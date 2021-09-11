package ar.edu.unq.po2.tp2.reciboDeHaberes;

import java.util.Date;

public class ReciboDeHaberes {
	
	private String nombreDelEmpleado;
	private String direccion;
	private Date fechaDeEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	
	public ReciboDeHaberes(String nombreDelEmpleado, String direccion, Date fechaDeEmision, float sueldoBruto,
			float sueldoNeto) {
		super();
		this.nombreDelEmpleado = nombreDelEmpleado;
		this.direccion = direccion;
		this.fechaDeEmision = fechaDeEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}

	

}
