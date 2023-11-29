/**
 * Question3 Find length of a string taken from keyboard and also find the length of that string except front and end spaces.

 */
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.trim().length());
        sc.close();
    }
}