package Collect;

import java.util.*;
import java.util.stream.*;
public class Exemplu3 {
    public static void main(String[] args){
        
        List<Integer> list = Arrays.asList(1, 7, 2, 34, 19, 1, 56);
        
        Set<Double> rez = list.stream()
                                .map(x -> Math.pow(x, 2))
                                .collect(Collectors.toSet());
        
        System.out.println(rez);
    }
}

// list de numere -> patratele intr-un SET