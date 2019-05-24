package com.mayab.desarrollo.sage;

public class EnvioCompleto implements EnvioBehaviour{

	public void enviarMensajes(Gasto gasto, Gerente destinatario) {
		System.out.println("Envio de Correo al email: " + destinatario.getEmail() + " del gerente " + destinatario.getNombre() + ":");
		System.out.println("Estimado/a " + destinatario.getNombre() + ", se reporto un gasto por el monto de: " + gasto.getCantidad() + " de la empresa: " + gasto.getNombreCliente());
		System.out.println("Envio de SMS al numero: " + destinatario.getNumeroCelular() + " del gerente " + destinatario.getNombre() + ":");
		System.out.println("Se reporto un gasto por el monto de: " + gasto.getCantidad() + " de la empresa: " + gasto.getNombreCliente());
	}
	
}
