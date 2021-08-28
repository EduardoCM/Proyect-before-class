package com.codigorupestre.spacetravels.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	String userLogin = "codigorupestre";
	
	String passwordLogin = "spaceNative";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		System.out.println("Usuario " + userName + " Password: " + password);
		
		if(userName.equals(userLogin) && password.equals(passwordLogin)) {
			System.out.println("Login exitoso");
			
			String nombre = "Eduardo Castillo Mendoza";
			req.setAttribute("nombre", nombre);
			
			RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, resp);
			
		} else {
			System.out.println("Login incorrecto");
		}
		
		
	}

}
