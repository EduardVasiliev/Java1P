package Collect;

import java.util.*;
import java.util.stream.*;
public class Exemplu6 {
    public static void main(String[] args){
        
        List<String> list = Arrays.asList("Shelby", "Thorne", "Arthur", "Ada", "Tommy");
        
        Map<Boolean, List<String>> map1 = list.stream()
                                              .collect(Collectors.groupingBy(s ->s.length()%2==0));
        
        Map<Boolean, List<String>> map2 = list.stream()
                                              .collect(Collectors.partitioningBy(s -> s.length()%2==0));
        
        System.out.println(map1);
        System.out.println(map2);
    }
}

// lista siruri caractere -> grupare lungime para/impara