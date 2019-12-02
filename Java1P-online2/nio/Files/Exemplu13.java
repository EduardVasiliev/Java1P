package nio.Files;
import java.nio.file.*;
import java.io.*;
public class Exemplu13 {
    public static void main(String[] args){
        
        Path p1 = Paths.get("Folder1");
        
        try{
            if(Files.exists(p1)){
                Files.delete(p1);
            }
            
            //Files.deleteIfExists(p1);
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
}

// Delete file if exists