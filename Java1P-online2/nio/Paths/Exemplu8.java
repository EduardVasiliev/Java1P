package nio.Paths;
import java.nio.file.*;
public class Exemplu8 {
    public static void main(String[] args){
        
        Path p1 = Paths.get("A/B");
        Path p2 = Paths.get("C/D");
        
        Path rez = p1.resolve(p2);
        
        System.out.println(rez);
    }
}

// Concatenare - p1.resolve();