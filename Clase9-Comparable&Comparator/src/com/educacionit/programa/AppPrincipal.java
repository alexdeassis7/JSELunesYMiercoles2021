package com.educacionit.programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.comparadores.OrdenarPersonaPorId;
import com.educacionit.modelos.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Carlos", "Ana", "Dionisio", "Bernardo");
		System.out.println("Lista Original : " + nombres);
		// collection sort() nos ordena una lista cualquiera
		Collections.sort(nombres);
		System.out.println("Lista Ordenada: " + nombres);

		Set<String> otrosNombres = new TreeSet<>();
		otrosNombres.add("Mario");
		otrosNombres.add("Fernando");
		otrosNombres.add("Omar");
		otrosNombres.add("Juana");

		System.out.println("Conjunto Tree Set Ordenado : " + otrosNombres);

		// nombre y otrosNombres funcionan correctamente por que cada elementos de las
		// coleciones con comparables entre si , para que un obejto sea comparable su
		// clase
		// debe implementar la intefaz comparable de java.lang

		// Ahora cuando usemos una collecion para ordenar , el ordenamiento de personas
		// sera automatico ,
		// pero siempre sera ordenado con el mismo criterio (nombre)
		Set<Persona> personas = new TreeSet<>();

		personas.add(new Persona(1, "Mario"));
		personas.add(new Persona(2, "Fernando"));
		personas.add(new Persona(3, "Omar"));
		personas.add(new Persona(4, "juana"));
		System.out.println("conjunto Ordenado de personas: " + personas);

		// Utilizamos el comparador de Id
		List<Persona> otrasPersonas = Arrays.asList(new Persona(4, "juana"), new Persona(2, "Fernando"),
				new Persona(1, "Mario"), new Persona(3, "Omar"));
		
		Collections.sort(otrasPersonas, new OrdenarPersonaPorId() );
		
		System.out.println("Lista de personas ordenandas pro ID: " + otrasPersonas);
		
		
		//otra forma seria enviando el parametro del constructor ....
		Set<Persona> conjuntoPersonas = new TreeSet<>(new OrdenarPersonaPorId());
		conjuntoPersonas.add(new Persona(3, "Omar"));
		conjuntoPersonas.add(new Persona(4, "juana"));
		conjuntoPersonas.add(new Persona(2, "Fernando"));
		conjuntoPersonas.add(new Persona(1, "Mario"));
		
		System.out.println("Conjunto de personas ordenadas por ID : " + conjuntoPersonas);
		
		
		

	}

}
