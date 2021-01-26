package com.educacioit.modelos;

public class Futbolista extends SeleccionFutbol {
	// atributos de la clase
	private int dorsal;
	private String demarcacion;

	// constructores
	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento (ClaseFutbolista)");
	}
	//REdefinimos o especializamos el metodo del padre 
	@Override
	public void partidoFutbol() {
		System.out.println("Juega un  partido de Futbol (Clase Futbolista)");
	}


	public void entrevista() {
		System.err.println("Da una entrevista ");
	}

//	public void jugarPartido() {
//		System.out.println("estoy jugando el partido (ClaseFutbolista)");
//	}
//
//	public void entrenar() {
//		System.out.println("estoy entrenando para el partido (ClaseFutbolista)");
//	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

}
