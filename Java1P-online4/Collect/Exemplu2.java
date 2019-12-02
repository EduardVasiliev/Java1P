package Collect;

import java.util.*;
import java.util.stream.*;
public class Exemplu2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,7,2,3,4,14,15,28);
        
        List<Double> rez = list.stream()
                                .map(x -> Math.pow(x, 2))
                                .collect(Collectors.toList());
        
        System.out.println(rez);
    }
}

// list de numere -> patratele intr-o lista