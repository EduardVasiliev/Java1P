package Semaphore;
import java.util.concurrent.*;
public class MyRunnable implements Runnable{
    private int n;
    private Semaphore semaphore = new Semaphore(10);    //nr. maxim de threads ce trece de semaphore
    
    @Override
    public void run(){
        
        try{
            for(int i=0; i<50; i++){
                
                semaphore.acquire();    //aquire
                n++;
                System.out.println(n);
                semaphore.release();    //release
            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}