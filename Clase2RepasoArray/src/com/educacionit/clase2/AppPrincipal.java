package com.educacionit.clase2;

import java.util.Scanner;

/* calcular la temperatura media del mes de Agosto y la suma de todas las
 * temperaturas del mes (la temperatura de cada dia debera ser ingresada por el
 * usuario)	 */
public class AppPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int diasAgosto = 31;
		// definimo e inicializamos un array de datos float
		float[] temperaturasAgosto = new float[diasAgosto];
		float sumaDeTemperaturas = 0; // variable de tipo acumulador
		float promedioTemperaturas = 0;
		System.out.println("cantidad de elementos del array " + temperaturasAgosto.length);
		// cargamos todo nuestro array con las temperaturas que ingresara el
		// usuario por teclado

		for (int indice = 0; indice < temperaturasAgosto.length; indice++) {
			System.out.println("Ingrese la Temperatura Maxima del dia " + (indice + 1));
			temperaturasAgosto[indice] = teclado.nextFloat();
			// acumulamos todas las temperaturas en la variable "sumaDeTemperaturas"
			// sumaDeTemperaturas = sumaDeTemperaturas + temperaturasAgosto[indice];
			sumaDeTemperaturas += temperaturasAgosto[indice];
		}
		System.out.println("Suma de temperaturas de agosto es : " + sumaDeTemperaturas);
		// calculamos y mostramos el promedio de las temperaturas del mes
		promedioTemperaturas = sumaDeTemperaturas / temperaturasAgosto.length;

		System.out.println("*****  Mostramos el array de temperaturas*****");
		for (int i = 0; i < temperaturasAgosto.length; i++) {
			System.out.print(temperaturasAgosto[i] + "-");
		}
		System.out.println("la temperatura promedio de agosto fue de : " + promedioTemperaturas);

	}

}
