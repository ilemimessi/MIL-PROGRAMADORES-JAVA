package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear un m�todo que reciba dos n�meros reales.
	 *  Este m�todo debe devolver la multiplicaci�n entre esos dos n�meros.
	 * Los n�meros para probar este m�todo deben ser ingresados en el main.
	 */
	 double num;
	 double num2;
	 Scanner teclado = new Scanner(System.in);
	 System.out.println("Por favor ingrese 2 n�meros");
	 num=teclado.nextDouble();
	 num2=teclado.nextDouble();
	 System.out.println();
	 double resultado = multiplicacion(num,num2);
	 System.out.println("El resultado de la multiplicaci�n entre " + num + " y " + num2 + " es "  + resultado);
	
	}
public static double multiplicacion (double num, double num2) {
	double resultado = num * num2;
	return resultado;
}

}
