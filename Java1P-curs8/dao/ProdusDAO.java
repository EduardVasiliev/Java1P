package dao;

import db.Produs;
import db.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdusDAO {
    private Connection con;

    public ProdusDAO(Connection con) {
        this.con = con;
    }
    
    public boolean create(Produs p) {
        String sql = "INSERT INTO produse VALUES (NULL, ?, ?, ?)";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
             stmt.setString(1, p.getNume());
             stmt.setInt(2, p.getPret());
             stmt.setInt(3, p.getUserId());
             
             return stmt.executeUpdate() != 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Produs> findByUserId(int userId) {
        String sql = "SELECT * FROM produse WHERE user_id = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            
            ResultSet rs = stmt.executeQuery();
            List<Produs> produse = new ArrayList<>();
            
            while (rs.next()) {
                produse.add(
                        new Produs(
                                rs.getInt("id"),
                                rs.getString("nume"),
                                rs.getInt("pret"),
                                rs.getInt("user_id")
                        )
                );
            }
            
            return produse;
        } catch (SQLException ex) {
            Logger.getLogger(ProdusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }
    
    public boolean delete(Produs p) {
        String sql = "DELETE FROM produse WHERE id = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, p.getId());
            
            return stmt.executeUpdate() != 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}








