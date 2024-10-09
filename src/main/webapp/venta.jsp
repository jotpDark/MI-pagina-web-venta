<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="llenarGuardar" method="post">
		<label for="nit">NIT / CLIENTE</label> <input type="text" id="nombre"
			name="nit" required><br> <br> <label for="apellido">APELLIDO/CLIENTE</label>
		<input type="text" id="apellido" name="apellido" required><br>
		<label for="producto">Seleccione un producto:</label>
    <select name="producto">
        <c:forEach items="${lispro}" var="producto">
            <option value="${producto.getIdProducto()}">${producto.getNombre()} Precio: ${producto.getPrecio()} </option>
        </c:forEach>
    </select>
		<label for="nit">REQUIERE/CANTIDAD</label> <input type="number" id="cantidad"
			name="cantidad" required>
		 <br> <input type="submit" value="Enviar">
	</form>
	<table id="tablaDatos" border="1">
    <thead>
      <tr>
        <th>Nombre</th>
        <th>precio</th>
        
      </tr>
    </thead>
    <tbody id="tbody">
      <!-- Aquí se llenará la tabla con datos -->
    </tbody>
  </table>
  
  <script>
    $(document).ready(function() {
       
    });
</script>
</body>
</html>