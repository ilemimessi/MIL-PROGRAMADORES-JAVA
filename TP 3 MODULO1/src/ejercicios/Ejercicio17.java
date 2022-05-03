package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear el m�todo primo que determine si un valor ingresado por el usuario es primo o no.
	 * Para esto el m�todo debe devolver un boolean.
	 * Suponga que el valor de entrada es ingresado en el main.
	 * Se debe mostrar un mensaje �ES PRIMO � o �NO ES PRIMO.�
	 */
	 
	Scanner teclado = new Scanner (System.in);
	int num;
	System.out.println("Ingrese un n�mero mayor a 1: ");
	num = teclado.nextInt();
	
	if (esPrimo(num)) {
		System.out.println("El n�mero ingresado es primo");
	} else {
		System.out.println("El n�mero ingresado no es primo");
	}
	}
	
	public static boolean esPrimo (int num) {
		boolean a=false;
		int cont = 0;
		for(int i=1; i<=num; i++) {
			if (num % i == 0 ) {
				cont++;
			}
		}
		if (cont!=2) {
			a=false;
		} else {
			a=true;
		}
		return a;
	}
}
