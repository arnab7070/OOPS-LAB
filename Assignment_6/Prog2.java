// // Show that static block is executed at the time of class loading and also the order of execution of these blocks (for multiple blocks/
// // inherited block).
// class A{
//     static{
//         System.out.println("Static block 1 of Parent(A)");
//     }
//     static{
//             System.out.println("Static block 2 of Parent(A)");
//     }
//     {
//             System.out.println("Instance block 1 of Parent(A)");
//     }
//     {
//              System.out.println("Instance block 2 of Parent(A)");
//     }

//     public static void main(String[]args){
//         A a = new A();
//       System.out.println("Main method of A");
//     }
//      A(){
//          System.out.println("Constuctor-->A");
//     }
// }
// class B extends A{
//     static{
//         System.out.println("Static block 1 of Child(B)");
//     }
//     static{
//         System.out.println("Static block 2 of Child(B)");
//     }
//     {
//         System.out.println("Instance block 1 of Child(B)");
//     }
//     {
//         System.out.println("Instance block 2 of Child(B)");
//     }
//      public static void main(String[]args){
//         B a = new B();
//       System.out.println("Main method of B");
//     }
//      B(){
//          System.out.println("Constuctor-->B");
//     }
// }
// class Prog2 extends B{//Experiemnt here too exrted with A,B or nothing and see output helpfyul in viva//
//     public static void main(String[]args){
//         Prog2 b = new Prog2();//This is the defining line//
//         //by commenting and uncommenting it out we will get different ouputs//
//         // A a= new A();
//         // B c = new B();
//         System.out.println("Prog2 main Method");
//     }
//     {
//         System.out.println("Prog2 instance block 2");
//     }
//      static{
//         System.out.println("Prog2 static block 2");
//     }
//      static{
//         System.out.println("Prog2 static block 3");
//     }
//     {
//         System.out.println("Prog2 instance block 1");
//     }
//     static{
//         System.out.println("Prog2 static block 1");
//     }

// }
// //This is a beautiful program experiment with it alot//

// Show that static block is executed at the time of class loading and also the order of execution of these blocks 
// (for multiple blocks/inherited block).

class A {
    static {
        System.out.println("Static Block of Class A (Parent)");
    }
    {
        System.out.println("Instance Block of Class A (Parent)");
    }

    A() {
        System.out.println("Constructor Block of Class A (Parent)");
    }
}

class B extends A {
    static {
        System.out.println("Static Block of Class B (Child)");
    }
    {
        System.out.println("Instance block of Class B (Child)");
    }

    B() {
        System.out.println("Constructor Block of Class B (Child)");
    }
}

class Prog2 {
    public static void main(String[] args) {
        B obj = new B();
    }
}