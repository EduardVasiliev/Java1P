package db;
public class Student {
    private int id;
    private String Nume;
    private String Prenume;
    private String Cnp;

    public Student() {
    }

    public Student(String Nume, String Prenume, String Cnp) {
        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Cnp = Cnp;
    }

    public Student(int id, String Nume, String Prenume, String Cnp) {
        this.id = id;
        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Cnp = Cnp;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String Nume) {
        this.Nume = Nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String Prenume) {
        this.Prenume = Prenume;
    }

    public String getCnp() {
        return Cnp;
    }

    public void setCnp(String Cnp) {
        this.Cnp = Cnp;
    }
    
    @Override
    public String toString(){
        return id + " " + Nume + " " + Prenume + " " + Cnp;
    }
    
}