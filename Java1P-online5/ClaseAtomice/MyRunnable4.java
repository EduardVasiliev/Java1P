package ClaseAtomice;
import java.util.concurrent.atomic.*;
public class MyRunnable4 implements Runnable{
    private AtomicInteger x = new AtomicInteger();
    private AtomicBoolean b = new AtomicBoolean();
    private AtomicLong l = new AtomicLong();
    private AtomicReference r = new AtomicReference();

    @Override
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println(x.incrementAndGet());
        }
    }
}