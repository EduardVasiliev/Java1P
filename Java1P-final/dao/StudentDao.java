package dao;

import db.Student;
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

public class StudentDao {
    private Connection con;
    
    public StudentDao(Connection con){
        this.con = con;
    }
    
    public Optional<Student> findStudent(String Cnp) throws SQLException{
        String sql = "SELECT * FROM studenti WHERE Cnp = ?";
   
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, Cnp);
        Student student = null;
        
        try(ResultSet rs = stmt.executeQuery()){
            if(rs.next()){
                student = new Student();
                student.setId(rs.getInt("id"));
                student.setNume(rs.getString("Nume"));
                student.setPrenume(rs.getString("Prenume"));
                student.setCnp(rs.getString("Cnp"));
            }
        }

        return Optional.ofNullable(student);
            
    }
    
    public boolean addStudent(Student student){
        String sql = "INSERT INTO studenti VALUES(NULL, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, student.getNume());
            stmt.setString(2, student.getPrenume());
            stmt.setString(3, student.getCnp());
            
            return stmt.executeUpdate() != 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public List<Student> getAllStudents(){
        String sql = "SELECT * FROM studenti";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);           
            ResultSet rs = stmt.executeQuery();
            
            List<Student> studentList = new ArrayList<>();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String Nume = rs.getString("Nume");
                String Prenume = rs.getString("Prenume");
                String Cnp = rs.getString("Cnp");
                
                studentList.add(new Student(id, Nume, Prenume, Cnp));
            }
            
            return studentList;

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
    
    public boolean deleteStudent(int id){
        String sql = "DELETE FROM studenti WHERE id = ?";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            return stmt.executeUpdate() != 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}