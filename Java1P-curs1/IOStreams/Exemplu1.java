package IOStreams;
import java.io.*;
public class Exemplu1 {
    public static void main(String[] args){
        
        InputStreamReader reader = null;   //le aducem in domeniul de vizibilitate al blocului finally
        BufferedReader br = null;
        
        try{
            reader = new InputStreamReader(System.in);    //flux low level
            br = new BufferedReader(reader);   //bufferizam - il imbracam intr-un flux high level, pe care il putem citi linie cu linie

            String line = br.readLine();    //citim o linie de la tastatura
            System.out.println("Buna," + line);
            
        }catch(IOException e){
            e.printStackTrace();
            
        }finally{
            try{
                if (reader != null){
                    reader.close();    //close propaga la randul lor o exceptie
                }

                if (br != null){
                    br.close();
                }  
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}