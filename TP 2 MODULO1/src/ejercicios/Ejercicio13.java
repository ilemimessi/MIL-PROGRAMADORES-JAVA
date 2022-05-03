package ejercicios;

import java.util.Scanner;


public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Dado un natural K.
		 * Generar y mostrar todos los numeros enteros pares comprendidos en el intervalos [-K,K].
		 * Considerar K mayor que 1.
		 */
		Scanner teclado = new Scanner (System.in);
		
			System.out.println("Ingrese un numero mayor a 1");
			int k = teclado.nextInt();
			
			if (k > 1) {
				System.out.println("El número que usted ingreso es: "+ k);	
				for (int i=-k; i<=k; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
						}
				}
				}
				else { 
					System.out.println("El número no es válido. Por favor ingrese un número mayor a 1");
				}
		
	
				
		
		
		}
	}


