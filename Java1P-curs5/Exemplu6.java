import java.util.*;
public class Exemplu6 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(3, 6, 10, 10, 2, 2, 4, 8);
        
        long startTime = System.currentTimeMillis();
        
        list.parallelStream()
            .filter(Exemplu6::filtru)
            //.forEachOrdered(System.out::println);
            .forEach(System.out::println);
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Execution time: " + (endTime-startTime));
    }
    
    private static boolean filtru(Integer i){
        Utils.sleep(100);
        return i % 2 == 0;
    }
}