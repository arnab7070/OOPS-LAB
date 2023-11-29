// // Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch
// // its exception and, in the catch clause, throw a different exception (of a second type that you define). Test your code in main( ).
// class ExceptionForg extends RuntimeException{
//     ExceptionForg(String s){
//         super(s);
//     }
// }//Defining the custom Exception for g()//
// class ExceptionForf extends RuntimeException{
//     ExceptionForf(String s){
//         super(s);
//     }
// }
// class A{
//     void f(){ //"Throws (not throw) keyword helps in dedicating the mechanism of checked exception handling mecahnism to the caller method//"
//         try{
//             g();//calling g() instance method from instance block is readily accessible had it been static  g would also have to be static//
//         }
//         catch(ExceptionForg e){
//             System.out.println("Caught Exception for g() in f(): "+e.getMessage());
//             throw new ExceptionForf("This is the exception for f(). ");
//         }
//     }
//     void g() {
//         throw new ExceptionForg("This is the Exception for g().");
//     }
// }
// class Prog7{
//     public static void main(String[]args){
//         A a = new A();
//         try{
//                a.f();
//         }
//         catch(ExceptionForf e){
//             System.out.println("Caught Exception: "+e.getMessage());
//         }

//     }
// }

class Exception1 extends Exception {
    Exception1(String message) {
        super(message);
    }
}
class Exception2 extends Exception {
    Exception2(String message) {
        super(message);
    }
}

class Test {
    void g() throws Exception1 {
        throw new Exception1("This is for g()");
    }
    void f() throws Exception2 {
        try {
            g();
        } catch (Exception1 e) {
            System.out.println(e);
            throw new Exception2("This is for f()");
        }
    }
}

public class Prog7 {
    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.f();
        } catch (Exception2 e) {
            System.out.println(e);
        }
    }
} 