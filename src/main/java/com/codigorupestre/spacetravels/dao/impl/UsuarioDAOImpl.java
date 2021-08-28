package com.codigorupestre.spacetravels.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.codigorupestre.spacetravels.clases.Usuario;
import com.codigorupestre.spacetravels.dao.UsuarioDAO;
import com.codigorupestre.spacetravels.factorymethod.DBFactory;
import com.codigorupestre.spacetravels.factorymethod.IDBAdapter;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	private IDBAdapter dbAdapter;
	
	public UsuarioDAOImpl() {
		dbAdapter = DBFactory.getDefaultDBAdapter();
	}

	@Override
	public boolean insertarUsuario(Usuario usuario) {
		
		Connection connection = dbAdapter.getConnection();
		String sqlInsert = "INSERT INTO codigorupestre.Usuario (nombre, apellidos, usuario, password, email, telefono) VALUES(?,?,?,?,?,?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sqlInsert);
			statement.setString(1, usuario.nombre);
			statement.setString(2, usuario.apellidos);
			statement.setString(3, usuario.usuario);
			statement.setString(4, usuario.contrasena);
			statement.setString(5, usuario.email);
			statement.setString(6, usuario.telefono);
			
			statement.executeUpdate();
			
			return true;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	
	

}
