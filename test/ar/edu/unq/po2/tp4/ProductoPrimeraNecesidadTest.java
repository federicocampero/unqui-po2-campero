package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad lenteja;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		lenteja = new ProductoPrimeraNecesidad("lenteja", 20d, true, 12d);
		
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2d, leche.getPrecio());
	}
	@Test
	public void testCalcularPrecioConUnDescuentoDeterminado() {
		assertEquals(17.6d, lenteja.getPrecio());
	}
}

