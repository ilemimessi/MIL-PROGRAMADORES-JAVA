package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�1 - M�DULO 2: Creaci�n de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio2 {
static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Crear una clase llamada serie con los atributos: titulo, n�meros de temporadas, g�nero y creador.
	Con los m�todos: Constructor mostrar todos los atributos, sobrescribir todos los atributos. */
	
	// Ver CLASS SERIE dentro del paquete. 
	
	Serie ej = new Serie ("Game of Thrones", 8, "Fantas�a", "HBO" );
	ej.mostrarDatos();
	
	}

}
