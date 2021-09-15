package ar.edu.unq.po2.tp4;

public class Producto {
	
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	private void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public void aumentarPrecio(double aumento) {
		//precio += aumento
		double precioActual = this.getPrecio(); 
		
		this.setPrecio(precioActual + aumento );
	}

	
	
	
	
	
	

}
