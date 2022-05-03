package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear un m�todo que reciba una opci�n:
	 * Si la opci�n es 1 devolver "inicio"
	 * Si es 2 "dashboard"
	 * Si es 3 devolver "home"
	 * Si es 4 devolver "panel"
	 * Sino es ninguna devolver "error".
	 * La opci�n es ingresada en el main.
	 */
	 
	Scanner teclado = new Scanner (System.in);
	int opcion;
	System.out.println("OPCIONES: 1)INICIO - 2)DASHBOARD - 3)HOME - 4)PANEL");
	System.out.println("Elija con n�meros una opci�n: ");
	opcion = teclado.nextInt();
	
	
	/* SOLUCI�N CON IF
	 * if (opcion == 1) { System.out.println("Tu elecci�n fue: INICIO"); } else if
	 * (opcion == 2) { System.out.println("Tu elecci�n fue: DASHBOARD"); } else if
	 * (opcion == 3) { System.out.println("Tu elecci�n fue: HOME"); } else if
	 * (opcion == 4) { System.out.println("Tu elecci�n fue: PANEL"); } else {
	 * System.out.println("ERROR"); }
	 */
	
	// SOLUCI�N CON SWITCH:
	switch (opcion)
	{
	case 1:  System.out.println("Tu elecci�n fue: INICIO");
	break;
	case 2:  System.out.println("Tu elecci�n fue: DASHBOARD");
	break;
	case 3:  System.out.println("Tu elecci�n fue: HOME");
	break;
	case 4:  System.out.println("Tu elecci�n fue: PANEL");
	break;
	default:  System.out.println("ERROR");
	break;
	}
	}
}
