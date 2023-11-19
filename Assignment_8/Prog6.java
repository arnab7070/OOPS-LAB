// Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a person is less than Rs. 10,000 /-) and fire the exception
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;
class  PayOutOfBoundsException extends RuntimeException{
    PayOutOfBoundsException(String s){
        super(s);
    }
}//Defining the custom exceptuion with the user provided string message s and transfred to the immediate super class RuntimeException which is unchecked exception //
class Prog6{
    public static void main(String[]args) throws IOException{
        Scanner sc= new Scanner (System.in);
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        Console c= System.console();
         int salary=0;
        try{
           salary =Integer.parseInt(reader.readLine());
        }
        catch(IOException e){
            System.out.println("koi nehi hota hai eiye java hai");
        }
       
        while(salary!=0){
            try{
                if(salary<10000){
                    throw new PayOutOfBoundsException("Ei sala ami sala eto khati tao eto kom taka --> manushe khete porte pabe na erom korle");
            }
                else{
                    System.out.println("OK ji 4lpa r enginner aot  te pori ar kii ba hobe");
                }
            }
            catch(PayOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            salary=sc.nextInt();
            
        }   

    }
}
