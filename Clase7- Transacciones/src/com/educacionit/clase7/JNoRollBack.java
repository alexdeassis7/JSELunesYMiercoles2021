package com.educacionit.clase7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.educacionit.database.Conexion;

public class JNoRollBack {

	public static void main(String[] args) {

		Conexion con = new Conexion();
		Connection connection = con.getConnection();

		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		try {
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

			// forzamos un error
			stmt2.setString(3, "ERRORRR");
			stmt2.executeUpdate();

		} catch (SQLException e) {

			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
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

		/*
		 * 1. comprobar que nuestra cuenta existe es valida y esta operativa 2.
		 * comprobar si hay saldo en nuestra cuenta 3. comprobar los datos de la cuenta
		 * del vendedor (que existe ,que tiene posibilidad de recibir dinero ....etc...)
		 * 4. retirar el dinero de nuestra cuenta 5.ingresar el dinero en la cuenta del
		 * vendedor
		 *
		 * Propiedades ACID : atomicity , consistency , isolation y durability
		 * Aromicidad consistencia aislamiento
		 * 
		 * TEnemos 3 tipos de transacciones segun como las iniciamos :
		 *
		 * De confirmacion Automatica Implicitas * Explicitas
		 *
		 * DEGIN TRAN
		 *
		 * operacion 1 si fallo : Rollback Tran
		 *
		 * 
		 * operacion 2 si fallo : Rollback Tran
		 *
		 * operacion N si fallo : Rollback Tran
		 *
		 * Commit TRAN
		 *
		 * MyISAM - InnoDB
		 *
		 **/
	}

}
