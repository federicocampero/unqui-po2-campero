package ar.edu.unq.po2.tp4;

import ar.edu.unq.po2.varios.Calculadora;

public class ProductoPrimeraNecesidad extends Producto{
	
	/**
	 * cantDeDescuento = el numero indica el porcentaje de descuento que se hace al producto de primera
	 * necesidad. por defecto tiene un descuento del 10%
	 */
	private double cantDeDescuento = 10;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double cantDeDescuento) {
		super(nombre, precio, esPrecioCuidado);
		this.cantDeDescuento = cantDeDescuento;
	}
	
	@Override
	public double getPrecio() {
		double precioBase = super.getPrecio();
		double descuento = Calculadora.getPorcentaje(precioBase, this.getCantDeDescuento());
		return precioBase - descuento;
	}

	private double getCantDeDescuento() {
		return cantDeDescuento;
	}

}
