package com.clearminds.jg.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.jg.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad) {

		Properties p = new Properties();

		try {
			p.load(new FileReader("conexion.properties"));

			// System.out.println(p.getProperty(propiedad));
			return p.getProperty(propiedad);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("no se encontro el archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static Connection obtenerConexion() throws BDDException {
		Connection conn = null;

		String username = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		String url = leerPropiedad("urlConexion");

		try {
			return conn = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("no se pudo conectar a la base de datos");
		}

	}
}
