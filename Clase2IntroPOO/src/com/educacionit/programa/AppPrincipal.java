package com.educacionit.programa;

import com.educacionit.modelos.Auto;

public class AppPrincipal {

	public static void main(String[] args) {
		// Instanciamos objetos pertenecientes a la clase Auto
		Auto a1 = new Auto();

		System.out.println("mostramos los estados de atributos del objeto A1");
		System.out.println("a1 color = " + a1.color);
		System.out.println("a1 marca = " + a1.marca);
		System.out.println("a1 patente = " + a1.patente);
		System.out.println("a1 modelo = " + a1.modelo);
		System.out.println("a1 anio = " + a1.anio);
		System.out.println("a1 esUsado = " + a1.esUsado);

		System.out.println("seteamos los estados de atributos del objeto A1");
		a1.color = "rojo";
		a1.marca = "BMW";
		a1.patente = "EEE452";
		a1.modelo = "x1";
		a1.anio = 2013;
		a1.esUsado = true;

		System.out.println("mostramos los estados de atributos del objeto A1 post modificacion");
		System.out.println("a1 color = " + a1.color);
		System.out.println("a1 marca = " + a1.marca);
		System.out.println("a1 patente = " + a1.patente);
		System.out.println("a1 modelo = " + a1.modelo);
		System.out.println("a1 anio = " + a1.anio);
		System.out.println("a1 esUsado = " + a1.esUsado);

		// instanciamos el objeto a2
		Auto a2 = new Auto();
		System.out.println("seteamos los estados de atributos del objeto A2");
		a2.color = "blanco";
		a2.marca = "Peugeot";
		a2.patente = "ABV556";
		a2.modelo = "208";
		a2.anio = 2012;
		a2.esUsado = true;

//		System.out.println("mostramos los estados de atributos del objeto A2 post modificacion");
//		System.out.println("a1 color = " + a2.color);
//		System.out.println("a1 marca = " + a2.marca);
//		System.out.println("a1 patente = " + a2.patente);
//		System.out.println("a1 modelo = " + a2.modelo);
//		System.out.println("a1 anio = " + a2.anio);
//		System.out.println("a1 esUsado = " + a2.esUsado);
		// instanciamos un objeto con el constructor que recibe todos los parametros
		Auto a3 = new Auto("verde", "Audi", "AAA123", "A6", 2021, true);
		Auto a4 = new Auto("X3445", "gris", "Jaguar");

		System.out.println("a1.toString() : " + a1.toString());
		System.out.println("a2.toString() : " + a2.toString());
		System.out.println("a3.toString() : " + a3.toString());
		System.out.println("a4.toString() : " + a4.toString());

		// imvocamos a los metodos de la clase Auto
		System.out.println("Imvocamos a los metodo del objeto A1");
		a1.cargarCombustible(50, "nafta");
		a1.acelerar(200);
		a1.frenar();
		
		System.out.println("Imvocamos a los metodo del objeto A2");
		a2.cargarCombustible(30, "Gasoil");
		a2.acelerar(120);
		a2.frenar();

		System.out.println("Imvocamos a los metodo del objeto A2");
		a3.cargarCombustible(30, "GNC");
		a3.acelerar(180);
		a3.frenar();
	}

}
