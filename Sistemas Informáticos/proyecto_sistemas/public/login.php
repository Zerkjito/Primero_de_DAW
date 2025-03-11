<?php
session_start();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar Sesión - Automóviles</title>
    <link rel="stylesheet" href="../assets/style.css"> <!-- Vincula tu archivo CSS -->
</head>
<body>
    <div class="container">
        <h1>Iniciar Sesión</h1>
        <form action="procesar_login.php" method="POST">
            <!-- Campo de correo primero -->
            <label for="correo">Correo Electrónico:</label>
            <input type="email" id="correo" name="correo" required>

            <!-- Campo de DNI después -->
            <label for="dni">DNI:</label>
            <input type="text" id="dni" name="dni" required>

            <input type="submit" value="Iniciar Sesión">
        </form>
        <p>¿No tienes cuenta? <a href="registro.php">Registrarse</a></p>
    </div>
</body>
</html>
