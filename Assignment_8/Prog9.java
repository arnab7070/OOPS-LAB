// Write a demo program to illustrate ‘throws’ versus method overriding.
// import java.io.IOException;
// class A{
//     //method which throws Exception//
//    public void methodwithException()throws IOException{
//         System.out.println("Superclass method that throws Exception:IOException");
//         throw new IOException("Hello I am IOException from the Superclass method and i am your best friend");
//    }
//    //method which does not throw exception//
//    public void methodwithoutException()
//     {
//         System.out.println("Superclass method that does not throw any Exception");
//     }
// }
// class B extends A{
//     //overriding the method with exception//
//     public void methodwithException() {
//         try{
//             System.out.println("Child class method overriding the super class method with exception");
//             super.methodwithException();
//         }
//         catch(IOException e){
//             System.out.println("Caught Exception: " +e.getMessage());
//         }     
//     }
//     //overriding the normal method //
//     public void methodwithoutException(){
//         System.out.println("Child class method that does not throw any Exception");
//     }
// }

// class Prog9{
//     public static void main(String[]args){
//         B b = new B();
//         b.methodwithException();
//         b.methodwithoutException();
//         System.out.println("***************With Dynamic method Dispatching***************");
//         A a = new B();
//         try{
//             a.methodwithException();
//         }
//         catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//         a.methodwithoutException();

//     }
// }

import java.io.IOException;
class A{
	//method which throws Exception//
   void methodwithException()throws IOException {
		System.out.println("Superclass method that throws Exception:IOException");
		throw new IOException("I will throw exception");
   }
}
class B extends A {
	//overriding the method with exception
	@Override
	public void methodwithException() {
		System.out.println("No Exception Here. I am Overridden method");
	}
}
class Prog9 {
    public static void main(String[] args) {
        B b = new B();
        b.methodwithException(); // Exception handling in B is properly done
        A a = new A(); // we need to wrap this into try-catch block as here no exception handling is done                     
        try {
            a.methodwithException();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}