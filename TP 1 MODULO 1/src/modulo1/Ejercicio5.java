package modulo1;

public class Ejercicio5 {
	public static void main(String[] args) {
	System.out.println("Este es el ejercicio n°5");
	
	int edad;
	edad=10;
	int edad2;
	edad2=30;
	
	
	// OPERADORES REALES Y ENTEROS
	//Operador suma
	int suma;
	suma= edad + edad2;
	System.out.println(suma);

	//Operador resta
	int resta;
	resta= edad - edad2;
	System.out.println(resta);

	//Operador producto
		int producto;
		producto= edad * edad2;
		System.out.println(producto);
	
	//Operador division
		double valor;
		valor = 10;
		int valor2;
		valor2 = 30;
		double division;
		division= valor / valor2;
		System.out.println(division);
	
	// OPERADORES LOGICOS
		boolean dato;
		dato = true;
		
		if (dato) {
			System.out.println("VERDADERO");
		}else {
			System.out.println("FALSO");
		}
		
		boolean dato2;
		dato2 = false;
		
		if (dato2) {
			System.out.println("VERDADERO");
		}else {
			System.out.println("FALSO");
		}
		
		boolean resultado;
		int a, b;
		a = 10;
		b = 20;
		resultado = a < b;
		System.out.println("El resultado es: " + resultado);
		
		boolean igual;
		igual = a == b;
		System.out.println("El resultado es: " + igual);
	
		
		
	// LOGICOS BOOLEANOS
		boolean res;
		res = (a<b) || (b>5);
		System.out.println("El resultado es: " + res);
		
		
	}
}
