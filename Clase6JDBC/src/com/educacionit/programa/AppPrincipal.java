package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.daos.PersonaDao;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println("Inicio de la App");

		PersonaDao pd = new PersonaDao();

		PersonaVO pvo = new PersonaVO();
		// REGISTRAMOS UNA PERSONA (CREATE)
//		pvo.setNombrePersona(JOptionPane.showInputDialog("Ingrese el nombre de la persona"));
//		pvo.setIdPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona")));
//		pvo.setEdadPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona")));
//		pvo.setProfesionPersona(JOptionPane.showInputDialog("Ingrese la profesion de la persona"));
//		pvo.setTelefonoPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona")));
//
//		pd.registrarPersona(pvo);
//		
//		System.out.println(pvo);

		// BUSCAMOS UNA PERSONA (READ)
//		int idIngresado = Integer
//				.parseInt(JOptionPane.showInputDialog("Ingrese por favor el id de la persona que gustas conocer"));
//		// 632
//
//		PersonaVO personaBuscada = pd.buscarPersona(idIngresado);
//
//		if (personaBuscada != null) {
//			JOptionPane.showMessageDialog(null, personaBuscada.toString());
//		} else {
//			JOptionPane.showMessageDialog(null, "NO existe el id : " + idIngresado + " En la DB");
//		}
//
//		// ELIMINAMOS UNA PERSONA (DELETE)
//		String idAborrar = JOptionPane.showInputDialog("Ingrese por favor el id de la persona que quieres borrar");
//
//		pd.eliminarPersona(idAborrar);

		PersonaVO persona = new PersonaVO(888, "Rodrigo", 29, "Mago", 1234545);

		pd.modificarPersona(persona);
		
		System.out.println("Fin de la App");
	}

}
