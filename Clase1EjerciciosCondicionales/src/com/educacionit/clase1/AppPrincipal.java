package com.educacionit.clase1;

import java.util.Scanner;

/* Ejercicio 3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga $16 por cada hora.
Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.*/
public class AppPrincipal {
	public static void main(String[] args) {
		// definimos las variables de trabajo
		float hsTrabajadas = 0, hsExtras = 0, salarioSemanal = 0;
		Scanner teclado = new Scanner(System.in);
		// que entra?
		System.out.println("ingrese por favor las horas trabajas durante esta semana");
		hsTrabajadas = teclado.nextFloat();
		// que se procesa?
		if (hsTrabajadas > 40) {
			// acciones a ejecutar si la condicion se cumple
			hsExtras = hsTrabajadas - 40;
			salarioSemanal = hsExtras * 20 + 40 * 16;
		} else {
			// acciones a ejecutar si la condicion NOOO se cumple
			salarioSemanal = hsTrabajadas * 16;
		}
		// que sale?
		System.out.println("Su salario de esta semana es de : " + salarioSemanal);
	}

}
