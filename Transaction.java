package ewall;

public class Transaction {
    private String description;
    private double amount;
    private boolean isCredit;

    public Transaction(String description, double amount, boolean isCredit) {
        this.description = description;
        this.amount = amount;
        this.isCredit = isCredit;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isCredit() {
        return isCredit;
    }
}
