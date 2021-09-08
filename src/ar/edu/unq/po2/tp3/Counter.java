package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>(); 
	
	public void addNumber(Integer numero) {
		numeros.add(numero);
	}
	
	
	public int getCantidadDeNumerosPares() {
		Integer cantDePares = 0;
		for(Integer num : numeros) {
			if( (num % 2) == 0 ) {
				cantDePares++;
			}
		}
		return cantDePares;
	}
	
	public int getCantidadDeNumerosImpares() {
		Integer cantDeImpares = 0;
		for(Integer num : numeros) {
			if( (num % 2) == 1 ) {
				cantDeImpares++;
			}
		}
		return cantDeImpares;
	}
	
	public int getCantidadDeMultiplosDelNumero(Integer numero) {
		int cantDeMultiplosANumero = 0;
		for(Integer num : numeros) {
			if( (num % numero) == 0 ) {
				cantDeMultiplosANumero++;
			}
		}
		return cantDeMultiplosANumero;
	}

}
