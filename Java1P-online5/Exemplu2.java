import java.util.concurrent.*;
public class Exemplu2 {
    public static void main(String[] args){
        ForkJoinPool fjp = new ForkJoinPool();
        fjp.invoke(new NumbersRecursiveAction(1));
    }
}