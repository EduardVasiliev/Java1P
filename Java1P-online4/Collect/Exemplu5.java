package Collect;

import java.util.*;
import java.util.stream.*;
public class Exemplu5 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("aaaa", "bbb", "cccc", "ddd", "Thorne", "x", "y", "z");
        
        Map<Integer, List<String>> map = list.stream()
                                             .collect(Collectors.groupingBy(s -> s.length()));
        
        System.out.println(map);
    }
}

// lista siruri caractere -> grupati sirurile dupa lungimea lor

// Cheie - intreg
// Valoare - Lista de string-uri