package com.clearminds.jg.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.clearminds.jg.dtos.Estudiante;
import com.clearminds.jg.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private String dateString = format.format(new Date());

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {

		abrirConexion();
		System.out.println("insertando estudiante: " + estudiante);

		Statement stmt = null;

		try {

			stmt = getConexion().createStatement();

			String sql = "INSERT INTO estudiantes (nombre,apellido,edad,fecha) VALUES ('" + estudiante.getNombre()
					+ "','" + estudiante.getApellido() + "','" + estudiante.getEdad() + "','" + this.dateString + "')";
			System.out.println("Scrip: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("error al insertar el estudiante");
		}
	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {

		abrirConexion();

		System.out.println("Actualizando estudiante: " + estudiante);

		Statement stmt = null;

		try {

			stmt = getConexion().createStatement();

			String sql = "UPDATE estudiantes SET nombre= '" + estudiante.getNombre() + "', apellido='"
					+ estudiante.getApellido() + "' , edad='" + estudiante.getEdad() + "' , fecha='" + this.dateString
					+ "' where id=6";
			System.out.println("Scrip: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("error al Actualizar el estudiante");
		}

	}

}
