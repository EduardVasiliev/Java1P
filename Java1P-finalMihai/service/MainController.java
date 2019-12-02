package service;

import dao.StudentiDAO;
import db.Studenti;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainController {
    private static MainController singleton;
    private StudentiDAO studentiDao;
    private Connection con;
    
    public static MainController getInstance() {
        if (singleton == null) {
            singleton = new MainController();
        }
        return singleton;
    }
    
    private MainController() {
        try {
            String url = "jdbc:mysql://localhost:3306/java1pexamen";
            con = DriverManager.getConnection(url, "root", "");
            studentiDao = new StudentiDAO(con);
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean adaugaStudent(String nume, String prenume, String cnp){
        return studentiDao.create(
                new Studenti(nume, prenume, cnp)
        );
    }
    
    public boolean stergeStudent(Studenti stud){
        return studentiDao.delete(stud);
    }
    
    public List<Studenti> allStudents(){
        return studentiDao.allStudents();
    }
}

