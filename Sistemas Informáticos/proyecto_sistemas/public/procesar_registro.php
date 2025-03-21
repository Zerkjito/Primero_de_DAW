<?php
session_start();
include('../config/db_config.php');

// Verificar si los datos fueron enviados correctamente
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Conexión a la base de datos (ajusta los valores según tu configuración)
    $servername = "localhost";
    $username = "unive_blogs";  // Usuario por defecto de XAMPP
    $password = "aldous";      // Contraseña por defecto de XAMPP
    $dbname = "vehiculoserik";

    // Crear conexión
    $conn = new mysqli($servername, $username, $password, $dbname);

    // Verificar conexión
    if ($conn->connect_error) {
        die("Conexión fallida: " . $conn->connect_error);
    }

    // Recoger los datos del formulario
    $dni = $_POST['dni'];
    $correo = $_POST['correo'];  // Nuevo campo correo
    $nombre = $_POST['nombre'];
    $apellidos = $_POST['apellidos'];
    $ciudad = $_POST['ciudad'];

    // Insertar los datos en la base de datos
    $sql = "INSERT INTO cliente (dni, correo, nombre, apellidos, ciudad) 
            VALUES ('$dni', '$correo', '$nombre', '$apellidos', '$ciudad')";

    if ($conn->query($sql) === TRUE) {
        // Si la inserción fue exitosa, redirigir a una página de éxito
        echo "Registro exitoso.";
        // Puedes redirigir al usuario a otra página con:
        // header("Location: login.php");  // Redirigir a login.php, por ejemplo
    } else {
        // Si hubo un error con la inserción, mostrar un mensaje
        echo "Error al registrar: " . $conn->error;
    }

    // Cerrar la conexión
    $conn->close();
}
?>
