package IOStreams;
import java.io.*;

public class Pisica implements Serializable{
    public static final long serialVerionUID = 2;   //Serializare - Nu mai primesc eroare la modificarea instantei
    
    String nume;
    transient double varsta;
    String culoare;
    
    public Pisica(String nume, double varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
    
    @Override
    public String toString(){
        return this.nume + " " + this.varsta;
    }

}

// transient - marcheaza atributele care nu trebuie serializate