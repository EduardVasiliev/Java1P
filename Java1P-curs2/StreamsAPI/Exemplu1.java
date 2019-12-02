package StreamsAPI;
import java.util.*;
public class Exemplu1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(4,2,6,1,1,4);
        
        list.stream()
            .filter(x -> x%2 == 0)
            .distinct()
            .forEach(x -> System.out.println(x));
    }
}
// asemantor unui pipe-line (linie de productie).
// trebuie sa aiba o sursa si o destinatie.
// De recapitulat: Predicat, Consumator, Comparator !!! (Interfete functionale)