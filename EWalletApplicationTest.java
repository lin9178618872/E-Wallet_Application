package ewall;

public class EWalletApplicationTest {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();

        wallet.addFunds(100);
        wallet.makePayment(50, "Online Shopping");
        wallet.makePayment(30, "Coffee Shop");
        wallet.addFunds(200);
        wallet.makePayment(80, "Dinner");

        wallet.viewTransactionHistory();
    }
}
