package IntefeteFunctionale;

import java.util.function.*;
public class Exemplu3 {
    public static void main(String[] args){
        Consumer<String> c1 = x -> System.out.println(x.toUpperCase());
        c1.accept("Tommy");
        
        BiConsumer<Integer, String> c2 = (a,b) -> System.out.println(a + " " + b);
        c2.accept(10, "Ten");
        
        Predicate<String> p1 = s -> s.length()%2 == 0;
        System.out.println(p1.test("Hearts"));
        
        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("Suma literelor"));
    }
}