package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;
import ar.edu.unq.po2.varios.Calculadora;

class TrabajadorTest {
	
	

	private Trabajador trabajador1;
	private ArrayList<Ingreso> ingresos;
	private ArrayList<Integer> ad;
	private Ingreso ingresoEnero;
	private Ingreso ingresoFebrero;
	private HorasExtras horasExtrasEnero;
	
	
	@BeforeEach
	public void setUp() {
		
		trabajador1 = new Trabajador();
		ingresoEnero = new Ingreso(1, "basico", 1000d);
		ingresoFebrero = new Ingreso(2, "basico", 1000d);
		horasExtrasEnero = new HorasExtras(1,"horas Extras", 200d,10);
		
		trabajador1.agregarIngreso(ingresoEnero);
		trabajador1.agregarIngreso(ingresoFebrero);
		trabajador1.agregarIngreso(horasExtrasEnero);
		
	}
	
	@Test
	public void testGetTotalPercibido() {
		double amount = trabajador1.getTotalPercibido();
		assertEquals(2160d, amount);
	}
	
	@Test
	public void testGetMontoImponible() {
		assertEquals(2000d, trabajador1.getMontoImponible());
	}
	
	@Test
	public void testGetImpuestoAPagar() {
		double amount = trabajador1.getImpuestoAPagar();
		
		assertEquals(40d, amount);
	}
	
	

}
