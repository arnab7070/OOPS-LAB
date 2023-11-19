// Add two numbers by taking input using Command Line Input, Scanner class and BufferedReader class
import java.io.Console;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class Prog1{
    public static void main(String[]args){
        //Bufferd reader//
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        try{
            String userInput=reader.readLine();
            String userInput2=reader.readLine();
            int a=Integer.parseInt(userInput);
            int b= Integer.parseInt(userInput2);
            System.out.println(a+b);
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        //Scanner//
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(s);
        //Console//
        Console c = System.console();
        String s1= c.readLine();
        System.out.println(s1);
        sc.close();
    }

}