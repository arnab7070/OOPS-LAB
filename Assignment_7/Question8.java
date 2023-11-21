// Write a program in Java which will read a string and rewrite it in the alphabetical order. For example, the word STRING
// should be written as GINRST.
import java.util.Arrays;
import java.util.Scanner;
public class Question8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Construct a new string from the sorted character array
        String sortedString = new String(charArray);

        // Display the string in alphabetical order
        System.out.println("String in alphabetical order: " + sortedString);

        scanner.close();
    }
}




