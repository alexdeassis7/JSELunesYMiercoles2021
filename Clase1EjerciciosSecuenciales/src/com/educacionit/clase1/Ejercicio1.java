package com.educacionit.clase1;

//importo el Scanner para poder tomar los datos por teclado 
import java.util.Scanner;

/*Ejercicio 1 :
 * Un Maestro desea saber que porcentajer de hombres y 
 * que porcentaje de mujeres hay en un grupo de estudiantes
 * */
public class Ejercicio1 {
	// comentario de linea
	/* * Comentario de bloque */
	// punto de inicio de ejecucion o funcion principal
	public static void main(String[] args) {
		// defino mis variables de trabajo
		float numHombres = 0, numMujeres = 0, totalAlumnos = 0;
		float porcetajeHombres = 0, porcetajeMujeres = 0;
		// me defino un escanner para solicitar dato por teclado
		Scanner teclado = new Scanner(System.in);
		// que entra ???
		System.out.println("ingrese el numero de estudiantes mujeres");
		numMujeres = teclado.nextFloat();
		System.out.println("ingrese el numero de estudiantes hombres");
		numHombres = teclado.nextFloat();
		// que se procesa ???
		totalAlumnos = numHombres + numMujeres;
		porcetajeMujeres = numMujeres * 100 / totalAlumnos;
		porcetajeHombres = numHombres * 100 / totalAlumnos;
		// que sale ???
		System.out.println("el porcentaje de mujeres es : " + porcetajeMujeres);
		System.out.println("el porcentaje de hombres es : " + porcetajeHombres);
	}
}
