package StreamsAPI.nio;
import java.nio.file.*;
import java.io.*;
public class Exemplu20 {
    public static void main(String[] args){
        
        Path p = Paths.get("src/StreamsAPI/nio/Exemplu20.java");
        
        try{
            Files.lines(p).forEach(System.out::println);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Afisare din fisier cu Streams.