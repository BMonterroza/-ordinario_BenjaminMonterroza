package com.mayab.desarrollo.sage;

public class EnvioCorreo implements EnvioBehaviour{

	public void enviarMensajes(Gasto gasto, Gerente destinatario) {
		// TODO Auto-generated method stub
		System.out.println("Envio de Correo al email: " + destinatario.getEmail() + " del gerente " + destinatario.getNombre() + ":");
		System.out.println("Estimado/a " + destinatario.getNombre() + ", se reporto un gasto por el monto de: " + gasto.getCantidad() + " de la empresa: " + gasto.getNombreCliente());
	}

}
