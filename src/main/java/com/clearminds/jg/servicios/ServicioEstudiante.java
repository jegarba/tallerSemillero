package com.clearminds.jg.servicios;

import com.clearminds.jg.dtos.Estudiante;
import com.clearminds.jg.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		
		abrirConexion();
		System.out.println("insertando estudiante: " + estudiante);
		cerrarConexion();
	}
}
