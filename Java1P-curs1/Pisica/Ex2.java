package Pisica;
import java.io.*;
public class Ex2 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("pisica.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis)){
            
            Pisica p = (Pisica) ois.readObject();
            
            System.out.println(p);
            
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}