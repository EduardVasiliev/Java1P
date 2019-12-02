import java.nio.file.*;
import java.io.*;

public class Checker implements Runnable {
    
    @Override
    public void run(){
        Path p = Paths.get("nu_sterge.txt");
            
        if(Files.notExists(p)){  
            try{
                Files.createFile(p);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}