package javaTime;
import java.time.*;
public class Exemplu8 {
    public static void main(String[] args){
        
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2019, 8, 15);
        LocalDate d3 = LocalDate.of(2019, Month.MARCH, 21);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
    }
}