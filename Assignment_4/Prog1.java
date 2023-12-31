// 1. Check without having any abstract methods whether a class can be abstract; if so, then use that concrete method/s from another
// class having main method. 
abstract class A{
    void m1(){
        System.out.println("Doing something not abstract method but i am still in abstract class");
    }
}
// we cannot create an object of abstract class directly contraty to popular understanding abstract class is not one which contains abstract mehtods but any class for which object cannot be instantiated is an abstract class//
// Even if a class is abstract we can define non-abstract class//
//But if any method is abstract the top level class has to be abstract//
class B extends A{
    //This step is important to enable users to use the method m1 of abstract class A//
}
class Prog1{
    public static void main(String[]args){
        // A a = new A(); // Cannot instatiate the type A
        B b = new B();// we cannot create an object directly for the abstract class A//
        b.m1();
    }
}