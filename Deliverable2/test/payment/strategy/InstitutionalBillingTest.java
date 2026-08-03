package payment.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class InstitutionalBillingTest {

	@Test
	public void testPositivePaymentIsSuccessful() {
		InstitutionalBilling number = new InstitutionalBilling("001"); 
		assertTrue(number.pay(25));
		
	} 
	
	@Test
	public void testStrategyImplementation() {
		PaymentStrategy strategy = new InstitutionalBilling("002");
		assertTrue(strategy.pay(55)); 
	}
	
	@Test
	public void testPaymentThroughPaymentClass() {
		PaymentStrategy strategy = new InstitutionalBilling("003"); 
		Payment payment = new Payment (112, 22, 35, strategy); 
		assertTrue(payment.processPayment());
		assertNotNull(payment.getDatePaid()); 
	}

}
