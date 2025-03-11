<?php
session_start();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro - Automóviles</title>
    <link rel="stylesheet" href="../assets/style.css"> <!-- Vincula tu archivo CSS -->
</head>
<body>
    <div class="container">
        <h1>Registro de Usuario</h1>
        <form action="procesar_registro.php" method="POST">
            <label for="dni">DNI:</label>
            <input type="text" id="dni" name="dni" required>
            
            <label for="correo">Correo Electrónico:</label>
            <input type="email" id="correo" name="correo" required>
            
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required>

            <label for="apellidos">Apellidos:</label>
            <input type="text" id="apellidos" name="apellidos" required>

            <label for="ciudad">Ciudad:</label>
            <input type="text" id="ciudad" name="ciudad" required>

            <!-- Nuevo campo correo -->

            <input type="submit" value="Registrar">
        </form>
        
        <p>¿Ya tienes cuenta? <a href="login.php">Iniciar sesión</a></p>

        <!-- Botón para volver al portal -->
        <br>
        <a href="index.php">
            <button class="back-button">Volver al Portal</button>
        </a>
    </div>
</body>
</html>
