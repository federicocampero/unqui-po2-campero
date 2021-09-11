package ar.edu.unq.po2.tp2.empleados;

import java.util.Date;

public class Temporario extends Empleado{
	
	private Date fechaFinAsignacion;
	private int cantdeHorasExtras;
	
	
	public Temporario(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento, float sueldoBasico,
			Date fechaFinAsignacion, int cantdeHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinAsignacion = fechaFinAsignacion;
		this.cantdeHorasExtras = cantdeHorasExtras;
	}
	
	private int getCantdeHorasExtras() {
		return cantdeHorasExtras;
	}
	
	@Override
	public float calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calcularBonoPorHorasExtras() ;
	}
	
	private float calcularBonoPorHorasExtras() {
		return this.getCantdeHorasExtras() * 40;
	}

	@Override
	public float calcularRetenciones() {
		float sueldoBruto = this.calcularSueldoBruto();
		return this.calcularPagoPorObraSocial(sueldoBruto) + this.calcularPagoPorAportesJubilatorios(sueldoBruto);
	}

	private float calcularPagoPorObraSocial(float sueldoBruto) {
		return (sueldoBruto * 10) / 100 + this.longevidad();
	}
	private float longevidad() {
		if (this.esMayorA50()) {
			return 25;
		}else {
			return 0;
		}
	}
	private boolean esMayorA50() {
		return this.calcularEdad() > 50;
	}
	private float calcularPagoPorAportesJubilatorios(float sueldoBruto) {
		return (sueldoBruto * 10) / 100 + this.getCantdeHorasExtras() * 5;
	}
	
}

