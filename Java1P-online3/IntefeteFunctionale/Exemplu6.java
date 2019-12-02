package IntefeteFunctionale;

import java.util.*;
import java.util.stream.*;
public class Exemplu6 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("AAAAAA", "ZZZ", "LALA", "CCCC");
        
        double medie = list.stream()
                            .mapToInt(s -> s.length())
                            .average()
                            .getAsDouble();
        
        System.out.println(medie);
    }
}

// Am o lista de string-uri -> Media aritmetica a lungimilor sirurilor