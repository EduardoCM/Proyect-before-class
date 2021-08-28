package com.codigorupestre.spacetravels.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/holamundo")
public class HolaMundoServlets extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Se recibe peticion GET");
	
		resp.getWriter().append("Hola Mundo con Servlets").append("  ").append(LocalDateTime.now().toString());
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println("Usuario: " + username);
		System.out.println("Password: " + password);
		
		resp.getWriter().append("Logeo exitoso con usuario ").append(username);
	}
}
