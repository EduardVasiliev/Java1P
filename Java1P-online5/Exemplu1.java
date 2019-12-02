import java.util.*;
public class Exemplu1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2,3,4,5,6,2,3,1,2);
        
        List<Integer> syncedList = Collections.synchronizedList(list);
        
        System.out.println(syncedList);
    }
}