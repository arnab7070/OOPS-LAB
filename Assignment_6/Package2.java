// // Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under package pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of previous class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s
// // members. 
// package ptwo;
// import pone.A_Prog3;
// public class B_Prog3 extends A_Prog3{
//         public static void main(String[]args){
//             B_Prog3 b = new B_Prog3();
//             System.out.println("Acessing variables and methods of A_PROG3 in package pone: ");
//             System.out.println(b.a);
//              System.out.println(b.b);
//               System.out.println(b.c);
//               b.m1();
//         }
//         //defining new members for B_Prog3 to be acesses in main directory//
//         public void m2(){
//             System.out.println("This is the method of the 2nd class B_Prog3 in package ptwo");
//         }


//     }
    

package pTwo;
import pOne.Package1;
public class Package2 extends Package1 {
	public void m2() {
		System.out.println("Calling from Package 2");
		System.out.println("Accessing Variables: "+degree+","+PIE);
	}
}


