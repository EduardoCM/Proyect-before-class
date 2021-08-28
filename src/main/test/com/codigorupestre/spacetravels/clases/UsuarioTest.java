package com.codigorupestre.spacetravels.clases;

import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	public void testCreateUsuario() {
		System.out.println("Inicia prueba unitaria");
		Usuario usuarioUno = new Usuario();
		usuarioUno.id = 1;
		usuarioUno.nombre = "Eduardo";
		usuarioUno.apellidos = "Castillo Mendoza";
		usuarioUno.usuario = "ecastillo";
		usuarioUno.email = "ecastillo@spacenative.com";
		usuarioUno.telefono = "5543876534";
		usuarioUno.activo = true;
		System.out.println(usuarioUno);
		
		Usuario usuarioDos = new Usuario(2, "Juanito", "Perez", "jperez", "12345", "jperez@spacenative.com", "5533442134", true);
		
		System.out.println(usuarioDos);
		
		System.out.println("Termina Prueba unitaria");
		
	}

}
