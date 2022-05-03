package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Dado un numero natural N se desea conocer sus divisores y la suma de todos ellos.
		 * No considerar el 1 si mismo.
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese un numero mayor a 1");
		int n = teclado.nextInt();
		int suma = 0;
		if (n > 1) {
			System.out.println("El número que usted ingreso es: "+ n);	
			for (int i= 1; i<=n; i++) {
				if (n % i ==0 ) {
					suma+=i;
					System.out.println(i + " es divisor de " + n);
					}
			}
			System.out.println("La suma de los divisores es igual a " +suma);
			}
			else { 
				System.out.println("El número no es válido. Por favor ingrese un número mayor a 1");
			}
		
		
		}
	}


