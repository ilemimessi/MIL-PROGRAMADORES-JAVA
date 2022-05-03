package ejercicios;

//A este ejercicio no se como hacerlo sin Arrays. 

public class Ejercicio17 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dada un lista de numero naturales mostrar aquellos que tengan una cantidad par de digitos pares.
		
		//LISTA DE NÚMEROS

		int n = 5; //Cantidad de elementos de la lista
		int [] listaNaturales = new int [n];
		
		listaNaturales[0] = 258921;  // -->  cantidad de digitos pares: 3 (es impar => No Mostrar) 
		listaNaturales[1] = 68;     // * -->  cantidad de digitos pares: 2 (es par => Mostrar)
		listaNaturales[2] = 2;    // -->  cantidad de digitos pares: 1  es impar => No Mostrar)
		listaNaturales[3] = 3569;    // -->  cantidad de digitos pares: 1  es impar => No Mostrar)
		listaNaturales[4] = 883366;  // * -->  cantidad de digitos pares:  (es par => Mostrar)

		
		System.out.println("Elementos de la lista de Naturales:");
		System.out.println();
		
		// Mostrar Lista
		for (int k=0; k < n; k++) {
			if (listaNaturales[k] > 0) { // Verifica que Elemento es Natural
				System.out.print(listaNaturales[k] + "   ");
			}else { // El Elemento es Incorrecto. No es Natural
				System.out.print("( " + listaNaturales[k] + "  Posicion " + k + " NO ES NATURAL)   ");
			}
			
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
		// Números con Cantidad de Digitos Pares
		
		
		int natural , cantDigitosPares;
		for (int i=0; i<n; i++) { // Ciclo que lee elementos de la lista.
			natural = listaNaturales[i]; // Separa elementos de la lista.
			cantDigitosPares = 0; // Cantidad de digitos de cada elemento.
			
		
				while (natural > 0) { // Mientras sea mayor a 0
					
					if ((natural%10)%2 == 0) { // %10 para extraer el ultimo digito y % 2 = 0 indica si es par
						cantDigitosPares++; // si es par incrementa contador. 
					}
					natural = natural / 10; // Quita el digito ya evaluado y vuelve a comenzar. 
				}
				if ((cantDigitosPares % 2) == 0) { // Si la cantidad par de digitos es par muestra el número.
					System.out.println(listaNaturales[i]+ " Tiene cantidad par de números pares ");
				}
				else {
					System.out.println(listaNaturales[i]+ " No tiene cantidad par de números pares");
				}
					
				
		

		}
		
		
	}



	}


	