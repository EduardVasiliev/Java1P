package nio.Files;
import java.nio.file.*;
import java.io.*;
public class Exemplu12 {
    public static void main(String[] args){
        
        Path p1 = Paths.get("Fisier1");
        Path p2 = Paths.get("Folder1");
        
        try{
            Files.createFile(p1);
            Files.createDirectory(p2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Creare fisier
// Creare folder
