package ar.com.educacionit.clase4;

//una interface es un conjunto de metodo abstracto y atributos contantes 
public interface ISeries {
	// las variable que definimos dentro de un ainterface no son varibales
	// de intancia , en cambio son :
	// implicitamente public , final y static y deben inicializarce.Por lo tanto ,
	// son
	// esencialmente constantes

//	int numero = 10;
	
	//los metodos de la interface con implicitamente publicos!!
	int getSiguiente();

	void reiniciar();

	void setComenzar(int x);

}

//Novedades del JDK 8
//es posible agregar una implementacion predeterminada  a un metodo de interfaz , ademas
//tambien ahora se admiten metodos de interfaz static 

//Novedades del JDK 9 
//es posible tambien incluir metodos privados ,por lo tanto ahora es posible
//que la interfaz especifique algun comportamiento 

