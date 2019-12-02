import java.util.*;
import java.util.stream.*;
public class Exemplu5 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("aaa", "bb", "cccc", "d");
        
        List<Integer> rez = 
            list.stream()
                .map(String::length)    //s -> s.length()
                .collect(Collectors.toList());
        
        System.out.println(rez);
    }

}