package Pattern.Observer;
public class ListenerImpl implements ListenerInterface{
    
    @Override
    public void subiectModificat(){
        System.out.println("Subiect Modificat !");
    }
}