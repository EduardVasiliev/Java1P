package DecoratorPattern;
public class ObjectInputStream {
    private InputStream obiectDecorat;
    
    public ObjectInputStream(InputStream obiectDecorat){
        this.obiectDecorat = obiectDecorat;
    }
    
    public void read(){
        obiectDecorat.readBytes();
        System.out.println("Convertesc informatia din bytes in String");
    }
    
}