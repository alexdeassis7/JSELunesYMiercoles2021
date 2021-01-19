package com.educacioit.programa;

import java.util.ArrayList;

import com.educacioit.modelos.*;

public class AppPrincipal {

	public static void main(String[] args) {

		// Array de objetos seleccionFutbol .
		// Idenpendientemente de la clase hija a la que pertenezca el objeto
		ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "123EER4");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 30, 7, "Delantero Derecho");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 42, "Lisenciado en Fisioterapia deportiva", 15);

		// agregamos los integrantes de la seleccion al Array List
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println(
				"Todos los integrantes comienzan una concentracion.(Todos ejecutan el mismo metodo del padre)");

		for (SeleccionFutbol integranteAux : integrantes) {
			System.out.print(integranteAux.getNombre() + " " + integranteAux.getApellido() + " ->");
			integranteAux.concentrarse();
		}

		// VIAJE
		System.out.println(
				"********Todos los integrantes viajan a jugar un partido.(Todos ejecutan el mismo metodo del padre)");

		for (SeleccionFutbol integranteAux : integrantes) {
			System.out.print(integranteAux.getNombre() + " " + integranteAux.getApellido() + " ->");
			integranteAux.viajar();
		}

		System.out.println( "----------ejecutamos los metodos especificos de las clases hijas!----------");
		
		//Entrenamiento 
		System.out.println("entrenamiento: solamente el entrenador y el futbolista tienen metodos para entrenar");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido() + " -> ");
		delBosque.dirigirEntrenamiento();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido() + " -> ");
		iniesta.entrenar();
		
		//MASAJE
		System.out.println("Masaje : solo el masajista puede dar masajes");
		System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " -> ");
		raulMartinez.darMasaje();
		
		/// PARTIDO DE FUTBOL!
		System.out.println("Partido de Futbol : Solamente el entrenador y el futbolista tienen metodo para el partido ");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido() + " -> ");
		delBosque.dirigirPartido();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido() + " -> ");
		iniesta.jugarPartido();
		
		
		
	}

}
