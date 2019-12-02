package File;
import java.io.*;
public class Exemplu2 {
    public static void main(String[] args){
        File f1 = new File("./A/b");
        
        try{
            f1.createNewFile();     //Am creat un fisier 'b' in directorul A.
        }catch(IOException e){
            e.printStackTrace();
        }
        
        File f2 = new File("./A/X/C");
        
        boolean rez = f2.mkdirs();
        System.out.println(rez);

    }
}