package dao;

import db.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserDao {
    private Connection con;
    private PreparedStatement stmt1, stmt2;
    
    public UserDao(Connection con){
        this.con = con;
        
        try{
            this.stmt1 = con.prepareStatement("SELECT * FROM users WHERE username = ?");
            this.stmt2 = con.prepareStatement("INSERT INTO users VALUES(NULL, ?, ?)");
            
        }catch(Exception e){
            e.printStackTrace();
        }    
    }

    public Optional<User> findUser(String username) throws SQLException{
        stmt1.setString(1, username);
        User user = null;
        
        try(ResultSet rs = stmt1.executeQuery()){
            if(rs.next()){
                user = new User();
                    user.setId(rs.getInt("id"));                    //setterii din User.java 
                    user.setUsername(rs.getString("username"));     //setam parametrii User.java
                    user.setParola(rs.getString("parola"));    
            }
        }    
        return Optional.ofNullable(user);
    }
    
    public void adaugaUser(User user) throws SQLException{
        stmt2.setString(1, user.getUsername());
        stmt2.setString(2, user.getParola());
        stmt2.executeUpdate();
    }
}