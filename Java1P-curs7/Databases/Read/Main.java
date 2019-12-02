package Databases.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "";
        
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            
            String sql = "SELECT * FROM persoane";
            stmt.execute(sql);
            
            ResultSet rs = stmt.getResultSet();  // Iterator = este un cursor cu care iteram in jos. Folosim .next();
            
            while(rs.next()){
                int id   = rs.getInt("id");
                String nume = rs.getString("nume");
                System.out.println(id + " " + nume);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}