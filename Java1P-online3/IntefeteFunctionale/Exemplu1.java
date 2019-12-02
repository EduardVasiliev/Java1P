package IntefeteFunctionale;

public class Exemplu1 {
    public static void main(String[] args){
        
        Consumator c1 = new MyConsumer();
        c1.consuma(10);
        
        Consumator c2 = new Consumator(){
            @Override
            public void consuma(int x){
                System.out.println("X: " + x);
            }
        };
        c2.consuma(20);
        
        //Expreii lambda
        Consumator c3 = x -> System.out.println("X: " + x);
        c3.consuma(30);
        
        Consumator c4 = System.out::println;
        c4.consuma(40);    
    }
    
    public static class MyConsumer implements Consumator{
        @Override
        public void consuma(int x){
            System.out.println("X: " + x);
        }
    }
}