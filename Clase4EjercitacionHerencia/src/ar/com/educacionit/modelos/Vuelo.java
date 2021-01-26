package ar.com.educacionit.modelos;

//CLase padre o clase base !
public class Vuelo {
	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// inicializador de bloque
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
			System.out.println("se dispoibilizo el asiento " + i);
		}
	}

	public Vuelo() {

	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;

	}

	public int getAsientos() {
		return getAsiento();
	}

	public int getAsiento() {
		return 150;
	}

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			pasajeros += 1;
			System.out.println("Se subio a " + p1.getNombre() + " al avion");
		} else {
			faltaAsiento();
		}
	}

	private boolean asientoDisponible() {
		return pasajeros < getAsiento();
	}

	private void faltaAsiento() {
		System.out.println("ya no quedan asientos , busquese otra aerolinea por favor");
	}

	public int asientosDisponibles() {
		int contadorDisponibles = 0;

		for (int i = 0; i < getAsiento(); i++) {
			if (asientosDisponibles[i] == true) {
				contadorDisponibles++;
			}
		}
		return contadorDisponibles;

	}

}
