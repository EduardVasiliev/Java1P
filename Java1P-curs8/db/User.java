package db;

public class User {
    private int id;
    private String nume;
    private String parola;

    public User() {
    }

    public User(int id, String nume, String parola) {
        this.id = id;
        this.nume = nume;
        this.parola = parola;
    }

    public User(String nume, String parola) {
        this.nume = nume;
        this.parola = parola;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 83 * hash + this.id;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final User other = (User) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nume=" + nume + ", parola=" + parola + '}';
    }
    
    
}
















