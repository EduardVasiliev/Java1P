package Threads;
public class Exemplu9 {
    public static void main(String[] args){
        EvenNumbersRunnable e1 = new EvenNumbersRunnable();
        
        Thread thr = new Thread(e1);
        
        thr.start();
 
    }
}