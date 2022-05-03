package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Declare una variable de tipo entero y asigne un valor cualquiera.
		 * Determine si el numero es par o impar y muestre un mensaje con esa informacion.
		 * Mensaje: "El numero... es (par o impar)"
		 */	
		
		//Variable
		int var = 205;
		int resto =  var % 2;
		System.out.println("El resto de 205/2 es "+resto); //Un n° es par si es divisible x2. En ese caso el resto tiene que ser 0-
	
	if (resto == 0) {
		System.out.println("El número " + var + " es par");
	}
	else {
		System.out.println("El número " + var + " es impar");
	}
	
	}

}
