package javaTime;
import java.time.*;
public class Exemplu9 {
    public static void main(String[] args){
        
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2020, 03, 20, 10, 55);
        
        LocalTime t1 = LocalTime.of(10, 55);
        LocalDate d1 = LocalDate.of(2019, Month.MARCH, 8);
        LocalDateTime dt3 = LocalDateTime.of(d1, t1);
        
        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
    }
}