package com.mayab.desarrollo.sage;

public class EnvioSMS implements EnvioBehaviour{

	public void enviarMensajes(Gasto gasto, Gerente destinatario) {
		// TODO Auto-generated method stub
		System.out.println("Envio de SMS al numero: " + destinatario.getNumeroCelular() + " del gerente " + destinatario.getNombre() + ":");
		System.out.println("Se reporto un gasto por el monto de: " + gasto.getCantidad() + " de la empresa: " + gasto.getNombreCliente());
	}
	
}
