package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio8 {
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Ingrese 10 nombres de personas en un vector.
	 * Luego ingrese un nombre cualquiera y búsquelo en el vector.
	 * Si el nombre aparece en el vector mostrar "Nombre Encontrado".
	 * En caso contrario "Nombre no encontrado".
	 */
	String buscar;
	String []lista = new String [10];
	ingreso (lista);
	buscar = busqueda ();
	encontrar (lista, buscar);
	
	
	 
	}

		
		public static void encontrar(String[] lista, String buscar) {
		// TODO Auto-generated method stub
		int i=0, e=0;
		while (i<lista.length && e==0) {
			if (lista [i].equals(buscar)) { //Compara 2 strings -> lista y el nombre a buscar. 
				e=1; // -> lo uso como encontrado. Inicia en 0, pero si encuentra se pasa a 1. 
			} else {
				i++; //-> si no encuentra el nombre, que busque en el siguiente. 
			}
		}
		if (e==1) {
			System.out.println("NOMBRE ENCONTRADO");
		}
		else {
			System.out.println("NOMBRE NO ENCONTRADO");
		}
		
	}

		// UN NOMBRE A BUSCAR POR CONSOLA.
		public static String busqueda() {
		// TODO Auto-generated method stub
			String nombre;
			System.out.println("¿Qué nombre quiere buscar?");
			nombre=teclado.next();
			return nombre;
	}


	
		// PEDIDA DE INGRESO DE DATOS POR CONSOLA
	public static void ingreso(String[] lista) {
		// TODO Auto-generated method stub
	for (int i= 0; i<lista.length; i++) {
		System.out.println("Ingrese nombre de persona: ");
		lista [i] = teclado.next();
	}
	}

}
