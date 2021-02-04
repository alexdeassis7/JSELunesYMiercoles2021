package com.educacionit.entidades;

import java.util.ArrayList;

public class Banco {

	public ArrayList<Persona> fila = new ArrayList();

	public int cuantasPersonasHay() {
		return fila.size();
	}

	public void agregarPersona(Persona persona) {
		if (!fila.contains(persona)) {
			fila.add(persona);
		} else {
			System.out.println("La persona con el dni :" + persona.getDni() + " Ya Se Encuentra en la Fila");
		}
	}

	public void eliminarPersonaDeFila(Persona persona) {
		if (fila.contains(persona)) {
			fila.remove(persona);
			System.out.println("Se extrajo de la fila a " + persona.getNombre() + " DNI:"+ persona.getDni());
		} else {
			System.out.println(persona.getNombre() + " No estaba en la fila !");
		}
	}

	public void mostrarFila() {
		System.out.println("Mostramos la Fila Del Banco :");
		for (Persona p : fila) {
			System.out.println("NOmbre : " + p.getNombre() + ", DNI : " + p.getDni());
		}
	}

}
