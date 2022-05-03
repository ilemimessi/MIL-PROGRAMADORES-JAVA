package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio5 {
	static Scanner teclado = new Scanner (System.in);	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Dada una lista de n° enteros separarla en 2 listas ordenadas de menor a mayor.
	 * La primera con n° pares
	 * La segunda con n° impares
	 */
		
		int tam;
		System.out.println("Ingrese el tamaño de la lista");
		tam = teclado.nextInt();
		int [] lista = new int [tam]; //Declaro el Array.
		ArrayList <Integer> pares = new ArrayList <Integer> () ; //se usa un ArrayList para adaptar el vector a la cantidad que se declare. 
		ArrayList <Integer> impares = new ArrayList <Integer> () ;
		
		ejercicio5 (lista, pares, impares);
	}

	public static void ejercicio5(int[] lista, ArrayList<Integer> pares, ArrayList<Integer> impares) {
		// TODO Auto-generated method stub
		ingreso (lista);
		separar (lista,pares,impares);
		ordenar (pares);
		ordenar (impares);
		
		if (pares.size()==0) {
		System.out.println("\nNo hay pares");
	}
		else {
			mostrar (pares);
		
		}
		
		if (impares.size ()==0) {
		System.out.println("\nNo hay impares");
		}
		else {
			mostrar2 (impares);
		}
	}
	public static void mostrar(ArrayList<Integer> pares) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("*** LISTA DE N° PARES ***");
		System.out.println(pares);
	}
	
	public static void mostrar2(ArrayList<Integer> impares) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("*** LISTA DE N° IMPARES ***");
		System.out.println(impares);
	}

	private static void ordenar(ArrayList<Integer>lista) { //Método de ordenamiento: selección
		// TODO Auto-generated method stub
		int i, k, p, aux, limit = lista.size()-1;
		for (k=0; k<limit; k++) {
			p=k;
			for (i = k+1; i<=limit; i++) {
				if (lista.get(i) < lista.get(p)) p =i;
				if (p!= k) {
					aux = lista.get(p);
					lista.set (p, lista.get(k));
					lista.set (k,aux);
				}
			}
		}
		
	}

	public static void separar(int[] lista, ArrayList<Integer> pares, ArrayList<Integer> impares) {
		// TODO Auto-generated method stub
		for (int i=0; i<lista.length; i++) {
			if (lista [i]%2==0) {
				pares.add(lista[i]); //Si me da resto 0 lo agrego al array list de pares.
			}
			else {
				impares.add(lista[i]); //Sino al de impares.
			}
		}
	}

	public static void ingreso(int[] lista) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<lista.length; i++) {
			System.out.println("Ingrese el valor de la posición " + i);
			lista [i]  = teclado.nextInt ();
			
		}
		
	}

}
