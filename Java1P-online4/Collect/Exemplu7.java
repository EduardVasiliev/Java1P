package Collect;

import java.util.*;
public class Exemplu7 {
    public static void main(String[] args){
        
        Optional<String> o1 = Optional.empty();
        
        Optional<String> o2 = Optional.of("Hello");         //nu are voie sa primeasca valoare 'null'
        
        String hello = null;
        Optional<String> o3 = Optional.ofNullable(hello);   //pentru a da valoarea null -> Optional gol
        
        System.out.println(o1.isPresent());
        System.out.println(o2.isPresent());
        
        o1.ifPresent(System.out::println);
        o2.ifPresent(System.out::println);
        
        o2.filter(s -> s.length()%2==0)
          .ifPresent(System.out::println);
        
        o2.map(s -> s.length())
          .ifPresent(System.out::println);
        
        String v = o2.orElse("World");
        System.out.println(v);
    }
}
