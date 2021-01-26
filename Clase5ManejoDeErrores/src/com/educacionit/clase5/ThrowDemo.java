package com.educacionit.clase5;

public class ThrowDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Antes de la lanzar la Excepcion!");

			// lanzo un aexcepcion
			throw new ArithmeticException();

		} catch (ArithmeticException e) {
			// Capturando la Exception
			System.out.println("Exception Capturada!");
		}finally {
			System.out.println("ejecute el finally");
		}
		System.out.println("Despues del bloque try cath ");
	}
	

}
