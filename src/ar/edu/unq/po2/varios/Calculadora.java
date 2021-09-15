package ar.edu.unq.po2.varios;

public class Calculadora {
	
	/**
	 * 
	 * @param numero -> numero a sacar el porcentaje
	 * @param porcentaje -> cantidad de porcentaje a sacar
	 * @return
	 */
	public static double  getPorcentaje(double numero, double porcentaje) {
		return ( numero / 100 ) * porcentaje; 
	}
		
	/**
	 * 
	 * @param numero -> numero a sacar el porcentaje
	 * @param porcentaje -> cantidad de porcentaje a sacar
	 * @return
	 */
	public static float  getPorcentaje(float numero, float porcentaje) {
		return ( numero / 100 ) * porcentaje; 
	}

}
