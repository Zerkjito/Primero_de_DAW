<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "automoviles";
$conn = new msqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
  die("Conexión fallida: " . $conn->connect_error);
}
?>

