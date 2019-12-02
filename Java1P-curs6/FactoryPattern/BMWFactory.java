package FactoryPattern;
public final class BMWFactory {
    
    private BMWFactory(){
        
    }
    
    public static enum Model{
        GT, X7
    }
    
    public static BMW buildCar(Model model){
        switch (model){
            case GT: return new BMW_GT();
            case X7: return new BMW_X7();
            default: throw new IllegalArgumentException("Model inexistent");
        }
    }
    
    private static class BMW_GT implements BMW{
        
        @Override
        public int getNumarCai(){
            return 350;
        }
    }
    
    public static class BMW_X7 implements BMW{
        
        @Override
        public int getNumarCai(){
            return 450;
        }
    }
    
}