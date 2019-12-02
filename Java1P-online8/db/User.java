package db;

public class User {
    
    private int id;
    private String username;
    private String parola;

    public User() {
    }

    public User(String username, String parola) {
        this.username = username;
        this.parola = parola;
    }

    public User(int id, String username, String parola) {
        this.id = id;
        this.username = username;
        this.parola = parola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
    
}