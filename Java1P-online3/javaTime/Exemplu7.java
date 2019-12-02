package javaTime;
import java.time.*;
public class Exemplu7 {
    public static void main(String[] args){
        
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.of(10, 55);
        LocalTime t3 = LocalTime.of(10, 55, 01);
        LocalTime t4 = LocalTime.of(10, 55, 01, 100);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        
        LocalTime rez1 = t1.minusMinutes(10);
        LocalTime rez2 = t1.plusMinutes(10);
        
        System.out.println(rez1);
        System.out.println(rez2);
        
        if(t1.isAfter(t2)){
            System.out.println("good evening");
        }else{
            System.out.println("good day");
        }
    }
}