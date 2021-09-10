package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	
	private  Multioperador multioperador;

	@BeforeEach
	public void setUp() {
		multioperador = new Multioperador();
		
		multioperador.agregarNumero(2);
		multioperador.agregarNumero(4);
		multioperador.agregarNumero(6);
	}

	@Test
	void testcalcularSumaDeTodosLosNumeros() {
		Integer amount = multioperador.calcularSumaDeTodosLosNumeros();
		
		assertEquals(12, amount);
	}
	
	@Test
	void testcalcularRestaDeTodosLosNumeros() {
		Integer amount = multioperador.calcularRestaDeTodosLosNumeros();
		
		assertEquals((-12), amount);
	}
	

	@Test
	void calcularMultiplicacionDeTodosLosNumeros() {
		Integer amount = multioperador.calcularMultiplicacionDeTodosLosNumeros();
		
		assertEquals(48, amount);
	}

	

}
