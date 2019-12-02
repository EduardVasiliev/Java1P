package nio.Paths;
import java.nio.file.*;
public class Exemplu9 {
    public static void main(String[] args){
        
        Path p1 = Paths.get("A/B/C/D");
        Path p2 = Paths.get("A/B/X/Y");
        
        Path rez = p1.relativize(p2);
        System.out.println(rez);
    }
}

// Cale relativa la alta calte