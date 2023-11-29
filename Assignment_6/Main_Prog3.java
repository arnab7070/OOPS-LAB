// Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under package pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of previous class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s
// members. 
// import ptwo.B_Prog3;
// class Main_Prog3{
//     public static void main(String[]args){
//         B_Prog3 c = new B_Prog3();
//         System.out.println("Now from Main (under working directory) access second class's members. ");
//         c.m2();
        

//     }
// }
import pTwo.Package2;
class Main_Prog3 {
  public static void main(String[] args) {
    Package2 p2 = new Package2();
	  p2.m2();
  }
}