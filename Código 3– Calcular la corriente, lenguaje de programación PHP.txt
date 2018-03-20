<!DOCTYPE html>
<html>
<head>
	<title>Ejercicio 3</title>
</head>
<body>
<center>
<form action="" method="POST">
<h1>Ejercicio 2</h1>
<label>Ingrese el voltaje:</label>
<input type="text" name="voltaje"><br>
<label>Ingrese la resistencia:</label>
<input type="text" name="resistencia"><br>
<input type="submit" name="btn" value="enviar">
</form>
</body>
</html>

<?php
if (isset($_POST['btn'])) {
	$volate=$_POST['voltaje'];
	$resistencia=$_POST['resistencia'];
$corriente=voltaje/resistencia;
echo "<br><h2>La corriente es: ".$corriente." </h2>";
}


?>