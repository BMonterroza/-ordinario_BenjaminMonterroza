package com.mayab.desarrollo.ibm;

import java.util.ArrayList;

public interface InterfazIBM {
	public void addCliente(String nombre);
	public String getCliente(int index);
	public ArrayList<String> exportarClientes();
}
