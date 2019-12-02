package DesignPattern.Builder;
public class Exemplu5 {
    public static void main(String[] args){
        MyObject o = new MyObject.Builder()
                                    .setX1(1)
                                    .setX2(2)
                                    .setX3(3)
                                    .setX4(4)
                                    .build();
    }
}