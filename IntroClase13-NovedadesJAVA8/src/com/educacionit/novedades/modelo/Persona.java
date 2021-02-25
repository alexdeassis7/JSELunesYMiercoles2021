package com.educacionit.novedades.modelo;

import com.educacionit.novedades.MiInterface;

public class Persona implements MiInterface {

	private String nombre;
	private String apellido;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	

	
	@Override
	public void caminar() {
		System.out.println("soy " + getNombre() + " y estoy caminando ");
	}

	@Override
	public void correr() {
		System.out.println("soy " + getNombre() + " y Estoy Corriendo");
	}

	// Getters & Setters
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

}
