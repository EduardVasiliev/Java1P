package service;

import dao.StudentDao;
import db.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainService {
    private String url = "jdbc:mysql://localhost:3306/java1pexamen";
    private String user = "root";
    private String password = "";
    private Connection con;
    
    private MainService(){
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(MainService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static final class SingletonHolder{
        private static final MainService SINGLETON = new MainService();
    }
    
    public static MainService getInstance(){
        return SingletonHolder.SINGLETON;
    }
    
    public boolean addStudent(Student student){
        StudentDao studentDao = new StudentDao(con);
        boolean rez = false;
        
        try{
            Optional<Student> optionalStudent = studentDao.findStudent(student.getCnp());

            if(!optionalStudent.isPresent()){
                studentDao.addStudent(student);
                rez = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return rez;
    }
    
    public List<Student> getAllStudents(){
        StudentDao studentDao = new StudentDao(con);
        return studentDao.getAllStudents();
    }
    
    public boolean deleteStudent(int id){
        StudentDao studentDao = new StudentDao(con);
        return studentDao.deleteStudent(id);
    }
}