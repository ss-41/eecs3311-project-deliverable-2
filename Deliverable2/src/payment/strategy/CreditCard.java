package payment.strategy;

public class CreditCard implements PaymentStrategy {

	 private String cardNumber;
	 private String cardHolderName;

	 public CreditCard(String cardNumber, String cardHolderName) {
	        this.cardNumber = cardNumber;
	        this.cardHolderName = cardHolderName;
	    }

	 @Override
	 public boolean pay(double amount) {

	     System.out.println("Payment of $" + amount + " successful.");

	     return true;
	 }
}
