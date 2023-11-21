import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a string from the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Read the index (m) of the element to be removed
        System.out.println("Enter the index (m) of the element to be removed:");
        int m = scanner.nextInt();

        // Call the deleteMe method to remove the m-th element
        String resultString = deleteMe(inputString, m);

        // Display the result
        System.out.println("String after removing the m-th element: " + resultString);

        scanner.close();
    }

    // Method to remove the m-th element from the string
    private static String deleteMe(String str, int m) {
        if (m >= 0 && m < str.length()) {
            // Use StringBuilder to efficiently remove the m-th character
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.deleteCharAt(m);
            return stringBuilder.toString();
        } else {
            // Return the original string if m is out of bounds
            System.out.println("Index (m) is out of bounds. Returning the original string.");
            return str;
        }
    }
}
