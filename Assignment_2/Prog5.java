// Create a class; make its instance variable and method. Use them from main, declared in different class//
class A{
    int x;
    void show(){
        System.out.println("Show methiod of A class");
    }
}
class Prog5{
    public static void main(String[]args){
    A a = new A();
    System.out.println(a.x);//0
    a.show();
    }
   
}