package com.educacionit.daos;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import java.sql.*;
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
		System.out.println("INSERT INTO personas VALUES ('" + miPersona.getIdPersona() + "','"
				+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
				+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");
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

	public PersonaVO buscarPersona(int codigo) {

		Conexion conex = new Conexion();
		PersonaVO persona = new PersonaVO();

		boolean existe = false;
		try {

			// Statement estatuto = conex.getConnection().createStatement();
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM personas where id = ? ");
			consulta.setInt(1, codigo);// reemplaza el ? por el valor que tiene el parametro codigo
			ResultSet res = consulta.executeQuery();

			while (res.next()) {// recorremos el set de registro/s obtenidos y lo cargamos en un VO
				existe = true;
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));

			}

			res.close();
			conex.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error , al intentar buscar la persona con el id " + codigo);
			System.out.println(e.getMessage());
		}
		if (existe) {
			return persona;
		} else {
			return null;
		}

	}

	public void eliminarPersona(String codigo) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();
			if (buscarPersona(Integer.parseInt(codigo)) != null) {
				estatuto.executeUpdate("DELETE FROM personas WHERE id='" + codigo + "'");
				JOptionPane.showMessageDialog(null, "La persona con Id" + codigo + " se elimino de la db  ");
			} else {
				JOptionPane.showMessageDialog(null,
						"La persona con Id" + codigo + " No se elimino" + " de la db por que no EXISTE ");
			}
			estatuto.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,
					"Ocurrio un error al intentar eliminar la persona con codigo :" + codigo);

		}
	}

	public void modificarPersona(PersonaVO miPersona) {

		Conexion conex = new Conexion();
		String consulta = "Update personas SET id = ? , nombre = ? , edad = ? , profesion = ?, telefono = ? where id = ?";

		try {
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

			estatuto.setInt(1, miPersona.getIdPersona());
			estatuto.setString(2, miPersona.getNombrePersona());
			estatuto.setInt(3, miPersona.getEdadPersona());
			estatuto.setString(4, miPersona.getProfesionPersona());
			estatuto.setInt(5, miPersona.getTelefonoPersona());
			estatuto.setInt(6, miPersona.getIdPersona());

			estatuto.executeUpdate();

			JOptionPane.showMessageDialog(null,
					"Se ah modificado Correctamente a la persona con id : " + miPersona.getIdPersona());
		} catch (SQLException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"Ocurrio Error al modificar la persona con id : " + miPersona.getIdPersona());
		}

	}

}
