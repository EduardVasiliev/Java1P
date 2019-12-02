package Pisica;
import java.io.*;
public class Ex {
    public static void main(String[] args){
        Pisica p = new Pisica("Mitzi", 6, "alb");
        
        try(FileOutputStream fos = new FileOutputStream("pisica.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos)){
            
            oos.writeObject(p);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
