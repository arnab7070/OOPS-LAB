// Create a class and test if method overloading holds good for return type of method or not
class Prog1{
    public static void m1(int i){
        System.out.println(i);
    }
    public static int m1(int i){
        System.out.println(i);
        return i;
    }//overloading will not occur ambiguity problem will arise//
    // error: method m1(int) is already defined in class Prog1
    public static void main(String[]args){
        m1(2);
    }
}
