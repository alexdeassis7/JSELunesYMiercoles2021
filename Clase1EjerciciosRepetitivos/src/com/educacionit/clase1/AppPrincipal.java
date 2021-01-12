package com.educacionit.clase1;

import java.util.Scanner;

/*7)Calcular e imprimir la tabla de multiplicar de un número cualquiera.
Imprimir el multiplicando , el multiplicador y el producto*/
public class AppPrincipal {

	public static void main(String[] args) {
		int numeroIngresado = 0, resultado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por Favor Ingrese el numero de la tabla que quiere conocer");
		numeroIngresado = teclado.nextInt();

		for (int x = 0; x <= 10; x++) {
			resultado = numeroIngresado * x;
			System.out.println(numeroIngresado + "X" + x + "=" + resultado);
		}

	}

}
