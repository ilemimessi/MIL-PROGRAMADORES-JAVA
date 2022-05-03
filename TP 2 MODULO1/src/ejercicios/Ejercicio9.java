package ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Dados tres números, mostrarlos ordenados ascendentemente.
		 
		double a =155.44;
		double b = 200.20;
		double c = 3.8;
		
		if (a < b && a < c) {
			System.out.println("1. " + a);
		}
		else {
			if ( b < a && b < c) 
			{
				System.out.println("1. " + b);
			}
			else {
				System.out.println("1. " + c);
			}
		}
	
		if((a > b && a <c) || (a < b && a > c)) {
					System.out.println("2. " + a);
				}
				else {
					if((b > a && b <c) || (b < a && b > c))
					{
						System.out.println("2. " + b);
					}
					else {
						System.out.println("2. " + c);
					}
				}
		
		if (a > b && a > c) {
			System.out.println("3. " + a);
		}
		else {
			if ( b > a && b > c) 
			{
				System.out.println("3. " + b);
			}
			else {
				System.out.println("3. " + c);
			}
		}
			}
			
	
		}
					
					

// este ejercicio no lo hago con Vector y Ordenamiento porque todavía no lo habiamos visto para este TP.
