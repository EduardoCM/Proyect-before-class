package com.codigorupestre.spacetravels.clases;

public class Usuario {
	
	// bloques static
	static {
		System.out.println("Ejecutando un bloque static");
	}
	
	//bloques anonimos
	{
		System.out.println("Ejecutando bloque anonimo");
	}
	
	//Constructor
	public Usuario() {
		System.out.println("Creando un nuevo usuario");
	}
	
	public Usuario(int id, String nombre, String apellidos, String usuario, String contrasena, String email, String telefono, boolean activo) {
		System.out.println("Creando nuevo objeto en constructor sobre cargado");
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.email = email;
		this.telefono = telefono;
		this.activo = activo;
				
	}
	
	
	// Atributos
	public int id;
	public String nombre;
	public String apellidos;
	public String usuario;
	public String contrasena;
	public String email;
	public String telefono;
	
	public boolean activo;
	
	
	// Metodos
	public boolean crearUsuario(Usuario usuario) {
		
		return false;
	}
	
	public Usuario buscarUsuario(String usuario) {
		
		return null;
	}
	
	public Usuario actualizarUsuario(String usuario, Usuario usuarioActualizar) {

		return null;
	}
	
	public boolean eliminarUsuario(String usuario) {

		return false;
	}
	
	public boolean loginUsuario(String usuario, String contrasena) {
		
		return false;
	}
	
	public boolean recuperarContrasena(String correo) {
		
		return false;
	}

	// toString();
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", usuario=" + usuario
				+ ", contrasena=" + contrasena + ", email=" + email + ", telefono=" + telefono + ", activo=" + activo
				+ "]";
	}
	
	
	

}
