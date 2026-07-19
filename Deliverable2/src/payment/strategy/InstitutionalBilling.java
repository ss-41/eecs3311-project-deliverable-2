package payment.strategy;

public class InstitutionalBilling implements PaymentStrategy {

	private String institutionNumber;

    public InstitutionalBilling(String institutionNumber) {
        this.institutionNumber = institutionNumber;
    }

    @Override
    public boolean pay(double amount) {

        System.out.println("Payment of $" + amount + " successful.");

        return true;
    }
}
