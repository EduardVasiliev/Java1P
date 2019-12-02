/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class UserDAO {
    private Connection con;

    public UserDAO(Connection con) {
        this.con = con;
    }
    
    public boolean create(User u) {
        String sql = "INSERT INTO users VALUES (NULL, ?, ?)";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, u.getNume());
            stmt.setString(2, u.getParola());
            return stmt.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public List<User> findAll() {
       String sql = "SELECT * FROM users";
       
       try (PreparedStatement stmt = con.prepareStatement(sql)) {
           List<User> users = new ArrayList<>();
           
           ResultSet rs = stmt.executeQuery();
           
           while (rs.next()) {
               users.add(
                       new User(
                               rs.getInt("id"),
                               rs.getString("nume"),
                               rs.getString("parola")                               
                       )
               );
           }
           return users;
           
           
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
       return Collections.emptyList();
    }
    
    public Optional<User> findByNume(String nume) {
        String sql = "SELECT * FROM users WHERE nume = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nume);
            ResultSet rs = stmt.executeQuery();
            User u = null;
            
            if (rs.next()) {
                u = new User(
                        rs.getInt("id"),
                        rs.getString("nume"),
                        rs.getString("parola")
                );
            }
            
            return Optional.ofNullable(u);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }
}









