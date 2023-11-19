// Create a class, make method inside it and pass object as parameter of this method. (a) pass same class’s object, (b) pass different
// class’s object
class AnotherClass{
    int y=200;
}
class Prog6{
    int x=20;
    void m1(Prog6 obj){
        System.out.println("Same class instance variable: "+obj.x);
    }
    void m2(AnotherClass obj1){
        System.out.println("Another class instance variable: "+obj1.y);
    }
    public static void main(String[]args){
        Prog6 obj = new Prog6();
        AnotherClass obj1 = new AnotherClass();
        obj.m1(obj);//Passing same class object//
        obj.m2(obj1);//Passing different class object//
    }
}
