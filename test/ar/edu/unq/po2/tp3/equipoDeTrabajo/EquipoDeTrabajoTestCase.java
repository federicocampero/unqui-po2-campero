package ar.edu.unq.po2.tp3.equipoDeTrabajo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class EquipoDeTrabajoTestCase {
	
	Persona beto,norberto,julian,alfonso,claudio;
	EquipoDeTrabajo equipoDeTrabajo1;
	
	@BeforeEach
	public void setUp() {
		beto = new Persona("Beto", "gonzalez", 40);
		norberto = new Persona("Norberto", "Rodriguez", 37);
		julian = new Persona("Julian", "Gomez", 21);
		alfonso = new Persona("Alfonso", "Garcia", 38);
		claudio = new Persona("Claudio", "Fernandez", 51);
		
		equipoDeTrabajo1 = new EquipoDeTrabajo("green");
		
		equipoDeTrabajo1.agregarIntegrante(beto);
		equipoDeTrabajo1.agregarIntegrante(norberto);
		equipoDeTrabajo1.agregarIntegrante(julian);
		equipoDeTrabajo1.agregarIntegrante(alfonso);
		equipoDeTrabajo1.agregarIntegrante(claudio);
	}

	@Test
	void tesgetPromedioDeEdadDeIntegrantes() {
		
		int amout = equipoDeTrabajo1.getPromedioDeEdadDeIntegrantes();
		
		assertEquals(37, amout);
	}

}


