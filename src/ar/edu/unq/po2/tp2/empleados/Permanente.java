package ar.edu.unq.po2.tp2.empleados;

import java.util.Date;

public class Permanente extends Empleado {
	
	private int cantDeHijos;
	private int antiguedad;

	public Permanente(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento, float sueldoBasico,
			int cantDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantDeHijos = cantDeHijos;
		this.antiguedad = antiguedad;
	}

	private int getCantDeHijos() {
		return cantDeHijos;
	}

	private int getAntiguedad() {
		return antiguedad;
	}

	@Override
	public float calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calcularSalarioFamiliar();
	}

	private float calcularSalarioFamiliar() {
		return this.calcularAsignacionPorHijo() + this.calcularAsignacionPorConyuge() + this.calcularBonoPorAntiguedad();
	}
	private float calcularAsignacionPorHijo() {
		return this.getCantDeHijos() * 150 ;
	}	
	
	private float calcularAsignacionPorConyuge() {
		if (this.esCasado()) { 
			return 100;
			}else {
				return 0;
				}  
	}
	private float calcularBonoPorAntiguedad() {
		return this.getAntiguedad() * 100;
	}	
	private Boolean esCasado() {
		return this.getEstadoCivil().equals("Casado");
	}
	
	@Override
	public float calcularRetenciones() {	
		float sueldoBruto = this.calcularSueldoBruto();
		return this.calcularPagoPorObraSocial(sueldoBruto) + this.calcularPagoPorAportesJubilatorios(sueldoBruto);
	}

	private float calcularPagoPorObraSocial(float sueldoBruto) {
		return  (sueldoBruto * 10) / 100  + this.getCantDeHijos() * 20 ;
	}
	private float calcularPagoPorAportesJubilatorios(float sueldoBruto) {
		
		return (sueldoBruto * 15) / 100;
	}
}
