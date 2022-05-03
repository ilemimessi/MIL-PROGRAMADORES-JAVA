package modulo1;

public class Ejercicio14 {
	public static void main(String[] args) {
		System.out.println("Este es el ejercicio n°14");
		
	//UPCASTING: casteo implicito. El num int, pasa a double.
		
	int num=4;
	double otronum = num;
	
	
	
	
	//DOWNCASTING explicito. Se resuelve en tiempo de ejecución.
	
	double num2= 5.5;
	int num3 = (int) num2;
	
	
	System.out.println(num);
	System.out.println(otronum);
	System.out.println(num2);
	System.out.println(num3);	
		
		
}
}


