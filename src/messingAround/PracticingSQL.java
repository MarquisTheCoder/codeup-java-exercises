package src.messingAround;
import java.sql.*;
import java.util.function.Consumer;

public class PracticingSQL {

    public static void main(String [] args) throws SQLException{

        // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/users?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                     "root", "");
        //Constructs a 'Statement' object called 'statement' inside Connection created.
        Statement statement = conn.createStatement();

        //Writing sql query string  Execute the above sql statement
        String queryString = "SELECT * FROM users.user_data where age > 0";
        sqlDebugging(queryString);

        ResultSet resultSet = statement.executeQuery(queryString);
        processResult(resultSet);

    }

    public static void sqlDebugging(String queryString){
        System.out.printf("SQL '%s' -> sent to database",queryString);
    }
    public static void processResult(ResultSet resultSet) throws SQLException{
        int rowCount = 0;
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("firstName");
            String lastName =  resultSet.getString("lastName");
            int age = resultSet.getInt("age");
            String alias =  resultSet.getString("alias");
            rowCount++;
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("Number of records: %d", rowCount);
    }
}
