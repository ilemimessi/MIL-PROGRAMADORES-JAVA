package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear un método que reciba una opción:
	 * Si la opción es 1 devolver "inicio"
	 * Si es 2 "dashboard"
	 * Si es 3 devolver "home"
	 * Si es 4 devolver "panel"
	 * Sino es ninguna devolver "error".
	 * La opción es ingresada en el main.
	 */
	 
	Scanner teclado = new Scanner (System.in);
	int opcion;
	System.out.println("OPCIONES: 1)INICIO - 2)DASHBOARD - 3)HOME - 4)PANEL");
	System.out.println("Elija con números una opción: ");
	opcion = teclado.nextInt();
	
	
	/* SOLUCIÓN CON IF
	 * if (opcion == 1) { System.out.println("Tu elección fue: INICIO"); } else if
	 * (opcion == 2) { System.out.println("Tu elección fue: DASHBOARD"); } else if
	 * (opcion == 3) { System.out.println("Tu elección fue: HOME"); } else if
	 * (opcion == 4) { System.out.println("Tu elección fue: PANEL"); } else {
	 * System.out.println("ERROR"); }
	 */
	
	// SOLUCIÓN CON SWITCH:
	switch (opcion)
	{
	case 1:  System.out.println("Tu elección fue: INICIO");
	break;
	case 2:  System.out.println("Tu elección fue: DASHBOARD");
	break;
	case 3:  System.out.println("Tu elección fue: HOME");
	break;
	case 4:  System.out.println("Tu elección fue: PANEL");
	break;
	default:  System.out.println("ERROR");
	break;
	}
	}
}
