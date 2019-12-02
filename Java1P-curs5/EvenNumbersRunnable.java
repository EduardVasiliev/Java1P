import java.util.stream.*;

public class EvenNumbersRunnable implements Runnable {
    
    @Override
    public void run() {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 2);
        
        stream.limit(50)
              .forEach(System.out::println);
    }
}