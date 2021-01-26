package com.educacionit.manejodeerrores;

public class DemoAnidados {

	public static void main(String[] args) {
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		System.out.println("*******Try catch Anidados*********");

		try { // try externo
				// podemos utilizar un try Externo para detectar los errores mas graves ,
				// permitiendo que los bloques try internos manejen los errores menos serios

			for (int i = 0; i < nums.length; i++) {

				try { // try interno
					System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
				} catch (ArithmeticException e) {
					// capturo un ArithmeticException en el try Interno
					System.out.println("No se puede dividir por cero en los Numeros Reales");
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// capturo un ArrayIndexOutOfBoundsException en el try externo
			System.out.println("Erroooorrr el programa finalizo");
		}

		System.out.println("Fin de la App");

	}

}
