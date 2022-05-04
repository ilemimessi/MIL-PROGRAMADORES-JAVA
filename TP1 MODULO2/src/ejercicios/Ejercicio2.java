package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°1 - MÓDULO 2: Creación de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio2 {
static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Crear una clase llamada serie con los atributos: titulo, números de temporadas, género y creador.
	Con los métodos: Constructor mostrar todos los atributos, sobrescribir todos los atributos. */
	
	// Ver CLASS SERIE dentro del paquete. 
	
	Serie ej = new Serie ("Game of Thrones", 8, "Fantasía", "HBO" );
	ej.mostrarDatos();
	
	}

}
