// . Create an interface containing three methods, in a package ‘pkgOne’. Implement the interface from a class under package
// pkgTwo. From main, under working directory, create object of the class and call methods of interface.
import pkgtwo.Prog4_2;
class Prog4_3{
    public static void main(String[]args){
        Prog4_2 obj = new Prog4_2();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}