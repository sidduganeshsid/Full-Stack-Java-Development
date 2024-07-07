import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class TestApp
{
    public static void main(String args[])
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            //step 1. Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. DRIVER LOADED & REGISTERED SUCCESSFULLY");

        //2. Establish the connection
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "root";
        connection = DriverManager.getConnection(url, username, password);
        // System.out.println("The implementation class name of the mysql::"+connection.getClass().getName());
        System.out.println("2. CONNECTION ESTABLISHED SUCCESSFULLY");

        String sqlSelectQuery = "select id,name from studentinfo";
        //3. 
        statement = connection.createStatement();
        // System.out.println("The implementation classname of the mysql :: ");
        resultSet = statement.executeQuery(sqlSelectQuery);

        //4. Process the resultSet object BFR = before first record , ALR = after last record
        System.out.println("Id\tName");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);

            System.out.println(id+"\t"+name);
            
        }


        }catch(ClassNotFoundException ce){
            ce.printStackTrace();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(connection!=null){
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}