package src.messingAround;
import java.sql.*;

public class PracticingSQL {
    public static void main(String [] args){
        try{
            // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/users?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                         "root", "");
            //Constructs a 'Statement' object called 'statement' inside Connection created.
            Statement statement = conn.createStatement();

            //Writing sql query string  Execute the above sql statement

        }catch(Exception e){

        }
    }
}
