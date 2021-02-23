package com.educacionit.novedades.programa;

import com.educacionit.novedades.modelo.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Camila" , "Di toro");
		Persona p2  = new Persona("Marcelo", "Yosia");
		
		p1.caminar();
		p1.correr();
		//invocamos al metodo default
		p1.mostrarMensajeError();
		
		System.out.println("############################");
		p2.caminar();
		p2.correr();
		p2.mostrarMensajeError();

	}

}
