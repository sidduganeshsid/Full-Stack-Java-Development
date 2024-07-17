package com.sag.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;


public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>ServletConfig</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>Name</th><th>value</th></tr>");
		
		Enumeration<String> parameterNames = getInitParameterNames();
		while(parameterNames.hasMoreElements()) {
			String parameterName = (String) parameterNames.nextElement();
			String value = getInitParameter(parameterName);
			out.println("<tr><td>"+parameterName+"</td><td>"+value+"</td></tr>");
			
		}
		out.println("</table>");
		
		out.close();
		 
	}

}
