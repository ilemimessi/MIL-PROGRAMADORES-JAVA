package ejercicios;
import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Crear dos matrices de mxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
	 *  Los valores y la longitud, serán insertados por el usuario.
	 *  Mostrar las matrices originales y el resultado.
	 */
	 
	Scanner teclado = new Scanner (System.in);
	
	int m, n; //cantidad de filas y columnas de matriz.
	
	//Solicitar al usuario filas y columnas para matriz.
	
	System.out.println("Ingrese la cantidad de filas para las matrices: ");
	m=teclado.nextInt(); // Cantidad de filas
	System.out.println("Ingrese la cantidad de columnas para las matrices: ");
	n=teclado.nextInt(); // Cantidad de columnas
	
	//Crear matriz mxn:
	
	int matrizA [][] = new int [m][n]; //Valores
	int matrizB [][] = new int [m][n]; //Otros Valores
	int matrizC [][] = new int [m][n];	// Suma de valores de A y B
	
	// Solicitar valores de matriz al usuario:
	
	System.out.println( "*** VALORES MATRIZ A *** ");
	for (int i=0; i<m ; i++) { //Hasta m para recorrer primero filas.
		for (int j=0; j<n; j++) { // n para recorrer luego columnas.
		System.out.println("Ingrese el elemento [" + i + "] " + " [" + j + "]" );
		matrizA [i][j] = teclado.nextInt();
		}
	}
	
	System.out.println( "*** VALORES MATRIZ B *** ");
	for (int i=0; i<m ; i++) { //Hasta m para recorrer primero filas.
		for (int j=0; j<n; j++) { // n para recorrer luego columnas.
		System.out.println("Ingrese el elemento [" + i + "] " + " [" + j + "]" );
		matrizB [i][j] = teclado.nextInt();
		}
	}
	
	//Suma de matrices:
	for (int i=0; i<m ; i++) { //Hasta m para recorrer primero filas.
		for (int j=0; j<n; j++) { // n para recorrer luego columnas
		matrizC [i][j] = matrizA [i][j] + matrizB [i][j];
	}

}
	System.out.println("Se creo la MATRIZ C, sumando MATRIZ A + MATRIZ B");
	teclado.close();
	System.out.println("*****************************************************************");
	System.out.println();
	
	// MATRIZ A :
	System.out.println();
	System.out.println("MATRIZ A: ");
	System.out.println();
	for (int i=0; i<m ; i++) { 
		for (int j=0; j<n; j++) { 
		System.out.print( matrizA [i][j] + " "  );
	}
		System.out.println();

	}
	// MATRIZ B :
	System.out.println();
		System.out.println("MATRIZ B: ");
		System.out.println();
		for (int i=0; i<m ; i++) { 
			for (int j=0; j<n; j++) { 
				System.out.print( matrizB [i][j] + " "  );
		}
			System.out.println();
	
		}
		
	// MATRIZ C :
		System.out.println();
		System.out.println("MATRIZ C: ");
		System.out.println();
		for (int i=0; i<m ; i++) { 
			for (int j=0; j<n; j++) { 
				System.out.print( matrizC [i][j] + " "  );
		}
			System.out.println();
			
		}
	}
}
