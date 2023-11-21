import java.util.Scanner;
class Question4 {
    private static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateGCD(num2, num1 % num2);
    }
    private static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateGCD(num1, num2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("Please enter at least two numbers for calculation.");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int gcd = calculateGCD(numbers[0], numbers[1]);
        int lcm = calculateLCM(numbers[0], numbers[1]);
        for (int i = 2; i < n; i++) {
            gcd = calculateGCD(gcd, numbers[i]);
            lcm = calculateLCM(lcm, numbers[i]);
        }
        System.out.println("GCD/HCF of the numbers: " + gcd);
        System.out.println("LCM of the numbers: " + lcm);
    }
}
