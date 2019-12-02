package StreamsAPI;
import java.io.*;
import java.nio.file.*;
public class Exemplu4 {
    public static void main(String[] args) throws IOException{
        Path p = Paths.get("./A");
        
        Files.walk(p)
             .forEach(x -> System.out.println(x));
    }
}
    
// arbore 