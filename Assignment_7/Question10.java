// Write a program in Java to extract a portion of a character string and print the extracted string. Assume that m characters are
// extracted, starting with the n-th character.

import java.util.Scanner;

/**
 * Question10
 */
public class Question10 {

    public static void main(String[] args) {
        try{ Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the starting index: ");
        int n = sc.nextInt();
        System.out.print("Enter how many characters are to be extracted: ");
        int m = sc.nextInt();
        System.out.println(str.substring(n, n + m));
        sc.close();}
           
        
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        
    }
}