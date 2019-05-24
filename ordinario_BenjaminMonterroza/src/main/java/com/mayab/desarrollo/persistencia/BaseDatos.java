package com.mayab.desarrollo.persistencia;

import java.util.ArrayList;

public abstract class BaseDatos {
	public ArrayList<String> datos;
	public CrearSentenciaBehaviour creador;
	abstract public void abrirConexion();
	abstract public void crearSentencia(String text);
	abstract public void ejecutarSentencia();
}
