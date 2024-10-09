<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
</head>
<body>
<%
	response.setHeader("Cache-Control","no-cache, no-store,must-revalidate"); // funciona para HTTP1.1, no permitir que se guarde en cache (no-store que no guarde en disco)
	
	response.setHeader("pragma","no-cache");// Para el antiguo HTTP 1.0
	response.setHeader("Expires","0");// Para el antiguo HTTP 1.0
	
	
	%>
	<div class="container">
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4">
				<form action="logeo" class="form" method="post">
					Usuario: <br><input type="text" name="usuario"><br>
					Contraseña:<br><input type="password" name="password"><br>
					<input class="btn btn-success" type="submit" value="LOGIN">
				</form>
			</div>
			<div class="col-4"></div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>