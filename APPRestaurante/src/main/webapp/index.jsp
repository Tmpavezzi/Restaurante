<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Seja Bem-Vindo</title>
  <link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>
<form action ="/login" method = "post">
<h1>Faça seu Login</h1>



<label for="username">E-mail:</label>
<input type="text" id="username" name="username" >



<label for="password">Senha:</label>
<input type="text" id="password" name="password">

<a href="Cadastrados.jsp" class="button">Cadastrar</a>



<input type="submit" id="Cadastrar" value="Cadastrar-se">
</form>
</body>
</html>
