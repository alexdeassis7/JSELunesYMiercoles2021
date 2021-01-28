package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.daos.PersonaDao;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println("Inicio de la App");

		PersonaDao pd = new PersonaDao();

		PersonaVO pvo = new PersonaVO();

		pvo.setNombrePersona(JOptionPane.showInputDialog("Ingrese el nombre de la persona"));
		pvo.setIdPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona")));
		pvo.setEdadPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona")));
		pvo.setProfesionPersona(JOptionPane.showInputDialog("Ingrese la profesion de la persona"));
		pvo.setTelefonoPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona")));

		pd.registrarPersona(pvo);
		
		System.out.println(pvo);

		System.out.println("Fin de la App");
	}

}
