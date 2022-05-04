package ejercicios;

import java.util.Scanner;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°1 - MÓDULO 2: Creación de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio1 {
static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*Crear una clase llamada Persona con los atributos: Nombre, Apellido, DNI, Domicilio.
	Con los métodos: Constructor y un método que permita mostrar la información de la persona. */
	
	// Ver CLASS PERSONA dentro del paquete. 
	
		
	
	String nombre, apellido, domicilio;
	int dni;
	
	System.out.println("Nombre: ");
	nombre = teclado.nextLine();
	
	System.out.println("Apellido: ");
	apellido = teclado.nextLine();
	
	System.out.println("Domicilio: ");
	domicilio = teclado.nextLine();
	
	System.out.println("DNI: ");
	dni = teclado.nextInt();
	
	//Por consola
	Persona objP = new Persona (nombre, apellido, domicilio, dni);
	objP.mostrarDatos();
	
	//Ingreso manual
	Persona objP2 = new Persona ("Pedro", "Lopez", "Belgrano 1", 202562532);
    objP2.mostrarDatos();
	}

}
