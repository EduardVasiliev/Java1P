package Pattern.Observer;
import java.util.*;

public class Subiect {
    List <ListenerInterface> listeners = new ArrayList<>();
    
    public void addListener(ListenerInterface lis){
        listeners.add(lis);
    }
    
    public void removeListener(ListenerInterface lis){
        listeners.remove(lis);
    }
    
    public void metodaCareModificaSubiectul(){
        //modificarea in sine
        
        notifyListeners();
    }
    
    private void notifyListeners(){
        listeners.forEach(ListenerInterface::subiectModificat);
    }
}