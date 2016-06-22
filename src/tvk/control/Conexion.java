package tvk.control;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static Connection conex = null;
    
    public static Connection getConex() throws Exception {
        String url  = "jdbc:mysql://localhost/mysql";
        String user = "root";
        String pwd  = "johan123";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conex = DriverManager.getConnection(url, user, pwd);
        return conex;
    }
    
}