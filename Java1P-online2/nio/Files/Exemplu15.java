package nio.Files;
import java.nio.file.*;
import java.io.*;
public class Exemplu15 {
    public static void main(String[] args){
        
        Path p1 = Paths.get("src/nio/Files/Exemplu15.java");
        
        try(
            BufferedReader br = Files.newBufferedReader(p1);
            ){
            
            String line;      
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Citire din fisier cu NIO