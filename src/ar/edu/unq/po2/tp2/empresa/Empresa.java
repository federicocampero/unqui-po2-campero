package ar.edu.unq.po2.tp2.empresa;

import java.util.ArrayList;

import ar.edu.unq.po2.tp2.empleados.Empleado;

public class Empresa {
	
	private String nombre;
	private int cuit;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String nombre, int cuit, ArrayList<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}

	private ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	
	public float calcularMontoTotalDeSueldoNeto() {
		float sumatoriaSueldosNeto = 0;	
		/*
		for (Empleado i:this.getEmpleados()) {
			sumatoriaSueldos =+ i.sueldoBruto(); 
		}
		*/
		for(int i = 0 ; i < this.getEmpleados().size() ; i++  ) {
			Empleado empleadoActual = this.getEmpleados().get(i);
			sumatoriaSueldosNeto =+ empleadoActual.calcularSueldoNeto(); 
		}
		return sumatoriaSueldosNeto;
	}
	
	public float calcularMontoTotalDeSueldoBruto() {
		float sumatoriaDeSueldosBruto = 0;	
		
		for(int i = 0 ; i < this.getEmpleados().size() ; i++  ) {
			Empleado empleadoActual = this.getEmpleados().get(i);
			sumatoriaDeSueldosBruto =+ empleadoActual.calcularSueldoBruto(); 
		}
		return sumatoriaDeSueldosBruto;
	}
	
	public float calcularMontoTotalDeRetenciones() {
		float sumatoriaDeRetenciones = 0;	

		for(int i = 0 ; i < this.getEmpleados().size() ; i++  ) {
			Empleado empleadoActual = this.getEmpleados().get(i);
			sumatoriaDeRetenciones =+ empleadoActual.calcularRetenciones(); 
		}
		return sumatoriaDeRetenciones;
	}

	public void realizarLiquidacionDeSueldos() {
		
		for(int i = 0 ; i < this.getEmpleados().size() ; i++  ) {
			Empleado empleadoActual = this.getEmpleados().get(i);
			empleadoActual.generarYGuardarReciboDeSueldo();
			
			
		}	
		
	}

}

