package ejercicios;

public class Ejercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Declarar dos variables, asignar un valor cualquiera y realizar las siguientes operaciones: 
		 * Mostrar la suma
		 * Mostrar la multiplicacion 
		 * Mostrar la resta
		 * Mostrar Division
		 */
		
		//Variables
		int var = 10;
		int var2 = 30;
		System.out.println("Mi variable 1 es " + var + " y mi variable 2 es " + var2);
		
		
		//SUMA
		int suma;
		suma = var + var2;
		System.out.println("La suma de mis variables es igual a " +suma);
		
		//RESTA
		int resta;
		resta = var2 - var;
		System.out.println("La resta de mis variables es igual a " +resta);
		
		//MULTIPLICACIÓN
		int producto;
		producto = var2 * var;
		System.out.println("La multiplicación de mis variables es igual a " +producto);
		
		//DIVISIÓN
		int division;
		division = var2 / var;
		System.out.println("La división de mis variables es igual a " +division);
				
	}
}
