package javaTime;
import java.util.*;
public class Exemplu13 {
    public static void main(String[] args){
        
        Locale l1 = new Locale("en");
        Locale l2 = new Locale("en", "US");
        
        Locale l3 = new Locale.Builder()
                               .setLanguage("en")
                               .setRegion("US")
                               .build();
        
        Locale l4 = Locale.GERMANY;       
    }
}

// Formate de limba si regiune