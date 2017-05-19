<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verificador de idade</title>
</head>
<body>
	<form action="ServletVerificadorIdade">
		<label>Nome</label>
		<input type="text" name="nome">
		<br></br>
		<label>Idade</label>
		<input type="text" name="idade">
		<br></br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>