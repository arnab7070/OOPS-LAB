// Write a program to handle the ArithmeticException.
class Prog1{
    public static void main(String[]args){
        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}