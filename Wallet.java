package ewall;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private double balance;
    private List<Transaction> transactionHistory;

    public Wallet() {
        balance = 0;
        transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void addFunds(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Added funds", amount, true));
        System.out.println("Added $" + amount + " to your wallet.");
    }

    public void makePayment(double amount, String description) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction(description, amount, false));
            System.out.println("Payment of $" + amount + " made: " + description);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void viewTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            String type = transaction.isCredit() ? "Credit" : "Debit";
            System.out.println(type + ": $" + transaction.getAmount() + " - " + transaction.getDescription());
        }
    }
}
