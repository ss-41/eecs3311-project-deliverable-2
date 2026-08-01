package payment.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaymentTest {

    private Payment payment;
    private PaymentStrategy strategy;

    @Before
    public void setup() {

        strategy =
                new CreditCard(
                        "1111222233334444",
                        "John Smith");

        payment =
                new Payment(
                        1,
                        10,
                        100.0,
                        strategy);
    }

    @Test
    public void testConstructor() {

        assertEquals(1, payment.getPaymentID());
        assertEquals(10, payment.getUserID());
        assertEquals(100.0, payment.getAmountPaid(), 0.001);
        assertNull(payment.getDatePaid());
    }

    @Test
    public void testProcessPaymentSuccess() {

        boolean success = payment.processPayment();

        assertTrue(success);
        assertNotNull(payment.getDatePaid());
    }

    @Test
    public void testChangeStrategy() {

        payment.setPaymentStrategy(
                new DebitCard(
                        "9999888877776666",
                        "Alice"));

        assertTrue(payment.processPayment());
        assertNotNull(payment.getDatePaid());
    }

    @Test
    public void testInstitutionalBillingStrategy() {

        payment.setPaymentStrategy(
                new InstitutionalBilling("YORK001"));

        assertTrue(payment.processPayment());
    }

    @Test
    public void testNullStrategyReturnsFalse() {

        Payment payment =
                new Payment(
                        2,
                        20,
                        50,
                        null);

        assertFalse(payment.processPayment());
        assertNull(payment.getDatePaid());
    }

    @Test
    public void testZeroAmountReturnsFalse() {

        Payment payment =
                new Payment(
                        3,
                        30,
                        0,
                        strategy);

        assertFalse(payment.processPayment());
        assertNull(payment.getDatePaid());
    }

    @Test
    public void testNegativeAmountReturnsFalse() {

        Payment payment =
                new Payment(
                        4,
                        40,
                        -100,
                        strategy);

        assertFalse(payment.processPayment());
        assertNull(payment.getDatePaid());
    }

    @Test
    public void testSuccessfulPaymentSetsDate() {

        assertNull(payment.getDatePaid());

        payment.processPayment();

        assertNotNull(payment.getDatePaid());
    }
}