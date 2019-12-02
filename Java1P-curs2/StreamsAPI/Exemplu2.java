package StreamsAPI;
import java.nio.file.*;
import java.io.*;
public class Exemplu2 {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("./src/StreamsAPI/Exemplu2.java");
        
        Files.lines(p)
             .forEach(s -> System.out.println(s));
    }
}

//Fisierul sursa printat in consola
//fara sa incarcam memoria cu toate liniile.
//Stream de stringuri.