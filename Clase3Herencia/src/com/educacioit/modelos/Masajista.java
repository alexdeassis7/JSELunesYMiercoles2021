package com.educacioit.modelos;

public class Masajista extends SeleccionFutbol {
	// atributos de la clase
	private String titulacion;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public void darMasaje() {
		System.out.println("Estoy dando masajes (ClaseMasajista)");
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String toString() {
		return "Masajista [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
	}

}
