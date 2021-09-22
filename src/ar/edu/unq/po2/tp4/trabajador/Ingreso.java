package ar.edu.unq.po2.tp4.trabajador;

import ar.edu.unq.po2.varios.Calculadora;

public class Ingreso {
	
	private int mes;
	private String concepto;
	protected double montoPercibidoDelMes;
	
	public Ingreso(int mes, String concepto, double montoBrutoDelMes) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibidoDelMes = montoBrutoDelMes;
	}
	
	public double getMontoImponibleDelMes() {
		return montoPercibidoDelMes;
	}
	
	public double getImpuestoAPagarPorMes() {
		double impuestoAlTrabajador = 2;
		return Calculadora.getPorcentaje(this.getMontoImponibleDelMes(), impuestoAlTrabajador);
	}
	
	public double getMontoPercibidoDelMes() {
		return this.getMontoImponibleDelMes() - this.getImpuestoAPagarPorMes();
	}

}