package com.clearminds.jg.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {

	public String leerPropiedad(String propiedad) {

		Properties p = new Properties();

		try {
			p.load(new FileReader("conexion.properties"));

			//System.out.println(p.getProperty(propiedad));
			return p.getProperty(propiedad);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("no se encontro el archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
}
