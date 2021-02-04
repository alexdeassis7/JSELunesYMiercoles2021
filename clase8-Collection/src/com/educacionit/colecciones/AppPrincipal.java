package com.educacionit.colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppPrincipal {

	public static void main(String[] args) {

		final Set hashSet = new HashSet(1_000_000);

		final Long starHashSetTime = System.currentTimeMillis();
		// insertamos un millon numero enteros dentro de la collection Set
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo que demoro el HashSet : " + (endHashSetTime - starHashSetTime));

		final Set treeSet = new TreeSet();
		final Long starTreeSetTime = System.currentTimeMillis();
		// insertamos un millon numero enteros dentro de la collection Set
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		final Long endtreeSetTime = System.currentTimeMillis();
		System.out.println("Tiempo que demoro el TreeSet : " + (endtreeSetTime - starTreeSetTime));

		final Set LinkedHashSet = new LinkedHashSet(1_000_000);
		final Long starLinkedHashSetTime = System.currentTimeMillis();
		// insertamos un millon numero enteros dentro de la collection Set
		for (int i = 0; i < 1_000_000; i++) {
			LinkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo que demoro el LinkedHashSet : " + (endLinkedHashSetTime - starLinkedHashSetTime));

	}

}
