package com.educacionit.metodosutiles;

import java.util.ArrayList;
import java.util.Iterator;

public class AppPrincipal {

	public static void main(String[] args) {

		ArrayList<String> nombreArrayList = new ArrayList<>();
		nombreArrayList.add("Elemento");
		nombreArrayList.add("Elemento1");
		nombreArrayList.add("Elemento2");
		nombreArrayList.add("Elemento3");

		System.out.println(nombreArrayList.size());

		System.out.println(nombreArrayList.get(2));

		System.out.println("contiene a Elemento ?? " + nombreArrayList.contains("Elemento"));

		System.out.println("Cual es la posicion del Elemento2 ? " + nombreArrayList.indexOf("Elemento2"));

		// borro todos los elementos del ArrayList
		// nombreArrayList.clear();

		System.out.println("Esta Vacio el ArrayList??? " + nombreArrayList.isEmpty());

		// Comvertimos un ArrayList a un array 'comun'
		Object[] array = nombreArrayList.toArray();

		ArrayList<String> miArray = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			miArray.add("Elemento" + i);
		}
		System.out.println(miArray);
		miArray.add(2, "Elemento 3");
		System.out.println(miArray);

		// Declaramos un iterator e imprimimos los elementos del arrayList

		Iterator<String> nombreIterator = miArray.iterator();

		while (nombreIterator.hasNext()) {
			String elemento = nombreIterator.next();
			
			if(elemento.equals("Elemento5")) {
				nombreIterator.remove();
			}
		}
		
		System.out.println(miArray);

	}

}
