// Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under package pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of previous class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s
// members. 
// package pone;
// public class A_Prog3{
//     protected int a=10;
//     protected int b=20;
//     protected int c=30;
//     protected void m1(){
//         System.out.println("This is the method of A in pone ");
//     }
// }

package pOne;

public class Package1 {
	// We must change the access modifier default to protected or public so that we can access these
	protected int degree = 1;
	protected double PIE = 3.1415;
	protected void m1(){
		System.out.println("Package 1 m1() method");
	}
}