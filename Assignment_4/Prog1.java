// 1. Check without having any abstract method/s whether a class can be abstract; if so, then use that concrete method/s from another
// class having main method. 
abstract class A{
    void m1(){
        System.out.println("Doing something not abstract method but i am still inn abstract class");
    }
}
// we cannot create an object of abstract class directly contraty to popular understanding abstract class is not one which contains abstract mehtods but any class for which object cnnot be instantiated is an bastract class//
// Even if a class is abstract we can define non-abstract class//
//But if any method is abstract the top level class has to be abstract//
class B extends A{
    //This step is important to enable users to use the method m1 of abstract class A//
}
class Prog1{
    public static void main(String[]args){
        B b = new B();// we cannot create an object directly for the abstract class A//
        b.m1();
    }
}