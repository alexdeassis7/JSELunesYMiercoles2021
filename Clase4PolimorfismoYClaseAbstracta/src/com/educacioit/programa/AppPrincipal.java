package com.educacioit.programa;

import java.util.ArrayList;

import com.educacioit.interfaces.ICredenciales;
import com.educacioit.modelos.Entrenador;
import com.educacioit.modelos.Futbolista;
import com.educacioit.modelos.Masajista;
import com.educacioit.modelos.SeleccionFutbol;

public class AppPrincipal implements ICredenciales {
	
	String clave = userBaseDatosPersonas; 
	// Array de objetos seleccionFutbol .
	// Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		// No se puede crear un objeto de una clase Abstracta!!!
//		SeleccionFutbol casillas = new seleccionFutbol();

		// entrenador , futbolista y masajista pertenecen a la mism clase padre
		// y por eso se pueden instanciar diciendo que es una SeleccionFutbol
		SeleccionFutbol delbosque = new Entrenador(121, "Vicente", "Delbosque", 59, "25897");
		SeleccionFutbol andres = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol raul = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		// agregamos los integrantes de la seleccion al Array List
		integrantes.add(delbosque);
		integrantes.add(andres);
		integrantes.add(raul);

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

		// Entrenamiento
		System.out.println(
				"entrenamiento: Todos los integrantes tienen su funcion en un entrenamiento (Especializacion)");

		for (SeleccionFutbol integranteAux : integrantes) {
			System.out.print(integranteAux.getNombre() + " " + integranteAux.getApellido() + " ->");
			integranteAux.entrenamiento();
		}
//		/// PARTIDO DE FUTBOL!
		System.out
				.println("Partido de Futbol :Todos los integrantes tienen su funcion en un partiodo (Especializacion)");
		for (SeleccionFutbol integranteAux : integrantes) {
			System.out.print(integranteAux.getNombre() + " " + integranteAux.getApellido() + " ->");
			integranteAux.partidoFutbol();
		}
		System.out.println("********** Ejecutamos los metodos especificos de cada clase hija *******");
		// Planificar entrenamiento
		System.out.println("Planificar entrenamiento : solo el entrenador puede planicar un entrenamiento  ");
		System.out.print(delbosque.getNombre() + " " + delbosque.getApellido() + " ->");
		((Entrenador) delbosque).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("Entrevista : solo el futbolista tiene el metodo para dar una entrevista  ");
		System.out.print(andres.getNombre() + " " + andres.getApellido() + " ->");
		((Futbolista) andres).entrevista();

		// MASAJE
		System.out.println("MASAJE : solo el el masajista tiene metodo para dar un masaje ");
		System.out.print(raul.getNombre() + " " + raul.getApellido() + " ->");
		((Masajista) raul).darMasaje();

		
	}

}
