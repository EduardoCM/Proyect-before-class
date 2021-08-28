package com.codigorupestre.spacetravels.connection;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbConnection;

import com.codigorupestre.spacetravels.clases.Usuario;

class TestMariaDB {
	
	/*
	 CREATE TABLE codigorupestre.`User` (
	Id INT auto_increment NOT NULL,
	nombre varchar(100) NOT NULL,
	Apellidos varchar(100) NOT NULL,
	usuario varchar(100) NOT NULL,
	password varchar(100) NULL,
	email varchar(100) NULL,
	telefono varchar(100) NULL,
	CONSTRAINT User_PK PRIMARY KEY (Id)
);
	 */

	//@Test
	void test() {
		DBConnectionMariaDB mariaDBConnection = new DBConnectionMariaDB();
		Connection connection = mariaDBConnection.getConnection();
		Assert.assertNotNull(connection);	
	}
	
	//@Test
	public void testInsert() throws SQLException {
		DBConnectionMariaDB mariaDBConnection = new DBConnectionMariaDB();
		String sql = "INSERT INTO codigorupestre.Usuario (nombre, Apellidos, usuario, password, email, telefono) VALUES('Eduardo', 'Castillo Mendoza', 'ecastillom', '12345', 'ecastillo@spacenative.com', '5544332232')";
		Connection connection = mariaDBConnection.getConnection();
		Statement stmt = connection.createStatement();		
		int valor = stmt.executeUpdate(sql);
		Assert.assertEquals(1, valor);
	}
	
	@Test
	public void testSelect() throws SQLException {		
		DBConnectionMariaDB mariaDBConnection = new DBConnectionMariaDB();		
		String sql = "SELECT * FROM codigorupestre.Usuario where usuario = 'ecastillom'";
		
		Statement stSelect = mariaDBConnection.getConnection().createStatement();
		
		ResultSet rs = stSelect.executeQuery(sql);
		
		Usuario usuario = null;
		
		while(rs.next()) {
			usuario = new Usuario();
			usuario.nombre = rs.getString("nombre");
			usuario.apellidos = rs.getString("Apellidos");
			usuario.usuario = rs.getString("usuario");
			usuario.contrasena = rs.getString("password");
			usuario.email = rs.getString("email");
			usuario.telefono = rs.getString("telefono");
		}
		
		System.out.println(usuario);
		
		Assert.assertEquals("12345", usuario.contrasena);
		
		
	

	}
	

}
