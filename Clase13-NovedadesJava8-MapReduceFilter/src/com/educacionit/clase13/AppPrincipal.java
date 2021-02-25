package com.educacionit.clase13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*java.util.stream
 * 
 * Biblioteca que nos permitira realizar distintas operaciones funcionales sobre Streams.*/
public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println(" ######################   MAP  ####################*/");
		// Map toma como párametros una funcion unaria , es decir que recibe un solo
		// parametro , y como segundo argumento
		// recibe una coleccion de datos (una list , un set ...),
		// eje : map(sqrt, [1 , 4 , 9 , 16 ]) =>>>>> [1.0 , 2.0 , 3.0 , 4.0 ]

		String[] myVector = new String[] { "bob", "alice", "paul", "ellie" };

		for (int i = 0; i < myVector.length; i++) {
			System.out.println(myVector[i]);
		}

		// comenzamos convirtiendo la matriz en un Stream:
		Stream<String> myStream = Arrays.stream(myVector);

		// luego llamamos al metodo map , pasando una expresion lambda , una que puede
		// convertir una cadena a mayusculas , como unico argumento:
		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());

		// El stream retornado een el paso anterior contiene los nombres modificados ,
		// ahora lo volvemos a comvertir en un array de String
		String[] myNewArray = myNewStream.toArray(String[]::new);

//		String::new este lambda es como lo siguiente:
//		public String[] create (int size) {
//			return new String[size];
//		}
		System.out.println("ahora lo vemos transformado en mayusculas ");
		for (int i = 0; i < myNewArray.length; i++) {
			System.out.println(myNewArray[i]);
		}

		System.out.println(" ######################   FILTER  ####################*/");

		// Filter nos permite obtener de una lista los datos que cumplan con con cierto
		// criterio , dicho criterio es una
		// funcion que retorna un booleano

		// Ej : contamos la cantidad de veces que aparece el numero cinco en una lista
		// de numeros
		List<Integer> listaNumeros = new ArrayList<Integer>();
		// agregamos numeros a la lista
		listaNumeros.add(5);
		listaNumeros.add(5);
		listaNumeros.add(55);
		listaNumeros.add(5);
		listaNumeros.add(55);
		listaNumeros.add(67);
		listaNumeros.add(5);
		listaNumeros.add(5);
		listaNumeros.add(5);

		// me genero el Stream
		Stream st = listaNumeros.stream();

		System.out.println("Ocurrencias del numero 5 (cinco) en la lista ");
		System.out.println(st.filter(Predicate.isEqual(5)).count());

		System.out.println(" ######################   REDUCE  ####################*/");
		// Reduce consiste en reducir una collecion de datos a un solo valor , por
		// ejemplo ,
		// si queremos tomar una lista de numeros y calcularles la suma
		// el promedio o alguna funcion mas compleja

		int myArray[] = { 1, 5, 8 };

		int sum = Arrays.stream(myArray).sum();

		System.out.println("La suma de todos los numeros es : " + sum);

		// los parametros que toma el reduce difieren de los del map y el filter , un
		// identificador y una funcion lambda.

		String[] myArray2 = { "Soy", "Una", "De", "Las", "Ultimas", "Sentencias", "Del", "Profe" };
									
		for (String aux : myArray2) {
			System.out.println(aux);
		}

		String result = Arrays.stream(myArray2).reduce("", (a, b) -> a + b);
		
		System.out.println("Resultado de reduce con el identificado : " + result);
	
		for (String aux : myArray2) {
			System.out.println(aux);
		}
	}

}
