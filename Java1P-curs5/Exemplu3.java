import java.util.concurrent.*;

public class Exemplu3 {
    public static void main(String [] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Runnable task = new Runnable5();
        
        
        
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        
        service.shutdown();
        
    }
}