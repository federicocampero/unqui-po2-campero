package ar.edu.unq.po2.tp3.figuraGeometrica;

import ar.edu.unq.po2.tp3.Point;

public class Rectangulo extends figuraGeometrica{
	
	public Rectangulo(Point esquinaSupIzq, int ancho, int alto) {
		super(esquinaSupIzq, ancho, alto);
	}
	
	public boolean esHorizontal() {
		return this.getAncho() > this.getAlto();
	}
	
	
	

}