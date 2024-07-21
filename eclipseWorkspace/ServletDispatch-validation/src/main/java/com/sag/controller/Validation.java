package com.sag.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Oops! Something went wrong.
@WebServlet("/valid")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("control in servlet 1");
		
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		System.out.println(userName+" "+userPassword);
		
//		if(userName.equals("sidduganesh") && userPassword.equals("java")) {
			RequestDispatcher reqDisp = request.getRequestDispatcher("/validfromdb");
			reqDisp.forward(request, response);
//		}
//		else
//		{//servlet chaining can be achieved in 2 ways
//			ServletContext servletContext = request.getServletContext();
//			RequestDispatcher reqDisp = servletContext.getRequestDispatcher("/error.jsp");
//			reqDisp.forward(request, response);
//		}
	}

}
