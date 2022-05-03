package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Declare dos variables de tipo entero una con el nombre divisor y la otra dividendo.
		 *  Asigne a dividendo el valor 25 y a la variable divisor el valor 10.
		 *  Muestre el resto (%) de la division entre dividendo y divisor. 
		 *  Luego a dividendo asigne el valor 25/10. 
		 *  Y vuelva a mostrar el resto entre dividendo  y divisor.
		 */
		
		int divisor = 10;
		int dividendo = 25;
		int resto = dividendo % divisor;
		System.out.println("Primero el  resto es " + resto);
		
		int dividendo2 = 25/10;
		int resto2 = dividendo2 % divisor;
		System.out.println("Luego el resto es " + resto2);
	}

}
