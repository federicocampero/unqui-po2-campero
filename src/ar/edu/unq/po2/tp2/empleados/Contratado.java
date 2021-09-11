package ar.edu.unq.po2.tp2.empleados;

import java.util.Date;

public class Contratado extends Empleado{
	
	private int numeroDeContrato;
	private String medioDePago;
	
	public Contratado(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento, float sueldoBasico,
			int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public float calcularSueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public float calcularRetenciones() {
		return 50;
	}

}
