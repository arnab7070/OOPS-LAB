// Write a program to take a sentence and convert it into string arrays and sort the words using any Sorting technique.
import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        Arrays.sort(arr);
        for (String string : arr) {
            System.out.println(string);
        }
        sc.close();
    }   
}
