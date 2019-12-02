package NIO2_Files;
import java.nio.file.*;
import java.io.*;
public class Exemplu1 {
    public static void main(String[] args){ // sau throws IOException
        Path p1 = Paths.get("./G");
        
        try{
            
            if(Files.notExists(p1)){
                Files.createDirectory(p1); 
            }
            
            Path p2 = Paths.get("./G/test.txt");
            
            Files.createFile(p2);
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}