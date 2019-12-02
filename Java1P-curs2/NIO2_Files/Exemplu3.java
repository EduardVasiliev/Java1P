package NIO2_Files;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Files;
public class Exemplu3 {
    public static void main(String[] args){
        Path p1 = Paths.get("./src/NIO2_Files/Exemplu3.java");

        try {

            List<String> lines = Files.readAllLines(p1);
            lines.forEach(line -> System.out.println(line));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}