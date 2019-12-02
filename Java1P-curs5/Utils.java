import java.util.*;
public final class Utils {
    
    private Utils(){
    }
    
    // Metoda de sleep
    public static void sleep (int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    // Metoda combinare 2 liste
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2){
        List<Integer> rez = new ArrayList<>();
        int i, j;
        
        for(i=0, j=0; i<list1.size() && j<list2.size();){
            if(list1.get(i) < list2.get(j)){
                rez.add(list1.get(i));
                i++;
            }else{
                rez.add(list2.get(j));
                j++;
            }   
        }
        
        while(i<list1.size()){
            rez.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            rez.add(list2.get(j));
            j++;
        }
        
        return rez;
    }
}