package com.educacionit.clase5;

import java.io.IOException;
import java.util.Properties;

public class ThrowsDemo {

	public static char prompt(String args) throws IOException {
		System.out.println(args + " : ");
		return (char) System.in.read();
	}

	public static void main(String[] args) {

		char ch;

		try {
			// Dado que propmt() podria eventualmente Arrojar una Exception ,
			// las llamadas deben estan contenidas en un bloque try catch
			// o debera delegarse el manejo mediante un nuevo Trhows
			ch = prompt("Ingresar una letra");

		} catch (IOException e) {
			System.out.println("Ocurrio un Error de Entrada /Salida");
			ch = 'X';
			e.printStackTrace();
		}

		System.out.println("Usted Presiono : " + ch);
	}

}
