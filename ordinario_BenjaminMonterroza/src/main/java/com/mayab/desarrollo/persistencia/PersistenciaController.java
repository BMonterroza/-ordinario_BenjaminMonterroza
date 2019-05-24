package com.mayab.desarrollo.persistencia;

public class PersistenciaController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDatos b1 = new BaseDatos_A();
		BaseDatos b2 = new BaseDatos_B();
		BaseDatos b3 = new BaseDatos_C();
		System.out.println("Se usa el mismo creador para acceder a las bases de datos");
		System.out.println("Se usa la base de datos B:");
		b2.abrirConexion();
		b2.crearSentencia("SELECT * FROM autos");
		b2.ejecutarSentencia();
		System.out.println("Se usa la base de datos A:");
		b1.abrirConexion();
		b1.crearSentencia("SELECT * FROM autos");
		b1.ejecutarSentencia();
		System.out.println("Se usa la base de datos C:");
		b3.abrirConexion();
		b3.crearSentencia("SELECT * FROM autos");
		b3.ejecutarSentencia();
	}

}
