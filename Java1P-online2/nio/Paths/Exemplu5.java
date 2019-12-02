package nio.Paths;
import java.nio.file.*;
public class Exemplu5 {
    public static void main(String[] args){
        
        String icon = "10c";
        String uri = "http://openweathermap.org/img/w/" + icon + ".png";
        
        System.out.println(uri);
        
    }
}

// interfata Path