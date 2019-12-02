import java.util.concurrent.*;
public class Runnable5 implements Runnable {
    private CyclicBarrier cb = new CyclicBarrier(3);
    
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        
        System.out.println(threadName + " asteapta la bariera");
        
        try{
            
            cb.await();
            System.out.println(threadName + " a trecut de bariera");
            
        }catch(InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}

//asteapta 3 fire de executie 