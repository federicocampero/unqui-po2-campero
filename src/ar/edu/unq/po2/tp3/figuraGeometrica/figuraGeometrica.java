package ar.edu.unq.po2.tp3.figuraGeometrica;

import ar.edu.unq.po2.tp3.Point;

public class figuraGeometrica {
	
	private Point esquinaSupIzq;
	private int ancho,alto;
	
	public figuraGeometrica(Point esquinaSupIzq, int ancho, int alto) {
		super();
		this.esquinaSupIzq = esquinaSupIzq;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public Point getEsquinaSupIzq() {
		return esquinaSupIzq;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}
	
	public int getArea() {
		return this.getAncho() * this.getAlto();
	}
	
	public int getPerimetro() {
		return (this.getAncho() *  2 ) + (this.getAlto() * 2);
	}

}
