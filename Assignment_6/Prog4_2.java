// . Create an interface containing three methods, in a package ‘pkgOne’. Implement the interface from a class under package
// pkgTwo. From main, under working directory, create object of the class and call methods of interface.
package pkgtwo;
import pkgone.Prog4;
public class Prog4_2 implements Prog4{
    public void m1(){
        System.out.println("Implmentation for method m1 of interface prog4 in pkgOne (implemnted in interface Prog4_2 of package pkgtwo)");
    }
    public void m2(){
        System.out.println("Implmentation for method m2 of interface prog4 in pkgOne  (implemnted in interface Prog4_2 of package pkgtwo)");
    }
    public void m3(){
        System.out.println("Implmentation for method m3 of interface prog4 in pkgOne  (implemnted in interface Prog4_2 of package pkgtwo)");
    }
}