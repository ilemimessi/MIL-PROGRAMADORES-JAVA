package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crea una matriz de 3x3 con los números del 1 al 9.
	 * Mostrar por pantalla, tal como aparece la matriz.
	 */
	Scanner teclado = new Scanner (System.in);
	int [][] matriz = new int [3][3]; //Creación de matriz 3x3
	System.out.println("Ingrese valores del 1 al 9");
	cargarMatriz(matriz);
	mostrarMatriz(matriz);
	}
	public static void cargarMatriz (int [][]m) {
	Scanner teclado = new Scanner (System.in);
	for (int i=0; i<3; i++)	{
		for(int j=0; j<3; j++) {
		System.out.print("Ingrese valor " + i + ", " + j + " " );
		m [i][j] = teclado.nextInt();
}
	}
	}
	public static void mostrarMatriz (int [][]m) {
		for (int i=0; i<3; i++)	{
			System.out.println("\n"); // \n y \t -> tabulacion para que se vea como matriz
			for(int j=0; j<3; j++) {
			System.out.print("\t" + m [i][j]  );
			
	}
		}	
}
}
