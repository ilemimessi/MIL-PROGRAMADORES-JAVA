package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Dado un numero k natural mayor a 10 mostrar todos los numeros primos que le anteceden. 
		// Por ejemplo si k=12 la salida sera {2,3,5,7,11}
	
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un número natural mayor a 10");
		int k = teclado.nextInt();
		while (k<=10) {
			System.out.println("Ingrese un número valido");
			k=teclado.nextInt();
		}
		

		if (k>10) {
		for (int i = 2; i < k ; i++) {
			int c = 2; 
			boolean esPrimo = true; 
			
		while (esPrimo && c < i) {
			if (i%c ==0) {
				esPrimo = false;
			}
			else {
				c++;
			}
		}
		

	
		
		if (esPrimo) {
			System.out.println(i + " es antecesor primo de " + k);
		}
		}
}
}
}

	


	
	