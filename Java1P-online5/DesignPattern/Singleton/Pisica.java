package DesignPattern.Singleton;
public class Pisica{
    private static Pisica SINGLETON = null;
    String nume;
    String culoare;
    
    private Pisica(){
        
    }
    
    public static Pisica getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Pisica();
        }
        
        return SINGLETON;
    }
}