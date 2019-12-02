package NIO2_Files;
import java.io.*;
import java.nio.file.*;
public class Exemplu2 {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("./src/NIO2_Files/Exemplu2.java");
        Path p2 = Paths.get("./src/NIO2_Files/Exemplu2_Copy.java");
        
        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
    }
}