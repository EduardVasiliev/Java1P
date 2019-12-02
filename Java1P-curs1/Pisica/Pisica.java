package Pisica;
import java.io.*;
public class Pisica extends Animal implements Serializable{
    private static final long serialVersionUID = 1L;
    public transient String nume = "Tom";   //transient aplicat pe un atribut al clasei, ii spune motorului de serializare sa
    public int varsta;                      //ignore atributul respectiv. Nu mai conteaza daca este Serializable. Va fi ignorat.
    public String culoare;
    public int greutate;
    
    {
        System.out.println("Bloc anonim non-static");
    }
    
    public Pisica(String nume, int varsta, String culoare){
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
        System.out.println("constructor pisica");
    }
    
    public Pisica(){
        System.out.println("constructor pisica");
        
    }
    
    @Override
    public String toString(){
        return nume + " " + varsta + " " + culoare + " " + greutate;
    }
}

/* Serializare <- transformarea unei instante intr-un sir de Bytes
    Se realizeaza prin mecanismul masinii virtuale numit motor al masinii virtuale.

    Interfata Serializable <- interfata Marker. Doar marcheaza. 
    Nu are nicio metoda abstracta

    Pentru a putea serializa o clasa, trebuie ca toate atributele sa fie serializabile.
*/