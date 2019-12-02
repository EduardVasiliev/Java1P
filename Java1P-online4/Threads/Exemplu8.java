package Threads;
public class Exemplu8 {
    public static void main(String[] args){
        OddNumbersThread thr = new OddNumbersThread();
        
        thr.start();
        
        System.out.println("The End");
    }
}