<?php
session_start();

// Verificar si el usuario ha iniciado sesión
if (!isset($_SESSION['dni'])) {  
    header("Location: login.php");
    exit();
}

$nombreUsuario = $_SESSION['nombre']; // Suponiendo que guardas el nombre del usuario en la sesión

// Incluir la configuración de la base de datos
include('../config/db_config.php');

// Procesar la compra
if (isset($_POST['comprar'])) {
    $codcoche = $_POST['codcoche'];  // Obtener el código del coche
    $dniCliente = $_SESSION['dni'];  // Obtener el DNI del cliente

    // Verificar si el coche está disponible
    $sql = "SELECT c.id, c.nombre, c.modelo, d.cantidad, co.cifc 
            FROM coche c 
            JOIN distribucion d ON c.id = d.codcoche 
            JOIN concesionario co ON d.cifc = co.cifc 
            WHERE c.id = ? AND d.cantidad > 0 AND c.usuario_id IS NULL"; 

    $stmt = $conn->prepare($sql);
    $stmt->bind_param("i", $codcoche);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();

        // Datos del coche
        $nombreCoche = $row['nombre'];
        $modeloCoche = $row['modelo'];
        $concesionario = $row['cifc'];

        // Registrar la compra en la tabla 'ventas'
        $sqlCompra = "INSERT INTO ventas (cifc, dni, codcoche) VALUES (?, ?, ?)";
        $stmtCompra = $conn->prepare($sqlCompra);
        $stmtCompra->bind_param("ssi", $concesionario, $dniCliente, $codcoche);
        $stmtCompra->execute();

        // Actualizar el coche con el usuario que lo compra
        $sqlActualizarCoche = "UPDATE coche SET usuario_id = ? WHERE id = ?";
        $stmtActualizarCoche = $conn->prepare($sqlActualizarCoche);
        $stmtActualizarCoche->bind_param("si", $dniCliente, $codcoche);
        $stmtActualizarCoche->execute();

        // Reducir la cantidad de coches disponibles
        $sqlActualizar = "UPDATE distribucion SET cantidad = cantidad - 1 WHERE codcoche = ? AND cifc = ?";
        $stmtActualizar = $conn->prepare($sqlActualizar);
        $stmtActualizar->bind_param("is", $codcoche, $concesionario);

        // Verificar si la actualización de cantidad fue exitosa
        if ($stmtActualizar->execute()) {
            $mensajeCompra = "Compra realizada con éxito: $nombreCoche $modeloCoche.";
        } else {
            $mensajeCompra = "Hubo un error al actualizar la cantidad del coche.";
        }
    } else {
        $mensajeCompra = "El coche no está disponible o no existe.";
    }
}

// Obtener los coches disponibles
$sql = "SELECT c.id, c.nombre, c.modelo, d.cantidad
        FROM coche c
        JOIN distribucion d ON c.id = d.codcoche
        WHERE d.cantidad > 0 AND c.usuario_id IS NULL"; // Solo coches con cantidad > 0 y usuario_id NULL

$result = $conn->query($sql);
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal - Automóviles</title>
    <link rel="stylesheet" href="../assets/style.css"> <!-- Vincula tu archivo CSS -->
</head>
<body>
    <div class="container">
        <h1>Bienvenido, <?php echo $nombreUsuario; ?>!</h1>
        <p>Has iniciado sesión correctamente.</p>

        <!-- Opciones para navegar -->
        <a href="cerrar_sesion.php" class="btn">Cerrar sesión</a>

        <!-- Mostrar mensaje de compra -->
        <?php if (isset($mensajeCompra)): ?>
            <p><?php echo $mensajeCompra; ?></p>
        <?php endif; ?>

        <!-- Mostrar los coches disponibles -->
        <h2>Coches disponibles para comprar</h2>
        <table>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Modelo</th>
                    <th>Acción</th>
                </tr>
            </thead>
            <tbody>
                <?php
                if ($result->num_rows > 0) {
                    // Mostrar los coches en la tabla
                    while ($row = $result->fetch_assoc()) {
                        echo "<tr>";
                        echo "<td>" . $row['nombre'] . "</td>";
                        echo "<td>" . $row['modelo'] . "</td>";
                        echo "<td>
                                <form action='portal.php' method='POST'>
                                    <input type='hidden' name='codcoche' value='" . $row['id'] . "'>
                                    <button type='submit' name='comprar' class='btn'>Comprar</button>
                                </form>
                              </td>";
                        echo "</tr>";
                    }
                } else {
                    echo "<tr><td colspan='3'>No hay coches disponibles para comprar.</td></tr>";
                }
                ?>
            </tbody>
        </table>
    </div>
</body>
</html>

<?php
// Cerrar la conexión a la base de datos
$conn->close();
?>
