package nio.Paths;
import java.nio.file.*;
public class Exemplu7 {
    public static void main(String[] args){
        
        Path p1 = Paths.get("C:/A/B/C/D/E");
        Path sp = p1.subpath(0, 3);
        
        System.out.println(sp);
    }
}