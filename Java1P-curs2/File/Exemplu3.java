package File;
import java.io.*;
public class Exemplu3 {
    public static void main(String[] main){
        File f1 = new File("./A/X/C");

        System.out.println(f1.delete());  //Am sters folderul C
        
        File f2 = new File("./A"); 
        
        File[] fisiere = f2.listFiles();   //afisam toate fisierele din A.   
        for(File x : fisiere){      
            System.out.println(x);
            System.out.println(x.getAbsolutePath());  //calea completa
        }
        
    }
}