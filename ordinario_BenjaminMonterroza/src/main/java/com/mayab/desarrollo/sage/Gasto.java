package com.mayab.desarrollo.sage;

import java.util.ArrayList;

public class Gasto{
	private double cantidad;
	private String nombreCliente;
	
	public Gasto(double cantidad, String nombreCliente) {
		this.cantidad = cantidad;
		this.nombreCliente = nombreCliente;
	}
	public double getCantidad() {
		return cantidad;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
}