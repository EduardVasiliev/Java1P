package service;

import dao.ProdusDao;
import dao.UserDao;
import db.Produs;
import db.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainService {
    private String url = "jdbc:mysql://localhost/application1";
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
    
    public boolean inregistrare(User user){
        UserDao userDao = new UserDao(con);
        boolean rez = false;
        
        try{
            Optional<User> optionalUser = userDao.findUser(user.getUsername());
            
            if(!optionalUser.isPresent()){
                userDao.adaugaUser(user);
                rez = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }   
        
        return rez;
    }
    
    public Optional<User> login(String username, String parola){
        UserDao userDao = new UserDao(con);
        
        try{
            Optional<User> optionalUser = userDao.findUser(username);
            if(optionalUser.isPresent()){
                if(optionalUser.get().getParola().equals(parola)){
                    return optionalUser;
                }   
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return Optional.empty();    //login esuat
    }
    
    public void adaugaProdus(Produs produs){
        ProdusDao produsDao = new ProdusDao(con);
        
        try {
            produsDao.adaugaProdus(produs);
            
        } catch (SQLException ex) {
            Logger.getLogger(MainService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Produs> getAllProducts(){
        ProdusDao produsDao = new ProdusDao(con);
        
        try{
            return produsDao.getAllProducts();  
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return Collections.emptyList();
    }
    
    public void stergeProdus(int id){
        ProdusDao produsDao = new ProdusDao(con);
        
        try {
            produsDao.stergeProdus(id);      
            
        } catch (SQLException ex) {
            Logger.getLogger(MainService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}