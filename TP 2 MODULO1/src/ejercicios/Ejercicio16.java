package ejercicios;
import java.util.Scanner; 

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dado un numero natural n mostrar sus digitos indivudualmente.
		
		int n; // Número natural. Número a dividir.
		System.out.println("Por favor ingrese un número natural");
		
		Scanner teclado;
		teclado = new Scanner (System.in);
		n = teclado.nextInt ();
		
		System.out.println("El número natural ingresado es " + n);
		 
		// Para mostrar los digitos individualmente, usando el sistema decimal dividimos el n°/10. 
		// Cada vez que se divida en 10, extrae el cociente, y como resto deja el último digito.
		
		int digito;
		int cont= 0;
		
		while (n!=0) //mientras no haya hecho todas las divisiones posible sobre este n°. 
		{
			digito= n%10;
			System.out.println("Digito: " + digito);
			n = n/10;  //romper con la condicion para que no se ejecute infinitas veces. N va a valer el cociente del numero ingresado
		//Cuando valga 0 va a parar.
			cont++;
		
		}
		System.out.println("Cantidad de digitos "+cont);
		
		}
	}


