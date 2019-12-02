import java.util.*;
public class Exemplu3 {
    public static void main(String[] args){
        Optional<String> o1 = Optional.empty();             //Optional este ca o cutie care poate sa fie goala
        Optional<String> o2 = Optional.of("Hello");         //sa contina un element
        Optional<String> o3 = Optional.ofNullable(null);    //sa contina un 'null' 
        
        //String s1 = o1.get();          //returneaza elementele. daca null -> exceptie
        String s2 = o1.orElse("world");  //daca null -> se inlocuieste cu 'world'
        System.out.println(s2);
        System.out.println(o1);
        
        String s3 = o2.orElseThrow( () -> new NoSuchElementException() );   //daca null -> arunc exceptie
        System.out.println(s3);
        System.out.println(o2);
        
        o2.ifPresent(System.out::println);
        
        
    }
}