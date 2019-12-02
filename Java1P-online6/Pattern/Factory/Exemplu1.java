package Pattern.Factory;
public class Exemplu1 {
    public static void main(String[] args){
        
        MyFactory f1 = MyFactory.createObject(MyFactory.Types.X);
        
        f1.m1();
        
        MyFactory f2 = MyFactory.createObject(MyFactory.Types.Y);
        
        f2.m1();
    }
}

// Prin abstractivarea lui f1, am dus la concretizarea metodei m1();