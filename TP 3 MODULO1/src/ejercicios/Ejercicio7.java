package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio7 {
	static Scanner teclado = new Scanner (System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Escriba un programa que determine la cantidad de vocales y consonantes de una palabra.
	
	String palabra;
	int contadorVocales=0; 
	int contadorConsonantes=0;
	
	palabra = ingreso();
	contar (palabra, contadorVocales, contadorConsonantes);

	
	 
	}

	public static void contar(String palabra, int contadorVocales, int contadorConsonantes) {
		// TODO Auto-generated method stub
		int i;
		char [] c= palabra.toCharArray(); //Vector de caracteres.
		for (i=0; i<c.length;i++) {
			if (c[i]== 'a' || c[i]== 'e' || c[i]== 'i' || c[i]== 'o' || c[i]== 'u' ) {
				contadorVocales ++;
			}
			else {
				contadorConsonantes++;
			}
		}
		System.out.println("La palabra " + palabra + " tiene " + contadorVocales + " vocales, y  " + contadorConsonantes + " consonantes." );
	}


	public static String ingreso() {
		// TODO Auto-generated method stub
		String palabra;
		System.out.println("Ingrese una palabra: ");
		palabra= teclado.next();
		palabra.toLowerCase(); //Pasar todas a minusculas. 
		return palabra;
	}

}
