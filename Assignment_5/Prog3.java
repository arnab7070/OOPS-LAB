// Create two interfaces, each with two methods. Inherit a new interface from the two, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. In main (), create an object of derived class and call the
// methods. [do all without package statement]

// Creating two interfaces//
interface i1{
    void m1();
    void m2();
}
// Creating two interfaces//
interface i2{
    void m3();
    void m4();
}
// Inherit a new interface from the two, adding a new method.//
interface i3 extends i1,i2{
    void m5();//new added method//
}
//A concrete class is a class where every method has well defined clear implemtaion.//

//From development point of view a concrete class refers to the ultimte implentaion class where we are ready to provide service and provide full implementation of each and every method there//
    //Thorough Example//
        //  ServeletClass(Interface)
        //          | 
        //          |
        // GenericServelet(Abstract Class)
        //          |
        //          |
        // HTTPServlet(Abstract Class)
        //          |
        //          |
        // MailSendingServelet(Concrete Class)   

class ConcreteClass{
    public void concrete_method(){
        System.out.println("Doing something Concrete and well defined.");
    }
}
// (class A  implements i3 extends ConcreteClass) is wrong syntax//
class A extends ConcreteClass implements i3{
            //providing implementation for every interface i3 methods//
           public  void m1(){
                System.out.println("m1 method of interface i1");
            }
            public  void m2(){
                System.out.println("m2 method of interface i1");
            }
            public  void m3(){
                System.out.println("m3 method of interface i2");
            }
            public  void m4(){
                System.out.println("m4 method of interface i2");
            }
            public  void m5(){
                System.out.println("m5(newly added in i3) method of interface i3");
            }
}
class Prog3{
    public static void main(String[]args){
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        a.m5();
        a.concrete_method();
    }
}
//everything done without package statement//
