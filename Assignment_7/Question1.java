// Take a sting from keyboard and convert into character array (new one).
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println(arr.getClass().isArray()); // returns true
        sc.close();
    }
}
