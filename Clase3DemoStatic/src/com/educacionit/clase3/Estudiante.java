package com.educacionit.clase3;

public class Estudiante {
	//se inicializa en cero por cada objeto creado 
	int a;	
	//1)una variable estatica pertenece a la clase en la que fue declarada 
	//2)se inicializa una sola vez aql inicio de la ejecucion de la app
	//3)se pueden acceder desde la clase sin necesidad de instanciar un objeto
	
	//b se inicializa en cero cuando la clase es cargada y NO POR CADA OBJETO CREADO 
	static int b;
	Estudiante() {
		// constructor que incrementa en 1 la variable static b
		b++;
		a++;
	}
	public  void mostrarInfo() {
		System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
	}	
	//en un metodo estatico solo pueden declarar o llamar a variables static
	//y solo puede invocar a metodos static 
	//un metodo estatic no puede hacer referencia a "this" o "super"
	public static void incrementar() {
		b++;
		//Esto me genera error ya que la variable a no es static 
//		a++;
		//mostrarInfo(); 
	}

}
