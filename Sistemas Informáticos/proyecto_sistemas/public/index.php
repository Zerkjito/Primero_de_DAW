<?php
session_start();
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
        <h1>Bienvenido al Portal de Automóviles</h1>
        <p>Seleccione una opción:</p>
        <!-- Botón Registrarse con clase 'action-button' -->
        <button class="action-button" onclick="window.location.href='registro.php'">Registrarse</button>
        <!-- Botón Iniciar Sesión con clase 'action-button' -->
        <button class="action-button" onclick="window.location.href='login.php'">Iniciar Sesión</button>
    </div>
</body>
</html>
