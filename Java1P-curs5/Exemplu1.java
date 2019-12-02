import java.util.concurrent.*;

public class Exemplu1 {
    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        Runnable task = new EvenNumbersRunnable();
        
        
        service.execute(task);
        
        service.shutdown();
        
        //service.shutdownNow();
    }
}