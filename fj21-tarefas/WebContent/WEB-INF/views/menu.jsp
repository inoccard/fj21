<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>P�gina Iincial</title>
</head>
<body>
	<h2>Pagina inicial da lista de Tarefas</h2>
	<p>Bem Vindo <b>${usuarioLogado.login}</b></p>
	<a href="listaTarefas">Clique Aqui</a> para acessar a lista de tarefas
	<br>
	<br>
	<a href="logout">Sair do sistema</a>
</body>
</html>