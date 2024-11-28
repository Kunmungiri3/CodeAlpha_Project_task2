import java.util.Scanner;

public class SimpleBankingApp {
    private static double balance = 0.0; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to Simple Banking Application");

        // Main menu loop
        while (!exit) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            // Handle user choices
            switch (choice) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using Simple Banking Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Deposit method
    private static void deposit(Scanner scanner) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    private static void withdraw(Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Check balance method
    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
}

