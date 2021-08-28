package com.codigorupestre.spacetravels.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DBConnectionOracleDB {
	
	
	static String dataBaseServiceName = "ORCLCDB.localdomain";
	
	static String port = "1521";
	
	static String user = "codigorupestre";
	
	static String password = "codigorupestre";
	
	static String url = "jdbc:oracle:thin:" + user + "/" + password + "@//localhost:" + port +"/" + dataBaseServiceName;
	
	Connection connection = null;
	
	public DBConnectionOracleDB() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url);
			
			if(connection == null){
				System.out.println("Conexion a Oracle fallo");
			}else {
				System.out.println("Conexion a Oracle exitosa");
			}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void desconectar() {
		connection = null;
	}

}
