package com.codigorupestre.spacetravels.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class TestOracleDB {
	
	/*
	 CREATE TABLE CODIGORUPESTRE.USUARIO (
	ID INTEGER GENERATED ALWAYS AS IDENTITY,
	NOMBRE VARCHAR2(100),
	APELLIDOS VARCHAR2(100),
	USUARIO VARCHAR2(100),
	PASSWORD VARCHAR2(100),
	EMAIL VARCHAR2(100),
	TELEFONO VARCHAR2(100));
	
	INSERT INTO CODIGORUPESTRE.USUARIO
    (NOMBRE, APELLIDOS, USUARIO, PASSWORD, EMAIL, COLUMN7)
    VALUES('T', 'T', 'T', 'T', 'T', 'T');
	 */

	@Test
	void test() {		
		DBConnectionOracleDB oracleDB = new DBConnectionOracleDB();
		Connection connection = oracleDB.getConnection();
		Assert.assertNotNull(connection);
	}
	
	
	@Test
	public void testInsert() throws SQLException {
		DBConnectionOracleDB oracleDBConnection = new DBConnectionOracleDB();
		String sql = "INSERT INTO codigorupestre.Usuario (nombre, Apellidos, usuario, password, email, telefono) VALUES('Eduardo', 'Castillo Mendoza', 'ecastillom', '12345', 'ecastillo@spacenative.com', '5544332232')";
		Connection connection = oracleDBConnection.getConnection();
		Statement stmt = connection.createStatement();		
		int valor = stmt.executeUpdate(sql);
		Assert.assertEquals(1, valor);
	}
	
	
	
	

}
