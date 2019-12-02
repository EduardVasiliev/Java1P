package DesignPattern.Singleton;
public class Pisica2 {
    private static Pisica2 SINGLETON = null;
    String nume;
    String culoare;
    
    private Pisica2(){
        
    }
    
    public static Pisica2 getInstance(){
        if(SINGLETON == null){
            synchronized(Pisica2.class){
                if(SINGLETON == null){
                    SINGLETON = new Pisica2();
                }
            }
        }
        
        return SINGLETON;
    }
}