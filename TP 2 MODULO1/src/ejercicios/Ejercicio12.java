package ejercicios;


public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Dada un lista con las edades de N deportistas:
		* Informar la edad promedio de los deportistas de la lista; 
		* Cual es la menor y la mayor edad ingresada.
		 */
		
		int dep1= 25;
		int dep2 = 36;
		int dep3 = 18;
		int dep4 = 22;
		int dep5 = 32;
		
		//CALCULO PROMEDIO
		int suma = dep1 + dep2 + dep3 + dep4 + dep5;
		int promedio = suma/5;
		
		System.out.println("El promedio de edad de los 5 deportistas es de "+ promedio +" años");
		
		
		// DEPORTISTA MAYOR
		if (dep1 > dep2 && dep1 > dep3 && dep1 > dep4 && dep1 > dep5) {
			System.out.println("El mayor de los deportistas tiene " + dep1 + " años");
		}
		else {
			if (dep2 > dep1 && dep2 > dep3 && dep2 > dep4 && dep2 > dep5) {
				System.out.println("El mayor de los deportistas tiene " + dep2 + " años");
			}
		else {
			if (dep3 > dep1 && dep3 > dep2 && dep3 > dep4 && dep3 > dep5) {
				System.out.println("El mayor de los deportistas tiene " + dep3 + " años");
				}
		else {
			if (dep4 > dep1 && dep4 > dep2 && dep4 > dep3 && dep4 > dep5) {
					System.out.println("El mayor de los deportistas tiene " + dep4 + " años");
					}
			else {
				System.out.println("El mayor de los deportistas tiene "+ dep5 + " años");
			}
			}	
		
		}
	}
		
		// DEPORTISTA MENOR
				if (dep1 < dep2 && dep1 < dep3 && dep1 < dep4 && dep1 < dep5) {
					System.out.println("El menor de los deportistas tiene " + dep1 + " años");
				}
				else {
					if (dep2 < dep1 && dep2 < dep3 && dep2 < dep4 && dep2 < dep5) {
						System.out.println("El menor de los deportistas tiene " + dep2 + " años");
					}
				else {
					if (dep3 < dep1 && dep3 < dep2 && dep3 < dep4 && dep3 < dep5) {
						System.out.println("El menor de los deportistas tiene " + dep3 + " años");
						}
				else {
					if (dep4 < dep1 && dep4 < dep2 && dep4 < dep3 && dep4 < dep5) {
							System.out.println("El menor de los deportistas tiene " + dep4 + " años");
							}
					else {
						System.out.println("El menor de los deportistas tiene "+ dep5 + " años");
					}
					}	
				
				}
			}
		
		
		
		
}
}


