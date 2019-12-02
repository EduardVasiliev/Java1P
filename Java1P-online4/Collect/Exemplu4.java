package Collect;

import java.util.*;
import java.util.stream.*;
public class Exemplu4 {
    public static void main(String[] args){
        
        List<Integer> list = Arrays.asList(1, 7, 2, 34, 19, 1, 56);
        
        List<Double> rez1 = list.stream()
                                .map(x -> Math.pow(x, 2))
                                .collect(Collectors.toCollection(() -> new ArrayList<>()));
        
        List<Double> rez2 = list.stream()
                                .map(x -> Math.pow(x, 2))
                                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        
        Set<Double> rez3 = list.stream()
                                .map(x -> Math.pow(x, 2))
                                .collect(Collectors.toCollection(() -> new HashSet<>()));
        
        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);
        
    }
}

// list de numere -> patratele intr-o COLECTIE anume