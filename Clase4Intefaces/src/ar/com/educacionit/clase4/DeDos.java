package ar.com.educacionit.clase4;

//implementamos la interface ISeries
public class DeDos implements ISeries {
	int iniciar;
	int valor;

	DeDos() {
		iniciar = 0;
		valor = 0;
	}

//siempre que se implemente un metodo definido por una interfaz,
//	debe implementarse como publico porque todos los miembros de una interfaz son implicitamente publicos
	@Override
	public int getSiguiente() {
		valor += 2;
		return valor;
	}


	@Override
	public void reiniciar() {
		valor = iniciar;

	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;

	}

}
