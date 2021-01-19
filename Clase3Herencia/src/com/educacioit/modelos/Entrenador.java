package com.educacioit.modelos;

//Clase Hijo
public class Entrenador extends SeleccionFutbol {
	// atributos de la clase
	private String idFederacion;

	public Entrenador() {
		// invoco al constructor vacio de la clase padre
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		// super me sirve para invocar al constructor
//		de la clase padre 
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("estoy dirigiendo el partido (ClaseEntrenador)");
	}

	public void dirigirEntrenamiento() {
		System.out.println("estoy dirigiendo el entrenamiento (ClaseEntrenador)");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	public String toString() {
		return "Entrenador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", idFederacion=" + idFederacion + "]";
	}

}
