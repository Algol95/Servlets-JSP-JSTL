<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,aplicacion.model.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="content-type" content="text/html; utf-8">
<title>Gofreria</title>
</head>
<body>
<table>
<tr><thead>Lista de Gofres</thead><tr>
<tr><th>Nombre</th><th>Relleno</th><th>Cubierta</th><th>Precio</th><tr>
<c:forEach var="gofre" items="${requestScope['gofres']}">
​<tr>
<td>${gofre.getNombre()}</td>​
<td>${gofre.getRelleno()}</td>
<td>${gofre.getCubierta()}</td>
<td>${gofre.getPrecio()}</td>
</tr>​
</c:forEach>
</table>
</body>
</html>