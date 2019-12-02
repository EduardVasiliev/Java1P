package Pattern.Factory;

public abstract class MyFactory {

    public static enum Types{
        X, Y, Z
    }
    
    public static MyFactory createObject(Types t){
        switch(t){
            case X:
                return new MyFactoryObject1();
            
            case Y:
                return new MyFactoryObject2();
                
            case Z:
                return new MyFactoryObject3();
                
            default:
                throw new IllegalArgumentException("Nu exista acest tip pentru acest Factory");
        }
    }
    
    // Implementez metodele abstracte pentru fiecare Type
    private static class MyFactoryObject1 extends MyFactory{
        @Override
        public void m1(){
            System.out.println("Object1 m1()");
        }   
        
        @Override
        public void m2(){
            System.out.println("Object1 m2()");
        }
    }
    
    private static class MyFactoryObject2 extends MyFactory{
        @Override
        public void m1(){
            System.out.println("Object2 m1()");
        }
        
        @Override
        public void m2(){
            System.out.println("Object2 m2()");
        }
    }
    
    private static class MyFactoryObject3 extends MyFactory{
        @Override
        public void m1(){
            System.out.println("Object3 m1()");
        }
        
        @Override
        public void m2(){
            System.out.println("Object3 m2()");
        }
    }
    
    public abstract void m1();
    public abstract void m2();
}