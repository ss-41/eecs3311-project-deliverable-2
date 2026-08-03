package payment.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentTest {

	@Test
	public void testConstructorPaymentID() {
		PaymentStrategy strategy = new DebitCard("472480905678", "Mike Andrews");
		Payment payment = new Payment (100, 10, 30, strategy);
		assertEquals(100, payment.getPaymentID()); 
	}
	
	@Test
	public void testConstructorUserID() {
		PaymentStrategy strategy = new CreditCard("123456789871", "Sam Lee");
		Payment payment = new Payment (101, 11, 20, strategy);
		assertEquals(11, payment.getUserID()); 
	}
	
	@Test
	public void testConstructorAmountPaid() {
		PaymentStrategy strategy = new DebitCard("4352167853756", "Andy Mack");
		Payment payment = new Payment (102, 12, 50, strategy);
		assertEquals(50, payment.getAmountPaid(), 0.001);
	}
	
	@Test
	public void testSuccessfulPayment() {
		PaymentStrategy strategy = new CreditCard("278346758345", "Harry Potter");
		Payment payment = new Payment (103, 13, 20, strategy); 
		boolean paid = payment.processPayment();
		assertTrue(paid); 
	}
	
	@Test
	public void testSuccessfulPaymentDate() {
		PaymentStrategy strategy = new CreditCard("817563869476", "Jack Weah");
		Payment payment = new Payment (104, 14, 40, strategy); 
		payment.processPayment();
		assertNotNull(payment.getDatePaid());
	}
	
	@Test
	public void testAmountPaidIsZeroFails() {
		PaymentStrategy strategy = new CreditCard("264967395638", "Kim Reece");
		Payment payment = new Payment (105, 15, 0, strategy); 
		assertFalse(payment.processPayment());
		assertNull(payment.getDatePaid());
	}
	
	@Test
	public void testAmountPaidIsNegativeFails() {
		PaymentStrategy strategy = new DebitCard("538564846485", "Jennifer Mathew");
		Payment payment = new Payment (106, 16, -25, strategy); 
		assertFalse(payment.processPayment());
		assertNull(payment.getDatePaid());
	}
	
	@Test
	public void testStrategyIsNullFails() {
		Payment payment = new Payment (107, 17, 45, null); 
		assertFalse(payment.processPayment());
		assertNull(payment.getDatePaid());
	}
	
	@Test
	public void testChangeFailedStrategyToValidStrategy() {
		Payment payment = new Payment (108, 18, 20, null); 
		assertFalse(payment.processPayment());
		assertNull(payment.getDatePaid()); 
		
		PaymentStrategy strategy = new CreditCard("846578363746", "Roan Atlas"); 
		payment.setPaymentStrategy(strategy);
		
		assertTrue(payment.processPayment()); 
		assertNotNull(payment.getDatePaid());
	}
	
	@Test
	public void testDatePaidIsNullBeforePaymentProcess() {
		PaymentStrategy strategy = new InstitutionalBilling("2603");
		Payment payment = new Payment (109, 19, 35, strategy); 
		assertNull(payment.getDatePaid()); 
		
	}
	
}
