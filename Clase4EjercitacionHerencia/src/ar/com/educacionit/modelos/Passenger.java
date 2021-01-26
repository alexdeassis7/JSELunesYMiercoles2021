package ar.com.educacionit.modelos;

public class Passenger {

	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalAPagar;
	private int totalEquipaje;
	private String nombre ;

	public Passenger() {

	}

	// constructor 2 : con un parametro , este llama al constructor 4
	public Passenger(int bolsos) {
		this(bolsos > 1 ? 50.0d : 25.0d);
		this.bolsos = bolsos;
		totalAPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
	}

	// constructor 3 con do parametro : este llama al constructor 2 que a su vez
	// llamara constructor 4
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalAPagar = bolsos * tarifaXbolso;
	}

//constructor 4 encargado de setear la tarifa de los bolsos
	// constructor privado
	private Passenger(double tarifaXBolso) {
		this.tarifaXbolso = tarifaXBolso;
	}

	public String toString() {
		return "Passenger [bolsos=" + bolsos + ", bolsosPagos=" + bolsosPagos + ", tarifaXbolso=" + tarifaXbolso
				+ ", totalAPagar=" + totalAPagar + ", totalEquipaje=" + totalEquipaje + "]";
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public double getTotalAPagar() {
		return totalAPagar;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}

	public static void mostrarListaDePAsajeros(Passenger listaPasajeros[]) {
		for (Passenger p1 : listaPasajeros) {
			System.out.println("*************************************");
			System.out.println("Tarifa por bolso " + p1.tarifaXbolso);
			System.out.println("Total a pagar : " + p1.getTotalAPagar());
			System.out.println("Total de Bolsos " + p1.getTotalEquipaje());

		}
	}

}
