package ListaDeProduse;
import java.util.*;
import java.util.stream.*;
public class Exemplu11 {
    public static void main(String[] args){
        List<Produs> produse = Arrays.asList(
            new Produs("telefon", 1500, 40),
            new Produs("frigider", 2500, 20),
            new Produs("laptop", 1500, 50),
            new Produs("masina de spalat", 2500, 10),
            new Produs("microunde", 400, 10),
            new Produs("frigider", 2000, 20)
        );
        
        Map<Boolean, List<Produs>> map =
        produse.stream()
                .collect(Collectors.partitioningBy(
                       p -> p.getPret() > 1000          // testez conditia: true/false
                ));
        
        System.out.println(map);
    }
}
// Grupez dupa o conditie