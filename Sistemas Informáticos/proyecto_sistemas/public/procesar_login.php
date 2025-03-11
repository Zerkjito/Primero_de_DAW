<?php
session_start();
include('../config/db_config.php'); // Incluye la configuración de la base de datos

// Verificar si los datos fueron enviados correctamente
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Conexión a la base de datos
    $servername = "localhost";
    $username = "root";  // Usuario por defecto de XAMPP
    $password = "";      // Contraseña por defecto de XAMPP
    $dbname = "automoviles";

    // Crear conexión
    $conn = new mysqli($servername, $username, $password, $dbname);

    // Verificar conexión
    if ($conn->connect_error) {
        die("Conexión fallida: " . $conn->connect_error);
    }

    // Recoger los datos del formulario
    $correo = $_POST['correo'];  // Usamos correo, no DNI
    $dni = $_POST['dni'];        // DNI como contraseña

    // Verificar si el usuario existe en la base de datos
    $sql = "SELECT * FROM cliente WHERE correo = '$correo' AND dni = '$dni'";  // Compara por correo y DNI
    $result = $conn->query($sql);

    // Depuración: ver el resultado de la consulta
    if ($result === false) {
        echo "Error en la consulta: " . $conn->error;
    }

    if ($result->num_rows > 0) {
        // Si el usuario existe, obtener el DNI y guardarlo en la sesión
        $row = $result->fetch_assoc();
        $_SESSION['dni'] = $row['dni'];  // Usamos el DNI como identificador único
        $_SESSION['nombre'] = $row['nombre'];  // Guarda el nombre del usuario para mostrar en el portal
        header("Location: portal.php");  // Redirigir al portal de automóviles
        exit();
    } else {
        // Si las credenciales son incorrectas
        echo "<script>alert('Correo o DNI incorrectos.'); window.location.href='login.php';</script>";
    }

    // Cerrar la conexión
    $conn->close();
}
?>
