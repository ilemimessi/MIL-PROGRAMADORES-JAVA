package ejercicios;


public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Dado 3 numeros naturales que representan los lados de un triángulo.
		 * Se pide determinar si el triángulo es Isosceles, Escaleno o Equilatero.
		 * 1. Equilátero: Todos sus lados son iguales.
		 * 2. Isósceles: Dos de sus tres lados son de igual longitud.
		 * 3. Escaleno: Todos sus lados son de diferente longitud.
		 */
		 
		int a= 20;
		int b = 25;
		int c = 20;
		
		if (a==b && a == c) {
			System.out.println("El triangulo es EQUILATERO");
		}
			else { 
				if ((a==b && a!=c) || (a==c && a!=b) || (b==a && b!=c) || (b==c && b!=a)) {
					System.out.println("El triangulo es ISOSCELES");
			}
		
		else {
				System.out.println("El triangulo es ESCALENO");
			}
		
		}
	}
}

