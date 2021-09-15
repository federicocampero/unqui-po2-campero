package ar.edu.unq.po2.varios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	@Test
	void testEl27PorcientoDe1500Es150() {
		
		assertEquals(405, Calculadora.getPorcentaje(1500, 27));
	}

}
