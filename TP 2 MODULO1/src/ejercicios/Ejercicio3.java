package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el menor.
		
		int a = 5;
		int b = 104;
		int c = 5552;
		
		if (a > b && a > c) {
			System.out.println("El n�mero mayor es " + a);
		}
		else {
			if ( b > a && b > c) 
			{
				System.out.println("El n�mero mayor es " + b);
			}
			else {
				System.out.println("El n�mero mayor es " + c);
			}
			
		if (a < b && a < c) {
				System.out.println("El n�mero menor es " + a);
			}
			else {
				if ( b < a && b < c) 
				{
					System.out.println("El n�mero menor es " + b);
				}
				else {
					System.out.println("El n�mero menor es " + c);
				}	
			
			}
		}
	}
}

		
	
		
		
	


