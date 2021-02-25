package com.educacionit.clase13;

public class AppPrincipal {

	public static void main(String[] args) {

		// creo una referencia a una Instancia de MiValor
		MiValor miVal;

		// A continuacion , se Asigna una Expresion Lambda a esa
		// referencia de interfaz .
		// Usamos una lambda en un contexto de asignacion
		miVal = () -> 28.6;

		// los dos pasos anteriores se podrian comvinar en una unica sentencia
		MiValor miVal2 = () -> 3.8;// aqui miVal2 se inicializa con la expresion Lambda.

		// Cuando se produce una expresion lambda en un determinado contexto,
		// se crea automaticamente una instancia de una clase que implementa la
		// interface
		// funcional, definiendo la expresion lambda en el comportamiento del metodo
		// abstracto que esta declarado por la interface funcional
		// cuando se invoque al metodo a traves del objeto se ejecutara la expresion
		// lambda
		// POr lo tangto una expresion lambda nos brinda una forma de transformar
		// un segmento de codigo en un object
		System.out.println("Un valor contante miVal : " + miVal.getValor());
		System.out.println("un valor constante miVal2 : " + miVal2.getValor());

		// Aqui se especifica explicitamente 'n' como double ,
		// por lo gral no es necesario especificarlo
		MiValParam miValor2 = (double n) -> 1.0 / n;

		System.out.println("El reciproco de 4.0 es : " + miValor2.getValor(4.0));

		// Esta Expresion Lambda determina si un String es parte de otro String

		PruebaString esParte = (a, b) -> a.indexOf(b) != -1;

		String str = "Esto es una prueba amigo";

		System.out.println("Probando con el string :" + str);

		if (esParte.prueba(str, "es una"))
			System.out.println("'es una' ENCONTRADO");
		else
			System.out.println("'es una' NO ENCONTRADO");

		if (esParte.prueba(str, "xyz"))
			System.out.println("'xyz' ENCONTRADO");
		else
			System.out.println("'xyz' Noooooooooooo ENCONTRADO");

		// Ejemplo Bloque Lambda
		//Este Bloque Lambda retorna el divisor positivo mas pequeño de un valor dado 
		FuncNum divPeq = (n) -> {
			int res = 1;
			
			//Obtengo el valor absoluto de n.
			n = n < 0 ? -n : n;
			
			for(int i = 2 ; i <= n/i ; i++ )
				if((n%i) == 0) {
					res = i;
					break;
				}
			
			return res;
		};

		System.out.println("El divisor mas pequeño de 12 es :" +divPeq.func(12));
		System.out.println("El divisor mas pequeño de 15 es :" +divPeq.func(-15));
	}

}
