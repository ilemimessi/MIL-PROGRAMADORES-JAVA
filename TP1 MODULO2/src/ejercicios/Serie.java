package ejercicios;

/* MIL PROGRAMADORES JAVA - UNSA
 * PRÁCTICO N°1 - MÓDULO 2: Creación de Clases y Objetos. Sintaxis y variables.
 * Alumna: Ileana Mimessi
 * Profesor: Benito Arrieta
 * Comisión T6 
 */

public class Serie {
	
	//Clase creada a partir del EJERCICIO 2.
	
//Atributos
	
	private String titulo;
	private int temporadas;
	private String genero;
	private String creador;
	
		
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	public void mostrarDatos () {
		 System.out.println("**** SERIE ****");
		 System.out.println("Titulo: " + getTitulo());
		 System.out.println("Número de Temporadas: " + getTemporadas());
		 System.out.println("Género: " + getGenero());
		 System.out.println("Creador: " + getCreador ());
		}
	
//Constructor 
	
    public Serie(String titulo, int temporadas, String genero, String creador) {
    	super();
    	this.titulo = titulo;
    	this.temporadas = temporadas;
    	this.genero = genero;
    	this.creador = creador;
	
	
}
}