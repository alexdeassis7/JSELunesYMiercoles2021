package com.educacionit.programa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.educacionit.modelos.JugadorSeleccion;

import java.util.TreeMap;

public class AppPrincipal {

	public static void main(String[] args) {
		// principales metodos para trabajar con los Map:

		// declaracion de un Map (HashMap) con clave integer y valor String
		// OJO no podemos utlizar datos atomicos o primitivos
		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
		nombreMap.size(); // Retorna el numero de elementos del map
		nombreMap.isEmpty(); // retorna true si no hay elemento en el MAp y false si los hay
		nombreMap.put(1, "Alex"); // agrega un elemento con clave 1 y valor Alex
		nombreMap.get(1); // devuelve el valor de la clave que se le pasa como parametro o null si la
							// clave no existe
		nombreMap.clear();// borra todos los elementos del map
		nombreMap.remove(1); // borra el par clave/valor de la clave que se le pasamos como parametro
		nombreMap.containsKey(1);// retorna true si en el map hay una clave que coincide con 1
		nombreMap.containsValue("Jose"); // retorna true si en el map hay un valor que coincide con "Jose"

		// Demo HASHMAP
		System.out.println("********* HASH MAP - nos guarda los objetos sin un 'orden logico' ********");
		Map<Integer, String> map = new HashMap<Integer, String>();
		// agregamos elementos al map
		map.put(1, "Casillas");
		map.put(3, "Pique");
		map.put(11, "Capdevilla");
		map.put(16, "Busquets");
		map.put(18, "Pedrito");
		map.put(7, "Villa");
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xabi Alonso");
		map.put(8, "Xavi Hernandez");
		map.put(6, "Iniesta");

		// imprimimos el MAp con un Iterador
		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + "-> Valor: " + map.get(key));
		}

		// Demo TREEMAP
		System.out.println("********* TREE MAP - nos guarda los objetos ordenados por clave 'orden natural' ********");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		// agregamos elementos al treeMap
		treeMap.put(1, "Casillas");
		treeMap.put(3, "Pique");
		treeMap.put(11, "Capdevilla");
		treeMap.put(16, "Busquets");
		treeMap.put(18, "Pedrito");
		treeMap.put(7, "Villa");
		treeMap.put(15, "Ramos");
		treeMap.put(5, "Puyol");
		treeMap.put(14, "Xabi Alonso");
		treeMap.put(8, "Xavi Hernandez");
		treeMap.put(6, "Iniesta");

		// imprimimos el MAp con un Iterador
		Iterator ittreeMap = treeMap.keySet().iterator();

		while (ittreeMap.hasNext()) {
			Integer key = (Integer) ittreeMap.next();
			System.out.println("Clave: " + key + "-> Valor: " + treeMap.get(key));
		}

		// Demo LinkedHashMAP
		System.out.println(
				"********* linkedHashMap MAP - nos guarda los objetos ordenados  tal y como lo introducimos al map ********");
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// agregamos elementos al treeMap
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(3, "Pique");
		linkedHashMap.put(11, "Capdevilla");
		linkedHashMap.put(16, "Busquets");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(7, "Villa");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(14, "Xabi Alonso");
		linkedHashMap.put(8, "Xavi Hernandez");
		linkedHashMap.put(6, "Iniesta");

		// imprimimos el MAp con un Iterador
		Iterator itlinkedHashMap = linkedHashMap.keySet().iterator();

		while (itlinkedHashMap.hasNext()) {
			Integer key = (Integer) itlinkedHashMap.next();
			System.out.println("Clave: " + key + "-> Valor: " + linkedHashMap.get(key));
		}

		System.out.println("******** Trabajando con los metodos de map");
		System.out.println("numero de elemento que tiene el tree map: " + treeMap.size());
		System.out.println("esta vacio el TreeMap" + treeMap.isEmpty());
		System.out.println("Obtenemos un elemento del map pasandole la clave 6 :" + treeMap.get(6));
		System.out.println("borramos el elemento con clave 18 : " + treeMap.remove(18));
		System.out.println("vemos que pasa si queremos obtener la clave 18 que ya no existe : " + treeMap.get(18));
		System.out.println("vemos si existe un elemento con la clave 18 : " + treeMap.containsKey(18));
		System.out.println("vemos si existe un elemento con la clave 1 : " + treeMap.containsKey(1));
		System.out.println("vemos si existe un elemento con el valor 'Villa' " + treeMap.containsValue("Villa"));
		System.out.println("vemos si existe un elemento con el valor 'Ricardo' " + treeMap.containsValue("Ricardo"));
		System.out.println("Borramos todos los elementos del tree map");
		treeMap.clear();
		System.out.println("comprobamos si lo hemos eliminado mirando su size : " + treeMap.size());
		System.out.println("Lo comprobamos tambien observando si esta vacio  :" + treeMap.isEmpty());

		// recorremos un map como si fuese un arrayList
		System.out.println("For Each : Forma Alternativa para recorrer los Map");
		for (Entry<Integer, String> jugador : linkedHashMap.entrySet()) {
			Integer clave = jugador.getKey();
			String valor = jugador.getValue();
			System.out.println(clave + " -> " + valor);
		}

		System.out.println("################Tree Map con objetos como value y String como clave #####################");

		Map<String, JugadorSeleccion> jugadores = new TreeMap<String, JugadorSeleccion>();

		jugadores.put("Casilla", new JugadorSeleccion(1, "Casillas", "Arquero"));
		jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "Lateral DErecho"));
		jugadores.put("Pique", new JugadorSeleccion(13, "Pique", "Central"));
		jugadores.put("Puyol", new JugadorSeleccion(5, "Puyol", "Central"));
		jugadores.put("Capdevilla", new JugadorSeleccion(11, "Capdevilla", "Lateral Izquierdo"));
		jugadores.put("Xabi Alonso", new JugadorSeleccion(14, "Xabi Alonso", "Medio Centro"));
		jugadores.put("Busquets", new JugadorSeleccion(16, "Busquets", "Centro"));
		jugadores.put("Xavi", new JugadorSeleccion(8, "Xavi H", "centro campista"));
		jugadores.put("Pedrito", new JugadorSeleccion(18, "Pedrito", "interior Izq"));
		jugadores.put("Iniesta", new JugadorSeleccion(6, "Iniesta", "Interior Der"));

		System.out.println("mostramos el map ordsenado por orden alfabetico de la clave");
		for (Entry<String, JugadorSeleccion> jugador : jugadores.entrySet()) {
			String clave = jugador.getKey();
			JugadorSeleccion valor = jugador.getValue();
			System.out.println(clave + " -> " + valor.toString());
		}

	}

}
