package com.educacionit.modelos;

/*AL utilizar este tipo de clases , aplicamos el patron Value Object
 *  atnteriormente conocido como DTO (Data Transfer Object) en el que representamos 
 *  las entidades (tablas)  de la base de datos , la tabla persona tiene los campos id , nombre , edad , profesion , 
 *  telefono  entonces nuestra clase tendra estos mismos atributos y de esta manera podremos transportar 
 *  un objeto personaVO cono todo sus valores  
 *  
 *  Este patron nos facilita enormemente el transporte de la informacion , evitando que se envien gran
 *  cantidad de parametros a un metodo cuando queremos hacer un registro o necesitamos actualizar algun dato ,
 *  */
public class PersonaVO {

	private int idPersona;
	private String nombrePersona;
	private int edadPersona;
	private String profesionPersona;
	private int telefonoPersona;

	public PersonaVO() {
	}

	public PersonaVO(int idPersona, String nombrePersona, int edadPersona, String profesionPersona,
			int telefonoPersona) {
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.profesionPersona = profesionPersona;
		this.telefonoPersona = telefonoPersona;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public int getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	public int getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(int telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	@Override
	public String toString() {
		return "PersonaVO [idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", edadPersona=" + edadPersona
				+ ", profesionPersona=" + profesionPersona + ", telefonoPersona=" + telefonoPersona + "]";
	}

}
