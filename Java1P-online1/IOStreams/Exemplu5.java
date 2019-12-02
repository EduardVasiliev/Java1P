package IOStreams;
import java.io.*;

public class Exemplu5 {
    public static void main(String[] args){
        
        try(
            FileInputStream fis = new FileInputStream("numereAleatoare.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            PrintStream out = new PrintStream("numereDublate.txt");
            ){
            
            String line;
            
            while((line = br.readLine()) != null){
                int x = Integer.parseInt(line);
                
                out.println(2*x);
            }        
        }catch(IOException e){
            e.printStackTrace();
        } 
    }
}

// Citim fisierul numereAleatoare.txt si afisam continutul in alt fisier, cu valoarea dubla a numerelor