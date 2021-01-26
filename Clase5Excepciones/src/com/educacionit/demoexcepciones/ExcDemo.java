package com.educacionit.demoexcepciones;

public class ExcDemo {

	//Las subClases deben SI O SI preceder a las superclase en las declaracion de los catch 
	public static void main(String[] args) {

		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < nums.length; i++) {
			try {
				System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// capturamos la Excetion de la subclase
				System.out.println("No se encontro ningun Elemento para Dividir en en denominador");
				System.out.println("indice inexitente!"+e.getMessage());
			} catch (Throwable e) {
				// Capturanmos una Exception de la Superclase
				System.out.println("Alguna Exception Ocurrio");
				System.out.println(e.getMessage());
			}
		}

	}

}
