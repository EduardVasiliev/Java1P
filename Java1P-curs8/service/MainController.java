package service;

import dao.ProdusDAO;
import dao.UserDAO;
import db.Produs;
import db.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainController {
    private static MainController singleton;
    private UserDAO userDao;
    private ProdusDAO produsDao;
    private Connection con;
    
    
    private MainController() {
        try {
            String url = "jdbc:mysql://localhost:3306/application2";
            con = DriverManager.getConnection(url, "root", "");
            produsDao = new ProdusDAO(con);
            userDao = new UserDAO(con);
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MainController getInstance() {
        if (singleton == null) {
            singleton = new MainController();
        }
        return singleton;
    }
    
    public boolean createUser(String nume, String parola) {
        Optional<User> user = userDao.findByNume(nume);
        
        if (user.isPresent()) {
            return false;
        }
        
        User u = new User(nume, parola);
        return userDao.create(u);
    }
    
    public Optional<User> logheazaUser(String nume, String parola) {
        Optional<User> user = userDao.findByNume(nume);
        
        if (!user.isPresent()) {
            return Optional.empty();
        }
        
        User u = user.get();
        
        if (u.getParola().equals(parola)) {
            return user;
        }
        
        return Optional.empty();
    }
    
    public boolean adaugaProdus(String nume, int pret, int userId) {
        return produsDao.create(
                new Produs(nume, pret, userId)
        );
    }
    
    public List<Produs> findProduseByUserId(int userId) {
        return produsDao.findByUserId(userId);
    }
    
    public boolean stergeProdus(Produs p) {
        return produsDao.delete(p);
    }
}








