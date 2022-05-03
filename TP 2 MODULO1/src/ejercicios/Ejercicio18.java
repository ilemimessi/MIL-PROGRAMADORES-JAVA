package ejercicios;
import java.util.Scanner; 

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dado un numero natural K determinar si es capicua.
		//Nota: un numero capicua es aquel que se lee igual de derecha a izquierda y de izquierda a derecha.
		
		int k; // Número natural. 
		System.out.println("Por favor ingrese un número natural");
		
		Scanner teclado;
		teclado = new Scanner (System.in);
		k = teclado.nextInt ();
		
		System.out.println("El número natural ingresado es " + k);

		
		int aux = k;
		int inverso=0;
		
		while (k>0) {
			
		inverso = inverso*10; //En cada vuelta, el ultimo digito de la variable numero se multiplica x 10 para que se vaya corriendo al primer lugar.
		inverso = inverso + k%10;
		k = k/10;
		
		System.out.println("capicua"+inverso);
		}
		if (inverso==aux) {
			System.out.println(" Su número es capicua");
		}
		else {
			System.out.println( "Su número no es capicua");
		}
		
		
		}
	
	}


