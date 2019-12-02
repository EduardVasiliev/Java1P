package RegistryPattern;
public class Exemplu2 {
    public static void main(String[] args){
        Mancare paste = Mancare.getInstance(Mancare.Fel.DULCE);
        paste.nume = "paste";
        
        Mancare taco = Mancare.getInstance(Mancare.Fel.IUTE);
        taco.nume = "taco";
        
        System.out.println(Mancare.getInstance(Mancare.Fel.DULCE).nume);
    } 
}