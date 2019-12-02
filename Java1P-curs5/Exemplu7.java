import java.util.*;
import java.util.concurrent.*;

public class Exemplu7 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2, 6, 1, 7, -1, 1, 10, 9, 11);
        
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask <List<Integer>> task = new SortTask(list);
        
        List<Integer> rez = pool.invoke(task);
        System.out.println(rez);
    }
}   