package Day1;

import java.util.Scanner;

public class SimpleBankingApp {
    static double balance = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("Banking Application Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Current Balance");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thank you for using our banking application.");
        scanner.close();
    }

    public static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    public static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }

    public static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
