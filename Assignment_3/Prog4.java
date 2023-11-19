// . Create a class with a method void show () and make 3 subclasses of it and all subclasses have void show () method overridden 
// and call those methods using their class references.
class A{
    void show(){
            System.out.println("Original method");
    }
}
class B extends A{
    void show(){
        System.out.println("B Subclass method");
     }
 }

class C extends A{
    void show(){
        System.out.println("C Subclass method");
     }
 }

class D extends A{
    void show(){
        System.out.println("D Subclass method");
     }
 }
class Prog4{
    public static void main(String[]args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        a.show();
        b.show();
        c.show();
        d.show();
    }
}