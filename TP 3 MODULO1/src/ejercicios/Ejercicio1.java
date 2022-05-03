
/* MIL PROGRAMADORES JAVA - UNSA
   * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
   * Alumna: Ileana Mimessi
   * Profesor: Benito Arrieta
   * Comisión T6 
   */

package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Crea un array de 10 n° enteros, con valores solicitados por teclado. 
	 * Mostrar por consola el índice y el valor de  cada elemento. 
	 * Realizar 2 metodos: uno para el ingreso de datos y otro para el de salida de datos.
	 */
		
	
		

		
		System.out.println("*** 10 VALORES ENTEROS ***");
		System.out.println();
		
	
		
	// CREACIÓN DE VECTOR
		int [] numeros;
		numeros = new int [10];
		
	// CREAR OBJETO PARA MÉTODOS
		
				Ejercicio1 ej = new Ejercicio1 ();
				ej.solicitarValores (numeros);
				ej.mostrarValores (numeros);
				
				

		
		
	}
	
	private void mostrarValores(int[] numeros) {
		// TODO Auto-generated method stub
		// MOSTRAR ÍNDICE Y VALORES:
		
		System.out.println();
		System.out.println("*** POSICIÓN DE SUS VALORES ***");
		System.out.println();
		
		for (int i=0 ; i<10; i++) {
		System.out.println("["+ i + "]" + "=" + numeros[i]);
	}
	}

	private void solicitarValores(int[] numeros) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// SOLICITAR VALORES:
		for (int i = 0 ; i < 10; i++) {
		System.out.println("Por favor ingrese valor entero: ");
		numeros[i] = teclado.nextInt();
		}
	}
}



