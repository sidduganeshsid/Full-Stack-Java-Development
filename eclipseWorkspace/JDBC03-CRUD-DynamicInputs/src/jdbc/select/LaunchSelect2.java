package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchSelect2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//autoloading for JDBC 4.X
//		//1. load and register the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Establish the connection with database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		//3. Create a statement
		Statement statement = connection.createStatement();
		//4. Execute the query
		ResultSet resultSet = statement.executeQuery("SELECT id,name FROM studentinfo");
		//5. Process the resultSet 
		System.out.println("Id\tName");
		while(resultSet.next()) {
			Integer id = resultSet.getInt("id");//performance
			String name = resultSet.getString("name");//better performance
			
			System.out.println(id+"\t"+name);
		}
		//6. Handle the exception
		//ducked
		
		//7. close the resource
		resultSet.close();
		statement.close();
		connection.close();
		
		
	}

}
