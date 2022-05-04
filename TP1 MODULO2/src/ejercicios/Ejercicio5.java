package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°1 - MÓDULO 2: Creación de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     /* Escribe una clase Cuenta para representar una cuenta bancaria.
      * Los datos de la cuenta son: 
      * nombre del cliente (String), número de cuenta (String), tipo de interés (double) y saldo (double).
      * La clase contendrá los siguientes métodos: 
      * Constructor  por defecto y Constructor con todos los parámetros Constructor copia. 
      * Métodos setters/getters para asignar y obtener los datos de la cuenta. 
      * Métodos ingreso y  reintegro. 
      * Un ingreso consiste en aumentar el saldo en la cantidad que se indique. Esa cantidad no puede ser negativa. 
      * Un reintegro consiste en disminuir el saldo en una cantidad pero antes se debe comprobar que hay saldo suficiente. 
      * La cantidad no puede ser negativa. 
      * Los métodos ingreso y reintegro devuelve true si la operación se  ha podido realizar o false en caso contrario. 
      * Método de transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero
      * suficiente para poder hacerla. 
      * Ejemplo de uso del método transferencia:
      * cuentaOrigen.transferencia(cuentaDestino, importe); que indica que queremos hacer
      * una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.
      */
		
	// Ver CLASS CUENTA dentro del paquete.
		
		double monto = 20000.65;
		
		
		 String NombreCliente = "Luna Q";
		 String NumCuenta = "02562548";
		 double tipoInteres = 0;
		 double saldo = 93000.40;
		 
		 String NombreClienteB = "Alma M";
		 String NumCuentaB = "0426688";
		 double tipoInteresB = 2;
		 double saldoB = 25000.05;
		 
		 Cuenta cuentaA = new Cuenta (NombreCliente, NumCuenta, tipoInteres, saldo);
		 Cuenta cuentaB = new Cuenta (NombreClienteB, NumCuentaB, tipoInteresB, saldoB);
		
		 cuentaA.transferencia(cuentaB, monto);
		 System.out.println("Saldo cuenta A: " + cuentaA.getSaldo());
		 System.out.println("Saldo cuenta B: " + cuentaB.getSaldo());
		 
		 double monto3 = 4000;
		 cuentaA.reintegro(monto3);
		 System.out.println("Saldo cuenta A: " + cuentaA.getSaldo());
		 
		 double monto2 = 10000;
		 cuentaB.ingreso(monto2);
		 System.out.println("Saldo cuenta B: " + cuentaB.getSaldo());
	}

}
