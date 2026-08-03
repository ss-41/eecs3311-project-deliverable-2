package payment.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardTest {

	@Test
	public void testPositivePaymentIsSuccessful() {
		CreditCard card = new CreditCard("648563756489", "Leila Jama"); 
		assertTrue(card.pay(20));  
	}

	@Test
	public void testStrategyImplementation() {
		PaymentStrategy strategy = new CreditCard("846563746574", "John Monroe");
		assertTrue(strategy.pay(30)); 
	}
	
	@Test
	public void testPaymentThroughPaymentClass() {
		PaymentStrategy strategy = new CreditCard("739574845847", "Alex Son"); 
		Payment payment = new Payment (110, 20, 50, strategy); 
		assertTrue(payment.processPayment());
		assertNotNull(payment.getDatePaid()); 
	}
}
