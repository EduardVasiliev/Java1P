package StreamsAPI.nio;
import java.nio.file.*;
import java.io.*;
public class Exemplu22 {
    public static void main(String[] args){
        
        Path p = Paths.get("./");
        
        try{
            Files.list(p).forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Afisarea continutului unui folder