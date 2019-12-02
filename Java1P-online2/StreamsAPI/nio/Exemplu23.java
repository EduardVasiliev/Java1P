package StreamsAPI.nio;
import java.nio.file.*;
import java.io.*;
public class Exemplu23 {
    public static void main(String[] args){
        
        Path p = Paths.get("src/StreamsAPI/nio/");
        
        try{
            Files.list(p)
                    .filter(x -> x.toString().endsWith(".java"))
                    .filter(x -> x.getFileName().toString().length() % 2 == 0)
                    .forEach(System.out::println);
            
          
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Afisarea fisierelor .java care au numele par.