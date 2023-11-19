class Parent{
    protected String name;protected int age;
    Parent(String name,int age){
        this.name=name;
        this.age=age;
    }
    void m1(){
        System.out.println("Parent Class");
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
    }

}
class Child extends Parent{
   String color;
    Child(String name,int age,String color){
        super(name,age);
        this.color=color;
    }
    protected void m2(){
        System.out.println("Child Class");
        System.out.println("Name:"+super.name);
        System.out.println("Age:"+super.age);
        System.out.println("Age:"+this.color);
    }
    public static void main(String[]args){
       Parent p = new Child("Supratik",21,"Yellow");
        Child c=(Child)p;//Downcasting from parent p to child c//
        c.m2();
    }
}
