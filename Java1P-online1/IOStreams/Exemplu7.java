package IOStreams;
import java.io.*;

public class Exemplu7 {
    public static void main(String[] args){
        
        try(
            FileInputStream fis = new FileInputStream("pisica.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ){
            
            Pisica p = (Pisica) ois.readObject();
            System.out.println(p);
            
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

// Citirea unei instante de obiect dintr-un fisier