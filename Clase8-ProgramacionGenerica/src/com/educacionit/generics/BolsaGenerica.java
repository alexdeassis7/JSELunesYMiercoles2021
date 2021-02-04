package com.educacionit.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class BolsaGenerica<T> implements Iterable<T> {

	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public BolsaGenerica(int tope) {
		super();
		this.tope = tope;
	}

	public void add(T objeto) {
		if (lista.size() <= tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas elemento en la bolsa Generica");
		}
	}

	@Override
	public Iterator<T> iterator() {

		return lista.iterator();
	}
}
