import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First String (s1)
        System.out.print("Enter the first string (s1): ");
        String s1 = scanner.nextLine();

        // Input: Second String (s2)
        System.out.print("Enter the second string (s2): ");
        String s2 = scanner.nextLine();

        // Create the third string (s3)
        String s3 = combineStrings(s1, s2);

        // Display the third string
        System.out.println("Combined String (s3): " + s3);
    }

    private static String combineStrings(String s1, String s2) {
        StringBuilder combinedStringBuilder = new StringBuilder();

        // Determine the length of the combined string
        int maxLength = Math.max(s1.length(), s2.length());

        // Iterate through each character index
        for (int i = 0; i < maxLength; i++) {
            // Append a character from s1 (if available)
            if (i < s1.length()) {
                combinedStringBuilder.append(s1.charAt(i));
            }

            // Append a character from s2 (if available)
            if (i < s2.length()) {
                combinedStringBuilder.append(s2.charAt(i));
            }
        }

        // Convert the StringBuilder to a String and return
        return combinedStringBuilder.toString();
    }
}

