package com.mayab.desarrollo.sage;

public class Gerente implements Observer{
	private String nombre;
	private String numeroCelular;
	private String email;
	private SistemaSAGE sistema;
	private double ammountForMSG;
	private boolean deseaSMS = true;
	
	public Gerente(String nombre, String numeroCelular, String email, SistemaSAGE sistema) {
		this.setNombre(nombre);
		this.setNumeroCelular(numeroCelular);
		this.setEmail(email);
		this.setSistema(sistema);
		this.ammountForMSG = sistema.getAmmoutForMSG();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SistemaSAGE getSistema() {
		return sistema;
	}

	public void setSistema(SistemaSAGE sistema) {
		this.sistema = sistema;
	}

	public void update() {
		// TODO Auto-generated method stub
		if(this.sistema.getUltimoGasto().getCantidad() > this.ammountForMSG) {
			sistema.solicitarMensajes(this);
		}
	}

	public boolean isDeseaSMS() {
		return deseaSMS;
	}

	public void setDeseaSMS(boolean deseaSMS) {
		this.deseaSMS = deseaSMS;
	}

	public double getAmmountForMSG() {
		return ammountForMSG;
	}

	public void setAmmountForMSG(double ammoutForMSG) {
		this.ammountForMSG = ammoutForMSG;
	}

	
}
