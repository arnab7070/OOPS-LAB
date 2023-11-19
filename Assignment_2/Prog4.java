// Create a class First, make instance variable [int x], method [void show ()] and also put main method inside that class and use the
// instance variable and method from main.
class Prog4{
     int x;//not initialised so default value will be zero//
    void show(){
        System.out.println("Show method");
    }
    public static void main(String[]args){
        System.out.println(x);//error as x is instance and x cannot be accessed directly from a static area//
        show();//error as show() is instance and show() cannot be accessed directly from a static area//
        
    }
}