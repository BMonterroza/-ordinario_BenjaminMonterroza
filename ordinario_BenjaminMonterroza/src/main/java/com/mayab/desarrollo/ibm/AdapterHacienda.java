package com.mayab.desarrollo.ibm;

import java.util.ArrayList;

public class AdapterHacienda implements InterfazHacienda{

	private SistemaIBM sistema;
	
	public AdapterHacienda(SistemaIBM sistema) {
		this.sistema = sistema;
	}
	
	public ArrayList<String> exportarNombres() {
		// TODO Auto-generated method stub
		ArrayList<String> lista = sistema.exportarClientes();
		ArrayList<String> nombres = new ArrayList<String>();
		for(String texto : lista) {
			String[] partes = texto.split(" ");
			nombres.add(partes[0]);
		}
		return nombres;
	}

	public ArrayList<String> exportarApellidos() {
		// TODO Auto-generated method stub
		ArrayList<String> lista = sistema.exportarClientes();
		ArrayList<String> apellidos = new ArrayList<String>();
		for(String texto : lista) {
			String[] partes = texto.split(" ");
			apellidos.add(partes[1]);
		}
		return apellidos;
	}

}
