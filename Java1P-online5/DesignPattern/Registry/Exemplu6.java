package DesignPattern.Registry;
public class Exemplu6 {
    public static void main(String[] args){
        Produs p1 = Produs.getInstance(Produs.ProdusType.IUTE);
        Produs p2 = Produs.getInstance(Produs.ProdusType.IUTE);
        Produs p3 = Produs.getInstance(Produs.ProdusType.ACRISOR);
        
        p2.nume = "Alume";
       
        System.out.println(p1.nume + " " + p2.nume);
    }
}