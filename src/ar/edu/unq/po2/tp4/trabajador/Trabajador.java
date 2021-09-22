package ar.edu.unq.po2.tp4.trabajador;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	public Double getMontoImponible() {
		double totalImponible = 0d;
		
		for(Ingreso ingreso : ingresos ) {
			totalImponible += ingreso.getMontoBrutoDelMes();
		}
		
		return totalImponible;
	}


	public double getTotalPercibido() {
		double totalPercibido = 0d;
		
		for(Ingreso ingreso : ingresos ) {
			totalPercibido += ingreso.getMontoNetoDelMes();
		}
		
		return totalPercibido;
	}

	
	public double getImpuestoAPagar() {
		double totalImpuesto = 0d;
		
		for(Ingreso ingreso : ingresos ) {
			totalImpuesto += ingreso.getImpuestoAPagarPorMes();
		}
		
		return totalImpuesto;
	}

	
	
	
	
	

}
