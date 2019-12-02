import java.util.concurrent.*;
public class Exemplu4 {
    public static void main(String[] args){
        ExecutorService service = Executors.newCachedThreadPool();
        Runnable task = new Runnable4();
        
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        
        service.shutdown();
    }
}