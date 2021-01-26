package com.educacionit.calculadora;

public class Calculadora {
//	Este método debe lanzar una excepción con un mensaje descriptivo si algún argumento es menor a 0 o
//	mayor a 1000

	public int sumar(int a, int b) { // throws MiCalCException
		if (a < 0 || b < 0) {
			// lanzamos una exception
			// throw new .....MiCalCException("No se pueden enviar numeros menores a cero)
		}
		if (a > 1000 || b > 1000) {
			// lanzamos una exception
			// throw new .....MiCalCException("No se pueden enviar numeros menores a cero)

		}

		return a + b;

	}
//	Este método debe lanzar una excepción con un mensaje descriptivo si algún argumento es menor a 0 o si
//	el resultado es menor a 0.

	public int restar(int a, int b) {// MiCalcException
		if (a < 0 || b < 0) {
			// lanzamos una exception
			// throw new .....MiCalCException("No se pueden enviar numeros menores a cero)
		}
		if (a < b) {
			// throw new MiCalcException("el primer numero no pueder ser inferior al segundo
			// ")
		}
		return a - b;
	}

}
