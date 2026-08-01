package payment.strategy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        java.lang.Class<?> wildcardClass11 = creditCard9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy8);
        int int10 = payment9.getPaymentID();
        boolean boolean11 = payment9.processPayment();
        payment.strategy.CreditCard creditCard14 = new payment.strategy.CreditCard("hi!", "");
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        boolean boolean17 = creditCard14.pay(1.0d);
        boolean boolean19 = creditCard14.pay((double) 1);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        java.lang.Class<?> wildcardClass21 = creditCard14.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        double double6 = payment4.getAmountPaid();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        boolean boolean12 = payment4.processPayment();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 1);
        boolean boolean16 = creditCard9.pay((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 1);
        java.lang.Class<?> wildcardClass15 = creditCard9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        int int7 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        boolean boolean5 = payment4.processPayment();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        java.util.Date date6 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay((double) 'a');
        boolean boolean5 = institutionalBilling1.pay((double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        boolean boolean5 = payment4.processPayment();
        int int6 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        payment.strategy.DebitCard debitCard2 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean4 = debitCard2.pay((double) 'a');
        java.lang.Class<?> wildcardClass5 = debitCard2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        payment.strategy.CreditCard creditCard2 = new payment.strategy.CreditCard("hi!", "hi!");
        boolean boolean4 = creditCard2.pay((double) (byte) 1);
        boolean boolean6 = creditCard2.pay(10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        boolean boolean12 = payment4.processPayment();
        int int13 = payment4.getPaymentID();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        int int11 = payment4.getUserID();
        boolean boolean12 = payment4.processPayment();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        boolean boolean9 = payment4.processPayment();
        double double10 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.util.Date date13 = payment4.getDatePaid();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = date13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        payment.strategy.DebitCard debitCard2 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean4 = debitCard2.pay((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        boolean boolean17 = creditCard13.pay(100.0d);
        java.lang.Class<?> wildcardClass18 = creditCard13.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        payment.strategy.DebitCard debitCard17 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean19 = debitCard17.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard17);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        boolean boolean12 = payment4.processPayment();
        int int13 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment(32, 35, (double) (short) 10, (payment.strategy.PaymentStrategy) debitCard5);
        java.util.Date date7 = payment6.getDatePaid();
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        double double7 = payment4.getAmountPaid();
        int int8 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        int int6 = payment4.getPaymentID();
        boolean boolean7 = payment4.processPayment();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("");
        payment.strategy.Payment payment5 = new payment.strategy.Payment((int) (short) 0, 0, (double) (short) 100, (payment.strategy.PaymentStrategy) institutionalBilling4);
        java.lang.Class<?> wildcardClass6 = institutionalBilling4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        boolean boolean12 = payment4.processPayment();
        java.util.Date date13 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("");
        payment.strategy.Payment payment5 = new payment.strategy.Payment((int) (short) 0, 0, (double) (short) 100, (payment.strategy.PaymentStrategy) institutionalBilling4);
        java.lang.Class<?> wildcardClass6 = payment5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        double double6 = payment4.getAmountPaid();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        boolean boolean17 = creditCard13.pay(0.0d);
        boolean boolean19 = creditCard13.pay(100.0d);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        boolean boolean17 = creditCard13.pay(100.0d);
        boolean boolean19 = creditCard13.pay((double) 0L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        int int6 = payment4.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("");
        boolean boolean10 = institutionalBilling8.pay((double) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        int int12 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.util.Date date13 = payment4.getDatePaid();
        int int14 = payment4.getUserID();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        payment.strategy.PaymentStrategy paymentStrategy18 = null;
        payment.strategy.Payment payment19 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy18);
        payment.strategy.DebitCard debitCard22 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean24 = debitCard22.pay((double) 0.0f);
        payment19.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard22);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard22);
        boolean boolean28 = debitCard22.pay((double) '#');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        payment.strategy.PaymentStrategy paymentStrategy18 = null;
        payment.strategy.Payment payment19 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy18);
        payment.strategy.DebitCard debitCard22 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean24 = debitCard22.pay((double) 0.0f);
        payment19.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard22);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard22);
        java.util.Date date27 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 0.0f);
        boolean boolean16 = creditCard9.pay((double) 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 1);
        boolean boolean16 = creditCard9.pay((double) (byte) 100);
        java.lang.Class<?> wildcardClass17 = creditCard9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.Payment payment12 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean17 = debitCard15.pay((double) 'a');
        boolean boolean19 = debitCard15.pay(100.0d);
        boolean boolean21 = debitCard15.pay((double) 1.0f);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        java.lang.Class<?> wildcardClass23 = debitCard15.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean20 = debitCard18.pay((double) 'a');
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.DebitCard debitCard24 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean26 = debitCard24.pay((-1.0d));
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard24);
        boolean boolean29 = debitCard24.pay((double) (short) 100);
        boolean boolean31 = debitCard24.pay((double) (-1));
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.InstitutionalBilling institutionalBilling14 = new payment.strategy.InstitutionalBilling("");
        boolean boolean16 = institutionalBilling14.pay((double) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling14);
        int int18 = payment4.getPaymentID();
        double double19 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getUserID();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.InstitutionalBilling institutionalBilling14 = new payment.strategy.InstitutionalBilling("");
        boolean boolean16 = institutionalBilling14.pay((double) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling14);
        boolean boolean19 = institutionalBilling14.pay((double) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        payment.strategy.DebitCard debitCard2 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean4 = debitCard2.pay((-1.0d));
        boolean boolean6 = debitCard2.pay((double) 0);
        java.lang.Class<?> wildcardClass7 = debitCard2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("");
        boolean boolean3 = institutionalBilling1.pay((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 1);
        boolean boolean16 = creditCard9.pay((double) (byte) 100);
        boolean boolean18 = creditCard9.pay((-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        int int9 = payment7.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("");
        boolean boolean13 = institutionalBilling11.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        boolean boolean16 = institutionalBilling11.pay((double) 0.0f);
        payment.strategy.Payment payment17 = new payment.strategy.Payment((int) (byte) -1, (int) (byte) 1, (double) (-1.0f), (payment.strategy.PaymentStrategy) institutionalBilling11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        int int6 = payment4.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("");
        boolean boolean10 = institutionalBilling8.pay((double) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        boolean boolean13 = institutionalBilling8.pay((double) 0.0f);
        boolean boolean15 = institutionalBilling8.pay((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        java.util.Date date6 = payment4.getDatePaid();
        double double7 = payment4.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment.strategy.Payment payment12 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy11);
        payment.strategy.PaymentStrategy paymentStrategy16 = null;
        payment.strategy.Payment payment17 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy16);
        int int18 = payment17.getPaymentID();
        boolean boolean19 = payment17.processPayment();
        payment.strategy.CreditCard creditCard22 = new payment.strategy.CreditCard("hi!", "");
        payment17.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        boolean boolean25 = creditCard22.pay(1.0d);
        boolean boolean27 = creditCard22.pay((double) 1);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        int int30 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.PaymentStrategy paymentStrategy14 = null;
        payment7.setPaymentStrategy(paymentStrategy14);
        payment.strategy.InstitutionalBilling institutionalBilling17 = new payment.strategy.InstitutionalBilling("");
        boolean boolean19 = institutionalBilling17.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling17);
        payment.strategy.Payment payment21 = new payment.strategy.Payment((int) (byte) 100, 52, (double) (short) 1, (payment.strategy.PaymentStrategy) institutionalBilling17);
        java.util.Date date22 = payment21.getDatePaid();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy12);
        int int14 = payment13.getPaymentID();
        int int15 = payment13.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling17 = new payment.strategy.InstitutionalBilling("");
        boolean boolean19 = institutionalBilling17.pay((double) 100);
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling17);
        payment.strategy.Payment payment21 = new payment.strategy.Payment(0, (int) (byte) 0, (double) ' ', (payment.strategy.PaymentStrategy) institutionalBilling17);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling17);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        int int17 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        int int9 = payment7.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("");
        boolean boolean13 = institutionalBilling11.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        boolean boolean16 = institutionalBilling11.pay((double) 0.0f);
        payment.strategy.Payment payment17 = new payment.strategy.Payment(100, (int) ' ', 0.0d, (payment.strategy.PaymentStrategy) institutionalBilling11);
        java.lang.Class<?> wildcardClass18 = institutionalBilling11.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean20 = debitCard18.pay((double) 'a');
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        boolean boolean23 = debitCard18.pay((double) 'a');
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        boolean boolean17 = creditCard13.pay(0.0d);
        boolean boolean19 = creditCard13.pay(10.0d);
        boolean boolean21 = creditCard13.pay((double) (short) 1);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("hi!");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        boolean boolean11 = institutionalBilling8.pay((double) 10L);
        java.lang.Class<?> wildcardClass12 = institutionalBilling8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        int int6 = payment4.getPaymentID();
        java.util.Date date7 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        double double7 = payment4.getAmountPaid();
        double double8 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.InstitutionalBilling institutionalBilling14 = new payment.strategy.InstitutionalBilling("");
        boolean boolean16 = institutionalBilling14.pay((double) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling14);
        java.lang.Class<?> wildcardClass18 = institutionalBilling14.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        java.util.Date date8 = payment4.getDatePaid();
        payment.strategy.InstitutionalBilling institutionalBilling10 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean12 = institutionalBilling10.pay(0.0d);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        int int6 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean11 = payment4.processPayment();
        int int12 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.PaymentStrategy paymentStrategy14 = null;
        payment7.setPaymentStrategy(paymentStrategy14);
        payment.strategy.InstitutionalBilling institutionalBilling17 = new payment.strategy.InstitutionalBilling("");
        boolean boolean19 = institutionalBilling17.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling17);
        payment.strategy.Payment payment21 = new payment.strategy.Payment((int) (byte) 100, 52, (double) (short) 1, (payment.strategy.PaymentStrategy) institutionalBilling17);
        boolean boolean23 = institutionalBilling17.pay((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        payment.strategy.CreditCard creditCard5 = new payment.strategy.CreditCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment((int) (short) 10, (int) '4', (-1.0d), (payment.strategy.PaymentStrategy) creditCard5);
        boolean boolean8 = creditCard5.pay(0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        int int9 = payment7.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("");
        boolean boolean13 = institutionalBilling11.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        boolean boolean16 = institutionalBilling11.pay((double) 0.0f);
        payment.strategy.Payment payment17 = new payment.strategy.Payment(100, (int) ' ', 0.0d, (payment.strategy.PaymentStrategy) institutionalBilling11);
        java.util.Date date18 = payment17.getDatePaid();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        boolean boolean15 = payment4.processPayment();
        boolean boolean16 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        java.util.Date date8 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy12);
        int int14 = payment13.getPaymentID();
        java.util.Date date15 = payment13.getDatePaid();
        double double16 = payment13.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy20 = null;
        payment.strategy.Payment payment21 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy20);
        payment.strategy.PaymentStrategy paymentStrategy25 = null;
        payment.strategy.Payment payment26 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy25);
        int int27 = payment26.getPaymentID();
        boolean boolean28 = payment26.processPayment();
        payment.strategy.CreditCard creditCard31 = new payment.strategy.CreditCard("hi!", "");
        payment26.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        boolean boolean34 = creditCard31.pay(1.0d);
        boolean boolean36 = creditCard31.pay((double) 1);
        payment21.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        boolean boolean41 = creditCard31.pay((double) 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        java.util.Date date9 = payment4.getDatePaid();
        boolean boolean10 = payment4.processPayment();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean20 = debitCard18.pay((double) 'a');
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.DebitCard debitCard24 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean26 = debitCard24.pay((-1.0d));
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard24);
        boolean boolean29 = debitCard24.pay((double) (short) 0);
        boolean boolean31 = debitCard24.pay((double) 100);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay((double) 100);
        boolean boolean5 = institutionalBilling1.pay(1.0d);
        boolean boolean7 = institutionalBilling1.pay((double) (-1.0f));
        boolean boolean9 = institutionalBilling1.pay((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        payment.strategy.DebitCard debitCard2 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean4 = debitCard2.pay(100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        boolean boolean18 = debitCard15.pay((double) (byte) 0);
        boolean boolean20 = debitCard15.pay((double) (short) 10);
        boolean boolean22 = debitCard15.pay((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        int int7 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean6 = institutionalBilling4.pay((double) 100);
        boolean boolean8 = institutionalBilling4.pay(1.0d);
        boolean boolean10 = institutionalBilling4.pay((double) (-1.0f));
        payment.strategy.Payment payment11 = new payment.strategy.Payment((int) (byte) 100, (int) (byte) 10, (double) (byte) 10, (payment.strategy.PaymentStrategy) institutionalBilling4);
        java.util.Date date12 = payment11.getDatePaid();
        boolean boolean13 = payment11.processPayment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean11 = payment4.processPayment();
        payment.strategy.PaymentStrategy paymentStrategy15 = null;
        payment.strategy.Payment payment16 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy15);
        java.util.Date date17 = payment16.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy21 = null;
        payment.strategy.Payment payment22 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy21);
        payment.strategy.CreditCard creditCard25 = new payment.strategy.CreditCard("hi!", "");
        payment22.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard25);
        payment16.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard25);
        boolean boolean29 = creditCard25.pay(100.0d);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        int int16 = payment4.getUserID();
        int int17 = payment4.getPaymentID();
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) ' ', 100, (double) 1.0f, paymentStrategy3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("");
        boolean boolean3 = institutionalBilling1.pay(0.0d);
        boolean boolean5 = institutionalBilling1.pay((double) ' ');
        boolean boolean7 = institutionalBilling1.pay((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        java.util.Date date6 = payment4.getDatePaid();
        double double7 = payment4.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment.strategy.Payment payment12 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy11);
        payment.strategy.PaymentStrategy paymentStrategy16 = null;
        payment.strategy.Payment payment17 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy16);
        int int18 = payment17.getPaymentID();
        boolean boolean19 = payment17.processPayment();
        payment.strategy.CreditCard creditCard22 = new payment.strategy.CreditCard("hi!", "");
        payment17.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        boolean boolean25 = creditCard22.pay(1.0d);
        boolean boolean27 = creditCard22.pay((double) 1);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        double double30 = payment4.getAmountPaid();
        int int31 = payment4.getPaymentID();
        boolean boolean32 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        java.util.Date date8 = payment7.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy12);
        payment.strategy.CreditCard creditCard16 = new payment.strategy.CreditCard("hi!", "");
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard16);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard16);
        payment.strategy.DebitCard debitCard21 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean23 = debitCard21.pay((double) 'a');
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard21);
        payment.strategy.DebitCard debitCard27 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean29 = debitCard27.pay((-1.0d));
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard27);
        boolean boolean32 = debitCard27.pay((double) (short) 0);
        boolean boolean34 = debitCard27.pay((-1.0d));
        boolean boolean36 = debitCard27.pay((double) 100);
        payment.strategy.Payment payment37 = new payment.strategy.Payment((int) 'a', (int) ' ', 0.0d, (payment.strategy.PaymentStrategy) debitCard27);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        int int7 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy8);
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.DebitCard debitCard16 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean18 = debitCard16.pay((double) 0.0f);
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        payment.strategy.CreditCard creditCard23 = new payment.strategy.CreditCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard23);
        boolean boolean26 = creditCard23.pay((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("");
        payment.strategy.Payment payment5 = new payment.strategy.Payment((int) (short) 0, 0, (double) (short) 100, (payment.strategy.PaymentStrategy) institutionalBilling4);
        int int6 = payment5.getPaymentID();
        java.lang.Class<?> wildcardClass7 = payment5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        int int8 = payment4.getUserID();
        boolean boolean9 = payment4.processPayment();
        double double10 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.util.Date date13 = payment4.getDatePaid();
        int int14 = payment4.getPaymentID();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        payment.strategy.CreditCard creditCard5 = new payment.strategy.CreditCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment((int) (short) 10, (int) '4', (-1.0d), (payment.strategy.PaymentStrategy) creditCard5);
        java.util.Date date7 = payment6.getDatePaid();
        boolean boolean8 = payment6.processPayment();
        int int9 = payment6.getUserID();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        boolean boolean12 = payment4.processPayment();
        int int13 = payment4.getPaymentID();
        java.util.Date date14 = payment4.getDatePaid();
        java.util.Date date15 = payment4.getDatePaid();
        double double16 = payment4.getAmountPaid();
        int int17 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.Payment payment12 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean17 = debitCard15.pay((double) 'a');
        boolean boolean19 = debitCard15.pay(100.0d);
        boolean boolean21 = debitCard15.pay((double) 1.0f);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        java.util.Date date23 = payment12.getDatePaid();
        int int24 = payment12.getUserID();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("hi!");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        boolean boolean11 = institutionalBilling8.pay((double) (short) 100);
        java.lang.Class<?> wildcardClass12 = institutionalBilling8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        boolean boolean17 = payment4.processPayment();
        int int18 = payment4.getPaymentID();
        java.util.Date date19 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        boolean boolean12 = payment4.processPayment();
        int int13 = payment4.getPaymentID();
        java.util.Date date14 = payment4.getDatePaid();
        java.util.Date date15 = payment4.getDatePaid();
        double double16 = payment4.getAmountPaid();
        double double17 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        boolean boolean8 = payment4.processPayment();
        boolean boolean9 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 0.0f);
        boolean boolean16 = creditCard9.pay(1.0d);
        boolean boolean18 = creditCard9.pay((double) 0L);
        boolean boolean20 = creditCard9.pay(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        java.util.Date date8 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy12);
        int int14 = payment13.getPaymentID();
        java.util.Date date15 = payment13.getDatePaid();
        double double16 = payment13.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy20 = null;
        payment.strategy.Payment payment21 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy20);
        payment.strategy.PaymentStrategy paymentStrategy25 = null;
        payment.strategy.Payment payment26 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy25);
        int int27 = payment26.getPaymentID();
        boolean boolean28 = payment26.processPayment();
        payment.strategy.CreditCard creditCard31 = new payment.strategy.CreditCard("hi!", "");
        payment26.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        boolean boolean34 = creditCard31.pay(1.0d);
        boolean boolean36 = creditCard31.pay((double) 1);
        payment21.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        java.util.Date date40 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(date40);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.PaymentStrategy paymentStrategy14 = null;
        payment7.setPaymentStrategy(paymentStrategy14);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.PaymentStrategy paymentStrategy23 = null;
        payment.strategy.Payment payment24 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy23);
        int int25 = payment24.getPaymentID();
        boolean boolean26 = payment24.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling28 = new payment.strategy.InstitutionalBilling("hi!");
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling28);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling28);
        payment.strategy.Payment payment31 = new payment.strategy.Payment((int) (short) 10, (int) (short) 1, (double) 1.0f, (payment.strategy.PaymentStrategy) institutionalBilling28);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        int int17 = payment4.getPaymentID();
        java.util.Date date18 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        payment.strategy.DebitCard debitCard2 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean4 = debitCard2.pay((double) 10);
        boolean boolean6 = debitCard2.pay((double) 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        int int5 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        java.util.Date date9 = payment4.getDatePaid();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        int int14 = payment4.getPaymentID();
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy8);
        java.util.Date date10 = payment9.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy14 = null;
        payment.strategy.Payment payment15 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy14);
        payment.strategy.CreditCard creditCard18 = new payment.strategy.CreditCard("hi!", "");
        payment15.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard18);
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard18);
        payment.strategy.DebitCard debitCard23 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean25 = debitCard23.pay((double) 'a');
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard23);
        payment.strategy.DebitCard debitCard29 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean31 = debitCard29.pay((-1.0d));
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard29);
        boolean boolean34 = debitCard29.pay((double) (short) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard29);
        boolean boolean37 = debitCard29.pay((double) (-1));
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) 0, 0, (double) (byte) 100, paymentStrategy3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean15 = creditCard12.pay(1.0d);
        boolean boolean17 = creditCard12.pay((double) 0.0f);
        payment.strategy.Payment payment18 = new payment.strategy.Payment((int) (byte) 1, 100, (double) 100.0f, (payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean20 = creditCard12.pay((double) 97);
        boolean boolean22 = creditCard12.pay((-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.util.Date date13 = payment4.getDatePaid();
        int int14 = payment4.getUserID();
        java.util.Date date15 = payment4.getDatePaid();
        int int16 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        int int9 = payment4.getUserID();
        boolean boolean10 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        java.util.Date date6 = payment4.getDatePaid();
        double double7 = payment4.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment.strategy.Payment payment12 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy11);
        payment.strategy.PaymentStrategy paymentStrategy16 = null;
        payment.strategy.Payment payment17 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy16);
        int int18 = payment17.getPaymentID();
        boolean boolean19 = payment17.processPayment();
        payment.strategy.CreditCard creditCard22 = new payment.strategy.CreditCard("hi!", "");
        payment17.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        boolean boolean25 = creditCard22.pay(1.0d);
        boolean boolean27 = creditCard22.pay((double) 1);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        double double30 = payment4.getAmountPaid();
        int int31 = payment4.getUserID();
        int int32 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean7 = debitCard5.pay((double) 'a');
        boolean boolean9 = debitCard5.pay(100.0d);
        payment.strategy.Payment payment10 = new payment.strategy.Payment((int) '#', (int) (short) 100, (double) 52, (payment.strategy.PaymentStrategy) debitCard5);
        boolean boolean12 = debitCard5.pay((double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        boolean boolean17 = payment4.processPayment();
        int int18 = payment4.getPaymentID();
        int int19 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean20 = debitCard18.pay((double) 'a');
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.DebitCard debitCard24 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean26 = debitCard24.pay((-1.0d));
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard24);
        boolean boolean29 = debitCard24.pay((double) (short) 100);
        boolean boolean31 = debitCard24.pay((double) 52);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("");
        boolean boolean6 = institutionalBilling4.pay((double) 100);
        boolean boolean8 = institutionalBilling4.pay((double) 1);
        payment.strategy.Payment payment9 = new payment.strategy.Payment(0, (int) (byte) -1, (double) 10, (payment.strategy.PaymentStrategy) institutionalBilling4);
        java.util.Date date10 = payment9.getDatePaid();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        payment.strategy.CreditCard creditCard5 = new payment.strategy.CreditCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment((int) (short) 10, (int) '4', (-1.0d), (payment.strategy.PaymentStrategy) creditCard5);
        java.util.Date date7 = payment6.getDatePaid();
        boolean boolean8 = payment6.processPayment();
        boolean boolean9 = payment6.processPayment();
        boolean boolean10 = payment6.processPayment();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        boolean boolean15 = payment4.processPayment();
        payment.strategy.PaymentStrategy paymentStrategy19 = null;
        payment.strategy.Payment payment20 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy19);
        int int21 = payment20.getPaymentID();
        boolean boolean22 = payment20.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling24 = new payment.strategy.InstitutionalBilling("hi!");
        payment20.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling24);
        boolean boolean27 = institutionalBilling24.pay((-1.0d));
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling24);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        int int6 = payment4.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("");
        boolean boolean10 = institutionalBilling8.pay((double) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        java.util.Date date12 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.Payment payment12 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard10);
        int int13 = payment12.getUserID();
        int int14 = payment12.getPaymentID();
        double double15 = payment12.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        int int7 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        int int9 = payment7.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("");
        boolean boolean13 = institutionalBilling11.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        payment.strategy.Payment payment15 = new payment.strategy.Payment(0, (int) (byte) 0, (double) ' ', (payment.strategy.PaymentStrategy) institutionalBilling11);
        java.lang.Class<?> wildcardClass16 = institutionalBilling11.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        double double6 = payment4.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy10 = null;
        payment.strategy.Payment payment11 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy10);
        java.util.Date date12 = payment11.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy16 = null;
        payment.strategy.Payment payment17 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy16);
        payment.strategy.CreditCard creditCard20 = new payment.strategy.CreditCard("hi!", "");
        payment17.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard20);
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard20);
        payment.strategy.DebitCard debitCard25 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean27 = debitCard25.pay((double) 'a');
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment.strategy.DebitCard debitCard31 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean33 = debitCard31.pay((-1.0d));
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard31);
        boolean boolean36 = debitCard31.pay((double) (short) -1);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard31);
        int int38 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        payment.strategy.CreditCard creditCard5 = new payment.strategy.CreditCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment((int) (short) 10, (int) '4', (-1.0d), (payment.strategy.PaymentStrategy) creditCard5);
        java.util.Date date7 = payment6.getDatePaid();
        boolean boolean8 = payment6.processPayment();
        java.util.Date date9 = payment6.getDatePaid();
        int int10 = payment6.getPaymentID();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getUserID();
        boolean boolean12 = payment4.processPayment();
        payment.strategy.PaymentStrategy paymentStrategy16 = null;
        payment.strategy.Payment payment17 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy16);
        int int18 = payment17.getPaymentID();
        boolean boolean19 = payment17.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling21 = new payment.strategy.InstitutionalBilling("hi!");
        payment17.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling21);
        boolean boolean24 = institutionalBilling21.pay((double) 10L);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling21);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 0.0f);
        boolean boolean16 = creditCard9.pay(1.0d);
        boolean boolean18 = creditCard9.pay((double) (byte) 1);
        boolean boolean20 = creditCard9.pay((double) ' ');
        java.lang.Class<?> wildcardClass21 = creditCard9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(35, (int) (short) 1, (double) 1.0f, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.PaymentStrategy paymentStrategy14 = null;
        payment7.setPaymentStrategy(paymentStrategy14);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        boolean boolean21 = debitCard18.pay((double) (byte) 0);
        boolean boolean23 = debitCard18.pay((double) (short) 100);
        boolean boolean25 = debitCard18.pay((double) (short) 1);
        payment.strategy.Payment payment26 = new payment.strategy.Payment(1, (int) (byte) -1, (double) 1, (payment.strategy.PaymentStrategy) debitCard18);
        boolean boolean27 = payment26.processPayment();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        java.util.Date date8 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy12);
        int int14 = payment13.getPaymentID();
        java.util.Date date15 = payment13.getDatePaid();
        double double16 = payment13.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy20 = null;
        payment.strategy.Payment payment21 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy20);
        payment.strategy.PaymentStrategy paymentStrategy25 = null;
        payment.strategy.Payment payment26 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy25);
        int int27 = payment26.getPaymentID();
        boolean boolean28 = payment26.processPayment();
        payment.strategy.CreditCard creditCard31 = new payment.strategy.CreditCard("hi!", "");
        payment26.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        boolean boolean34 = creditCard31.pay(1.0d);
        boolean boolean36 = creditCard31.pay((double) 1);
        payment21.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment.strategy.CreditCard creditCard42 = new payment.strategy.CreditCard("hi!", "hi!");
        boolean boolean44 = creditCard42.pay((double) (byte) 1);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment(32, 35, (double) (short) 10, (payment.strategy.PaymentStrategy) debitCard5);
        double double7 = payment6.getAmountPaid();
        double double8 = payment6.getAmountPaid();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        int int6 = payment4.getPaymentID();
        double double7 = payment4.getAmountPaid();
        int int8 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        int int16 = payment4.getUserID();
        double double17 = payment4.getAmountPaid();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy8);
        int int10 = payment9.getPaymentID();
        boolean boolean11 = payment9.processPayment();
        payment.strategy.CreditCard creditCard14 = new payment.strategy.CreditCard("hi!", "");
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        boolean boolean17 = creditCard14.pay(1.0d);
        boolean boolean19 = creditCard14.pay((double) 1);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        int int21 = payment4.getPaymentID();
        boolean boolean22 = payment4.processPayment();
        double double23 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean15 = creditCard12.pay(1.0d);
        boolean boolean17 = creditCard12.pay((double) 0.0f);
        payment.strategy.Payment payment18 = new payment.strategy.Payment((int) (short) 0, (int) (byte) 0, (double) (short) 100, (payment.strategy.PaymentStrategy) creditCard12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("");
        boolean boolean6 = institutionalBilling4.pay((double) 100);
        boolean boolean8 = institutionalBilling4.pay((double) 1);
        payment.strategy.Payment payment9 = new payment.strategy.Payment(0, (int) (byte) -1, (double) 10, (payment.strategy.PaymentStrategy) institutionalBilling4);
        double double10 = payment9.getAmountPaid();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("hi!");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        boolean boolean10 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean11 = payment4.processPayment();
        java.util.Date date12 = payment4.getDatePaid();
        payment.strategy.CreditCard creditCard15 = new payment.strategy.CreditCard("hi!", "hi!");
        boolean boolean17 = creditCard15.pay((double) (byte) 1);
        boolean boolean19 = creditCard15.pay((double) 35);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard15);
        int int21 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        java.util.Date date6 = payment4.getDatePaid();
        double double7 = payment4.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment.strategy.Payment payment12 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy11);
        payment.strategy.PaymentStrategy paymentStrategy16 = null;
        payment.strategy.Payment payment17 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy16);
        int int18 = payment17.getPaymentID();
        boolean boolean19 = payment17.processPayment();
        payment.strategy.CreditCard creditCard22 = new payment.strategy.CreditCard("hi!", "");
        payment17.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        boolean boolean25 = creditCard22.pay(1.0d);
        boolean boolean27 = creditCard22.pay((double) 1);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        boolean boolean30 = payment4.processPayment();
        java.util.Date date31 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(date31);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        double double6 = payment4.getAmountPaid();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        int int11 = payment4.getUserID();
        double double12 = payment4.getAmountPaid();
        double double13 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean11 = payment4.processPayment();
        int int12 = payment4.getUserID();
        int int13 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean7 = debitCard5.pay((double) 0.0f);
        boolean boolean9 = debitCard5.pay((-1.0d));
        boolean boolean11 = debitCard5.pay((double) (byte) 0);
        payment.strategy.Payment payment12 = new payment.strategy.Payment((int) (byte) -1, (int) (short) 10, (double) 1, (payment.strategy.PaymentStrategy) debitCard5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean20 = debitCard18.pay((double) 'a');
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.DebitCard debitCard24 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean26 = debitCard24.pay((-1.0d));
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard24);
        boolean boolean29 = debitCard24.pay((double) (short) 0);
        boolean boolean31 = debitCard24.pay((double) ' ');
        java.lang.Class<?> wildcardClass32 = debitCard24.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean7 = debitCard5.pay((-1.0d));
        payment.strategy.Payment payment8 = new payment.strategy.Payment((int) '#', (int) 'a', 100.0d, (payment.strategy.PaymentStrategy) debitCard5);
        int int9 = payment8.getUserID();
        int int10 = payment8.getUserID();
        boolean boolean11 = payment8.processPayment();
        java.util.Date date12 = payment8.getDatePaid();
        boolean boolean13 = payment8.processPayment();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(date12);
// flaky "1) test142(randoop_test.payment.strategy.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Sat Aug 01 07:36:40 EDT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy8);
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.DebitCard debitCard16 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean18 = debitCard16.pay((double) 0.0f);
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        java.util.Date date21 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        java.util.Date date8 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy12);
        int int14 = payment13.getPaymentID();
        java.util.Date date15 = payment13.getDatePaid();
        double double16 = payment13.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy20 = null;
        payment.strategy.Payment payment21 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy20);
        payment.strategy.PaymentStrategy paymentStrategy25 = null;
        payment.strategy.Payment payment26 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy25);
        int int27 = payment26.getPaymentID();
        boolean boolean28 = payment26.processPayment();
        payment.strategy.CreditCard creditCard31 = new payment.strategy.CreditCard("hi!", "");
        payment26.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        boolean boolean34 = creditCard31.pay(1.0d);
        boolean boolean36 = creditCard31.pay((double) 1);
        payment21.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard31);
        boolean boolean40 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay((double) 100);
        boolean boolean5 = institutionalBilling1.pay(1.0d);
        boolean boolean7 = institutionalBilling1.pay((double) (-1.0f));
        boolean boolean9 = institutionalBilling1.pay((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        java.util.Date date6 = payment4.getDatePaid();
        java.util.Date date7 = payment4.getDatePaid();
        int int8 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay((double) 100);
        boolean boolean5 = institutionalBilling1.pay((double) (short) 0);
        boolean boolean7 = institutionalBilling1.pay((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean15 = creditCard12.pay(1.0d);
        boolean boolean17 = creditCard12.pay((double) 0.0f);
        payment.strategy.Payment payment18 = new payment.strategy.Payment((int) (short) 10, 10, (double) (short) -1, (payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean20 = creditCard12.pay(1.0d);
        boolean boolean22 = creditCard12.pay((double) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        java.util.Date date8 = payment7.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy12);
        int int14 = payment13.getPaymentID();
        boolean boolean15 = payment13.processPayment();
        payment.strategy.CreditCard creditCard18 = new payment.strategy.CreditCard("hi!", "");
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard18);
        boolean boolean21 = creditCard18.pay(1.0d);
        boolean boolean23 = creditCard18.pay((double) 1);
        boolean boolean25 = creditCard18.pay((double) (byte) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard18);
        payment.strategy.Payment payment27 = new payment.strategy.Payment((int) (byte) 10, (int) (short) 0, (double) (short) 1, (payment.strategy.PaymentStrategy) creditCard18);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.processPayment();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("");
        payment.strategy.Payment payment5 = new payment.strategy.Payment((int) (short) 0, 0, (double) (short) 100, (payment.strategy.PaymentStrategy) institutionalBilling4);
        int int6 = payment5.getPaymentID();
        double double7 = payment5.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        payment.strategy.CreditCard creditCard2 = new payment.strategy.CreditCard("hi!", "hi!");
        boolean boolean4 = creditCard2.pay((double) (byte) 1);
        boolean boolean6 = creditCard2.pay((double) (short) 0);
        boolean boolean8 = creditCard2.pay((double) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.Payment payment12 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard10);
        int int13 = payment12.getPaymentID();
        boolean boolean14 = payment12.processPayment();
        payment.strategy.PaymentStrategy paymentStrategy21 = null;
        payment.strategy.Payment payment22 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy21);
        payment.strategy.CreditCard creditCard25 = new payment.strategy.CreditCard("hi!", "");
        payment22.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard25);
        payment.strategy.Payment payment27 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard25);
        int int28 = payment27.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy32 = null;
        payment.strategy.Payment payment33 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy32);
        int int34 = payment33.getPaymentID();
        boolean boolean35 = payment33.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling37 = new payment.strategy.InstitutionalBilling("hi!");
        payment33.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling37);
        boolean boolean40 = institutionalBilling37.pay((-1.0d));
        payment27.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling37);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling37);
        java.lang.Class<?> wildcardClass43 = institutionalBilling37.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean6 = institutionalBilling4.pay((double) 100);
        boolean boolean8 = institutionalBilling4.pay(1.0d);
        boolean boolean10 = institutionalBilling4.pay((double) (-1.0f));
        payment.strategy.Payment payment11 = new payment.strategy.Payment((int) (byte) 100, (int) (byte) 10, (double) (byte) 10, (payment.strategy.PaymentStrategy) institutionalBilling4);
        java.util.Date date12 = payment11.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy19 = null;
        payment.strategy.Payment payment20 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy19);
        payment.strategy.CreditCard creditCard23 = new payment.strategy.CreditCard("hi!", "");
        payment20.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard23);
        payment.strategy.Payment payment25 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard23);
        int int26 = payment25.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy30 = null;
        payment.strategy.Payment payment31 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy30);
        int int32 = payment31.getPaymentID();
        boolean boolean33 = payment31.processPayment();
        payment.strategy.CreditCard creditCard36 = new payment.strategy.CreditCard("hi!", "");
        payment31.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        boolean boolean39 = creditCard36.pay(1.0d);
        boolean boolean41 = creditCard36.pay((double) 0.0f);
        payment25.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        int int44 = payment11.getPaymentID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        boolean boolean12 = debitCard7.pay((double) '4');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean15 = creditCard12.pay(1.0d);
        boolean boolean17 = creditCard12.pay((double) 0.0f);
        payment.strategy.Payment payment18 = new payment.strategy.Payment((int) (short) 10, 10, (double) (short) -1, (payment.strategy.PaymentStrategy) creditCard12);
        int int19 = payment18.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy23 = null;
        payment.strategy.Payment payment24 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy23);
        java.util.Date date25 = payment24.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy29 = null;
        payment.strategy.Payment payment30 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy29);
        payment.strategy.CreditCard creditCard33 = new payment.strategy.CreditCard("hi!", "");
        payment30.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard33);
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard33);
        payment.strategy.DebitCard debitCard38 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean40 = debitCard38.pay((double) 'a');
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard38);
        payment.strategy.DebitCard debitCard44 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean46 = debitCard44.pay((-1.0d));
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard44);
        boolean boolean49 = debitCard44.pay((double) (short) -1);
        payment18.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard44);
        boolean boolean51 = payment18.processPayment();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        java.util.Date date6 = payment4.getDatePaid();
        int int7 = payment4.getUserID();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.DebitCard debitCard14 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean16 = debitCard14.pay((double) 0.0f);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard14);
        payment.strategy.PaymentStrategy paymentStrategy21 = null;
        payment.strategy.Payment payment22 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy21);
        payment.strategy.DebitCard debitCard25 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean27 = debitCard25.pay((double) 0.0f);
        payment22.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment.strategy.Payment payment30 = new payment.strategy.Payment((int) (byte) 1, (int) (byte) 10, (double) 0.0f, (payment.strategy.PaymentStrategy) debitCard25);
        double double31 = payment30.getAmountPaid();
        java.lang.Class<?> wildcardClass32 = payment30.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        payment.strategy.DebitCard debitCard2 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean4 = debitCard2.pay((double) 0.0f);
        boolean boolean6 = debitCard2.pay((-1.0d));
        java.lang.Class<?> wildcardClass7 = debitCard2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        java.util.Date date6 = payment4.getDatePaid();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("");
        boolean boolean10 = institutionalBilling8.pay((double) 100);
        boolean boolean12 = institutionalBilling8.pay((double) 1);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment(32, 35, (double) (short) 10, (payment.strategy.PaymentStrategy) debitCard5);
        double double7 = payment6.getAmountPaid();
        payment.strategy.InstitutionalBilling institutionalBilling9 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean11 = institutionalBilling9.pay((double) 100);
        boolean boolean13 = institutionalBilling9.pay((double) (short) 0);
        payment6.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling9);
        boolean boolean16 = institutionalBilling9.pay((double) (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        boolean boolean18 = debitCard15.pay((double) (byte) 0);
        boolean boolean20 = debitCard15.pay((double) (short) 100);
        boolean boolean22 = debitCard15.pay((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 1);
        boolean boolean16 = creditCard9.pay(100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(35, (int) (short) 1, (double) 1.0f, paymentStrategy3);
        boolean boolean5 = payment4.processPayment();
        double double6 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        int int11 = payment10.getPaymentID();
        boolean boolean12 = payment10.processPayment();
        payment.strategy.CreditCard creditCard15 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard15);
        payment.strategy.PaymentStrategy paymentStrategy17 = null;
        payment10.setPaymentStrategy(paymentStrategy17);
        payment.strategy.DebitCard debitCard21 = new payment.strategy.DebitCard("", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard21);
        boolean boolean24 = debitCard21.pay((double) (byte) 0);
        boolean boolean26 = debitCard21.pay((double) (short) 100);
        boolean boolean28 = debitCard21.pay((double) (short) 1);
        payment.strategy.Payment payment29 = new payment.strategy.Payment(1, (int) (byte) -1, (double) 1, (payment.strategy.PaymentStrategy) debitCard21);
        payment.strategy.Payment payment30 = new payment.strategy.Payment(100, (int) (short) 100, (double) (short) 0, (payment.strategy.PaymentStrategy) debitCard21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        java.util.Date date8 = payment7.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy12);
        payment.strategy.CreditCard creditCard16 = new payment.strategy.CreditCard("hi!", "");
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard16);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard16);
        boolean boolean20 = creditCard16.pay(0.0d);
        payment.strategy.Payment payment21 = new payment.strategy.Payment((int) (short) 1, 100, (double) 100, (payment.strategy.PaymentStrategy) creditCard16);
        java.lang.Class<?> wildcardClass22 = creditCard16.getClass();
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean6 = institutionalBilling4.pay((double) 100);
        boolean boolean8 = institutionalBilling4.pay(1.0d);
        boolean boolean10 = institutionalBilling4.pay((double) (-1.0f));
        payment.strategy.Payment payment11 = new payment.strategy.Payment((int) (byte) 100, (int) (byte) 10, (double) (byte) 10, (payment.strategy.PaymentStrategy) institutionalBilling4);
        payment.strategy.PaymentStrategy paymentStrategy18 = null;
        payment.strategy.Payment payment19 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy18);
        payment.strategy.CreditCard creditCard22 = new payment.strategy.CreditCard("hi!", "");
        payment19.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        payment.strategy.Payment payment24 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard22);
        int int25 = payment24.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy29 = null;
        payment.strategy.Payment payment30 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy29);
        int int31 = payment30.getPaymentID();
        boolean boolean32 = payment30.processPayment();
        payment.strategy.CreditCard creditCard35 = new payment.strategy.CreditCard("hi!", "");
        payment30.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard35);
        boolean boolean38 = creditCard35.pay(1.0d);
        boolean boolean40 = creditCard35.pay((double) 0.0f);
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard35);
        boolean boolean43 = creditCard35.pay((double) (short) 1);
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean20 = debitCard18.pay((double) 'a');
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.DebitCard debitCard24 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean26 = debitCard24.pay((-1.0d));
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard24);
        boolean boolean29 = debitCard24.pay((double) (short) -1);
        boolean boolean31 = debitCard24.pay(1.0d);
        boolean boolean33 = debitCard24.pay((double) (short) 10);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy8);
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.DebitCard debitCard16 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean18 = debitCard16.pay((double) 0.0f);
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        payment.strategy.CreditCard creditCard23 = new payment.strategy.CreditCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard23);
        int int25 = payment4.getUserID();
        int int26 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        java.util.Date date6 = payment4.getDatePaid();
        double double7 = payment4.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment.strategy.Payment payment12 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy11);
        payment.strategy.PaymentStrategy paymentStrategy16 = null;
        payment.strategy.Payment payment17 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy16);
        int int18 = payment17.getPaymentID();
        boolean boolean19 = payment17.processPayment();
        payment.strategy.CreditCard creditCard22 = new payment.strategy.CreditCard("hi!", "");
        payment17.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        boolean boolean25 = creditCard22.pay(1.0d);
        boolean boolean27 = creditCard22.pay((double) 1);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard22);
        double double30 = payment4.getAmountPaid();
        int int31 = payment4.getPaymentID();
        double double32 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        java.util.Date date11 = payment4.getDatePaid();
        boolean boolean12 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.PaymentStrategy paymentStrategy19 = null;
        payment.strategy.Payment payment20 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy19);
        java.util.Date date21 = payment20.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy25 = null;
        payment.strategy.Payment payment26 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy25);
        payment.strategy.CreditCard creditCard29 = new payment.strategy.CreditCard("hi!", "");
        payment26.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard29);
        payment20.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard29);
        boolean boolean33 = creditCard29.pay(0.0d);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard29);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        payment.strategy.DebitCard debitCard2 = new payment.strategy.DebitCard("hi!", "hi!");
        boolean boolean4 = debitCard2.pay((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        int int9 = payment7.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("");
        boolean boolean13 = institutionalBilling11.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        payment.strategy.Payment payment15 = new payment.strategy.Payment((int) (byte) 1, 0, (double) 100L, (payment.strategy.PaymentStrategy) institutionalBilling11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        payment.strategy.CreditCard creditCard5 = new payment.strategy.CreditCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment((int) (short) 10, (int) '4', (-1.0d), (payment.strategy.PaymentStrategy) creditCard5);
        boolean boolean8 = creditCard5.pay((double) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        payment.strategy.CreditCard creditCard5 = new payment.strategy.CreditCard("", "hi!");
        payment.strategy.Payment payment6 = new payment.strategy.Payment((int) (byte) 0, (int) (short) 1, (double) 97, (payment.strategy.PaymentStrategy) creditCard5);
        boolean boolean8 = creditCard5.pay((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        boolean boolean15 = payment4.processPayment();
        int int16 = payment4.getPaymentID();
        boolean boolean17 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(35, (int) (short) 1, (double) 1.0f, paymentStrategy3);
        boolean boolean5 = payment4.processPayment();
        int int6 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean11 = payment4.processPayment();
        payment.strategy.CreditCard creditCard14 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        int int16 = payment4.getUserID();
        int int17 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getUserID();
        double double12 = payment4.getAmountPaid();
        int int13 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        payment.strategy.CreditCard creditCard2 = new payment.strategy.CreditCard("hi!", "");
        boolean boolean4 = creditCard2.pay((double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean6 = institutionalBilling4.pay((double) 100);
        boolean boolean8 = institutionalBilling4.pay(1.0d);
        boolean boolean10 = institutionalBilling4.pay((double) (-1.0f));
        payment.strategy.Payment payment11 = new payment.strategy.Payment((int) (byte) 100, (int) (byte) 10, (double) (byte) 10, (payment.strategy.PaymentStrategy) institutionalBilling4);
        java.util.Date date12 = payment11.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy19 = null;
        payment.strategy.Payment payment20 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy19);
        payment.strategy.CreditCard creditCard23 = new payment.strategy.CreditCard("hi!", "");
        payment20.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard23);
        payment.strategy.Payment payment25 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard23);
        int int26 = payment25.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy30 = null;
        payment.strategy.Payment payment31 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy30);
        int int32 = payment31.getPaymentID();
        boolean boolean33 = payment31.processPayment();
        payment.strategy.CreditCard creditCard36 = new payment.strategy.CreditCard("hi!", "");
        payment31.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        boolean boolean39 = creditCard36.pay(1.0d);
        boolean boolean41 = creditCard36.pay((double) 0.0f);
        payment25.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        boolean boolean45 = creditCard36.pay((double) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.util.Date date13 = payment4.getDatePaid();
        int int14 = payment4.getUserID();
        boolean boolean15 = payment4.processPayment();
        int int16 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean11 = payment4.processPayment();
        payment.strategy.CreditCard creditCard14 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        boolean boolean16 = payment4.processPayment();
        boolean boolean17 = payment4.processPayment();
        int int18 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        boolean boolean17 = creditCard13.pay(0.0d);
        boolean boolean19 = creditCard13.pay(10.0d);
        java.lang.Class<?> wildcardClass20 = creditCard13.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        java.util.Date date8 = payment7.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy12 = null;
        payment.strategy.Payment payment13 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy12);
        payment.strategy.CreditCard creditCard16 = new payment.strategy.CreditCard("hi!", "");
        payment13.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard16);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard16);
        payment.strategy.DebitCard debitCard21 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean23 = debitCard21.pay((double) 'a');
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard21);
        payment.strategy.DebitCard debitCard27 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean29 = debitCard27.pay((-1.0d));
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard27);
        boolean boolean32 = debitCard27.pay((double) (short) -1);
        boolean boolean34 = debitCard27.pay(1.0d);
        payment.strategy.Payment payment35 = new payment.strategy.Payment((int) (byte) 1, (int) (short) 100, (double) (-1.0f), (payment.strategy.PaymentStrategy) debitCard27);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        int int9 = payment7.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("");
        boolean boolean13 = institutionalBilling11.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        boolean boolean16 = institutionalBilling11.pay((double) 0.0f);
        payment.strategy.Payment payment17 = new payment.strategy.Payment((int) ' ', 0, (double) 10L, (payment.strategy.PaymentStrategy) institutionalBilling11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean15 = creditCard12.pay(1.0d);
        boolean boolean17 = creditCard12.pay((double) 0.0f);
        payment.strategy.Payment payment18 = new payment.strategy.Payment((int) (short) 10, 10, (double) (short) -1, (payment.strategy.PaymentStrategy) creditCard12);
        int int19 = payment18.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy23 = null;
        payment.strategy.Payment payment24 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy23);
        java.util.Date date25 = payment24.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy29 = null;
        payment.strategy.Payment payment30 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy29);
        payment.strategy.CreditCard creditCard33 = new payment.strategy.CreditCard("hi!", "");
        payment30.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard33);
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard33);
        payment.strategy.DebitCard debitCard38 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean40 = debitCard38.pay((double) 'a');
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard38);
        payment.strategy.DebitCard debitCard44 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean46 = debitCard44.pay((-1.0d));
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard44);
        boolean boolean49 = debitCard44.pay((double) (short) -1);
        payment18.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard44);
        boolean boolean52 = debitCard44.pay((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("");
        boolean boolean3 = institutionalBilling1.pay(0.0d);
        boolean boolean5 = institutionalBilling1.pay((double) ' ');
        boolean boolean7 = institutionalBilling1.pay((double) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        payment.strategy.CreditCard creditCard2 = new payment.strategy.CreditCard("hi!", "hi!");
        boolean boolean4 = creditCard2.pay((double) (byte) 1);
        boolean boolean6 = creditCard2.pay((double) 35);
        java.lang.Class<?> wildcardClass7 = creditCard2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("hi!");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        boolean boolean14 = institutionalBilling11.pay((-1.0d));
        payment.strategy.Payment payment15 = new payment.strategy.Payment((-1), (int) 'a', (double) '#', (payment.strategy.PaymentStrategy) institutionalBilling11);
        java.lang.Class<?> wildcardClass16 = payment15.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.Payment payment12 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean17 = debitCard15.pay((double) 'a');
        boolean boolean19 = debitCard15.pay(100.0d);
        boolean boolean21 = debitCard15.pay((double) 1.0f);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        boolean boolean24 = debitCard15.pay((double) 10L);
        boolean boolean26 = debitCard15.pay((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.InstitutionalBilling institutionalBilling14 = new payment.strategy.InstitutionalBilling("");
        boolean boolean16 = institutionalBilling14.pay((double) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling14);
        int int18 = payment4.getPaymentID();
        java.util.Date date19 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy8);
        java.util.Date date10 = payment9.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy14 = null;
        payment.strategy.Payment payment15 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy14);
        payment.strategy.CreditCard creditCard18 = new payment.strategy.CreditCard("hi!", "");
        payment15.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard18);
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard18);
        payment.strategy.DebitCard debitCard23 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean25 = debitCard23.pay((double) 'a');
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard23);
        payment.strategy.DebitCard debitCard29 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean31 = debitCard29.pay((-1.0d));
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard29);
        boolean boolean34 = debitCard29.pay((double) (short) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard29);
        boolean boolean36 = payment4.processPayment();
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment(32, 35, (double) (short) 10, (payment.strategy.PaymentStrategy) debitCard5);
        double double7 = payment6.getAmountPaid();
        int int8 = payment6.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment6.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        boolean boolean8 = payment4.processPayment();
        int int9 = payment4.getPaymentID();
        boolean boolean10 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean6 = institutionalBilling4.pay((double) 100);
        boolean boolean8 = institutionalBilling4.pay(1.0d);
        boolean boolean10 = institutionalBilling4.pay((double) (-1.0f));
        payment.strategy.Payment payment11 = new payment.strategy.Payment((int) (byte) 100, (int) (byte) 10, (double) (byte) 10, (payment.strategy.PaymentStrategy) institutionalBilling4);
        java.util.Date date12 = payment11.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy19 = null;
        payment.strategy.Payment payment20 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy19);
        payment.strategy.CreditCard creditCard23 = new payment.strategy.CreditCard("hi!", "");
        payment20.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard23);
        payment.strategy.Payment payment25 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard23);
        int int26 = payment25.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy30 = null;
        payment.strategy.Payment payment31 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy30);
        int int32 = payment31.getPaymentID();
        boolean boolean33 = payment31.processPayment();
        payment.strategy.CreditCard creditCard36 = new payment.strategy.CreditCard("hi!", "");
        payment31.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        boolean boolean39 = creditCard36.pay(1.0d);
        boolean boolean41 = creditCard36.pay((double) 0.0f);
        payment25.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard36);
        payment.strategy.DebitCard debitCard49 = new payment.strategy.DebitCard("hi!", "");
        payment.strategy.Payment payment50 = new payment.strategy.Payment(32, 35, (double) (short) 10, (payment.strategy.PaymentStrategy) debitCard49);
        double double51 = payment50.getAmountPaid();
        payment.strategy.InstitutionalBilling institutionalBilling53 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean55 = institutionalBilling53.pay((double) 100);
        boolean boolean57 = institutionalBilling53.pay((double) (short) 0);
        payment50.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling53);
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling53);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean11 = payment4.processPayment();
        payment.strategy.CreditCard creditCard14 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        int int16 = payment4.getUserID();
        int int17 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.util.Date date13 = payment4.getDatePaid();
        int int14 = payment4.getPaymentID();
        boolean boolean15 = payment4.processPayment();
        boolean boolean16 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        payment.strategy.CreditCard creditCard2 = new payment.strategy.CreditCard("hi!", "hi!");
        boolean boolean4 = creditCard2.pay((double) (byte) 1);
        boolean boolean6 = creditCard2.pay((double) 35);
        boolean boolean8 = creditCard2.pay((double) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        boolean boolean8 = payment4.processPayment();
        double double9 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.PaymentStrategy paymentStrategy14 = null;
        payment7.setPaymentStrategy(paymentStrategy14);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.PaymentStrategy paymentStrategy23 = null;
        payment.strategy.Payment payment24 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy23);
        int int25 = payment24.getPaymentID();
        boolean boolean26 = payment24.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling28 = new payment.strategy.InstitutionalBilling("hi!");
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling28);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling28);
        payment.strategy.Payment payment31 = new payment.strategy.Payment((int) (byte) 1, 0, (double) (short) -1, (payment.strategy.PaymentStrategy) institutionalBilling28);
        payment.strategy.PaymentStrategy paymentStrategy35 = null;
        payment.strategy.Payment payment36 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy35);
        int int37 = payment36.getPaymentID();
        boolean boolean38 = payment36.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling40 = new payment.strategy.InstitutionalBilling("hi!");
        payment36.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling40);
        boolean boolean43 = institutionalBilling40.pay((double) 10L);
        payment31.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        int int6 = payment4.getPaymentID();
        int int7 = payment4.getUserID();
        double double8 = payment4.getAmountPaid();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getUserID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        java.util.Date date8 = payment4.getDatePaid();
        double double9 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment(32, 35, (double) (short) 10, (payment.strategy.PaymentStrategy) debitCard5);
        int int7 = payment6.getPaymentID();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        boolean boolean7 = payment4.processPayment();
        double double8 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean20 = debitCard18.pay((double) 'a');
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.DebitCard debitCard24 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean26 = debitCard24.pay((-1.0d));
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard24);
        boolean boolean29 = debitCard24.pay((double) 0L);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        boolean boolean18 = debitCard15.pay((double) (byte) 0);
        boolean boolean20 = debitCard15.pay((double) (short) 10);
        boolean boolean22 = debitCard15.pay((double) 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy8);
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.DebitCard debitCard16 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean18 = debitCard16.pay((double) 0.0f);
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        int int21 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        payment.strategy.CreditCard creditCard5 = new payment.strategy.CreditCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment((int) (short) 10, (int) '4', (-1.0d), (payment.strategy.PaymentStrategy) creditCard5);
        java.util.Date date7 = payment6.getDatePaid();
        boolean boolean8 = payment6.processPayment();
        java.util.Date date9 = payment6.getDatePaid();
        java.util.Date date10 = payment6.getDatePaid();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay((double) 100);
        boolean boolean5 = institutionalBilling1.pay(1.0d);
        boolean boolean7 = institutionalBilling1.pay((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment(32, 35, (double) (short) 10, (payment.strategy.PaymentStrategy) debitCard5);
        double double7 = payment6.getAmountPaid();
        payment.strategy.InstitutionalBilling institutionalBilling9 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean11 = institutionalBilling9.pay((double) 100);
        boolean boolean13 = institutionalBilling9.pay((double) (short) 0);
        payment6.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling9);
        int int15 = payment6.getPaymentID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean15 = creditCard12.pay(1.0d);
        boolean boolean17 = creditCard12.pay((double) 0.0f);
        payment.strategy.Payment payment18 = new payment.strategy.Payment((int) (short) 10, 10, (double) (short) -1, (payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean20 = creditCard12.pay((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.Payment payment15 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard13);
        int int16 = payment15.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy20 = null;
        payment.strategy.Payment payment21 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy20);
        int int22 = payment21.getPaymentID();
        boolean boolean23 = payment21.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling25 = new payment.strategy.InstitutionalBilling("hi!");
        payment21.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling25);
        boolean boolean28 = institutionalBilling25.pay((-1.0d));
        payment15.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling25);
        payment.strategy.PaymentStrategy paymentStrategy33 = null;
        payment.strategy.Payment payment34 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy33);
        int int35 = payment34.getPaymentID();
        java.util.Date date36 = payment34.getDatePaid();
        double double37 = payment34.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy41 = null;
        payment.strategy.Payment payment42 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy41);
        payment.strategy.PaymentStrategy paymentStrategy46 = null;
        payment.strategy.Payment payment47 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy46);
        int int48 = payment47.getPaymentID();
        boolean boolean49 = payment47.processPayment();
        payment.strategy.CreditCard creditCard52 = new payment.strategy.CreditCard("hi!", "");
        payment47.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard52);
        boolean boolean55 = creditCard52.pay(1.0d);
        boolean boolean57 = creditCard52.pay((double) 1);
        payment42.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard52);
        payment34.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard52);
        double double60 = payment34.getAmountPaid();
        payment.strategy.PaymentStrategy paymentStrategy64 = null;
        payment.strategy.Payment payment65 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy64);
        int int66 = payment65.getPaymentID();
        boolean boolean67 = payment65.processPayment();
        payment.strategy.CreditCard creditCard70 = new payment.strategy.CreditCard("hi!", "");
        payment65.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard70);
        payment.strategy.PaymentStrategy paymentStrategy72 = null;
        payment65.setPaymentStrategy(paymentStrategy72);
        payment.strategy.InstitutionalBilling institutionalBilling75 = new payment.strategy.InstitutionalBilling("");
        boolean boolean77 = institutionalBilling75.pay((double) 100);
        payment65.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling75);
        payment34.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling75);
        boolean boolean81 = institutionalBilling75.pay((double) 10.0f);
        payment15.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling75);
        payment.strategy.Payment payment83 = new payment.strategy.Payment(0, (int) (byte) 100, (double) 1L, (payment.strategy.PaymentStrategy) institutionalBilling75);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        int int9 = payment7.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("");
        boolean boolean13 = institutionalBilling11.pay((double) 100);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        payment.strategy.Payment payment15 = new payment.strategy.Payment(0, (int) (byte) 0, (double) ' ', (payment.strategy.PaymentStrategy) institutionalBilling11);
        int int16 = payment15.getUserID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        java.util.Date date12 = payment7.getDatePaid();
        payment.strategy.CreditCard creditCard15 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard15);
        payment.strategy.Payment payment17 = new payment.strategy.Payment(100, (int) (short) 1, (double) 10.0f, (payment.strategy.PaymentStrategy) creditCard15);
        boolean boolean19 = creditCard15.pay((double) 52);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean12 = creditCard9.pay(1.0d);
        boolean boolean14 = creditCard9.pay((double) 1);
        boolean boolean16 = creditCard9.pay((double) (byte) 100);
        boolean boolean18 = creditCard9.pay((double) (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        payment.strategy.CreditCard creditCard5 = new payment.strategy.CreditCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment((int) (short) 10, (int) '4', (-1.0d), (payment.strategy.PaymentStrategy) creditCard5);
        java.util.Date date7 = payment6.getDatePaid();
        boolean boolean8 = payment6.processPayment();
        int int9 = payment6.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling11 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean13 = institutionalBilling11.pay((double) 100);
        boolean boolean15 = institutionalBilling11.pay(1.0d);
        payment6.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling11);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        boolean boolean17 = creditCard13.pay(0.0d);
        boolean boolean19 = creditCard13.pay((double) (short) 10);
        java.lang.Class<?> wildcardClass20 = creditCard13.getClass();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        payment.strategy.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.strategy.DebitCard debitCard15 = new payment.strategy.DebitCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard15);
        boolean boolean18 = debitCard15.pay((double) (byte) 0);
        boolean boolean20 = debitCard15.pay((double) (short) 0);
        boolean boolean22 = debitCard15.pay((double) '4');
        boolean boolean24 = debitCard15.pay(10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay(10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment.strategy.DebitCard debitCard18 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean20 = debitCard18.pay((double) 'a');
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard18);
        payment.strategy.DebitCard debitCard24 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean26 = debitCard24.pay((-1.0d));
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard24);
        boolean boolean29 = debitCard24.pay((double) (short) 0);
        boolean boolean31 = debitCard24.pay((double) 0.0f);
        boolean boolean33 = debitCard24.pay((double) 1);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        boolean boolean12 = payment4.processPayment();
        int int13 = payment4.getPaymentID();
        double double14 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        payment.strategy.CreditCard creditCard13 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard13);
        boolean boolean17 = creditCard13.pay(0.0d);
        boolean boolean19 = creditCard13.pay(10.0d);
        boolean boolean21 = creditCard13.pay(1.0d);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.DebitCard debitCard14 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean16 = debitCard14.pay((double) 0.0f);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard14);
        payment.strategy.PaymentStrategy paymentStrategy21 = null;
        payment.strategy.Payment payment22 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy21);
        payment.strategy.DebitCard debitCard25 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean27 = debitCard25.pay((double) 0.0f);
        payment22.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment.strategy.Payment payment30 = new payment.strategy.Payment((int) (byte) 1, (int) (byte) 10, (double) 0.0f, (payment.strategy.PaymentStrategy) debitCard25);
        double double31 = payment30.getAmountPaid();
        java.util.Date date32 = payment30.getDatePaid();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(date32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay(0.0d);
        boolean boolean5 = institutionalBilling1.pay(100.0d);
        boolean boolean7 = institutionalBilling1.pay((double) 10);
        boolean boolean9 = institutionalBilling1.pay((double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        payment.strategy.PaymentStrategy paymentStrategy18 = null;
        payment.strategy.Payment payment19 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy18);
        payment.strategy.DebitCard debitCard22 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean24 = debitCard22.pay((double) 0.0f);
        payment19.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard22);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard22);
        java.lang.Class<?> wildcardClass27 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        payment.strategy.InstitutionalBilling institutionalBilling7 = new payment.strategy.InstitutionalBilling("");
        payment.strategy.Payment payment8 = new payment.strategy.Payment((int) (short) 0, 0, (double) (short) 100, (payment.strategy.PaymentStrategy) institutionalBilling7);
        boolean boolean10 = institutionalBilling7.pay((double) 52);
        payment.strategy.Payment payment11 = new payment.strategy.Payment((-1), (int) (short) 0, (double) (byte) 10, (payment.strategy.PaymentStrategy) institutionalBilling7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.CreditCard creditCard9 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard9);
        boolean boolean11 = payment4.processPayment();
        java.util.Date date12 = payment4.getDatePaid();
        payment.strategy.CreditCard creditCard15 = new payment.strategy.CreditCard("hi!", "hi!");
        boolean boolean17 = creditCard15.pay((double) (byte) 1);
        boolean boolean19 = creditCard15.pay((double) 35);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard15);
        java.lang.Class<?> wildcardClass21 = creditCard15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        boolean boolean5 = payment4.processPayment();
        boolean boolean6 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.DebitCard debitCard14 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean16 = debitCard14.pay((double) 0.0f);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard14);
        payment.strategy.PaymentStrategy paymentStrategy21 = null;
        payment.strategy.Payment payment22 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy21);
        payment.strategy.DebitCard debitCard25 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean27 = debitCard25.pay((double) 0.0f);
        payment22.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment.strategy.Payment payment30 = new payment.strategy.Payment((int) (byte) 1, (int) (byte) 10, (double) 0.0f, (payment.strategy.PaymentStrategy) debitCard25);
        java.lang.Class<?> wildcardClass31 = payment30.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.DebitCard debitCard14 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean16 = debitCard14.pay((double) 0.0f);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard14);
        payment.strategy.PaymentStrategy paymentStrategy21 = null;
        payment.strategy.Payment payment22 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy21);
        payment.strategy.DebitCard debitCard25 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean27 = debitCard25.pay((double) 0.0f);
        payment22.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard25);
        payment.strategy.Payment payment30 = new payment.strategy.Payment((int) (byte) 1, (int) (byte) 10, (double) 0.0f, (payment.strategy.PaymentStrategy) debitCard25);
        double double31 = payment30.getAmountPaid();
        int int32 = payment30.getUserID();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        java.util.Date date12 = payment7.getDatePaid();
        payment.strategy.CreditCard creditCard15 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard15);
        payment.strategy.Payment payment17 = new payment.strategy.Payment(100, (int) (short) 1, (double) 10.0f, (payment.strategy.PaymentStrategy) creditCard15);
        boolean boolean18 = payment17.processPayment();
        boolean boolean19 = payment17.processPayment();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        java.util.Date date7 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.CreditCard creditCard7 = new payment.strategy.CreditCard("hi!", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard7);
        payment.strategy.DebitCard debitCard11 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean13 = debitCard11.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard11);
        double double15 = payment4.getAmountPaid();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        java.util.Date date5 = payment4.getDatePaid();
        java.util.Date date6 = payment4.getDatePaid();
        double double7 = payment4.getAmountPaid();
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay(0.0d);
        boolean boolean5 = institutionalBilling1.pay((double) 97);
        java.lang.Class<?> wildcardClass6 = institutionalBilling1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.Payment payment12 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard10);
        int int13 = payment12.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy17 = null;
        payment.strategy.Payment payment18 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy17);
        int int19 = payment18.getPaymentID();
        boolean boolean20 = payment18.processPayment();
        payment.strategy.CreditCard creditCard23 = new payment.strategy.CreditCard("hi!", "");
        payment18.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard23);
        boolean boolean26 = creditCard23.pay(1.0d);
        boolean boolean28 = creditCard23.pay((double) 0.0f);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard23);
        boolean boolean31 = creditCard23.pay((double) (short) 1);
        java.lang.Class<?> wildcardClass32 = creditCard23.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy9);
        int int11 = payment10.getPaymentID();
        boolean boolean12 = payment10.processPayment();
        payment.strategy.CreditCard creditCard15 = new payment.strategy.CreditCard("hi!", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard15);
        payment.strategy.PaymentStrategy paymentStrategy17 = null;
        payment10.setPaymentStrategy(paymentStrategy17);
        payment.strategy.DebitCard debitCard21 = new payment.strategy.DebitCard("", "");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard21);
        boolean boolean24 = debitCard21.pay((double) (byte) 0);
        boolean boolean26 = debitCard21.pay((double) (short) 100);
        boolean boolean28 = debitCard21.pay((double) (short) 1);
        boolean boolean30 = debitCard21.pay((double) (short) 0);
        payment.strategy.Payment payment31 = new payment.strategy.Payment((int) (short) 0, 35, (double) 100, (payment.strategy.PaymentStrategy) debitCard21);
        payment.strategy.Payment payment32 = new payment.strategy.Payment(10, (int) (short) 1, (double) 52, (payment.strategy.PaymentStrategy) debitCard21);
        int int33 = payment32.getUserID();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        int int6 = payment4.getPaymentID();
        payment.strategy.InstitutionalBilling institutionalBilling8 = new payment.strategy.InstitutionalBilling("");
        boolean boolean10 = institutionalBilling8.pay((double) 100);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling8);
        payment.strategy.PaymentStrategy paymentStrategy15 = null;
        payment.strategy.Payment payment16 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy15);
        int int17 = payment16.getPaymentID();
        boolean boolean18 = payment16.processPayment();
        payment.strategy.CreditCard creditCard21 = new payment.strategy.CreditCard("hi!", "");
        payment16.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard21);
        payment.strategy.PaymentStrategy paymentStrategy23 = null;
        payment16.setPaymentStrategy(paymentStrategy23);
        payment.strategy.InstitutionalBilling institutionalBilling26 = new payment.strategy.InstitutionalBilling("");
        boolean boolean28 = institutionalBilling26.pay((double) 100);
        payment16.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling26);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        boolean boolean5 = payment4.processPayment();
        java.util.Date date6 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("");
        boolean boolean3 = institutionalBilling1.pay((double) 100);
        java.lang.Class<?> wildcardClass4 = institutionalBilling1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy8);
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.DebitCard debitCard16 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean18 = debitCard16.pay((double) 0.0f);
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard16);
        payment.strategy.CreditCard creditCard23 = new payment.strategy.CreditCard("", "");
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard23);
        java.util.Date date25 = payment4.getDatePaid();
        int int26 = payment4.getPaymentID();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        payment.strategy.PaymentStrategy paymentStrategy14 = null;
        payment7.setPaymentStrategy(paymentStrategy14);
        java.util.Date date16 = payment7.getDatePaid();
        int int17 = payment7.getUserID();
        boolean boolean18 = payment7.processPayment();
        payment.strategy.PaymentStrategy paymentStrategy25 = null;
        payment.strategy.Payment payment26 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy25);
        payment.strategy.CreditCard creditCard29 = new payment.strategy.CreditCard("hi!", "");
        payment26.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard29);
        payment.strategy.Payment payment31 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard29);
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard29);
        payment.strategy.Payment payment33 = new payment.strategy.Payment((int) (short) 0, (int) (short) 100, (double) 10, (payment.strategy.PaymentStrategy) creditCard29);
        int int34 = payment33.getUserID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay(0.0d);
        boolean boolean5 = institutionalBilling1.pay(100.0d);
        boolean boolean7 = institutionalBilling1.pay((double) 10);
        boolean boolean9 = institutionalBilling1.pay((double) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        int int11 = payment4.getPaymentID();
        int int12 = payment4.getUserID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        payment.strategy.CreditCard creditCard10 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard10);
        payment.strategy.Payment payment12 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard10);
        int int13 = payment12.getPaymentID();
        boolean boolean14 = payment12.processPayment();
        payment.strategy.PaymentStrategy paymentStrategy21 = null;
        payment.strategy.Payment payment22 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy21);
        payment.strategy.CreditCard creditCard25 = new payment.strategy.CreditCard("hi!", "");
        payment22.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard25);
        payment.strategy.Payment payment27 = new payment.strategy.Payment((int) ' ', (int) (byte) 100, 0.0d, (payment.strategy.PaymentStrategy) creditCard25);
        int int28 = payment27.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy32 = null;
        payment.strategy.Payment payment33 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy32);
        int int34 = payment33.getPaymentID();
        boolean boolean35 = payment33.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling37 = new payment.strategy.InstitutionalBilling("hi!");
        payment33.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling37);
        boolean boolean40 = institutionalBilling37.pay((-1.0d));
        payment27.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling37);
        payment12.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling37);
        int int43 = payment12.getUserID();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        java.util.Date date6 = payment4.getDatePaid();
        double double7 = payment4.getAmountPaid();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        payment.strategy.InstitutionalBilling institutionalBilling1 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean3 = institutionalBilling1.pay((double) 100);
        boolean boolean5 = institutionalBilling1.pay((double) (byte) -1);
        boolean boolean7 = institutionalBilling1.pay((double) 32);
        boolean boolean9 = institutionalBilling1.pay((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("hi!", "");
        payment.strategy.Payment payment6 = new payment.strategy.Payment(32, 35, (double) (short) 10, (payment.strategy.PaymentStrategy) debitCard5);
        double double7 = payment6.getAmountPaid();
        payment.strategy.InstitutionalBilling institutionalBilling9 = new payment.strategy.InstitutionalBilling("hi!");
        boolean boolean11 = institutionalBilling9.pay((double) 100);
        boolean boolean13 = institutionalBilling9.pay((double) (short) 0);
        payment6.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling9);
        boolean boolean16 = institutionalBilling9.pay((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        boolean boolean7 = payment4.processPayment();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        payment.strategy.CreditCard creditCard2 = new payment.strategy.CreditCard("hi!", "hi!");
        boolean boolean4 = creditCard2.pay((double) (byte) 1);
        boolean boolean6 = creditCard2.pay((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = creditCard2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean15 = creditCard12.pay(1.0d);
        boolean boolean17 = creditCard12.pay((double) 0.0f);
        payment.strategy.Payment payment18 = new payment.strategy.Payment((int) (short) -1, 35, (double) '4', (payment.strategy.PaymentStrategy) creditCard12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        payment.strategy.PaymentStrategy paymentStrategy9 = null;
        payment.strategy.Payment payment10 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy9);
        int int11 = payment10.getPaymentID();
        boolean boolean12 = payment10.processPayment();
        payment.strategy.InstitutionalBilling institutionalBilling14 = new payment.strategy.InstitutionalBilling("hi!");
        payment10.setPaymentStrategy((payment.strategy.PaymentStrategy) institutionalBilling14);
        boolean boolean17 = institutionalBilling14.pay((-1.0d));
        payment.strategy.Payment payment18 = new payment.strategy.Payment((-1), (int) 'a', (double) '#', (payment.strategy.PaymentStrategy) institutionalBilling14);
        boolean boolean20 = institutionalBilling14.pay((double) (byte) -1);
        payment.strategy.Payment payment21 = new payment.strategy.Payment(35, 100, (double) (-1.0f), (payment.strategy.PaymentStrategy) institutionalBilling14);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        payment.strategy.InstitutionalBilling institutionalBilling4 = new payment.strategy.InstitutionalBilling("");
        payment.strategy.Payment payment5 = new payment.strategy.Payment((int) (short) 0, 0, (double) (short) 100, (payment.strategy.PaymentStrategy) institutionalBilling4);
        boolean boolean7 = institutionalBilling4.pay((double) 52);
        boolean boolean9 = institutionalBilling4.pay((double) 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy3);
        int int5 = payment4.getPaymentID();
        boolean boolean6 = payment4.processPayment();
        payment.strategy.PaymentStrategy paymentStrategy10 = null;
        payment.strategy.Payment payment11 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy10);
        int int12 = payment11.getPaymentID();
        boolean boolean13 = payment11.processPayment();
        payment.strategy.CreditCard creditCard16 = new payment.strategy.CreditCard("hi!", "");
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard16);
        payment.strategy.PaymentStrategy paymentStrategy18 = null;
        payment11.setPaymentStrategy(paymentStrategy18);
        payment.strategy.DebitCard debitCard22 = new payment.strategy.DebitCard("", "");
        payment11.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard22);
        boolean boolean25 = debitCard22.pay((double) (byte) 0);
        boolean boolean27 = debitCard22.pay((double) (short) 100);
        boolean boolean29 = debitCard22.pay((double) (short) 1);
        boolean boolean31 = debitCard22.pay((double) 1);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard22);
        int int33 = payment4.getPaymentID();
        int int34 = payment4.getUserID();
        boolean boolean35 = payment4.processPayment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        payment.strategy.DebitCard debitCard5 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean7 = debitCard5.pay((double) 'a');
        boolean boolean9 = debitCard5.pay(100.0d);
        payment.strategy.Payment payment10 = new payment.strategy.Payment((int) '#', (int) (short) 100, (double) 52, (payment.strategy.PaymentStrategy) debitCard5);
        boolean boolean11 = payment10.processPayment();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy3);
        payment.strategy.PaymentStrategy paymentStrategy8 = null;
        payment.strategy.Payment payment9 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy8);
        int int10 = payment9.getPaymentID();
        boolean boolean11 = payment9.processPayment();
        payment.strategy.CreditCard creditCard14 = new payment.strategy.CreditCard("hi!", "");
        payment9.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        boolean boolean17 = creditCard14.pay(1.0d);
        boolean boolean19 = creditCard14.pay((double) 1);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard14);
        int int21 = payment4.getPaymentID();
        java.util.Date date22 = payment4.getDatePaid();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        payment.strategy.PaymentStrategy paymentStrategy6 = null;
        payment.strategy.Payment payment7 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy6);
        int int8 = payment7.getPaymentID();
        boolean boolean9 = payment7.processPayment();
        payment.strategy.CreditCard creditCard12 = new payment.strategy.CreditCard("hi!", "");
        payment7.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard12);
        boolean boolean15 = creditCard12.pay(1.0d);
        boolean boolean17 = creditCard12.pay((double) 0.0f);
        payment.strategy.Payment payment18 = new payment.strategy.Payment((int) (short) 10, 10, (double) (short) -1, (payment.strategy.PaymentStrategy) creditCard12);
        int int19 = payment18.getUserID();
        payment.strategy.PaymentStrategy paymentStrategy23 = null;
        payment.strategy.Payment payment24 = new payment.strategy.Payment((int) (byte) -1, (int) '#', (double) (byte) 10, paymentStrategy23);
        java.util.Date date25 = payment24.getDatePaid();
        payment.strategy.PaymentStrategy paymentStrategy29 = null;
        payment.strategy.Payment payment30 = new payment.strategy.Payment(1, 1, 0.0d, paymentStrategy29);
        payment.strategy.CreditCard creditCard33 = new payment.strategy.CreditCard("hi!", "");
        payment30.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard33);
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) creditCard33);
        payment.strategy.DebitCard debitCard38 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean40 = debitCard38.pay((double) 'a');
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard38);
        payment.strategy.DebitCard debitCard44 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean46 = debitCard44.pay((-1.0d));
        payment24.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard44);
        boolean boolean49 = debitCard44.pay((double) (short) -1);
        payment18.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard44);
        boolean boolean52 = debitCard44.pay((double) 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        payment.strategy.PaymentStrategy paymentStrategy3 = null;
        payment.strategy.Payment payment4 = new payment.strategy.Payment((int) (short) 0, (int) '4', (-1.0d), paymentStrategy3);
        payment.strategy.DebitCard debitCard7 = new payment.strategy.DebitCard("", "hi!");
        boolean boolean9 = debitCard7.pay((double) 0.0f);
        payment4.setPaymentStrategy((payment.strategy.PaymentStrategy) debitCard7);
        java.lang.Class<?> wildcardClass11 = debitCard7.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}
