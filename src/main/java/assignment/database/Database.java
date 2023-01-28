package assignment.database;
import java.util.*;
public class Database {

	public static void main(String[] args) {
        String database;
        String username;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter database name");
        database = sc.next();
        System.out.println("Enter Username");
        username = sc.next();
        System.out.println("Enter Password ");
        password = sc.next();
        Storing obj1 = Storing.obj(database,username,password);
        obj1.connection();
        obj1.terminate();
        sc.close();
    }
}
