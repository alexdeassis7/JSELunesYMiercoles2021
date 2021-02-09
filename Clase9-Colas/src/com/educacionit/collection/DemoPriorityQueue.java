package com.educacionit.collection;

import java.util.PriorityQueue;

public class DemoPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> cola = new PriorityQueue<>();

		// cargamos la cola de numero en forma desordenada
		cola.add(70);
		cola.add(120);
		cola.add(6);
		cola.add(177);
		cola.add(788);
		cola.add(1958);
		cola.add(1992);

		for (int i = 0; i < 10; i++) {
			cola.add(i);
		}

		System.out.println("Imprimimos la cola prioritaria :");
		
		while(!cola.isEmpty()) {
			System.out.print(cola.poll() + " - ");
		}
		
		
		
	}

}
