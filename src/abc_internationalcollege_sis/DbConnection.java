

package abc_internationalcollege_sis;

import java.sql.Connection;
import java.sql.DriverManager;



public class DbConnection {
     Connection conn = null;

    public static Connection dbconnect(){
        Connection conn = null;
        try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                String connectionUrl = "jdbc:mysql://localhost:3306/abc_sis";
                String connectionUser = "root";
                String connectionPassword = "root";
            conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println("Error from dbconnection"+e );
        }
        return conn;  
    } 
}
