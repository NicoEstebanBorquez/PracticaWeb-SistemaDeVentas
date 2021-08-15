package config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bd_ventas?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345678";

    Connection con;
    
    public Connection Conexion(){
    
        try {
            //com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
