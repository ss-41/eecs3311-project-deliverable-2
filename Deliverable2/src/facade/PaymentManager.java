package facade;

public class PaymentManager {
    public boolean deposit(String clientID, double amount) {
        System.out.println("Payment: Deposit of $" + amount + " processed for user " + clientID);
        return true;
    }

    public boolean refund(String clientID, double amount) {
        System.out.println("Payment: Refund of $" + amount + " processed for user " + clientID);
        return true;
    }
}//a