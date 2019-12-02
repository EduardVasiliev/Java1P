package ObserverPattern;
import java.util.*;
public class EduardBday {
    private List<Listener> listeners = new ArrayList<>();
    
    public void addListener(Listener l){
        listeners.add(l);
    }
    
    public void removeListener(Listener l){
        listeners.remove(l);
    }
    
    public void esteZiuaLuiEduard(){
        listeners.forEach(Listener::notifica);
    }
}