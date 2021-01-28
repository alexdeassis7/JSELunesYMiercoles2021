package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	static String db = "persona"; // Nombre de mi base de datos Relacional
	static String login = "root"; // root es la password por defecto de MySQL
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;

	Connection conn = null;

	public Conexion() {
		try {
			// Obtenemos el driver para mysql
			Class.forName("com.mysql.jdbc.Driver");
			// Obtenemos la conexion
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Logramos conectarnos exitosamente a la DB " + db);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("No pudimos detectar el Driver en tu Build Path");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	// metodo que permite retornar la conexion
	public Connection getConnection() {
		return conn;
	}
	// metodo para desconectar de la base

	public void desconectar() {
		if (conn != null) {
			try {
				conn.close();//se libera el recurso 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("no se pudo desconectar de la base por que no estabas conectado");
		}
	}

}
