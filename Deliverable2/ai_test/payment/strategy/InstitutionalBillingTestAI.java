package payment.strategy;

import static org.junit.Assert.*;
import org.junit.Test;

public class InstitutionalBillingTestAI {

    @Test
    public void testPayPositiveAmount() {

        InstitutionalBilling billing =
                new InstitutionalBilling("YORK123");

        assertTrue(billing.pay(500));
    }

    @Test
    public void testPayZeroAmount() {

        InstitutionalBilling billing =
                new InstitutionalBilling("YORK123");

        assertTrue(billing.pay(0));
    }

    @Test
    public void testPayNegativeAmount() {

        InstitutionalBilling billing =
                new InstitutionalBilling("YORK123");

        assertTrue(billing.pay(-1));
    }
}