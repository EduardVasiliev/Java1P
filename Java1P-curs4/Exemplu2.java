import java.util.*;
public class Exemplu2 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("aaa", "abc", "xy", "g");
        
        //Creem un stream din lista
        Optional<Integer> sum =
        list.stream()
            .map(s -> s.split("\\s*"))      //String -> String[]
            .map(sa -> Arrays.asList(sa))   //String[] -> List<String>
            .flatMap(ls -> ls.stream())     //List<String> -> Stream<String>
            .map(l -> l.charAt(0))          //String -> char
            .map(c -> (int) c)              //char -> int ; se afiseaza codul unicode al caracterului
            .reduce((a,b) -> a + b);     //suma codurilor unicode pentru fiecare caracter in parte
        
        System.out.println(sum);
        System.out.println(sum.isPresent());
    }
}