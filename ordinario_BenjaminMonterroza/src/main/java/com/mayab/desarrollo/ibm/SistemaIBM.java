package com.mayab.desarrollo.ibm;

import java.util.ArrayList;

public class SistemaIBM implements InterfazIBM{

	private ArrayList<String> clientes;
	
	public SistemaIBM(ArrayList<String> clientes) {
		this.clientes = clientes;
	}
	public void addCliente(String nombre) {
		// TODO Auto-generated method stub
		clientes.add(nombre);
	}

	public String getCliente(int index) {
		// TODO Auto-generated method stub
		return clientes.get(index);
	}
	public ArrayList<String> exportarClientes() {
		// TODO Auto-generated method stub
		return clientes;
	}

}
