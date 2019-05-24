package com.mayab.desarrollo.sage;

import java.util.ArrayList;

public class SistemaSAGE implements Observable{
	private ArrayList<Gasto> gastos;
	private ArrayList<EmpresaCliente> clientes;
	private EnvioBehaviour emisor;
	private int horaInicioCorreos;
	private int horaFinalCorreos;
	private int horaActual;
	private double tarifaSMS = 0.01;
	private double maxTarifaSMS = Integer.MAX_VALUE;
	private double ammoutForMSG;
	private ArrayList<Observer> observadores = new ArrayList<Observer>();
	public SistemaSAGE() {
		gastos = new ArrayList<Gasto>();
		clientes = new ArrayList<EmpresaCliente>();
	}
	public void addCliente(EmpresaCliente cliente) {
		this.clientes.add(cliente);
	}
	public void registrarGasto(double cantidad, String nombre) {
		Gasto nuevoGasto = new Gasto(cantidad,nombre);
		gastos.add(nuevoGasto);
		notifyObservers();
	}
	public Gasto getUltimoGasto() {
		if(gastos.size() > 0) {
			return gastos.get(gastos.size() -1);
		}
		else {
			return null;
		}
	}
	public Gasto getGasto(int index) {
		if(index > 0 && index < gastos.size()) {
			return gastos.get(index);
		}
		else {
			return null;
		}
	}
	
	public void solicitarMensajes(Gerente solicitante) {
		if(tarifaSMS < maxTarifaSMS) {
			if(solicitante.isDeseaSMS()) {
				if((horaActual > horaInicioCorreos) && (horaActual < horaFinalCorreos)) {
					emisor = new EnvioCompleto();
					emisor.enviarMensajes(this.getUltimoGasto(),solicitante);
				}
				else {
					emisor = new EnvioSMS();
					emisor.enviarMensajes(this.getUltimoGasto(),solicitante);
					System.out.println("*No es posible enviar correo, horas fuera de la politica de la empresa*");
				}
			}
			else {
				System.out.println("*No se envia SMS, gerente no desea recibir SMSs*");
				if((horaActual > horaInicioCorreos) && (horaActual < horaFinalCorreos)) {
					emisor = new EnvioCorreo();
					emisor.enviarMensajes(this.getUltimoGasto(),solicitante);
				}
				else {
					System.out.println("*No es posible enviar correo, horas fuera de la politica de la empresa*");
				}
			}
		}
		else {
			System.out.println("*No es posible enviar SMS, tarifa muy alta*");
			if((horaActual > horaInicioCorreos) && (horaActual < horaFinalCorreos)) {
				emisor = new EnvioCorreo();
				emisor.enviarMensajes(this.getUltimoGasto(),solicitante);
			}
			else {
				System.out.println("*No es posible enviar correo, horas fuera de la politica de la empresa*");
			}
		}
		
	}
	public int getHoraInicioCorreos() {
		return horaInicioCorreos;
	}
	public void setHoraInicioCorreos(int horaInicioCorreos) {
		this.horaInicioCorreos = horaInicioCorreos;
	}
	public int getHoraFinalCorreos() {
		return horaFinalCorreos;
	}
	public void setHoraFinalCorreos(int horaFinalCorreos) {
		this.horaFinalCorreos = horaFinalCorreos;
	}
	public int getHoraActual() {
		return horaActual;
	}
	public void setHoraActual(int horaActual) {
		this.horaActual = horaActual;
	}
	public double getTarifaSMS() {
		return tarifaSMS;
	}
	public void setTarifaSMS(double tarifaSMS) {
		this.tarifaSMS = tarifaSMS;
	}
	public double getMaxTarifaSMS() {
		return maxTarifaSMS;
	}
	public void setMaxTarifaSMS(double maxTarifaSMS) {
		this.maxTarifaSMS = maxTarifaSMS;
	}
	public double getAmmoutForMSG() {
		return ammoutForMSG;
	}
	public void setAmmoutForMSG(double ammoutForMSG) {
		this.ammoutForMSG = ammoutForMSG;
	}
	public String[] getState() {
		String[] state = new String[] {Double.toString(this.getUltimoGasto().getCantidad()), this.getUltimoGasto().getNombreCliente()};
		return state;
	}
	public void addObserverToList(Observer foo) {
		observadores.add(foo);
	}
	public void deleteObserverFromList(Observer foo) {
		observadores.remove(foo);
	}
	public void notifyObservers() {
		for(Observer foo: observadores) {
			foo.update();
		}
	}
}
