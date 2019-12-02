package StreamsAPI;
import java.util.*;
public class Exemplu18 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Hello", "John", "Ed");
        
        list.stream()
                .filter(s -> s.length()%2 == 0)
                .map(s -> s.length() * 2)
                .forEach(System.out::println);
        
    }
}

// Lista siruri de caractere -> Dublul valorilor lungimilor sirurilor cu nr par de caractere. 