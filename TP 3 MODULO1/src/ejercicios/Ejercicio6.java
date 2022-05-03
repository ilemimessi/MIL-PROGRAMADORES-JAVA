package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Escriba un programa que determine si una palabra es pal�ndromo.
	 * Pal�ndromo: palabra o expresi�n que es igual si se lee de izq a derecha o de derecha a izq.
	 * Por ejemplo: arenera.
	 */
		
	String palabra;
	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Ingrese una palabra: ");
	palabra = teclado.nextLine();
	System.out.println();
	
	System.out.println("Usted ingreso la palabra: " + palabra);
	System.out.println("La cantidad de letras de su palabra es de: " + palabra.length() + " caracteres");
	System.out.println("�La palabra " + palabra + " es palindromo? " + esPalindromo(palabra));
	
	
	
	}
	
	public static boolean esPalindromo (String p) {
	String auxiliar = p;
	int i, k;
	k = p.length()-1;
	i= 0;
	while (i<p.length() && p.charAt(i)==auxiliar.charAt(k)) { //Es conveniente usar un while para que corte el ciclo una vez que no coincida una letra. {
		i++;
		k--;
	}
	if (i==p.length()) {System.out.println("Su palabra  es pal�ndromo.");
	
	return true; 
}
	
	else {System.out.println("Su palabra no es pal�ndromo.");
		return false; 
		
	}
	}
}