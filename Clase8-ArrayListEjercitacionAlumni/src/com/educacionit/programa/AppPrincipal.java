package com.educacionit.programa;

import com.educacionit.entidades.Banco;
import com.educacionit.entidades.Persona;

public class AppPrincipal {

	public static void main(String[] args) {

		Persona p = new Persona("camila", "Di toro", "1");
		Persona p1 = new Persona("Gabriel", "Cejas", "2");
		Persona p2 = new Persona("Guillermo", "Casalaspro", "3");
		Persona p3 = new Persona("Marcelo", "Yosia", "4");
		Persona p4 = new Persona("Marcos", "Quintana", "5");
		Persona p5 = new Persona("Nicolas", "Villalba", "6");
		Persona p6 = new Persona("Rodrigo", "PIntos", "7");
		Persona p7 = new Persona("Ramon", "Martinez", "1");

		Banco b1 = new Banco();
		b1.agregarPersona(p);
		b1.agregarPersona(p1);
		b1.agregarPersona(p2);
		b1.agregarPersona(p3);
		b1.agregarPersona(p4);
		b1.agregarPersona(p5);
		b1.agregarPersona(p6);
		b1.agregarPersona(p7);

		System.out.println("en la fila tenemos " + b1.cuantasPersonasHay() + " personas");

		b1.mostrarFila();
		b1.eliminarPersonaDeFila(p);
		b1.eliminarPersonaDeFila(p);
		System.out.println("en la fila tenemos " + b1.cuantasPersonasHay() + " personas");
		
		b1.mostrarFila();

		
		// Persona p1 = new Persona("camila", "Di toro", "123");
//		Persona p2 = new Persona("camila", "Di toro", "123");
//
//		System.out.println(p1 == p2);
//
//		int a = 8;
//		int b = 5;
//		int c = 8;
//
//		System.out.println(a == b);
//		System.out.println(a == c);
//
//		
//		Persona p = new Persona("alex", "Assis" , "12345");		
//		Persona pp = p;
//		
//		System.out.println( p == pp);

	}
}
