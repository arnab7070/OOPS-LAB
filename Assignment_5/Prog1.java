// Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle create object of
// the two classes and calculate their area.
interface Shape{
   double pie=3.14;//every variable in an interface is by default public and final and static//
    double area();//every method in an interface is by default public and abstract
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius; 
    }
    public double area(){ //take notice of the access modifier if you do not give any it will be default which is weaker assign privilege in java and for method overriding wre can't do that so always override interface methods in implementing class with a public acecss modifier//
        return pie*radius*radius;
    }
}
class Rectangle implements Shape{
    double length;double breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
       return length*breadth;
    }
}
class Prog1{
    public static void main(String[]args){
        Circle c = new Circle(3.0);
        Rectangle r = new Rectangle(3.0,4.0);
        System.out.println(c.area());
        System.out.println(r.area());
    }
}
