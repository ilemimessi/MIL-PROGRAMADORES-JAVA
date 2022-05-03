package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio14 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear un método que permita ingresar un número, 
	 * Determinar si el número es positivo, negativo o cero.
	 * En el caso que corresponda devolver “Positivo” “negativo” o “cero”.
	 *  El número es ingresado en el main.
	 */

		int numero;
		System.out.println("Ingrese un número");
		numero=teclado.nextInt();
		System.out.println("El número ingresado es un número " + tipo(numero));
		
		}
	public static String tipo(int numero) {
		String t;
		if (numero==0) {	
		t= "Cero";
	} else if (numero<0) {
		t= "Negativo";
	} else {
		t= "Positivo";
	}
return t;	
}
}