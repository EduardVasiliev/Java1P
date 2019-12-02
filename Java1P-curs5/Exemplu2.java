import java.util.concurrent.*;

public class Exemplu2 {
    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Callable<String> task = new DownloadTask();
        
        
        System.out.println("Pun in executie task ul...");
        Future<String> rez = service.submit(task);
        
        System.out.println("Fac ceva...");   
        System.out.println("Astept terminarea task-ului");
        
        try {
            String mesaj = rez.get(); 
            System.out.println("Task ul s-a terminat");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
        service.shutdown();
        System.out.println("end main");
    }
}
        