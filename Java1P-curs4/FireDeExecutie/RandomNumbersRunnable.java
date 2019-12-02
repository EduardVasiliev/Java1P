package FireDeExecutie;
import java.util.*;
import java.util.stream.*;
public class RandomNumbersRunnable implements Runnable {
    Random rand = new Random();
    
    @Override
    public void run(){
        Stream<Integer> stream = Stream.generate( () -> rand.nextInt(100));
        stream.limit(50).forEach(System.out::println);
    }
}