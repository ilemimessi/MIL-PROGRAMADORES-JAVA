package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio14 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear un m�todo que permita ingresar un n�mero, 
	 * Determinar si el n�mero es positivo, negativo o cero.
	 * En el caso que corresponda devolver �Positivo� �negativo� o �cero�.
	 *  El n�mero es ingresado en el main.
	 */

		int numero;
		System.out.println("Ingrese un n�mero");
		numero=teclado.nextInt();
		System.out.println("El n�mero ingresado es un n�mero " + tipo(numero));
		
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