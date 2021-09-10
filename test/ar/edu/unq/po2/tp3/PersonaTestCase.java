package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	
	private Persona beto;

	@BeforeEach
	public void setUp() {
		LocalDate fecha1 = LocalDate.of(1990, 6, 12);
		beto = new Persona("Beto",fecha1);
		
	}


	@Test
	void testgetEdad() {
		assertEquals(31, beto.getEdad());
	}

}
