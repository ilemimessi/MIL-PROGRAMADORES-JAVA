package ejercicios;

public class NumerosEnteros {
	
	/* Crear una clase NumerosEnteros y redefinir las operaciones elementales (+, -, *, /).
	* Esta clase tendr� los m�todos suma (), resta(), multiplicaci�n() y divisi�n() 
	que recibir�n como par�metros otro objeto de la misma clase NumerosEnteros.
	*/
	
	//Clase creada a partir del EJERCICIO 3.
	
//	ATRIBUTO:
	private int num;
	
//	METODOS:
	public NumerosEnteros() {
		// TODO Auto-generated constructor stub
	}
	
	public NumerosEnteros(int num) {
		
		this.num = num;
	}
	
//	SETTERS && GETTERS
	
	public void setNum(int num) {
		this.num = num;
	}
		
	public int getNum() {
		return num;
	}

//OPERACIONES
	public int suma(NumerosEnteros ej) {
		
		return this.num + ej.num;
	}
	
	public int resta(NumerosEnteros ej) {
		
		return this.num - ej.num;
	}
	
	public int multiplicacion(NumerosEnteros ej) {
		
		return this.num * ej.num;
	}
	
	public double division(NumerosEnteros ej) {
	 
		return this.num / ej.num;
		
		
	}
}

