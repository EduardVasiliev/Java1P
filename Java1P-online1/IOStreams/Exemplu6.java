package IOStreams;
import java.io.*;

public class Exemplu6 {
    public static void main(String[] args){
        
        try(
            PrintStream ps = new PrintStream("pisica.txt");
            ObjectOutputStream oos = new ObjectOutputStream(ps);                
            ){
            
            Pisica p = new Pisica("Tom", 3);
            oos.writeObject(p);
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Scrierea unei instante de obiect intr-un fisier.
// Pisica.java