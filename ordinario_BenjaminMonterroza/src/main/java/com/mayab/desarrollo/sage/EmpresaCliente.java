package com.mayab.desarrollo.sage;

public class EmpresaCliente {
	private String nombre;
	private SistemaSAGE sistema;
	public EmpresaCliente(String nombre,SistemaSAGE sistema) {
		this.nombre = nombre;
		this.sistema = sistema;
	}
	public void registrarGasto(double cantidad) {
		sistema.registrarGasto(cantidad, this.nombre);
	}
	public String getNombre() {
		return nombre;
	}
}
