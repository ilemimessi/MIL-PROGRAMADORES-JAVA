package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio15 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Crear un método que permita ingresar usuario y contraseña. 
	 * Para que el usuario y contraseña sean válidos:
	 * Usuario: cris1234 - Contraseña: xf3C#
	 * Si el logueo es exitoso devolver true sino false.
	 *  El usuario y contraseña son ingresados en el main.
	 *  Si es exitoso mostrar “logueo exitoso”, sino “error logueo”.
	 */
	
	String usuario, contraseña;
	System.out.println("Ingrese usuario: ");
	usuario = teclado.nextLine();
	System.out.println("Ingrese contraseña: ");
	contraseña = teclado.nextLine();
	
	if (validacion (usuario, contraseña) == true) {
		System.out.println("LOGUEO EXITOSO");
	}else {
		System.out.println("ERROR LOGUEO");
	}
}
	public static boolean validacion(String usuario, String contraseña) {
		// TODO Auto-generated method stub
	boolean e= false;
	if (usuario.equals("cris1234") && contraseña.equals("xf3c#")) {
		e=true;
	}
	return e;
	}

		
		
	}
