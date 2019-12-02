package IOStreams;
import java.io.*;

public class Exemplu3 {
    public static void main(String[] args){
        
        try(
            PrintStream out = new PrintStream("hello.txt");    
            ){
            
            out.println("HELLO WORLD!");
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Scriere intr-un fisier