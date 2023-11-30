import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First Name
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        // Input: Middle Name (if present)
        System.out.print("Enter Middle Name (if present, else press Enter): ");
        String middleName = scanner.nextLine();

        // Input: Last Name
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // Input: Last Four Digits of Roll Number
        System.out.print("Enter Last Four Digits of Roll Number: ");
        String rollNumber = scanner.nextLine();

        // Generate Password
        String password = generatePassword(firstName, middleName, lastName, rollNumber);

        // Display the generated password
        System.out.println("Generated Password: " + password);
    }

    private static String generatePassword(String firstName, String middleName, String lastName, String rollNumber) {
        // Initialize an empty StringBuilder to build the password
        StringBuilder passwordBuilder = new StringBuilder();

        // Append initials of the first name
        passwordBuilder.append(firstName.charAt(0));

        // Append initial of the middle name (if present)
        if (!middleName.isEmpty()) {
            passwordBuilder.append(middleName.charAt(0));
        }

        // Append initial of the last name
        passwordBuilder.append(lastName.charAt(0));

        // Append the last four digits of the roll number
        passwordBuilder.append(rollNumber);

        // Convert the StringBuilder to a String and return
        return passwordBuilder.toString();
    }
}
