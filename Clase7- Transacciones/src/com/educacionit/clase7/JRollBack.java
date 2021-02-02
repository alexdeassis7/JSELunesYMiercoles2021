package com.educacionit.clase7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.educacionit.database.Conexion;

public class JRollBack {

	public static void main(String[] args) {
		Conexion con = new Conexion();
		Connection connection = con.getConnection();

		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		try {

			// se desactiva el modo de confirmacion automatica
			connection.setAutoCommit(false);

			// se preparan las sentencias SQL
			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES (? ,?)");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES (? ,? , ?)");

			System.out.println("Primer Insert en MITABLA");
			stmt1.setInt(1, 444);
			stmt1.setString(2, "alexdeassis7@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Segundo Insert en MITABLA");
			stmt1.setInt(1, 555);
			stmt1.setString(2, "nicolas@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Tercer Insert en MITABLA");
			stmt1.setInt(1, 666);
			stmt1.setString(2, "camila@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Primer Insert en MI OTRA TABLA");
			stmt2.setString(1, "Matias");
			stmt2.setString(2, "gonzales");
			stmt2.setInt(3, 35);
			// forzamos un error
			//stmt2.setString(3, "ERRORRR");
			stmt2.executeUpdate();

			// ejecuto metodo commit para impactar los datos en la DB
			connection.commit();

		} catch (SQLException e) {

			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();

			if (connection != null) {
				System.out.println("Haciendo RoolBack de los posible cambios ");
				try {
					connection.rollback();
				} catch (Exception e2) {
					System.out.println("Error grave Rool back fallo  ");
				}
			}

		} finally {
			try {
				if (stmt1 != null) {
					stmt1.close();
				}

				if (stmt2 != null) {
					stmt2.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				System.out.println("ERROR 2" + e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
