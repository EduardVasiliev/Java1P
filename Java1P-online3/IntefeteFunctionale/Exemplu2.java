package IntefeteFunctionale;

public class Exemplu2 {
    public static void main(String[] args){
        
        Predicat p1 = x -> true;
        
        Predicat p2 = x -> x%2 == 0;
        System.out.println(p2.test(2));
        
        Predicat p3 = x -> {
            System.out.println(":)");
            return x%2 == 0;
        };
        System.out.println(p3.test(2));
        
        Predicat p4 = x -> myTest(x);
        System.out.println(p4.test(2));
        
        Predicat p5 = Exemplu2::myTest;
        System.out.println(p5.test(2));
    }
    
    private static boolean myTest(int x){
        System.out.println("Metoda privata statica");
        return x%2 == 0;
    }
}