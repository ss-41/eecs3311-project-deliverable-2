package payment.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class DebitCardTest {

	@Test
	public void testPositivePaymentIsSuccessful() {
		DebitCard card = new DebitCard("54746584748", "Bill Williams"); 
		assertTrue(card.pay(30));  
	} 

	@Test
	public void testStrategyImplementation() {
		PaymentStrategy strategy = new DebitCard("756754748452", "Sarah Gunner");
		assertTrue(strategy.pay(10)); 
	}
	
	@Test
	public void testPaymentThroughPaymentClass() {
		PaymentStrategy strategy = new DebitCard("935232546535", "Lily Rose"); 
		Payment payment = new Payment (111, 21, 40, strategy); 
		assertTrue(payment.processPayment());
		assertNotNull(payment.getDatePaid()); 
	}

}

