package DesignPattern.Decorator;
public class Decorator {
    private DecoratedObject decorat;
    
    public Decorator(DecoratedObject decorat){
        this.decorat = decorat;
    }
    
    public void metodaUNU(){
        decorat.metodaUNU();
    }
    
    public void metodaDOI(){
        decorat.metodaDOI();
    }
}