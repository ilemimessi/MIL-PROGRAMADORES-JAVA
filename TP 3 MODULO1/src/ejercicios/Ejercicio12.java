package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: METODOS Y FUNCIONES
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio12 {
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear un m�todo que reciba cuatro notas de un estudiante.
	 *  Este m�todo debe devolver el promedio de esas notas.
	 *  Las notas para probar este m�todo deben ser ingresadas en el main
	 */
		
		
		double nota;
		double nota2;
		double nota3;
		double nota4;
	
		 System.out.println("Por favor ingrese 4 notas del 1 al 10");
		 nota=teclado.nextDouble();
		 nota2=teclado.nextDouble();
		 nota3=teclado.nextDouble();
		 nota4=teclado.nextDouble();
		 System.out.println();
		 double promedio = promedio(nota, nota2, nota3, nota4);
		 System.out.println("El promedio entre las notas ingresadas es de " + promedio);
		
		}
	public static double promedio(double nota, double nota2, double nota3, double nota4) {
		// TODO Auto-generated method stub
		double suma = nota + nota2 + nota3 + nota4;
		double promedio = suma/4;
		return promedio;
	}
	

	}

