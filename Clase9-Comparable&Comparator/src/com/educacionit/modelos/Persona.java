package com.educacionit.modelos;

import java.util.Date;

//Entonces , si queremos que los objetos al guardarse en una coleccion(java.util.Set o java.util.list)
//esten ordenados por el campo nombre , deberiamos primero implementar la interfaz comparable


public class Persona implements Comparable<Persona>{

	private int idPersona;
	private String nombre;
	private Date fechaNacimiento;

	public Persona() {

	}

	public Persona(int idPersona, String nombre) {
		this.idPersona = idPersona;
		this.nombre = nombre;

	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}

	
	//implementamos su metodo de comparacion , aqui es donde definimos que campo 
	//vamos a utilizar para ordenar :
	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}

}
