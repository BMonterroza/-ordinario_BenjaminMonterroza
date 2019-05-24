package com.mayab.desarrollo.ibm;

public class AdapterFacturacion implements InterfazFacturacion{
	
	private SistemaIBM sistema;
	
	public AdapterFacturacion(SistemaIBM sistema) {
		this.sistema = sistema;
	}
	
	public void sendDatosFactura(int index) {
		// TODO Auto-generated method stub
		String cliente = sistema.getCliente(index);
		String[] componentes = cliente.split(" ");
		System.out.println("Enviando datos de cliente al sistema de facturación electrónica");
		System.out.println("Nombre: " + componentes[0]);
		System.out.println("Apellido: " + componentes[1]);
	}
	
}
