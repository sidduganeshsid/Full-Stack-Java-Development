package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//autoloading for JDBC 4.X
//		//1. load and register the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Establish the connection with database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		//3. Create a statement
		Statement statement = connection.createStatement();
		//4. Execute the query
		int insertCount = statement.executeUpdate("insert into studentinfo values(1,'sidduganesh')");
		System.out.println(insertCount);
		
		
		//6. Handle the exception
		//ducked
		
		//7. close the resource
		statement.close();
		connection.close();
		
		
	}

}
