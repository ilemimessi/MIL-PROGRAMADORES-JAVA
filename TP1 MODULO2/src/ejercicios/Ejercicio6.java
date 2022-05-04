package ejercicios;

import java.util.ArrayList;

/* MIL PROGRAMADORES JAVA - UNSA
 * PR�CTICO N�1 - M�DULO 2: Creaci�n de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisi�n T6 
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     /* Crea una clase DirectorCine con los atributos nombre (String), apellido(String) y edad (int). 
      * Crea los m�todos get y set para los atributos. 
      * Crea el m�todo constructor que tenga como par�metros cada uno de sus atributos. 
      * Luego crea otra clase llamada testEjercicio con el m�todo main y sigue los siguientes pasos:
      * 1) En el main, crea tres objetos DirectorCine que tengan como atributos respectivamente:
      * Pedro, G�mez, 31.
      * Juan, Su�rez, 55.
      * Elena, Albucar, 29.
      * 2) Crea un ArrayList de objetos DirectorCine.
      * 3) A�ade los tres objetos DirectorCine al ArrayList usando el m�todo add
      */
		
	// Ver CLASS DIRECTORCINE dentro del paquete. - Este ser�a el TEST EJERCICIO:
		
	DirectorCine ej = new DirectorCine ("Pedro" ,"Gomez" ,31);
	DirectorCine ej2 = new DirectorCine ("Juan" ,"Suarez" ,55);
	DirectorCine ej3 = new DirectorCine ("Elena" ,"Albucar" ,29);
	
	ArrayList<DirectorCine> lista = new ArrayList<DirectorCine>();
	lista.add(ej);
	lista.add(ej2);
	lista.add(ej3);
	
	System.out.println("*** DIRECTORES DE CINE ***");
	System.out.println();
	for (int i = 0; i<lista.size(); i++) {
		System.out.println("Nombre: " + lista.get(i).getNombre ());
		System.out.println("Apellido: " + lista.get(i).getApellido ());
		System.out.println("Edad: " + lista.get(i).getEdad ());
		System.out.println();
	}
		
	}

}
