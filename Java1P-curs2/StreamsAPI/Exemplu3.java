package StreamsAPI;
import java.io.*;
import java.nio.file.*;
public class Exemplu3 {
    public static void main(String[] args) throws IOException{
        Path p = Paths.get("./src/StreamsAPI");
        
        Files.list(p)
            .filter(x -> x.getFileName().toString().endsWith(".java"))
            .forEach(x -> System.out.println(x));
    }
}

//afisam fisirerele .java din fisier