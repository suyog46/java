import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_1 {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/lab";
        String uname = "root";
        String pass = "";
        //JDBC driver is a software component that enables a Java application to interact with a specific type of database using the JDBC API. The JDBC driver acts as a bridge between the Java application and the database, providing the necessary functionality to establish connections, execute SQL queries, and process query results.


        Class.forName("com.mysql.cj.jdbc.Driver");// loads the MySQL JDBC driver class com.mysql.cj.jdbc.Driver 
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected with database");
        String query = "SELECT * from employee";
        Statement smt = con.createStatement();
        ResultSet rset = smt.executeQuery(query); // Corrected the method name
        while (rset.next()) {
            System.out.println(rset.getString(1) + " " + rset.getString(2)); // Corrected the print statement
        }
        con.close(); // Closing the connection after use
    }
}
