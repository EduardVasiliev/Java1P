package nio.Files;
import java.nio.file.*;
import java.io.*;
import java.util.*;
public class Exemplu16 {
    public static void main(String[] args){
        
        Path p1 = Paths.get("src/nio/Files/Exemplu16.java");
        
        try{
            List<String> list = Files.readAllLines(p1);
            list.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}

// Citire din fisier cu NIO v2