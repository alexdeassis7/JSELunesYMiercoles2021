package com.educacionit.clase3;

public class AppPrincipal {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		Estudiante e1 = new Estudiante();
		e1.mostrarInfo();

		Estudiante e2 = new Estudiante();
		e2.mostrarInfo();
		// accedo a la variable b static de la clase
		e1.b++; // incrementa en 1

		// accedemos direcctamente desde la clase sin instanciar
		// un objeto
		Estudiante.b++; // incrementa en 1

		e2.mostrarInfo();
		
	}

}
