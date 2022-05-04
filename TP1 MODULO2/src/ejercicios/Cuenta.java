package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°1 - MÓDULO 2: Creación de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Cuenta {
	
	//Clase creada a partir del EJERCICIO 5.

//ATRIBUTOS:
	private String NombreCliente;
	private String NumCuenta;
	private double TipoInteres;
	private double saldo;
	
	
// CONSTRUCTOR:
	public Cuenta () {
		
	}
	
	public Cuenta(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
		NombreCliente = nombreCliente;
		NumCuenta = numCuenta;
		TipoInteres = tipoInteres;
		this.saldo = saldo;
	}


// SETTERS Y GETTERS:
	
	public String getNombreCliente() {
		return NombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}

	public String getNumCuenta() {
		return NumCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		NumCuenta = numCuenta;
	}

	public double getTipoInteres() {
		return TipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		TipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
// METODOS POR CONSIGNA: 
	public boolean ingreso (double monto) {
	if (monto>=0) {
		this.saldo += monto; //+= sirve para sumarle una cantidad al valor de una variable.
		return true;
	} else {
		return false;
	}
	}
	public boolean reintegro (double monto) {
		if ((monto>=0) && (this.saldo>= monto)) {
			this.saldo -= monto; 
			return true;
		} else {
			return false;
		}
		}
	public void transferencia (Cuenta Destino, double monto ) {
		if (this.saldo>= monto) {
		if (this.reintegro(monto)) {
			Destino.ingreso(monto);
		} else {
			System.out.println("Error en la transferencia");
		}
		}
	else {
			System.out.println("No hay saldo suficiente para realizar una transferencia");
		}
}
}