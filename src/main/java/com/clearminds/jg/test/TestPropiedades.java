package com.clearminds.jg.test;

import com.clearminds.jg.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {

		String valor = new ConexionBDD().leerPropiedad("propiedad1");
		System.out.println(valor);

		valor = new ConexionBDD().leerPropiedad("XX");
		System.out.println(valor);
	}
}
