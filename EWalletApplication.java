package ewall;

import java.util.Scanner;

public class EWalletApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wallet wallet = new Wallet();

        while (true) {
            System.out.println("\nE-Wallet Menu:");
            System.out.println("1. View Balance");
            System.out.println("2. Add Funds");
            System.out.println("3. Make Payment");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: $" + wallet.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to add: $");
                    double addAmount = scanner.nextDouble();
                    wallet.addFunds(addAmount);
                    break;
                case 3:
                    System.out.print("Enter payment amount: $");
                    double paymentAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter payment description: ");
                    String description = scanner.nextLine();
                    wallet.makePayment(paymentAmount, description);
                    break;
                case 4:
                    wallet.viewTransactionHistory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
