package com.educacionit.demoexcepciones;

import java.util.Scanner;

public class DemoMain {

	public static int numerador = 10;
	public static Integer denominador = 0;
	public static float division;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Antes de hacer la Division");

		try {
			// Instrucciones propensas a lanzar una Exception
			division = numerador / denominador;
		} catch (ArithmeticException e) {
			// Instrucciones a ejecutar cuando se produce una Exception
			// si Hay una Exception doy valor '0' al atributo 'division'
			division = 0;
			System.out.println("Error : " + e.getMessage());
			e.printStackTrace();
			e.getCause();

		} catch (NullPointerException ex) {
			// Si La exception es de un puntero nulo doy valor de '1' al atributo 'division
			division = 1;
			System.out.println("Error : " + ex.getMessage());
		} finally {
			// Instrucciones a ejecutar , Tando si hay como sino Hay Exceptions
			System.out.println("Resultado Division : " + division);
			System.out.println("Despues de hacer la Division");
		}
		System.out.println("Ingrese un numero ");
		int numIngresado = teclado.nextInt();
		System.out.println("Fin App");
	}

}
