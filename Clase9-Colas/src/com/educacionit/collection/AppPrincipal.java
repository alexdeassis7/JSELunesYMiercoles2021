package com.educacionit.collection;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class AppPrincipal {

	public static void main(String[] args) {
		// Metodos para el manejo de colas
//		Para insertar: add()   y  offer()
//		Para Extraer : remove() y poll()
//		Para consultar el Frente : Element()  y peek()

		// creamos la cola indicando el de dato ('Integer')
		Queue<Integer> cola = new LinkedList<>();
		// Insertamos Datos a la cola
		cola.offer(3);
		cola.add(14);
		cola.offer(12);
		cola.add(7);
		cola.offer(10);

		// imprimimos la cola llena de datos
		System.out.println("Cola llena : " + cola);
		System.out.println(cola.peek());
		// Estructura Repetitiva para desencolar
		while (cola.poll() != null) { // desencolamos y el valor se compara con null
			System.out.println(cola);
			// peek : muestra null si la cola esta vacia
			System.out.println(cola.peek());
		}

		// Lanza un NoSuchElementException si la cola esta vacia
//		System.out.println(cola.element());

		// Ahora una cola con elementos de diferentes tipos de dato
		LinkedList colaMixta = new LinkedList();
		colaMixta.offer(3);
		colaMixta.add(14.7);
		colaMixta.offer(12);
		colaMixta.add(7);
		colaMixta.offer(10);
		colaMixta.add(10.5);
		colaMixta.offer(3);
		colaMixta.add("cadena");
		colaMixta.add("pepe");

		System.out.println("Cola Mixta:  " + colaMixta);

		// creamos otra cola
		Queue queue = new LinkedList<>();
		try {
			queue.remove();
		} catch (NoSuchElementException e) {
			System.out.println("NO podes extraer elementos de una cola VACIA!");
		}
		
		queue.add("Item1");
		queue.add("Item2");
		
		//usamos el metodo offer para agrega , si algo sale mal retornara un true /false
		if(queue.offer("Item3")) {
			System.out.println("Se agrego correctamente el item 3");			
		}		
		queue.offer("Item4");		
		System.out.println(queue);
		
		System.out.println("validamos si un determinado elemnto existe dentro de la cola ");
		System.out.println("existe el item2 ? " + queue.contains("Item2"));
		
		//eliminamos el primer elemento de la cola 
		System.out.println("removimos el : " + queue.remove());
		System.out.println(queue);
		
		
		System.out.println("Primer elemento a desencolar es : " + queue.element());
		
		


	}

}
