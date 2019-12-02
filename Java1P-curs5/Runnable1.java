public class Runnable1 implements Runnable {
    private int x;
    
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        
        for (int i=0;i<25;i++) {
            Utils.sleep(50);
            System.out.println(x++);
        }
    }
}