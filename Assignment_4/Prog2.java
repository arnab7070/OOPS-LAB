//  Create an abstract class with three abstract methods check whether you can we override only few methods (not all methods) in sub -
// class or not
abstract class A{
    public abstract void m1();
    public abstract void m2();
    public abstract void m3();
}
class B extends A{
    public  void m1(){System.out.println("m1 method implemented");}
    public  void m2(){System.out.println("m2 method implemented");}
    public  void m3(){System.out.println("m3 method implemented");}
}
//OR//
abstract class C extends A{
    public  void m1(){System.out.println("m1 method implemented");}
    public  void m2(){System.out.println("m2 method implemented");}
}
class D extends C{
    public  void m3(){System.out.println("m3 method implemented");}
}
class Prog2{
    public static void main(String[]args){
        B b = new B();
        b.m1();
        b.m2();
        b.m3();// we must priovide implemtation for all the bastract class methods//
        //otherwise we have to declare the implenting class as abvastract too but the child clas of that abstract class has to provide implementation fo that 
        System.out.println("The other method");
        D d = new D();
        d.m1();
        d.m2();
        d.m3();
    }
    
}