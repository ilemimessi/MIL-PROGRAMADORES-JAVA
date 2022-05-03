package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear un método que reciba dos números reales.
	 *  Este método debe devolver la multiplicación entre esos dos números.
	 * Los números para probar este método deben ser ingresados en el main.
	 */
	 double num;
	 double num2;
	 Scanner teclado = new Scanner(System.in);
	 System.out.println("Por favor ingrese 2 números");
	 num=teclado.nextDouble();
	 num2=teclado.nextDouble();
	 System.out.println();
	 double resultado = multiplicacion(num,num2);
	 System.out.println("El resultado de la multiplicación entre " + num + " y " + num2 + " es "  + resultado);
	
	}
public static double multiplicacion (double num, double num2) {
	double resultado = num * num2;
	return resultado;
}

}
