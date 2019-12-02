package Threads;
import java.util.stream.*;
public class OddNumbersThread extends Thread{
    
    @Override
    public void run(){
        Stream.iterate(1, i -> i+2)
              .limit(50)
              .forEach(System.out::println);
    }
}