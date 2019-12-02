package nio.Files;
import java.nio.file.*;
import java.io.*;
public class Exemplu14 {
    public static void main(String[] main){
        
        Path p1 = Paths.get("src/nio/Files/Exemplu14.java");
        Path p2 = Paths.get("Exemplu14_nou.txt");
        
        try{
            Files.copy(p1, p2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Copiere, Mutare text interior