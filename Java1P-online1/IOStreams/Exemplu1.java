package IOStreams;
import java.io.*;

public class Exemplu1 {
    public static void main(String[] args){
        
        try(
            InputStreamReader in = new InputStreamReader(System.in);    //citim de la input prin System.in
            BufferedReader br = new BufferedReader(in);                 //citim sub forma de buffer
            ){
            
            String line = br.readLine();
            
            StringBuilder sb = new StringBuilder(line);
            sb.reverse();
            System.out.println(sb);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Citesc de la tastatura
// Inversez ordinea caracterelor