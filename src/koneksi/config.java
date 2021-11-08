package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 *  * @author Bhuwana
 */
public class config {
    public static Connection conn;

    public static Connection Conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tokobukudb","admin","admin");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static void main(String args[]){
        System.out.println(config.Conn());
    }
}
