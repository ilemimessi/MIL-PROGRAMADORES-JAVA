package ejercicios;
import java.util.Scanner; //importar una libreria predeterminada de java para que el usuario escriba los segundos.

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Calcular la cantidad de minutos que existen en una cantidad de segundos ingresada por el usuario.
		 
		try (Scanner teclado = new Scanner (System.in)) {
			System.out.println("Ingrese un numero de 0 en adelante");
			double segundos = teclado.nextDouble();
			
			if (segundos > 0) {
			System.out.println("La cantidad de segundos que usted ingreso es: "+ segundos);	
			}
			else { 
				System.out.println("El número no es válido. Por favor ingrese un número mayor a 0");
			}
			
			double segxMin = 60; // 60 segundos cada 1 minuto.
			double minutos = segundos / segxMin;
			
			if ( segundos > 0 ) {
			System.out.println("La cantidad de minutos que existen en " + segundos + " segundos, " + "es de " + minutos);
			}
		}
		
		//CONSULTA!!
	// PROFE, como se puede hacer para que se vuelva a colocar un número en consola si le sale error al usuario? Sin la necesidad de volver a correr el programa?
	}

}
