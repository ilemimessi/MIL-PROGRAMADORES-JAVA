package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°1 - MÓDULO 2: Creación de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Contador {
	
	//Clase creada a partir del EJERCICIO 4.
	
	//Atributos
	
	private int cont;

	//Constructores:
	
	public Contador() {
	
	}
	
	public Contador(int cont) {
		if (cont<=0) {
		this.cont=0;
		}
		this.cont = cont;
	}

	
	
	// Getter and Setter:
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	// Métodos de consigna:
	
	public void incrementar () {
		this.cont++;
	}
	
	public void decrementar () {
	if (cont<=0) {
		this.cont = 0;	//no puede ser menor a 0
	} else {
	 this.cont--;
	}
	}	
}