package File;
import java.io.*;
public class ExempluFinal {
    public static void main(String[] args){
        
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            ){
            
            while(true){
                System.out.println("COMANDA: ");
                
                String line = br.readLine();
                String[] a = line.split("\\s+");    //comanda   
                
                switch(a[0]){
                    case "exit":
                        System.out.println("Aplicatia a fost inchisa");
                        System.exit(0);
                        break;
                    case "cf":{
                        File file = new File(a[1]);
                        file.createNewFile();
                        System.out.println("A fost creat un fisier");
                        }
                        break;
                    case "cd":{
                        File file = new File(a[1]);
                        file.mkdir();
                        System.out.println("A fost creat un folder");
                        }
                        break;
                    case "list":{
                        File file = new File(a[1]);
                        String fisiere[] = file.list();
                        for(String s:fisiere){
                            System.out.println(s);
                        }
                        }
                        break;
                    case "delete":{
                        File file = new File(a[1]);
                        file.delete();
                        System.out.println("Fisierul a fost sters");
                        }
                        break;
                    default:
                        System.out.println("Comanda inexistenta");    
                }           
            }         
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}