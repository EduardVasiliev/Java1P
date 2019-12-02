package DesignPattern.Singleton;
public class Pisica3 {
    String nume;
    String culoare;
    
    private Pisica3(){
        
    }
    
    private static final class SingletonHolder{
        private static Pisica3 SINGLETON = new Pisica3();
    }
    
    public static Pisica3 getInstance(){
        return SingletonHolder.SINGLETON;
    }
}