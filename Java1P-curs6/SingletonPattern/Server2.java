public class Server2{
    private int maxConnections;
    
    private Server2(){
        
    }
    
    private static class SingletonHolder{
        private static Server2 SINGLETON = new Server2();
    }
    
    public static Server2 getInstance(){
        return SingletonHolder.SINGLETON;
    }
    
}