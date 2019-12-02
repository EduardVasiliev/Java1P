package IOStreams;
import java.io.*;
public class Exemplu3Exit {
    public static void main(String[] args){
        
        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter pw = new PrintWriter("date.txt")){
            
            String line;
            while(!(line = br.readLine()).equals("exit")){  //la scrierea cuv 'exit', se scrie in fisier
                pw.println(line);
                
                //nu necesita FLUSH, care este mai incet
                //pw.flush();
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

//citire de la input,