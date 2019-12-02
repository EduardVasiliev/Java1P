import java.util.*;
import java.util.stream.*;
public class Exemplu6 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("aaa", "bb", "cccc", "d", "ee");
        
        Set<Integer> rez =
            list.stream()
                .map(s -> s.length())
                .collect(Collectors.toSet());
        
        System.out.println(rez);
    }
}

// set ordonat