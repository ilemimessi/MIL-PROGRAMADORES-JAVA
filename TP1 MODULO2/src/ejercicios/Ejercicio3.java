package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�1 - M�DULO 2: Creaci�n de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio3 {
static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Crear una clase NumerosEnteros y redefinir las operaciones elementales (+, -, *, /).
		* Esta clase tendr� los m�todos suma (), resta(), multiplicaci�n() y divisi�n() 
		que recibir�n como par�metros otro objeto de la misma clase NumerosEnteros.
		*/

		// Ver CLASS NUMEROS ENTEROS dentro del paquete. 	
	
		int n, n2;
		NumerosEnteros objn   = new NumerosEnteros();  
		NumerosEnteros objn2 = new NumerosEnteros();
		
		System.out.println("ingrese el primer n�mero: ");
		n = teclado.nextInt();
		objn.setNum(n);
		
		System.out.println("ingrese el segundo n�mero: ");
		n2 = teclado.nextInt();
		objn2.setNum(n2);
		
		System.out.println("La Suma de " + n  + " y " + n2 + " es igual a " + objn.suma(objn2));
		System.out.println("La Resta de " + n  + " y " + n2 + " es igual a " + objn.resta(objn2));
		System.out.println("La Multiplicaci�n de " + n  + " y " + n2 + " es igual a " + objn.multiplicacion(objn2));
		System.out.println("La Divisi�n de " + n  + " y " + n2 + " es igual a " + objn.division(objn2));
	
	}

}
