
// // Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a person is less than Rs. 10,000 /-) and fire the exception
// import java.util.Scanner;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.Console;

// class PayOutOfBoundsException extends RuntimeException {
//     PayOutOfBoundsException(String s) {
//         super(s);
//     }
// }// Defining the custom exceptuion with the user provided string message s and
//  // transfred to the immediate super class RuntimeException which is unchecked
//  // exception //

// class Prog6 {
//     public static void main(String[] args) throws IOException {
//         Scanner sc = new Scanner(System.in);
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         int salary = 0;
//         try {
//             salary = Integer.parseInt(reader.readLine());
//         } catch (IOException e) {
//             System.out.println("koi nehi hota hai eiye java hai");
//         }

//         while (salary != 0) {
//             try {
//                 if (salary < 10000) {
//                     throw new PayOutOfBoundsException(
//                             "Ei sala ami sala eto khati tao eto kom taka --> manushe khete porte pabe na erom korle");
//                 } else {
//                     System.out.println("OK ji 4lpa r enginner aot  te pori ar kii ba hobe");
//                 }
//             } catch (PayOutOfBoundsException e) {
//                 System.out.println(e.getMessage());
//             }
//             salary = sc.nextInt();
//             sc.close();
//         }

//     }
// }

// User Defined Exception
class PayOutOfBoundsException extends Exception {
    PayOutOfBoundsException(String message) {
        super(message); // this is important
    }
}

class Person {
    int salary;

    Person(int salary) {
        this.salary = salary;
    }

    void checkSalary() {
        try {
            if (salary < 10000) {
                // CREATING NEW USER DEFINED EXCEPTION OBJECT
                throw new PayOutOfBoundsException("Monthly Salary is less than 10000/-");
            } else {
                System.out.println("You can go for it");
            }
        } catch (PayOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

// Run like this javac Prog6.java to compile the code then run the file as java Prog6 9045 to see the result
public class Prog6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided through command line");
            return;
        }
        int salary = Integer.parseInt(args[0]);
        Person object = new Person(salary);
        object.checkSalary();
    }
}