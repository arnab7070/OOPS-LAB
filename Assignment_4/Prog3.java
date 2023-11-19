// Assume that a bank maintains two kinds of account for its customers, one called savings account and other called current account.
// The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides
// cheque book facility but no interest. Current account holders should also maintain a minimum balance (say Rs. 1000) and if the balance falls below this level a service charge is imposed (say Rs. 100). 
// Create a class Account that stores customer name, account number and type of account. From this class derive two classes
// Curr_Acct and Savn_Acct respectively to make them more specific to their requirements. Include the necessary methods to
// achieve the following tasks:
// a. Accept deposit from a customer and update the balance.
// b. Display the balance.
// c. Compute and deposit interest.
// d. Permit withdrawal and update the balance.
// e. Check for minimum balance, impose penalty, if necessary, and update the balance.
// Use constructors to initialize the class members.

import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    // Constructor to initialize account details
    public Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to accept deposit and update balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Rs. " + amount + " successful.");
        displayBalance();
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    // Method to compute and deposit interest
    public void depositInterest(double rate) {
        double interest = balance * (rate / 100);
        balance += interest;
        System.out.println("Interest of Rs. " + interest + " deposited.");
        displayBalance();
    }

    // Method to permit withdrawal and update balance
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of Rs. " + amount + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
        displayBalance();
    }
}

class Curr_Acct extends Account {
    double minBalance;
    double serviceCharge;

    // Constructor to initialize Current Account details
    public Curr_Acct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
        this.minBalance = 1000; // Minimum balance required for a current account
        this.serviceCharge = 100; // Service charge for falling below the minimum balance
    }

    // Method to check for minimum balance and impose penalty if necessary
    public void checkMinBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of Rs. " + serviceCharge + " imposed for falling below minimum balance.");
            displayBalance();
        }
    }
}

class Savn_Acct extends Account {
    double interestRate;

    // Constructor to initialize Savings Account details
    public Savn_Acct(String customerName, int accountNumber, double balance, double interestRate) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = interestRate;
    }
}

public class Prog3 {
    public static void main(String[] args) {
        // Example usage
        Curr_Acct currentAccount = new Curr_Acct("John Doe", 1001, 1500);
        currentAccount.displayBalance();

        currentAccount.deposit(500);
        currentAccount.checkMinBalance();

        currentAccount.withdraw(2000); // Insufficient funds
        currentAccount.withdraw(500);
        currentAccount.checkMinBalance();

        Savn_Acct savingsAccount = new Savn_Acct("Jane Doe", 2001, 5000, 5);
        savingsAccount.displayBalance();

        savingsAccount.depositInterest(savingsAccount.interestRate);
    }
}
