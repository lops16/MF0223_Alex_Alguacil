package com.ipartek.modelo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Habitaciones;


public class DB_Helper implements I_Constantes{
	
	
	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}
		
		return con;
	}

	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("BASE DE DATOS DESCONECTADA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}

	public List<Habitaciones> obetenerHabitaciones(Connection con) {
		try {
			List<Habitaciones> lista = new ArrayList<Habitaciones>();
			CallableStatement cstmt = con.prepareCall(SP_OBTENER_TODAS_HABITACIONES);
			
			cstmt.execute();
		    ResultSet rs = cstmt.getResultSet();
		    
		    while (rs.next()) {
		        Habitaciones habitacion = new Habitaciones();
		        habitacion.setId(rs.getInt(HABITACIONES_ID));
		        habitacion.setNumeroHabitacion(rs.getInt(HABITACIONES_NUMERO_HAB));
		        habitacion.setNumeroCamas(rs.getInt(HABITACIONES_NUMERO_CAMA));
		        habitacion.setMetros(rs.getInt(HABITACIONES_METROS));
		        habitacion.setPrecio(rs.getDouble(HABITACIONES_PRECIO));
		        habitacion.setExterior(rs.getBoolean(HABITACIONES_EXTERIOR));;
		        

		        lista.add(habitacion);
		        
		   
		    }
		    
		    return lista;
		    
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
}
