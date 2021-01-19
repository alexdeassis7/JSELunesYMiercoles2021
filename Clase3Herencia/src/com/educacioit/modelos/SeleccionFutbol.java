package com.educacioit.modelos;

//Calse padre o Super Clase
public class SeleccionFutbol {
	// protected me sirve para indicar un tipo
	// de visibilidad de los atributos y metodo
	// de la clase padre y significa que cuando
	// usamos este modificador de acceso estos
	// solo seran visible desde las clase hijas
	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	
	public SeleccionFutbol() {
		
	}

	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void concentrarse() {
		System.out.println("estoy concentrando (Clase Padre)");
	}

	public void viajar() {
		System.out.println("estoy Viajando (Clase Padre)");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
