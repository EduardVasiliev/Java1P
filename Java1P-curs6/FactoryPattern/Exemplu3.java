package FactoryPattern;
public class Exemplu3 {
    public static void main(String[] args){
        BMW b1 = BMWFactory.buildCar(BMWFactory.Model.X7);
        
        System.out.println(b1.getNumarCai());
    }
}