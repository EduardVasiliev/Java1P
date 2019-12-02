package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database2 {
    public static void main(String[] args){
        
        String url = "jdbc:mysql://localhost/application1";
        String username = "root";
        String parola = "";
        
        try {
            Connection con = DriverManager.getConnection(url, username, parola);
            
            String sql = "SELECT * FROM users";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String u = rs.getString("username");
                String p = rs.getString("parola");
                
                System.out.println(id + " " + u + " " + p);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Database2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}