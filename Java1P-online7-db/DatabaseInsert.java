package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseInsert {
    public static void main(String[] args){
        
        String url = "jdbc:mysql://localhost:3306/database1";
        String username = "root";
        String password = "";
        
        try {
            Connection con = DriverManager.getConnection(url, username, password);          
            //obtinem o instanta de conexiune la baza de date  
            Statement stmt = con.createStatement();
            //trimitem o comanda catre sistemul de gesiune
            
            String sql = "INSERT INTO persoane VALUES(NULL, 'POP', 'IOAN')";
            stmt.execute(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
}

// Adaug in baza de date