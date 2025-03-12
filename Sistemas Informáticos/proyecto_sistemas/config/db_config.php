<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

$host = "localhost"; // Servidor de la base de datos
$user = "root"; // Usuario de MySQL (por defecto en XAMPP es root)
$pass = ""; // Contraseña (vacía por defecto en XAMPP)
$dbname = "automoviles"; // Nombre de la base de datos

// Crear conexión
$conn = new mysqli($host, $user, $pass, $dbname);

// Verificar conexión
if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
}

// Opcional: establecer codificación UTF-8
$conn->set_charset("utf8mb4");
?>
