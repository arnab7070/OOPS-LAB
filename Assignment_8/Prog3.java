// Write a program to fire the NegativeArraySize exception. 
class Prog3{
    public static void main(String[]args){
        try{
            int arr[]=new int[-45];
        }
        catch(NegativeArraySizeException NegativeArraySizeException){
            System.out.println("E hahah :"+NegativeArraySizeException.toString());
        }
    }
}