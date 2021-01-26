package ar.com.educacionit.modelos;

//Clase hijo que hereda de vuelo 
public class VueloCarga extends Vuelo {
	
	public int asientos = 12;
	public float espacioMaximoDeCarga = 1000; //pies cubicos de espacio en nuestra bodega
	//usamos esta variables para ver la cantidad de espacio que tenemos usado en la bodega
	public float espacioCargaUsado;
	
	//metodo para agregar un paquete al avion , este recibira 
	//las dimenciones del paquete
	public void agregarPaquete(float altura ,float ancho , float profundidad) {
		double size = altura * ancho * profundidad ;
	
		if(espacioDeCargaDisponible(size)) {
			espacioCargaUsado += size;
			System.out.println("Su paquete ya esta arriba del avion , queda en buenas manos!");
		}else {
			faltaEspacio();
		}	
	}
	
	//metodo para asegurarnos de que tenemos suficiente 
	//espacio para el paquete que intentamos agregar al avion 
	private boolean espacioDeCargaDisponible(double tamanio) {
		return espacioCargaUsado + tamanio <= espacioMaximoDeCarga;
	}
	
	private void faltaEspacio() {
		System.out.println("NO TENEMOS MAS ESPACIO EN LA BODEGA!");		
	}
	
	//utilizamos esta anotacion para asegurarnos que no cometimos un error accidental y 
	//que coincide con la firma del metodo a sobreescribir 
	//esto le indica al compilador que nuestra intencion es ANULAR un metodo de la clase padre 
	//(no tiene impacto en tiempo de ejecucion , solo en tiempo de compilacion !)
	@Override
	public int getAsiento() {
		return 12;
	}
	
	

}
