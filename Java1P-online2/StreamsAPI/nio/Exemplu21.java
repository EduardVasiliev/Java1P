package StreamsAPI.nio;
import java.nio.file.*;
import java.io.*;
public class Exemplu21 {
    public static void main(String[] args){
        
        Path p = Paths.get("src/StreamsAPI/nio/Exemplu20.java");
        
        try{
            Files.lines(p)
                    .filter(s -> !s.trim().isEmpty())
                    .filter(s -> s.length()%2 == 0)
                    .forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Afisare linii pare din fisier.