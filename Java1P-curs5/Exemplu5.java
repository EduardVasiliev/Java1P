import java.util.concurrent.*;
public class Exemplu5 {
    public static void main(String[] args){
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        Runnable task = new Checker();
        
        service.scheduleWithFixedDelay(task, 0, 5, TimeUnit.SECONDS); 
        
    }
}

//creaza un fisier, care daca este sters, se creaza din nou in 5 secunde.