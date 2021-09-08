package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	private Counter counter;

	@BeforeEach
	public void setUp() {
		counter = new Counter ();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	@Test
	void testCantidadDeNumerosPares() {
		int amount = counter.getCantidadDeNumerosPares(); 
		
		assertEquals(1, amount);
	}
	@Test
	void testCantidadDeNumerosImpares() {
		int amount = counter.getCantidadDeNumerosImpares(); 
		
		assertEquals(9, amount);
	}
	@Test
	void testCantidadDeMultiplosDelNumero() {
		int amount = counter.getCantidadDeMultiplosDelNumero(9); 
		
		assertEquals(1, amount);
	}
	

}
