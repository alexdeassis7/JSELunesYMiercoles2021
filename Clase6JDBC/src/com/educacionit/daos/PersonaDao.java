package com.educacionit.daos;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

//clase que permite el Acceso a la base de dato 
/*Cuando utlizamos este patron llamado DAta Access Object,
 * basicamente este patron consiste en centralizar los procesos de acceso
 * a la base de datos evitando inconsistencias y posibles problematicas 
 * cuando esto se reealiza  a lo largo de la aplicacion .
 * con este patron independizamos la logica de negocio de la logica de acceso
 * a datos obteniendo mayor organizacion y flexibilidad en el sistema * */

public class PersonaDao {

	public void registrarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();
		System.out.println("INSERT INTO personas VALUES ('"
				+ miPersona.getIdPersona() + "','" + miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona()
				+ "','" + miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO personas (`id`, `nombre`, `edad`, `profesion`, `telefono`)  VALUES ('"
					+ miPersona.getIdPersona() + "','" + miPersona.getNombrePersona() + "','"
					+ miPersona.getEdadPersona() + "','" + miPersona.getProfesionPersona() + "','"
					+ miPersona.getTelefonoPersona() + "')");

			JOptionPane.showMessageDialog(null, "Se ah Registrado Exitosamente", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"No Se Logro Registrar a " + miPersona.getNombrePersona() + " en la DB");
		}

	}

}
