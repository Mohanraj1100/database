package assignment.database;
import java.sql.*;

public class Storing 
{
	String database;
    String username;
    String password;
    Connection con;

    private Storing(String database, String username, String password) {
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public static Storing in(String database,String username,String password) {
        return new Storing(database, username, password);
    }

    void connection()

    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(database, username, password);
            System.out.println("Connection established");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void terminate() {
    	try {
        con.close();
        System.out.println("Closed");
    }
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    
}
