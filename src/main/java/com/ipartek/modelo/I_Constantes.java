package com.ipartek.modelo;

public interface I_Constantes {

	// constantes de la BD
	String BD = "jsp_hotel";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/"+BD;
	String USUARIO = "root";
	String PASS = "1234";
	
	//constantes de los JSP
	String JSP_INDEX = "index.jsp";
	String JSP_HABITACIONES = "habitaciones.jsp";
	
	
	String HABITACIONES_ID = "id";
	String HABITACIONES_NUMERO_HAB = "numero_habitacion";
	String HABITACIONES_NUMERO_CAMA = "numero_camas";
	String HABITACIONES_METROS = "metros";
	String HABITACIONES_PRECIO = "precio";
	String HABITACIONES_EXTERIOR = "exterior";
	
	String SP_OBTENER_TODAS_HABITACIONES = "call sp_obtener_todas_habitaciones();";
	
	
	String ATR_LISTAS_HABITACIONES = "lista_habitaciones";
	
}
