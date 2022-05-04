package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°1 - MÓDULO 2: Creación de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     /* Crea una clase llamada Contador que contenga un único atributo entero llamado cont.
	* La clase tendrá los siguientes constructores: Constructor por defecto Constructor con parámetros para inicializar el contador con un valor no negativo.
	* Si el valor inicial que se recibe es negativo el contador tomará el valor cero como valor inicial.
	* Constructor copia. Además de los métodos getter y setter, la clase contendrá los métodos:
	* incrementar: incrementa el contador en una unidad.
	* decrementar: decrementa el contador en una unidad.
	* El contador nunca podrá tener un valor negativo.
	* Si al decrementar se alcanza un valor negativo el contador toma el valor cero.
	 */
		
		// Ver CLASS CONTADOR dentro del paquete. 	
		
		int cont = 4;
		System.out.println("Variable 1: " + cont);
		Contador ejC = new Contador(cont);
		ejC.decrementar();
		System.out.println("Decrementar: " + ejC.getCont());
		System.out.println();
		int cont2 = 4;
		System.out.println("Variable 2: " + cont2);
		Contador ejC2 = new Contador(cont);
		ejC2.incrementar();
		System.out.println("Incrementar: " + ejC2.getCont());
		System.out.println();
		System.out.println("No será valor negativo. Decremento y queda 0. Ej:");
		int cont3 = 0;
		System.out.println("Variable 3: " + cont3);
		Contador ejC3 = new Contador(cont3);
		ejC3.decrementar();
		System.out.println("Decrementar: " + ejC3.getCont());
	}

}
