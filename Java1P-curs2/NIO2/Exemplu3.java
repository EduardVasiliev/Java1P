package NIO2;
import java.nio.file.*;
public class Exemplu3 {
    public static void main(String[] args){
        Path p1 = Paths.get("A\\B\\C\\D");
        Path p2 = Paths.get("A\\X\\Y");
        
        Path p3 = p1.resolve(p2); //concatenare de la root
        System.out.println(p3);
        
        Path p4 = Paths.get("A\\B\\C\\D");
        Path p5 = Paths.get("C:A\\X\\Y");
        
        Path p6 = p1.resolve(p5); //concatenare de la root
        System.out.println(p6);
        
        
    }
}