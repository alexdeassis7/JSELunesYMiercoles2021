package ar.com.educacionit.modelos;

public class AppPrincipal {

	public static void main(String[] args) {

		VueloCarga vc = new VueloCarga();

		vc.agregarPaquete(1, 2, 33);
		vc.agregarPaquete(10, 2, 5);
		vc.agregarPaquete(14, 22, 33);

		Passenger camila = new Passenger();
		camila.setNombre("Camila Di Toro");

		Passenger gabriel = new Passenger();
		gabriel.setNombre("gabriel Cejas");

		Passenger german = new Passenger();
		german.setNombre("German Ponce");

		Passenger marcos = new Passenger();
		marcos.setNombre("Marcos Quintana");
		
		for (int i = 0; i < 5; i++) {
			vc.agregarPasajero(marcos);
			vc.agregarPasajero(gabriel);
			vc.agregarPasajero(german);
			vc.agregarPasajero(camila);
		}
		
		System.out.println("Creamos con el primer constructor ");
		Vuelo v1 = new Vuelo();
		
		System.out.println("Creamos con el segundo constructor ");
		Vuelo v2 = new Vuelo('A');
		
		System.out.println("Creamos con el tercer constructor ");
		Vuelo v3 = new Vuelo(956);
		
		for (int i = 0; i <= 200; i++) {
	
			v3.agregarPasajero(camila);
		}
		
		
		
		
		
		
	}

}
