import java.util.concurrent.*;
import java.net.*;
import java.nio.file.*;
import java.io.*;

public class DownloadTask implements Callable<String> {
    
    
    public String call() throws Exception {
        URL source = new URL("https://vignette.wikia.nocookie.net/logopedia/images/2/26/Java.png/revision/latest?cb=20120902073224");
        Path dest = Paths.get("image.png");
        
        
        Files.copy(source.openStream(), dest, StandardCopyOption.REPLACE_EXISTING);
        
        
        return "Done";
    }
}