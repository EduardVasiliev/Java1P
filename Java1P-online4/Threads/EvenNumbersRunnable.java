package Threads;
import java.util.stream.*;
public class EvenNumbersRunnable implements Runnable{
    
    @Override
    public void run(){
        Stream.iterate(1, i -> i+1)
              .limit(50)
              .forEach(System.out::println);
    }
}