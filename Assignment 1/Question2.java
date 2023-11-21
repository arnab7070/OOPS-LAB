import java.util.Scanner;
class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println("Sum of the series up to " + n + " terms: " + sum);
    }
}

