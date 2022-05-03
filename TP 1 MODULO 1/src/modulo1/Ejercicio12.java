package modulo1;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Este es el ejercicio n°12");
		
		boolean res = !false;
		System.out.println( "La negación de false es: " + res);
		
		boolean res2 = 7>4 && 2<1;
		System.out.println("El ejercicio tiene un valor falso por lo que el resultado es: " + res2);
		
		boolean res3 = 7>4 && 2>1;
		System.out.println("El ejercicio no tiene valores falsos por lo que el resultado es: " + res3);
		
		boolean res4 = 7<4 || 4>2;
		System.out.println("El ejercicio tiene un valor verdadero por lo que el resultado es: " + res4);
		
		boolean res5 = 7<4 || 4<2;
		System.out.println("El ejercicio no tiene valores verdaderos por lo que el resultado es: " + res5);
	}

}
