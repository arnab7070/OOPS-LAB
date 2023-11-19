// Write a program to find Area and Circumference of Cylinder Using Constructors - Keyboard Input or Command Line Input//
import java.util.Scanner;
class Cylinder{
    double area;//2pi*r^2+2pi*r*h//
    double circumference;//2*pi*r//
    Cylinder(double radius,double height){
        area=2*3.1415*radius*radius+2*3.1415*radius*height;
        circumference=2*3.1415*radius;
    }
}
class Prog2{
    public static void main(String[]args){
        //keyboard input//  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius=sc.nextDouble();
        System.out.println("Enter height");
        double height=sc.nextDouble();
        Cylinder c = new Cylinder(radius,height);
        System.out.println(c.area);
        System.out.println(c.circumference);
        //command line input (comment out the previous one to run) //
        Cylinder c1= new Cylinder(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        System.out.println(c1.area);
        System.out.println(c1.circumference);
        sc.close();
    }
    // Volume = (1/3) × π × radius² × height (Cone)
    // Area = πr² + πrl
}