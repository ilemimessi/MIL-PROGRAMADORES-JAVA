package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	//Declarar una variable de tipo cadena (String) y una variable de tipo entero, asignar a la
		variable string tu nombre y a la variable entera tu edad y mostrar el mensaje "Mi nombre
		es...y mi edad es...""*/
				
		
		
		// VARIABLE TIPO CADENA
		
		String nombre; //Comienza con mayuscula porque es una clase. 
		nombre = "Ileana Mimessi";
		
		
		// VARIABLE TIPO ENTERA
		
		int edad;
		edad = 27;
		
		System.out.println("Mi nombre es " + nombre + " y mi edad es " + edad);
		
		// calcular cantidad de caracteres
		
		int tam = nombre.length();
		System.out.println("Cantidad de caracteres: " + tam);

	
		
	}

}
