package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°1 - MÓDULO 2: Creación de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Persona {
	
	//Clase creada a partir del EJERCICIO 1.
	
	//Atributos
	private String nombre;
	private String apellido;
	private String domicilio;
	private int dni;
	
	//Métodos. -> menu source (setters y getters)
	
	public String getNombre() {
		String valor;
		if (this.nombre == null) {
		valor = "No cargado"; 
		} else {
		 valor = this.nombre;
		}
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		if (this.apellido == null) { 
			} else {
			}
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDomicilio() {
		if (this.domicilio == null) { 
			} else {
			}
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getDni() {
		if (this.dni == 0) { 
		} else {
		}
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}

	public void mostrarDatos () {
	 System.out.println("**** MOSTRAR DATOS PERSONA ****");
	 System.out.println("Nombre: " + getNombre());
	 System.out.println("Apellido: " + getApellido());
	 System.out.println("DNI: " + getDni());
	 System.out.println("Domicilio: " + getDomicilio ());
	}
	
	// Creación de Constructores: //al crear distintos constructores, se puede ir variando los atributos guardados.
	
	public Persona () {
		
	}
	
 //firma del metodo o constructor.  (Deben tener dif firmas.)
// Dada por el nombre seguida de los parametros



	public Persona(String nombre, String apellido, String domicilio, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.dni = dni;
	}
	
	

	
}