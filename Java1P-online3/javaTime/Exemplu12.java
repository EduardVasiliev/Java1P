package javaTime;
import java.time.*;
public class Exemplu12 {
    public static void main(String[] args){
        
        Duration d = Duration.ofMinutes(10);
        
        Period p = Period.ofDays(10);
        
        System.out.println(d);
        System.out.println(p);
    }
}