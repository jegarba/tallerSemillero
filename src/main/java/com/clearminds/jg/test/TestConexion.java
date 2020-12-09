package com.clearminds.jg.test;

import java.sql.Connection;

import com.clearminds.jg.bdd.ConexionBDD;
import com.clearminds.jg.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {
		try {
			
			Connection conexion = ConexionBDD.obtenerConexion();
			
			if (conexion != null) {
				System.out.println("Conexion Exitosa");
			}
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
