package File;
import java.io.*;
public class Exemplu1 {
    public static void main(String[] args){
        File f1 = new File("./A");
        
        boolean rez = f1.mkdir();   // in folderul curent se face directorul(folderul) A.
        System.out.println(rez);
        
        System.out.println("Fisierul exista: " + f1.exists());
    }
}

// clasa concreta, imutabila, care nu implica neaparat o cale existenta;