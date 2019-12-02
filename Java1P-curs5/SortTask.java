import java.util.*;
import java.util.concurrent.*;
public class SortTask extends RecursiveTask<List<Integer>> {
    private List<Integer> list;
    
    public SortTask(List<Integer> list){
        this.list = list;
    }
    
    @Override
    protected List<Integer> compute(){
        
        if(list.size() <= 2){
            Collections.sort(list);
            return list;
        }
        
        int mid = list.size()/2;
        SortTask task1 = new SortTask(list.subList(0, mid));
        SortTask task2 = new SortTask(list.subList(mid, list.size()));
        
        task2.fork();
        List<Integer> rez1 = task1.compute();
        List<Integer> rez2 = task2.join();
        
        return Utils.merge(rez1, rez2);
    }
}