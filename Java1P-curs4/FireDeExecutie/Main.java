package FireDeExecutie;
public class Main {
    public static void main(String[] args){
        Thread t = new Thread(new RandomNumbersRunnable());
        
        
        t.start();
        
        try{
            t.join();   //main asteapta pana la finalul executiei lui t
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println("end main");
    }
}