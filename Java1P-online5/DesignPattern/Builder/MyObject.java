package DesignPattern.Builder;
public class MyObject {
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    
    public static class Builder{
        private MyObject o;
        
        public Builder setX1(int x){
            o.x1 = x;
            return this;
        }
        
        public Builder setX2(int x){
            o.x2 = x;
            return this;
        }
        
        public Builder setX3(int x){
            o.x3 = x;
            return this;
        }
        
        public Builder setX4(int x){
            o.x4 = x;
            return this;
        }
        
        public MyObject build(){
            return o;
        }
    }
}