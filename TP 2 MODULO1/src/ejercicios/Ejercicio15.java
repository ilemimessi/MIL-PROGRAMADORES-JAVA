package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dado un numero natural N. Determinar si este es primo.
		 
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un número natural mayor a 1");
		int n = teclado.nextInt();
		esPrimoONo (n);
		while (n<=1) {
			System.out.println("Ingrese un número valido");
			n=teclado.nextInt();
		esPrimoONo (n);
		}
		}
	
	public static boolean esPrimoONo (int n) {
		
		if (n>1) {
		for (int i = 2; i<= (n/2); i++) { // n/2 porque si no encontras divisores hasta la mitad del numero ya no es primo
		if (n%i == 0) {				//si es divisible x 2 ya no es primo.
			System.out.println(n + " no es primo");
			return false;
		}
		}
		}
		if (n>1) {
		System.out.println(n + " es primo");
		
	}
		return true;
	}
}


