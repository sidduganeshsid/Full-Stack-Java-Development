package in.ineuron.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC4.X autoloading feature is enabled.
public class SelectApp {

	public static void main(String[] args) throws  SQLException {

		// Step2. Establish the Connection
		String url = "jdbc:mysql:///octbatch";
		String user = "root";
		String password = "root123";
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("CONNECTION object created...");

		// Step3. Create statement Object and send the Query
		Statement statement = connection.createStatement();
		System.out.println("STATEMENT object created...");

		// Step4. Execute the Query and Process the resultSet
		String sqlSelectQuery = "select sid,sname,sage,saddress from student";
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		System.out.println("RESULTSET object created...");
		System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
		while (resultSet.next()) {
			int sid = resultSet.getInt("sid");
			String sname = resultSet.getString("sname");
			int sage = resultSet.getInt("sage");
			String saddress = resultSet.getString("saddress");
			System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + saddress);
		}

		// Step6. Close the resources
		resultSet.close();
		statement.close();
		connection.close();
		System.out.println("Closing the resources...");

	}
}
