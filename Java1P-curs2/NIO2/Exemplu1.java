package NIO2;
import java.nio.file.*;
public class Exemplu1 {
    public static void main(String[] args){
        Path p1 = Paths.get("./A");
        
        System.out.println(p1.getClass());
        System.out.println("Numele fisierului: " + p1.getFileName());
        System.out.println("Calea absoluta: " + p1.toAbsolutePath());
        
        Path p2 = Paths.get("C:/",".","A/B","C/D/E");
        System.out.println(p2);
        
        for(int i=0; i<p2.getNameCount(); i++){
            System.out.println(i + " : " + p2.getName(i));
        }
        
        //radacina
        System.out.println(p2.getRoot());
    }
}

//Paths - clasa utilitara care fornizeaza instante de Path corespunzatoare sistemului de operare cu care lucram.