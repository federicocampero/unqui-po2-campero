package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplosTestCase {
	
	private Multiplos multiplos;

	@BeforeEach
	public void setUp() {
		multiplos = new Multiplos();
	}

	@Test
	void testEsMultiplo() {
		
		assertTrue(multiplos.esMultiplo(999, 9));
		assertTrue(multiplos.esMultiplo(999, 3));
	}
	
	@Test
	void getMultiplosDe() {
		
		assertEquals(999, multiplos.getMultiplosDe(3, 9));
		assertEquals(-1, multiplos.getMultiplosDe(2000, 9));
	}
	

}
