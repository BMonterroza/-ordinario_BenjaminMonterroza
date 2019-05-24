package com.mayab.desarrollo.ibm;

import java.util.ArrayList;

public class IBMController {

	public static void main(String[] args) {
		ArrayList<String> clientes = new ArrayList<String>();
		clientes.add("Benjamin Monterroza");
		clientes.add("Carlos Sanabria");
		clientes.add("Mauricio López");
		clientes.add("Diego Oliva");
		clientes.add("Lucia Montiel");
		clientes.add("Miguel Berganza");
		SistemaIBM sistema = new SistemaIBM(clientes);
		System.out.println("Sistema de IBM creado");
		System.out.println("Imprimiendo lista de clientes del sistema IBM:");
		for(String nombre:sistema.exportarClientes()) {
			System.out.println("Nombre: " + nombre);
		}
		AdapterHacienda hacienda = new AdapterHacienda(sistema);
		System.out.println("Listas para hacienda creadas");
		System.out.println("Lista de nombres:");
		for(String nombre:hacienda.exportarNombres()) {
			System.out.println("Nombre: " + nombre);
		}
		System.out.println("Lista de apellidos:");
		for(String nombre:hacienda.exportarApellidos()) {
			System.out.println("Apellido: " + nombre);
		}
		AdapterFacturacion facturacion = new AdapterFacturacion(sistema);
		System.out.println("Interfaz creada para usar sistema de facturación");
		System.out.println("Facturacion para el usuario: " + sistema.getCliente(0));
		facturacion.sendDatosFactura(0);
	}

}
