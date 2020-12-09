package com.clearminds.jg.test;

import com.clearminds.jg.dtos.Estudiante;
import com.clearminds.jg.excepciones.BDDException;
import com.clearminds.jg.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("jesus", "garcia"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
