package controller;

import java.io.IOException;
import java.sql.Connection;
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
		urlPatterns = { "/regstudent" }, 
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:mysql:///vvhs"), 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "password", value = "root")
		})
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		
		String name = request.getParameter("username");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String phno = request.getParameter("phno");
		
		//LOGIC OF JDBC
		if(connection!=null) {
			try {
				pstmt=connection.prepareStatement("insert into person(`name`,`dob`,`email`,`phno`) values(?,?,?,?)");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
