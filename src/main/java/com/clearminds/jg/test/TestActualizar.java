package com.clearminds.jg.test;

import com.clearminds.jg.dtos.Estudiante;
import com.clearminds.jg.excepciones.BDDException;
import com.clearminds.jg.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("cambio", "salas", 12));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}
}
