package com.educacionit.comparadores;

import java.util.Comparator;

import com.educacionit.modelos.Persona;
//
//utilizamo un comparador de elementos , que seria como una clase de apoyo 
//que va a ser utilizada por los metodos e ordenamiento  

public class OrdenarPersonaPorId implements Comparator<Persona> {

//	el metodo compare() debe devolver lo siguiente
//	CONDICION			VALOR QUE DEBE DEVOLVER
//	o1 < o2              un numero menor a cero
//	o1 == o1             cero
//	o1 > o2 			un numero mayor a cero 

	@Override
	public int compare(Persona o1, Persona o2) {

		return o1.getIdPersona() - o2.getIdPersona();
	}

}
