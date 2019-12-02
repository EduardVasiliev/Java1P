package ObserverPattern;
public class Facebook {
    public static void main(String[] args){
        EduardBday subject = new EduardBday();
        
        Listener Maria = () -> System.out.println("O sa ii pregatesc un tort");
        Listener Costel = () -> System.out.println("O sa-l scot la o bere");
        Listener Florica = () -> System.out.println("O sa-i scriu o urare");
        
        subject.addListener(Maria);
        subject.addListener(Costel);
        subject.addListener(Florica);
        
        subject.esteZiuaLuiEduard();
    }
}