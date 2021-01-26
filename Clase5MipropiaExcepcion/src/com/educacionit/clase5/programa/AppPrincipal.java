package com.educacionit.clase5.programa;

import com.educacionit.clase5.miserrores.MiPropiaException;

public class AppPrincipal {

	public static void main(String[] args) {

		try {

			System.out.println("Antes de Lanzar la Exception");

			// Lanzamos nuestra exception Personalizada
			throw new MiPropiaException("Soy un mensaje de error Customizado");
			
		} catch (MiPropiaException e) {

			System.out.println("Exception Propia Fue Capturada");
			System.out.println(e.getMessage());
		}

		System.out.println("Finalizamos el Bloque Try Catch!");

	}

}
