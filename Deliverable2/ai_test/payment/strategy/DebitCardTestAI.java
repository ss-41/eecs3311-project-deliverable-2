package payment.strategy;

import static org.junit.Assert.*;
import org.junit.Test;

public class DebitCardTestAI {

    @Test
    public void testPayPositiveAmount() {

        DebitCard card =
                new DebitCard(
                        "9999888877776666",
                        "Alice");

        assertTrue(card.pay(25));
    }

    @Test
    public void testPayZeroAmount() {

        DebitCard card =
                new DebitCard(
                        "9999888877776666",
                        "Alice");

        assertTrue(card.pay(0));
    }

    @Test
    public void testPayNegativeAmount() {

        DebitCard card =
                new DebitCard(
                        "9999888877776666",
                        "Alice");

        assertTrue(card.pay(-10));
    }
}