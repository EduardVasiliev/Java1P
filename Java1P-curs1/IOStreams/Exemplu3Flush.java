package IOStreams;
import java.io.*;
public class Exemplu3Flush {
    public static void main(String[] args){
        
        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter pw = new PrintWriter("date.txt")){
            
            String line;
            while((line = br.readLine()) != null){
                pw.println(line);
                
                //pr scrierea instant in destinatie FLUSH
                pw.flush();
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

//citire de la input, scriere in fisier.