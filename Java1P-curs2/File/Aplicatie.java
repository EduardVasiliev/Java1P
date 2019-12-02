package File;
import java.io.*;
public class Aplicatie{
    public static void main(String[] args){
        
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            ){
            
            String line;
            String [] input;
            
            while(true){
                line = br.readLine();
                input = line.split("\\s+");
                
                switch(input[0].toUpperCase()){
                    case "CD":{
                        File f = new File(input[1]);
                        f.mkdir();
                        System.out.println("Folder created at " + input[1]);
                        }
                        break;
                    case "CF":{
                        File f = new File(input[1]);
                        f.createNewFile();
                        System.out.println("File created at " + input[1]);
                        }
                        break;
                    case "INFO":{
                        File f = new File(input[1]);
                        System.out.println("Size: " + f.length());
                        System.out.println("File Type: " + (f.isFile() ? "Regular file " : "Directory File"));
                        System.out.println("Parent: " + f.getParent());
                        }
                        break;
                    case "DELETE":{
                        File f = new File(input[1]);
                        f.delete();
                        System.out.println("File " + input[1] + " has been deleted");
                        }
                        break;
                    case "EXIT":
                        System.out.println("Application is stopping..");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid command");    
                }
            }  
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}