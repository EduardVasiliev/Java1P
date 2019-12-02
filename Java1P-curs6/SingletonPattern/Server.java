package SingletonPattern;

public class Server {
    private int maxConnections;
    private static Server SINGLETON;
    
    private Server(){
        
    }
    
    public static Server getInstance(){
        if(SINGLETON == null){
            synchronized(Server.class){     //sincronizare dupa obiectul .class;  Fiecare clasa are acest obiect
                if(SINGLETON == null){
                    SINGLETON = new Server();
                }
            }
        }
        return SINGLETON;
    }
}

/*
    Primul check se face asincron. Doar un fir va trece de al doilea if -> creaza instanta. 
    De primul pot trece mai multe. Este un sistem double check. 
*/

