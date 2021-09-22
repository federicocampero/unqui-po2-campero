package ar.edu.unq.po2.tp4.trabajador;

import ar.edu.unq.po2.varios.Calculadora;

public class Ingreso {
	
	private int mes;
	private String concepto;
	private double montoBrutoDelMes;
	
	public Ingreso(int mes, String concepto, double montoBrutoDelMes) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.montoBrutoDelMes = montoBrutoDelMes;
	}
	
	public double getMontoBrutoDelMes() {
		return montoBrutoDelMes;
	}
	
	public double getImpuestoAPagarPorMes() {
		double impuestoAlTrabajador = 2;
		return Calculadora.getPorcentaje(this.getMontoBrutoDelMes(), impuestoAlTrabajador);
	}
	
	public double getMontoNetoDelMes() {
		return this.getMontoBrutoDelMes() - this.getImpuestoAPagarPorMes();
	}

}
