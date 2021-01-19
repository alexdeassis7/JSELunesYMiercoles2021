package com.educacionit.modelo;

public class Persona {

	private int edad;
	private String nombre;
	private String apellido;
	private String profesion;

	public Persona() {

	}

	public Persona( int edad, String nombre, String apellido, String profesion ) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.profesion = profesion;
	}

	//Persona p1 = new Persona(50 , "pepe" , "Di Toro")
	public Persona( String nombre, String apellido) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Persona p1 = new Persona(15 ,"martinez"  , "martina")
	public Persona(int edad, String apellido, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(String nombre, int edad, String apellido) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(String nombre, String apellido, int edad) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", profesion=" + profesion
				+ "]";
	}
	
	

}
