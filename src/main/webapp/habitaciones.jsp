<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.I_Constantes"%>
<%@page import="com.ipartek.modelo.dto.Habitaciones"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% List<Habitaciones>
	listaHabitaciones = new ArrayList<>(); if
	(request.getAttribute(I_Constantes.ATR_LISTAS_HABITACIONES) != null) {
		listaHabitaciones = (List<Habitaciones>) request.getAttribute(I_Constantes.ATR_LISTAS_HABITACIONES); } %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Hotel Galea</title>
     <link rel="stylesheet" href="styles/style_variables.css" />
    <link rel="stylesheet" href="styles/style_form_table.css" >
    <link rel="stylesheet" href="styles/style.css" >
</head>
<body>
    
    <%@include file="includes/cabecera.jsp" %>


    <main>
       <section class="table_container">
					<table class="table_box">
						<thead>
							<tr>
								<th>ID</th>
								<th>Numero de habitacion</th>
								<th>Numero de camas</th>
								<th>Metros</th>
								<th>Precio</th>
								<th>Exterior</th>
							</tr>
						</thead>
						<tbody>
							<% for (Habitaciones h : listaHabitaciones) { %>
							<tr>
								<td><%= h.getId() %></td>
								<td><%= h.getNumeroHabitacion() %></td>
								<td><%= h.getNumeroCamas() %></td>
								<td><%= h.getMetros() %> m</td>
								<td><%= h.getPrecio() %> €</td>
								<td><%= h.isExterior() ? "Sí" : "No" %></td>
							</tr>
							<% } %>
						</tbody>
					</table>
				</section>
    </main>

   	<%@include file="includes/pie.jsp" %>

</body>
</html>