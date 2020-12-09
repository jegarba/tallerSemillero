package com.clearminds.jg.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.jg.bdd.ConexionBDD;
import com.clearminds.jg.excepciones.BDDException;

public class ServicioBase {

	private Connection conexion;
	
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public void abrirConexion() throws BDDException{
		conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion(){
		if (conexion != null) {
			try {
				conexion.close();
				System.out.println("Conexion cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error al cerrar la conexion");
			}
		}
	}
}
