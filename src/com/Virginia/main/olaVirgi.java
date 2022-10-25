package com.Virginia.main;

public class olaVirgi {

	public static void main(String[] args) {
		
		boolean estaLloviendo = true;
		boolean taroBajoLluvia = true;
		boolean lluviaMoja = false;
		
		//&& AND
		//|| OR
		
		//boolean taroMojandose = (estaLloviendo || taroBajoLluvia) && !lluviaMoja;
		
		//boolean popoCaca = true;
		/*if((estaLloviendo || taroBajoLluvia) && !lluviaMoja) {
			System.out.println("Taro esta mojandose");
		}else {
			System.out.println("Taro no esta mojandose");
		}*/
		
		/*while(estaLloviendo && taroBajoLluvia) {
			System.out.println("Taro esta mojandose");
			estaLloviendo = false;
		}*/
		
		int numero = 0;
		
		/*while(numero <= 10) {// 0  1  2       10  11
			System.out.println(numero); // 0  1  2  10
			numero = numero + 1;// 1  2  3   11
		}*/
	/*	
		do {
			System.out.println(numero); // 0  1  2  10
			numero = numero + 1;// 1  2  3   11
		}while(numero <=10);
		
		System.out.println("Terminamos con numero en " + numero);*/
		/*
		if(taroBajoLluvia) {
			while(numero == 10) {
				int uwu = 0;
				if(estaLloviendo) {
					numero = 2000;
				}
				uwu = 10;
			}
		}*/
		
		/*
		for(int i = 0;i < 10;i++) {
			System.out.println(i);
			break;
		}*/
		
		int resultado = 30;
		
		/*if(resultado == 10) {
			System.out.println("Hola Mundo, salio 10");
		}else if(resultado == 9) {
			System.out.println("Hola Mundo, salio 9");
		} else if(resultado == 6) {
			System.out.println("Hola Mundo, salio 6");
		} else {
			System.out.println("Hola Mundo, salio otra cosa");
		}*/
		System.out.println("Hola Mundo, salio " + resultado);
		if(resultado < 6) {
			System.out.println("Inscribete a bonice");
		}
			
		switch(resultado) {
			case 11:{
				System.out.println("Hola Mundo, salio 11");
				break;
			}
			case 10:{
				System.out.println("Hola Mundo, salio 10");
				break;
			}
			case 8:
			case 7:
			case 9:{
				System.out.println("Hola Mundo, no fue 10, pero no pansaste");
				break;
			}
			case 6:{
				System.out.println("Hola Mundo, pansaste");
				break;
			}
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:{
				System.out.println("Hola Mundo, valiste burger");
				break;
			}
			default:{
				System.out.println("Hola Mundo, empezamos algo para validar que pedo");
				break;
			}
		}
		
	}
	
}
