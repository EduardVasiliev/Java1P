package javaTime;
import java.time.*;
public class Exemplu11 {
    public static void main(String[] args){
        
        ZonedDateTime z1 = ZonedDateTime.now();                                 // zona noastra
        ZonedDateTime z2 = ZonedDateTime.now(ZoneId.of("Europe/London"));       // zona Londrei
        
        System.out.println(z1);
        System.out.println(z2);
    }
}