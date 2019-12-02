import java.util.concurrent.locks.*;
public class Runnable3 implements Runnable {
    private int x;
    private ReentrantReadWriteLock locker = new ReentrantReadWriteLock();

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        
        for(int i=0; i<25; i++){
            locker.readLock().lock();
            System.out.println(threadName + " a inceput citirea");
            System.out.println(x);
            System.out.println(threadName + " a terminat citirea");
            locker.readLock().unlock();
            increment();
        }        
    }
    
    private void increment(){
        String threadName = Thread.currentThread().getName();
        
        locker.writeLock().lock();
        System.out.println(threadName + " a inceput scrierea");
        x++; 
        System.out.println(threadName + " a terminat scrierea");
        locker.writeLock().unlock();
    }
}