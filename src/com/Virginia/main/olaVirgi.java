package com.Virginia.main;

public class olaVirgi {

	public static void main(String[] args) {
		System.out.println("El resultado de la suma es " + suma(1,1));
		int resultadoSuma = suma(5000,-4000);
		int adicionUwu = suma(resultadoSuma, 10);
		System.out.println(adicionUwu);
		
		System.out.println("hello_virgi acaba de crear una resta");
		System.out.println("alo polisia " + resta(1,1));
		System.out.println("Estoy multiplicando " + multiplicacion(1,1));
	}
	
	static int suma(int numUno, int numDos) {
		System.out.println("Estoy sumando");
		return numUno + numDos;
	}
	
	static int resta(int numUno, int numDos) {
		return numUno - numDos;
	}
	
	static int multiplicacion(int numUno, int numDos) {
		return numUno * numDos;	
	}
	static String saludar() {
		return "Hola";
	}
	
	static void nada() {
		System.out.println("Jola mundo");
	}
	
}
