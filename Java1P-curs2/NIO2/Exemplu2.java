package NIO2;
import java.nio.file.*;
public class Exemplu2 {
    public static void main(String[] args){
        Path p1 = Paths.get("A\\B\\C\\D");
        Path p2 = Paths.get("A\\X\\Y");
        
        Path p3 = p1.relativize(p2);  //ne da calea care concatenata lui p1 va realiza calea p2. ( .. <- intoarcere)
        
        System.out.println(p3);
        
        Path p4 = Paths.get(p1.toString(), p3.toString());
        p4 = p4.normalize();
        
        System.out.println(p4);
    }
}

//path este imutabila
//nu putem relativiza doua cai cu root diferit. 