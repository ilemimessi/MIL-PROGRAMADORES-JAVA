package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio15 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Crear un m�todo que permita ingresar usuario y contrase�a. 
	 * Para que el usuario y contrase�a sean v�lidos:
	 * Usuario: cris1234 - Contrase�a: xf3C#
	 * Si el logueo es exitoso devolver true sino false.
	 *  El usuario y contrase�a son ingresados en el main.
	 *  Si es exitoso mostrar �logueo exitoso�, sino �error logueo�.
	 */
	
	String usuario, contrase�a;
	System.out.println("Ingrese usuario: ");
	usuario = teclado.nextLine();
	System.out.println("Ingrese contrase�a: ");
	contrase�a = teclado.nextLine();
	
	if (validacion (usuario, contrase�a) == true) {
		System.out.println("LOGUEO EXITOSO");
	}else {
		System.out.println("ERROR LOGUEO");
	}
}
	public static boolean validacion(String usuario, String contrase�a) {
		// TODO Auto-generated method stub
	boolean e= false;
	if (usuario.equals("cris1234") && contrase�a.equals("xf3c#")) {
		e=true;
	}
	return e;
	}

		
		
	}
