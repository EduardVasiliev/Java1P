package CyclicBarrier;
import java.util.concurrent.*;
public class MyRunnable3 implements Runnable{
    private CyclicBarrier barrier = new CyclicBarrier(2);
    
    @Override
    public void run(){
        try{
            for(int i=0; i<50; i++){
                barrier.wait();
                System.out.println(i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}