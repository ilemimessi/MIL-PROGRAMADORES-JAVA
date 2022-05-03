package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�3 - M�DULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Genera 20 n� enteros entre 1 y 100 de forma aleatoria.
	 * Contar cuantos de esos n�meros enteros son divisibles entre 5.
	 */
		
	int vector [] = new int [20];
	int contador = 0;
	
	for (int posicion = 0; posicion < vector.length; posicion ++) {
	vector [posicion] = (int) (Math.random() * 100) + 1; //casteo porque es double. Busca valores aleatorios.
		
	}
	System.out.println("*** 20 N�MEROS ALEATORIOS ***");
	System.out.println();
	for (int posicion = 0; posicion < vector.length; posicion ++) {
		System.out.print(" " + vector [posicion] + " - ");
		
	}
	System.out.println();
	System.out.println();
	System.out.println("*** N�MERO DIVISIBLES ENTRE 5 ***");
	
	for (int posicion = 0; posicion < vector.length; posicion ++) {
		if (vector[posicion] % 5 == 0) { //si el resto de %5 es 0 es divisible por 5. 
			contador++;
			System.out.println();
			System.out.println(" * " + vector[posicion] );
		}
		
	}
	System.out.println();
	System.out.println("El listado tiene " + contador + " n�meros divisibles entre 5");
	System.out.println();

}
}
