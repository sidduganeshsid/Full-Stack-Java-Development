package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/addstudent" }, 
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:mysql:///vvhs"), 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "password", value = "root")
		},loadOnStartup=10)
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection = null;
	private PreparedStatement pstmt = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void init() throws ServletException{
		String jdbcUrl = getInitParameter("url");
		String user = getInitParameter("user");
		String password = getInitParameter("password");
		
		try {
			connection  = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("connection established successfully");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		try {
		String name = request.getParameter("username");
//		String dobstr = request.getParameter("dob");
//		java.util.Date ms1 = new java.util.Date(dobstr);
//		long ms = ms1.getTime();
//		java.sql.Date dob = new java.sql.Date(ms);
		String email = request.getParameter("email");
		String phno = request.getParameter("phno");
		
		//LOGIC OF JDBC
		if(connection!=null) {
			try {
				pstmt=connection.prepareStatement("insert into person(`name`,`email`,`phno`) values(?,?,?)");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null) {
			try {
				pstmt.setString(1,name);
//				pstmt.setDate(3, dob);
				pstmt.setString(2, email);
				pstmt.setString(3, phno);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null)
		{
			int rowAffected;
		
				rowAffected = pstmt.executeUpdate();
			
			PrintWriter out = response.getWriter();
			if(rowAffected==1) {
				out.println("<h1>successfull</h1>");
				out.close();
				}else {
				out.println("<h1>failed</h1>");
				out.println("<a href='./addstudent' >|REGISTER AGAIN|</a>");
				out.close();
			}
		}
			
			
		
		
	}catch(SQLException se) {
		se.printStackTrace();
	}
	}
	
	@Override
	public void destroy() {
		try {
			if(connection!=null) {
				connection.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
