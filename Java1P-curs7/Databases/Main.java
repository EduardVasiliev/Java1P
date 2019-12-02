package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        
        String url = "jdbc:mysql://localhost:3306/java";       //definim hostul cu portul
        String user = "root";
        String password = "";
        
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO persoane VALUES(NULL, 'Alexandru')";
            stmt.execute(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}