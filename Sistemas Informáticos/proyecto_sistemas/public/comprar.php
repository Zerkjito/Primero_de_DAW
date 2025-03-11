<?php
session_start();

// Verificar si el usuario ha iniciado sesión, si no, redirigirlo a la página de inicio de sesión
if (!isset($_SESSION['dni'])) {
    header("Location: login.php");
    exit();
}

$dniCliente = $_SESSION['dni']; // DNI del usuario logueado

// Incluir la configuración de la base de datos
include('../config/db_config.php');

// Verificar si se ha pasado el código del coche
if (isset($_GET['codcoche'])) {
    $codcoche = $_GET['codcoche'];

    // Verificar si el coche está disponible
    $sql = "SELECT c.id, c.nombre, c.modelo, d.cantidad, co.cifc 
            FROM coche c 
            JOIN distribucion d ON c.id = d.codcoche 
            JOIN concesionario co ON d.cifc = co.cifc 
            WHERE c.id = ? AND d.cantidad > 0"; // Solo coches con cantidad > 0

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

        // Reducir la cantidad de coches disponibles
        $sqlActualizar = "UPDATE distribucion SET cantidad = cantidad - 1 WHERE codcoche = ? AND cifc = ?";
        $stmtActualizar = $conn->prepare($sqlActualizar);
        $stmtActualizar->bind_param("is", $codcoche, $concesionario);
        $stmtActualizar->execute();

        // Redirigir a la página de éxito
        header("Location: compra_confirmada.php?nombre=$nombreCoche&modelo=$modeloCoche");
        exit();

    } else {
        // Si no se encuentra el coche o no está disponible
        echo "El coche no está disponible o no existe.";
    }

} else {
    echo "No se ha especificado un coche para comprar.";
}

// Cerrar la conexión a la base de datos
$conn->close();
?>
