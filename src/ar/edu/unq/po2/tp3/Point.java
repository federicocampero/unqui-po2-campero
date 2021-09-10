package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void cambiarCoordenadas (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point getCoordenasSumadas(Point p1, Point p2) {
		int nuevoX = p1.getX() + p2.getX();
		int nuevoY = p1.getY() + p2.getY();
		Point coordenadaSumada = new Point();
		
		return coordenadaSumada;
		
	}
	
	

}
