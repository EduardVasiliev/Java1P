package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseRead {
    public static void main(String[] args){
        
        String url = "jdbc:mysql://localhost:3306/database1";
        String username = "root";
        String password = "";
        
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            
            String sql = "SELECT * FROM persoane";
            stmt.execute(sql);
            
            ResultSet rs = stmt.getResultSet();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nume = rs.getString("Nume");
                String prenume = rs.getString("Prenume");
                
                System.out.println(id + " " + nume + " " + prenume);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}