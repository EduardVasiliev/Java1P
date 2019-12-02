package IntefeteFunctionale;

import java.util.stream.*;
public class Exemplu4 {
    public static void main(String[] args){
        
        Stream<Integer> s1 = Stream.empty();
        //creeaza un stream gol
        
        Stream<Integer> s2 = Stream.of(2,3,7,8,3,23);
        //creaeza un stream cu numar finit de valori
        
        Stream<Integer> s3 = Stream.iterate(1, i -> i+2);
        //stream cu numar infinit de valori
        
        Stream<Integer> s4 = Stream.generate(() -> 1);
        //stream cu numar infinit de valori (Supplier)
        
        s3.limit(10)
            .forEach(System.out::println);
        
        s4.limit(10)
            .forEach(System.out::println);
        
    }
}