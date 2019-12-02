package IOStreams;
import java.io.*;

public class Exemplu2 {
    public static void main(String[] args){
        
        try(
            FileInputStream fisier = new FileInputStream("src/IOStreams/Exemplu2.java");
            InputStreamReader isr = new InputStreamReader(fisier);
            BufferedReader br = new BufferedReader(isr);                       
            ){
            
            String line;
            
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Cirire din fisier
