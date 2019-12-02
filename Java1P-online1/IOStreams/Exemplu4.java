package IOStreams;
import java.io.*;
import java.util.*;

public class Exemplu4 {
    public static void main(String[] args){
        Random rand = new Random();
        
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            PrintStream out = new PrintStream("numereAleatoare.txt");
            ){
            
            int x = Integer.parseInt(br.readLine());
            
            for(int i=0; i<x; i++){
                out.println(rand.nextInt(1000));
            }
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}

// Citim de la consola un nr. N. In cadrul unui fisier scriem N numere aleatoare in intervalul [0 999];