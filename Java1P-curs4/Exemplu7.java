import java.util.*;
import java.util.stream.*;
public class Exemplu7 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("aaa", "bb", "cccc", "d", "ee");
        
        Set<Integer> rez =
            list.stream()
                .map(s -> s.length())
                .collect(Collectors.toCollection(LinkedHashSet::new));  //se afiseaza intr-un LinkedHashSet care pastreaza ordinea elem. 
        
        System.out.println(rez);
    }
}