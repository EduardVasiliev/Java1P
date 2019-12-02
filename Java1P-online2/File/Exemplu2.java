package File;
import java.io.*;
public class Exemplu2 {
    public static void main(String[] args){
        
        File file = new File("A/note.txt");
        
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Creare fisier