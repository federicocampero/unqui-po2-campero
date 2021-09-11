package ar.edu.unq.po2.tp2.empleados;

import java.util.Date;

import ar.edu.unq.po2.tp2.reciboDeHaberes.ReciboDeHaberes;

public abstract class  Empleado  {
	
	private String nombre;
	private String direccion;
	private String estadoCivil; // "Soltero" o "Casado"
	private Date fechaDeNacimiento;
	private float sueldoBasico;
	private ReciboDeHaberes reciboDeHaberes;
	
	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento, float sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil; 
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	private String getNombre() {
		return nombre;
	}

	private String getDireccion() {
		return direccion;
	}

	private Date getFechaDeNacimiento(){
		return this.fechaDeNacimiento;
	}
	
	protected float getSueldoBasico() {
		return this.sueldoBasico;
	}
		
	protected String getEstadoCivil() {
		return estadoCivil;
	}

	public int calcularEdad() {
		Date fechaActual = new Date();
		Date cumpleanios = this.getFechaDeNacimiento();
		
		return fechaActual.getYear() - cumpleanios.getYear(); 
		
	}
	
	public abstract float calcularSueldoBruto();
	
	public abstract float calcularRetenciones();
	
	public float calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones();  
	}



	public void generarYGuardarReciboDeSueldo() {
		Date fechaActual = new Date();
		reciboDeHaberes = new ReciboDeHaberes(this.getNombre(), this.getDireccion(), fechaActual, this.calcularSueldoBruto(), this.calcularSueldoNeto());
		
	}
	

}
