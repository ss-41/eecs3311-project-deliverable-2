package payment.strategy;

import java.util.Date;
//import facade.PaymentManager;

public class Payment {
	private int paymentID;
	private int userID;
    private double amountPaid;
    private Date datePaid;
    private PaymentStrategy paymentStrategy;
    

    public Payment(int paymentID, int userID, double amountPaid, PaymentStrategy paymentStrategy) {
    	this.paymentID = paymentID;
    	this.userID = userID;
        this.amountPaid = amountPaid;
        this.paymentStrategy = paymentStrategy;
    }


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment() {
        if (paymentStrategy == null || amountPaid <= 0) {
            return false;
        }

        boolean successful = paymentStrategy.pay(amountPaid);

        if (successful) {
            datePaid = new Date();
        }

        return successful;
    }

//    public boolean refundPayment() {
//        if (amountPaid <= 0) {
//            return false;
//        }
//        PaymentManager manager = new PaymentManager();
//
//        return manager.refund(String.valueOf(userID),amountPaid);
//    }
    
    public int getPaymentID() {
        return paymentID;
    }
    
    public int getUserID() {
        return userID;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public Date getDatePaid() {
        return datePaid;
    }
}
