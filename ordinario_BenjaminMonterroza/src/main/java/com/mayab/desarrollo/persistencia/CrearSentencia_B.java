package com.mayab.desarrollo.persistencia;

public class CrearSentencia_B implements CrearSentenciaBehaviour{

	public String abrir() {
		// TODO Auto-generated method stub
		return "*Abriendo conexion con la base de datos B*";
	}

	public String crear(String sentencia) {
		// TODO Auto-generated method stub
		return sentencia.toLowerCase();
	}

	public String ejecutar() {
		// TODO Auto-generated method stub
		return "*Ejecutando sentencia en la base de datos B*";
	}
	
}
