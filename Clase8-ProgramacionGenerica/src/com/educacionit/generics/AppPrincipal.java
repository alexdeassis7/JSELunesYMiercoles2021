package com.educacionit.generics;

public class AppPrincipal {

	public static void main(String[] args) {

		Bolsa bolsa = new Bolsa(5);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("ferrero");
		Chocolatina c2 = new Chocolatina("cofler");

		Golosina g = new Golosina("gomitas");
		Golosina g1 = new Golosina("chicle");

		// agrego los chocolates y las golosinas a la bolsa
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(g);
		bolsa.add(g1);
//		bolsa.add(g);
//		bolsa.add(g1);
		for (Object o : bolsa) {
			if (o instanceof Chocolatina) {
				Chocolatina chocolatina = (Chocolatina) o;
				System.out.println(chocolatina.getMarca());
			} else {
				Golosina golosina = (Golosina) o;
				System.out.println(golosina.getNombre());
			}
		}

		System.out.println("*************** Bolsa Generica ***********");

		BolsaGenerica<Chocolatina> bolsa2 = new BolsaGenerica<Chocolatina>(3);
		BolsaGenerica<Golosina> bolsa3 = new BolsaGenerica<Golosina>(3);

		bolsa2.add(c);
		bolsa2.add(c1);
		bolsa2.add(c2);

		bolsa3.add(g);
		bolsa3.add(g1);

		for (Chocolatina chocolatinaAux : bolsa2) {
			System.out.println(chocolatinaAux.getMarca());
		}

		for (Golosina golosinaAux : bolsa3) {
			System.out.println(golosinaAux.getNombre());
		}

	}

}
