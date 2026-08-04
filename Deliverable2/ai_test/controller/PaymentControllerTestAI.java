package controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaymentControllerTestAI {

    private PaymentController controller;

    @Before
    public void setup() {

        controller = new PaymentController();
    }

    @Test
    public void testCalculateFeeInvalidBooking() {

        assertEquals(
                0,
                controller.calculateFee(999),
                0.001);
    }

    @Test
    public void testProcessPaymentInvalidBooking() {

        assertFalse(
                controller.processPayment(999));
    }

}