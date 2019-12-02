import java.util.concurrent.atomic.*;

public class Runnable4 implements Runnable {
    private AtomicInteger x = new AtomicInteger(0);
    
    
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        
        for (int i=0; i<25; i++) {
            Utils.sleep(50);
            System.out.println(x.getAndIncrement());
        }
    }
}