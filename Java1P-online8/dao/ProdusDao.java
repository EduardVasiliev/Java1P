package dao;

import db.Produs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProdusDao {
    private Connection con;
    private PreparedStatement stmt1, stmt2, stmt3;
    
    public ProdusDao(Connection con){
        this.con = con;
        
        try{
            stmt1 = con.prepareStatement("INSERT INTO produse VALUES(NULL, ?, ?)");
            stmt2 = con.prepareStatement("SELECT * FROM produse");
            stmt3 = con.prepareStatement("DELETE FROM produse WHERE id = ?");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void adaugaProdus(Produs produs) throws SQLException{
        stmt1.setString(1, produs.getNume());
        stmt1.setDouble(2, produs.getPret());
        stmt1.executeUpdate();
    }
    
    //returneaza toata lista de produse
    public List<Produs> getAllProducts() throws SQLException{
        List<Produs> produse = new ArrayList<>();
        
        ResultSet rs = stmt2.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id");
            String nume = rs.getString("nume");
            double pret = rs.getDouble("pret");
            
            produse.add(new Produs(id, nume, pret));
        }
        
        return produse;
    }
    
    //stergerea la dublu-click
    public void stergeProdus(int id) throws SQLException{
        stmt3.setInt(1, id);
        stmt3.executeUpdate();
    }
    
}