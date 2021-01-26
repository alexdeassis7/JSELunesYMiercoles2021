package com.educacionit.clase5;

public class MultiCatch {

	// El multi catch permite capturar dos o mas Exceptions mediante la misma
	// clausula catch

	// Uso del multi-catch
	// ESte codigo requiere JDK7 o superior
	public static void main(String[] args) {
		int a = 28, b = 0;
		int resultado;
		char chars[] = { 'A', 'B', 'C' };

		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0)
					resultado = a / b; // genera un ArithmeticException
				else
					chars[25] = 'X'; // genera un ArrayIndexOutOfBOundsExceptions

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				e.getCause();
				System.out.println(e.getMessage());

			}

			System.out.println("Despues del multi-catch");
		}
		System.out.println("Fin del app");

	}
}
