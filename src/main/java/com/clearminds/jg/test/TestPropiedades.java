package com.clearminds.jg.test;

import com.clearminds.jg.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {

		String valor = ConexionBDD.leerPropiedad("usuario");
		System.out.println(valor);

		valor = ConexionBDD.leerPropiedad("password");
		System.out.println(valor);
		
		valor = ConexionBDD.leerPropiedad("urlConexion");
		System.out.println(valor);
	}
}
