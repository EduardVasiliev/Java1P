package ReentrateReadWriteLock;
import java.util.concurrent.locks.*;
import java.util.*;
public class MyRunnable2 implements Runnable{
    private Random rand = new Random();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private int x;
    private int sum;
    
    @Override
    public void run(){
        for(int i=0; i<50; i++){
            changeX();
            readX();
        }
    }
    
    public void changeX(){
        lock.writeLock().lock();
        x = rand.nextInt(10);
        lock.writeLock().unlock();
    }
    
    public void readX(){
        lock.readLock().lock();
        sum += x;
        lock.readLock().unlock();
    }
}