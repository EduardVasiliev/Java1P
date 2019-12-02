package BuilderPattern;

public class Exemplu1 {
    public static void main(String[] args){
        Pisica p = new Pisica.Builder()
                .setNume("Mitzi")
                .setVarsta(3)
                .setGreutate(4)
                .build();
        
        System.out.println(p.nume + " " + p.varsta);
    }
}