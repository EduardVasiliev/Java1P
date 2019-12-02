package StreamsAPI;
import java.util.*;
public class Exemplu19 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2,4,6,1,3,5,7,10);
        
        int suma = list.stream()
                        .filter(i -> i%2 == 1)
                        .reduce(0, (a,b) -> a + b);
        
        System.out.println(suma);
    }  
}

// Lista numere -> Suma nr. impare 