package com.codigorupestre.spacetravels.connection;

import java.sql.Connection;
import java.sql.DriverManager;

//https://downloads.mariadb.org/connector-java/
public class DBConnectionMariaDB {

	static String bd = "spacemoney";

	static String port = "3306";

	static String user = "root";

	static String password = "root";

	static String url = "jdbc:mysql://localhost:" + port + "/" + bd;

	Connection connection = null;

	public DBConnectionMariaDB() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			if (connection == null) {
				System.out.println("La conexion a " + bd + " ha fallado");

			} else {
				System.out.println("La conexion a " + bd + " ha sido exitosa");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void desconectar() {
		connection = null;
	}

}
