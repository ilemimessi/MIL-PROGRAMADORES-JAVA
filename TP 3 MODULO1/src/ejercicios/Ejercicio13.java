package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio13 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear un m�todo que reciba un n�mero.
	 *  Si el n�mero esta entre 1 y 100: el m�todo debe devolver un n�1, sino un 0.
	 *  Las datos para probar este m�todo deben ser ingresadas en el main
	 */
	 
	int numero;
	System.out.println("Ingrese un n�mero");
	numero=teclado.nextInt();
	int buscar;
	if (buscar(numero)==1) {
		System.out.println(1 + " Es decir su n�mero est� entre 1 y 100");
	} else {
		System.out.println(0 + " Es decir su n�mero es menor a 1 o mayor a 100");
	}
	
	}

public static int buscar (int numero) {
	int e =0;
	for (int i=1; i<=100; i++) {
		if (numero==i) {
			e=1;
		}
	}
	return e;
	
}
}
