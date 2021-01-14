package com.educacionit.modelos;

//el modificador de accceso public me permite 
//que pueda usar esta clase en otros PACKAGES
public class Auto {
	// atributos de la clase : definen las caracteristicas
	public String color;
	public String marca;
	public String patente;
	public String modelo;
	public int anio;
	public boolean esUsado;

	// metodo constructor 1 vacio!
	public Auto() {

	}

	// constructor 2 con todos los parametros
	public Auto(String color, String marca, String patente, String modelo, int anio, boolean esUsado) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.modelo = modelo;
		this.anio = anio;
		this.esUsado = esUsado;
	}
	// metodo constructor 3
	public Auto(String modelo, String color, String marca) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}

	// metodos de la clase : definen el comportamiento
	public void acelerar(float kmXhs) {
		System.out.println("estoy acelerando mi " + marca + " a " + kmXhs + "Km x HS.");
	}

	public void frenar() {
		System.out.println("estoy frenando mi " + marca);
	}

	public void cargarCombustible(int litroAcargar, String tipoCombustible) {
		System.out.println("cargame " + litroAcargar + " litros de " + tipoCombustible + " por favor ");
	}

	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", patente=" + patente + ", modelo=" + modelo + ", anio="
				+ anio + ", esUsado=" + esUsado + "]";
	}

}
