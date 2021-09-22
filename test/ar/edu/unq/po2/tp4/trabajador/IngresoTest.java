package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	
	Ingreso ingresoMarzo;

	
	@BeforeEach
	public void setUp() {
	
		ingresoMarzo = new Ingreso(3, "basico", 1000d);
	}
		

	@Test
	void testgetMontoBrutoDelMes() {
		
		assertEquals(1000d, ingresoMarzo.getMontoBrutoDelMes());
	}
	
	@Test
	void getImpuestoAPagarPorMes() {
		
		assertEquals(20d, ingresoMarzo.getImpuestoAPagarPorMes());
	}
	
	@Test
	void getMontoNetoDelMes() {
		
		assertEquals(980d, ingresoMarzo.getMontoNetoDelMes());
	}

}
