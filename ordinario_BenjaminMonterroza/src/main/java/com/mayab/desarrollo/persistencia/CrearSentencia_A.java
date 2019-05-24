package com.mayab.desarrollo.persistencia;

public class CrearSentencia_A implements CrearSentenciaBehaviour{

	public String abrir() {
		// TODO Auto-generated method stub
		return "*Abriendo conexion con la base de datos A*";
	}

	public String crear(String sentencia) {
		// TODO Auto-generated method stub
		return sentencia.toUpperCase();
	}

	public String ejecutar() {
		// TODO Auto-generated method stub
		return "*Ejecutando sentencia en la base de datos A*";
	}

}
