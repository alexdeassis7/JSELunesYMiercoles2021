package com.educacioit.modelos;

//una clase abstracta es aquella que no podra ser JAMAS instanciada!!!!
//por lo tanto  nunca podremos hacer un "new SeleccionFutbol()"
public abstract class SeleccionFutbol {

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

    //IMPORTANTE! -> METODO ABSTRACTO => No se implementa en la clase Abstracta
	// pero si en las clases hijas
	public abstract void entrenamiento();

	public void partidoFutbol() {
		System.out.println("Asiste al partido de Futbol (Clase Padre)");
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
