package ListaDeProduse;
import java.util.*;
import java.util.stream.*;
public class Exemplu10 {
    public static void main(String[] args){
        List<Produs> produse = Arrays.asList(
            new Produs("telefon", 1500, 40),
            new Produs("frigider", 2500, 20),
            new Produs("laptop", 1500, 50),
            new Produs("masina de spalat", 2500, 10),
            new Produs("microunde", 400, 10),
            new Produs("frigider", 2000, 20)
        );
        
        Map<Double, Long> map = 
            produse.stream()
                    .collect(Collectors.groupingBy(
                        p -> p.getPret(),
                        Collectors.counting()   //Numaram produsele asociate cheii
                            
                    ));
        System.out.println(map);
    }
}