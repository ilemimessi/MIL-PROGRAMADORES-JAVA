package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Genera 20 n° enteros entre 1 y 100 de forma aleatoria.
	 * Contar cuantos de esos números enteros son divisibles entre 5.
	 */
		
	int vector [] = new int [20];
	int contador = 0;
	
	for (int posicion = 0; posicion < vector.length; posicion ++) {
	vector [posicion] = (int) (Math.random() * 100) + 1; //casteo porque es double. Busca valores aleatorios.
		
	}
	System.out.println("*** 20 NÚMEROS ALEATORIOS ***");
	System.out.println();
	for (int posicion = 0; posicion < vector.length; posicion ++) {
		System.out.print(" " + vector [posicion] + " - ");
		
	}
	System.out.println();
	System.out.println();
	System.out.println("*** NÚMERO DIVISIBLES ENTRE 5 ***");
	
	for (int posicion = 0; posicion < vector.length; posicion ++) {
		if (vector[posicion] % 5 == 0) { //si el resto de %5 es 0 es divisible por 5. 
			contador++;
			System.out.println();
			System.out.println(" * " + vector[posicion] );
		}
		
	}
	System.out.println();
	System.out.println("El listado tiene " + contador + " números divisibles entre 5");
	System.out.println();

}
}
