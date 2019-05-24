package com.mayab.desarrollo.persistencia;

public class BaseDatos_C extends BaseDatos{

	public BaseDatos_C() {
		this.creador = new CrearSentencia_C();
	}
	
	@Override
	public void abrirConexion() {
		// TODO Auto-generated method stub
		System.out.println(creador.abrir());
	}

	@Override
	public void crearSentencia(String text) {
		// TODO Auto-generated method stub
		System.out.println(creador.crear(text));
	}

	@Override
	public void ejecutarSentencia() {
		// TODO Auto-generated method stub
		System.out.println(creador.ejecutar());
	}

}
