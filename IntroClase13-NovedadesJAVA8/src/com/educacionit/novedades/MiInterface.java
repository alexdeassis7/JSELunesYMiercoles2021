package com.educacionit.novedades;

public interface MiInterface {

	int NUMEROMAXIMO = 100;

	void caminar();

	void correr();

	// a partir de la java 8 podemos definir un metodo por defecto dentro de las
	// interfaces
	default void mostrarMensajeError() {
		System.out.println("Soy un mensaje de error proveniente de un metodo por defecto "
				+ "definido en la interface de java 8");
	}

}
