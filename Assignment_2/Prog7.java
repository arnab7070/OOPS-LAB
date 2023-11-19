// Create a class; put a method inside this class which will return a class reference return same class and/or different class object.
class AnotherClass{
    int y=20;
}
class Prog7{
    int x=200;
    Prog7 m1(Prog7 obj){
        return obj;//returns the reference to an object of same class(prog7)//
    }
    AnotherClass m2(AnotherClass obj){
        return obj;//returns the refernce to an object of differnct class(another class)//
    }
    public static void main(String[]args){
        Prog7 obj = new Prog7();
        AnotherClass obj1 = new AnotherClass();
        Prog7 obj2=obj.m1(obj);
        System.out.println(obj2.x);
        AnotherClass obj3= obj.m2(obj1);
        System.out.println(obj3.y);
    }

}