package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getEdad(){
		LocalDate fechaDeHoy = LocalDate.now();                          
		LocalDate cumpleanios = fechaDeNacimiento;  
		 
		Period p = Period.between(cumpleanios, fechaDeHoy);
		
		return p.getYears();
	}
	
	public boolean esMenorQue(Persona persona) {
		return persona.getEdad() < this.getEdad();
	}
	
	


	
	

}
