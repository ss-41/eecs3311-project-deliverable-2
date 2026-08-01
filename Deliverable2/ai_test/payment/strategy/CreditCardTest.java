package payment.strategy;

import static org.junit.Assert.*;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void testPayPositiveAmount() {

        CreditCard card =
                new CreditCard(
                        "1111222233334444",
                        "John Smith");

        assertTrue(card.pay(100.00));
    }

    @Test
    public void testPayZeroAmount() {

        CreditCard card =
                new CreditCard(
                        "1111222233334444",
                        "John Smith");

        assertTrue(card.pay(0));
    }

    @Test
    public void testPayNegativeAmount() {

        CreditCard card =
                new CreditCard(
                        "1111222233334444",
                        "John Smith");

        assertTrue(card.pay(-50));
    }
}