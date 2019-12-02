package StreamsAPI;
import java.io.*;
import java.nio.file.*;
public class Exemplu5 {
    public static void main(String[] args) throws IOException{
        Path p = Paths.get(".");
        
        Files.find(p, Integer.MAX_VALUE, (x,fa) -> x.getFileName().toString().endsWith(".txt"))
              .forEach(x -> System.out.println(x));
    }
}

// cauta fisierele terminate .txt si le afiseaza