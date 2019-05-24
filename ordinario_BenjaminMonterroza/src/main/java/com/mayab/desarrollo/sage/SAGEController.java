package com.mayab.desarrollo.sage;

public class SAGEController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaSAGE sistema = new SistemaSAGE();
		EmpresaCliente e1 = new EmpresaCliente("Galletera DONDE", sistema);
		EmpresaCliente e2 = new EmpresaCliente("IBM",sistema);
		EmpresaCliente e3 = new EmpresaCliente("Microsoft",sistema);
		Gerente gr1 = new Gerente("Benjamin Monterroza", "9995013908", "benjamonterroza@gmail.com", sistema);
		System.out.println("El gerente: " + gr1.getNombre() + " desea recibir SMS");
		Gerente gr2 = new Gerente("Carlos Sanabria", "9295013908", "csanabria@gmail.com", sistema);
		System.out.println("El gerente: " + gr2.getNombre() + " desea recibir SMS");
		Gerente gr3 = new Gerente("Alexis Delgado", "8895013908", "adelgado@outlook.com", sistema);
		gr3.setDeseaSMS(false);
		System.out.println("El gerente: " + gr3.getNombre() + " no desea recibir SMS");
		System.out.println("Tarifa maxima de SMS: 20mxn");
		System.out.println("Tarifa actual de SMS: 18mxn");
		sistema.setTarifaSMS(18);
		sistema.setMaxTarifaSMS(20);
		System.out.println("Politica de horario correos: solo entre las 8 y las 22 horas");
		System.out.println("Hora actual: 8:00");
		sistema.addObserverToList(gr1);
		sistema.addObserverToList(gr2);
		sistema.addObserverToList(gr3);
		sistema.setHoraActual(13);
		sistema.setHoraFinalCorreos(22);
		sistema.setHoraInicioCorreos(8);
		sistema.setAmmoutForMSG(1300);
		sistema.registrarGasto(5000,e1.getNombre());
		sistema.registrarGasto(1598.88,e1.getNombre());
		sistema.setHoraActual(21);
		System.out.println("Hora actual: 21:00");
		sistema.registrarGasto(800.24,e2.getNombre());
		sistema.setHoraActual(2);
		System.out.println("Hora actual: 2:00");
		sistema.registrarGasto(1928.76,e2.getNombre());
		sistema.registrarGasto(400,e3.getNombre());
		System.out.println("Tarifa actual de SMS: 25mxn");
		sistema.setTarifaSMS(25);
		sistema.registrarGasto(1200.23,e3.getNombre());
		sistema.registrarGasto(1300.23,e3.getNombre());
	}

}
