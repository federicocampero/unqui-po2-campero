package ar.edu.unq.po2.tp3.equipoDeTrabajo;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void agregarIntegrante(Persona persona) {
		this.getIntegrantes().add(persona);
	}
	
	public int getSumatoriaDeEdadesDeIntegrantes() {
		int sumatoriaDeEdades = 0;
		
		for(Persona persona : this.getIntegrantes()) {
			sumatoriaDeEdades += persona.getEdad();
		}
	
		return sumatoriaDeEdades;
	}
	
	public int getCantidadDeIntegrantes() {
		return  this.getIntegrantes().size();
	}
	
	public int getPromedioDeEdadDeIntegrantes() {
		return this.getSumatoriaDeEdadesDeIntegrantes() / this.getCantidadDeIntegrantes();
	}

	private ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	
}