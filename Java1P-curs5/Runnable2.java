import java.util.concurrent.*;
public class Runnable2 implements Runnable {
    private int x;
    private Semaphore s = new Semaphore(1);
    
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        
        for (int i=0;i<25;i++) {
            Utils.sleep(50);
            
            try{
                s.acquire();
                System.out.println(x++);
                
            }catch(InterruptedException e){
                e.printStackTrace();
                
            }finally{
                s.release();
            }
        }
        
        
    }
}