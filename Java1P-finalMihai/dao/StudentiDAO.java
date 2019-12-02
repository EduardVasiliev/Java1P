/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.Studenti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class StudentiDAO {
    private Connection con;
    private StudentiDAO studentiDao;
    
    public StudentiDAO(Connection con) {
        this.con = con;
    }
    
    public boolean create(Studenti stud) {
        String sql = "INSERT INTO studenti VALUES (NULL, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)) 
        {
            stmt.setString(1, stud.getNume());
            stmt.setString(2, stud.getPrenume());
            stmt.setString(3, stud.getCnp());
            return stmt.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(StudentiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Studenti> allStudents(){
        String sql = "SELECT * FROM studenti";
        try(PreparedStatement stmt = con.prepareStatement(sql)) 
        {
            List<Studenti> students = new ArrayList<>();
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                students.add(new Studenti(
                        rs.getInt("id"),
                        rs.getString("Nume"),
                        rs.getString("Prenume"),
                        rs.getString("Cnp")
                    )
                );
            }
            return students;
        } catch (SQLException ex) {
            Logger.getLogger(StudentiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }
    
    public boolean delete(Studenti stud) {
        String sql = "DELETE FROM studenti WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, stud.getId());
            return stmt.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(StudentiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
