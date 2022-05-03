package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°3 - MÓDULO 1: ARRAYS-
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* Crea un vector de 20 n° reales correspondientes a los pesos de 20 personas.
	 * Obtener el peso mayor, el menor, el peso medio.
	 * Visualizar un mensaje si hay alguna persona con un peso mayor a 100 kg.
	 */
	
	// Creación de vector de pesos de 20 personas.
	Ejercicio2 ej = new Ejercicio2 ();
	
	int [] peso = { 45, 50, 75, 102, 55, 89, 66, 121, 99, 46, 55, 21, 17, 107, 20, 43, 59, 80, 94, 36 };
	
	
	
	// ORDENAR - MÉTODO INJERCIÓN. 
	
	ej.ordenarPeso (peso);

	// MOSTRAR PESO ORDENADO 
	
		ej.mostrarPeso (peso);
	
	
	// Obtener pesos: mayor
	System.out.println();
	System.out.println();
	System.out.println("*** PESO MAYOR *** ");
	System.out.println();
	int mayor=peso[peso.length-1];
	System.out.println("El peso mayor es: " + mayor + " kg.");
	 
	// Obtener pesos: menor
	System.out.println();
	System.out.println();
	System.out.println("*** PESO MENOR *** ");
	System.out.println();
	int menor=peso[0];
	 System.out.println("El peso menor es: " + menor + " kg.");
	
	// Obtener pesos: medio
	System.out.println();
	System.out.println();
	System.out.println("*** PESO MEDIO *** ");
	System.out.println();
	int medio=peso[(peso.length-1)/2];
	System.out.println("El peso medio es: " + medio + " kg.");
    
    // Pesos mayores a 100kg.
	
	ej.pesoMasCien (peso);
	
	}

	



	private void pesoMasCien(int[] peso) {
		// TODO Auto-generated method stub
	
		System.out.println();
		System.out.println("*** PESOS MAYORES A 100KG ***");	
		
	for (int j=0; j<peso.length; j++) {
	if (peso[j]>100) {
		System.out.println();
		System.out.print( peso[j] + " es un peso mayor a 100kg.");
		System.out.println();
	}
	}
	}



	private void mostrarPeso(int[] peso) {
		// TODO Auto-generated method stub
   System.out.println("*** PESO ORDENADO ***");
   System.out.println();
	for (int i=0; i<peso.length; i++) {
		System.out.print(peso[i] + ", ");
	
	}
	}

	private void ordenarPeso(int[] peso) {
		// TODO Auto-generated method stub
	for (int i=1; i< peso.length; i++) {
		int aux = peso [i];
		int j;
	for (j= i-1; j>=0 && peso [j] > aux; j--) {
		peso [j+1] = peso [j];
		}
		peso [j+1]= aux;
	}
	}

	
	
	
}
