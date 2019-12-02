package nio.Paths;
import java.nio.file.*;
import java.io.*;
public class Exemplu11 {
    public static void main(String[] args){
        
        Path p1 = Paths.get("A/B/C/./../././X/Y/Z/../../Q/W/./E");
        Path p2 = p1.normalize();
        
        System.out.println(p2);
        
        File file = p2.toFile();    // Path -> File    
        Path p3 = file.toPath();    // File -> Path
    }
}