package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Crea un vector de 10 n° reales con valores solicitados al usuario.
		 * Solicitar una posición entre 0 y 9.
		 * Eliminar el elemento situado en esa posición sin dejar hueco. 
		 * Visualizar el vector resultante.
		 */
	
	System.out.println("*** 10 NÚMEROS REALES ***");
	System.out.println();
	int tam = 10;
	int [] reales;
	reales = new int [tam];
	Ejercicio3 ej = new Ejercicio3 ();
	ej.solictarValores (reales);
	ej.eliminarPosicion (reales,2, tam);
	 tam = tam - 1;
	ej.mostrarTabla (reales, tam);
	
	}

	private void mostrarTabla(int[] reales, int tam) {
		// TODO Auto-generated method stub
		System.out.println("La tabla queda: ");
		for(int i=0;i<tam;i++)
		{    System.out.println(reales[i]);}
	}

	private void eliminarPosicion(int[] reales,int pos, int tam ) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Por favor ingrese una posición del 0 al 9");
		int i;
		pos=teclado.nextInt();
		 for (i=pos;i<reales.length-1;i++)
		 {reales[i]=reales[i+1];    //Para no dejar hueco, incremento 1. 
		 
	}
	
	}

	private void solictarValores(int[] reales) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		for (int i = 0; i<10; i++) {
			System.out.println("Por favor ingrese valor real: ");
			reales[i] = teclado.nextInt();
		}
	}
	
	

}
