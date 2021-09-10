package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	ArrayList<Integer> numeros = new ArrayList<>();
	
	public void agregarNumero(Integer numero) {
		numeros.add(numero);
	}
	
	private ArrayList<Integer> getNumeros() {
		return numeros;
	}
	
	public Integer calcularSumaDeTodosLosNumeros() {
		Integer sumaDeTodos = 0;
		
		for(Integer num : this.getNumeros()) {
			sumaDeTodos += num;
		}
		return sumaDeTodos;
	}
	
	public Integer calcularRestaDeTodosLosNumeros() {
		Integer RestaDeTodos = 0;
		
		for(Integer num : this.getNumeros()) {
			RestaDeTodos -= num;
		}
		return RestaDeTodos;
	}
	
	public Integer calcularMultiplicacionDeTodosLosNumeros() {
		
		if (numeros.size() == 1) {
			return numeros.get(0);
		}
		
		Integer sumaDeTodos = numeros.get(0);
		
		for(int i = 1 ; i < numeros.size() ; i++ ) {
			sumaDeTodos *= numeros.get(i);
		}
		return sumaDeTodos;
	}
	
	/*
	private void laListaDeNumerosEstaVacia() {

	}
	*/
	

}
