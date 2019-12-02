package IntefeteFunctionale;

import java.util.*;
import java.util.stream.*;
public class Exemplu5 {
    public static void main(String[] args){
        Random rand = new Random();
        
        Stream.generate(() -> rand.nextInt(1000)+1)
                .limit(10)
                .forEach(System.out::println);
    }
}

// Program - genereaza 10 valori aleatoare (1:1000) folosind streamuri