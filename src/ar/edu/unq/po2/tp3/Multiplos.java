package ar.edu.unq.po2.tp3;

public class Multiplos {
	
	public int getMultiplosDe(int x, int y) {
		int numeroMaximo = 1000;
		
		
		
		while (! ( this.esMultiplo(numeroMaximo, x) && this.esMultiplo(numeroMaximo, y) ) ) {
			numeroMaximo -= 1;
			
			if (numeroMaximo == 0 ) {
				return -1;
			}
		}
		
		return numeroMaximo;
	}
	
	public boolean esMultiplo(int numero1 ,int numero2) {
		return ( numero1 % numero2 ) == 0; 
	}

}
