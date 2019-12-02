package DesignPattern.Registry;
import java.util.*;
public class Produs{
    String nume;
    
    public static enum ProdusType{
        DULCE, IUTE, ACRISOR;
    }
    
    private static Map<ProdusType, Produs> registry = new HashMap<>();
    
    public static Produs getInstance(ProdusType type){
        if(!registry.containsKey(type)){
            registry.put(type, new Produs());
        }
        
        return registry.get(type);
    }
}