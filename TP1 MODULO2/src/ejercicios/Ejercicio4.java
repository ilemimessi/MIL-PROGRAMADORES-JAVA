package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�1 - M�DULO 2: Creaci�n de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     /* Crea una clase llamada Contador que contenga un �nico atributo entero llamado cont.
	* La clase tendr� los siguientes constructores: Constructor por defecto Constructor con par�metros para inicializar el contador con un valor no negativo.
	* Si el valor inicial que se recibe es negativo el contador tomar� el valor cero como valor inicial.
	* Constructor copia. Adem�s de los m�todos getter y setter, la clase contendr� los m�todos:
	* incrementar: incrementa el contador en una unidad.
	* decrementar: decrementa el contador en una unidad.
	* El contador nunca podr� tener un valor negativo.
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
		System.out.println("No ser� valor negativo. Decremento y queda 0. Ej:");
		int cont3 = 0;
		System.out.println("Variable 3: " + cont3);
		Contador ejC3 = new Contador(cont3);
		ejC3.decrementar();
		System.out.println("Decrementar: " + ejC3.getCont());
	}

}
