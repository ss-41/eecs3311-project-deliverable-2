package controller;

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
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((int) (short) 0, (int) '4', (int) (byte) 0, (double) ' ', localDateTime5, localDateTime6);
// flaky "1) test001(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) (byte) -1, (int) ' ', (int) 'a', (double) (short) 0, localDateTime7, localDateTime8);
// flaky "2) test002(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "1) test002(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) '#', (int) (short) 100, 0, (double) 0.0f, localDateTime5, localDateTime6);
// flaky "3) test003(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) (byte) 100, (int) (short) -1, (-1), (double) 'a', localDateTime7, localDateTime8);
// flaky "4) test004(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "2) test004(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.lang.Class<?> wildcardClass3 = systemFacade0.getClass();
// flaky "5) test005(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) '#', (int) (short) 1, (int) '#', (double) 1, localDateTime5, localDateTime6);
// flaky "6) test006(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((int) (short) 100, (int) (short) 100, (int) (short) 1, (double) (byte) -1, localDateTime5, localDateTime6);
// flaky "7) test007(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.lang.Class<?> wildcardClass5 = systemFacade0.getClass();
// flaky "8) test008(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "3) test008(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.lang.Class<?> wildcardClass1 = bookingController0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) '4', (int) '4', (int) (byte) 10, (double) 100, localDateTime5, localDateTime6);
// flaky "9) test010(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (byte) 0, (int) '4', (int) (byte) 100, (double) (short) 10, localDateTime5, localDateTime6);
// flaky "10) test011(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) -1, (int) (byte) -1, (double) (short) 1, localDateTime11, localDateTime12);
// flaky "11) test012(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "4) test012(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "1) test012(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "1) test012(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        controller.AccountController accountController0 = new controller.AccountController();
        java.lang.Class<?> wildcardClass1 = accountController0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.lang.Class<?> wildcardClass7 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.lang.Class<?> wildcardClass1 = systemFacade0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        controller.RoomController roomController0 = new controller.RoomController();
        java.lang.Class<?> wildcardClass1 = roomController0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (short) 100, (int) ' ', (int) (short) 100, (double) 'a', localDateTime5, localDateTime6);
// flaky "12) test017(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) (short) -1, (int) (byte) 10, (int) (short) 1, (double) 1L, localDateTime7, localDateTime8);
// flaky "13) test018(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "5) test018(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = systemFacade0.bookRoom((int) '4', (int) (short) 0, (int) (byte) 10, 1.0d, localDateTime15, localDateTime16);
// flaky "14) test019(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "6) test019(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "2) test019(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "2) test019(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "1) test019(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "1) test019(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom(10, (int) (byte) 1, 0, (double) '#', localDateTime13, localDateTime14);
// flaky "15) test020(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "7) test020(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "3) test020(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "3) test020(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "2) test020(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((-1), 100, (int) (byte) 100, (double) 0L, localDateTime7, localDateTime8);
// flaky "16) test021(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "8) test021(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.lang.Class<?> wildcardClass11 = systemFacade0.getClass();
// flaky "17) test022(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "9) test022(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "4) test022(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "4) test022(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "3) test022(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        java.lang.Class<?> wildcardClass11 = roomController0.getClass();
// flaky "18) test024(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "10) test024(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "5) test024(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "5) test024(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "4) test024(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (short) 100, (int) (short) 100, (int) (short) 0, (double) 0.0f, localDateTime5, localDateTime6);
// flaky "19) test025(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) '4', (int) '#', 0, 0.0d, localDateTime7, localDateTime8);
// flaky "20) test026(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "11) test026(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) '#', (int) (byte) 10, (int) (short) -1, (double) (short) -1, localDateTime13, localDateTime14);
// flaky "21) test027(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "12) test027(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "6) test027(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "6) test027(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "5) test027(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = systemFacade0.bookRoom((int) '#', (int) (short) 10, (int) '#', (double) 10.0f, localDateTime15, localDateTime16);
// flaky "22) test028(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "13) test028(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "7) test028(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "7) test028(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "6) test028(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "2) test028(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) (short) 1, (int) (byte) 10, (int) (short) 1, (double) 1, localDateTime13, localDateTime14);
// flaky "23) test029(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "14) test029(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "8) test029(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "8) test029(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "7) test029(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking((int) (short) 100, 10, (int) (byte) 10, (double) 100, localDateTime12, localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom(100, 1, (int) (short) 0, (double) 10.0f, localDateTime7, localDateTime8);
// flaky "24) test031(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "15) test031(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        java.lang.Class<?> wildcardClass9 = roomController0.getClass();
// flaky "25) test032(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "16) test032(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "9) test032(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "9) test032(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) '#', 100, (int) (byte) 10, (double) (-1L), localDateTime5, localDateTime6);
// flaky "26) test033(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) (byte) 0, (-1), (int) (byte) -1, (double) ' ', localDateTime13, localDateTime14);
// flaky "27) test034(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "17) test034(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "10) test034(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "10) test034(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "8) test034(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.lang.Class<?> wildcardClass9 = systemFacade0.getClass();
// flaky "28) test035(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "18) test035(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "11) test035(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "11) test035(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = systemFacade0.bookRoom((int) (byte) 1, 0, (int) (byte) 1, (double) 1L, localDateTime9, localDateTime10);
// flaky "29) test036(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "19) test036(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "12) test036(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        controller.PaymentController paymentController0 = new controller.PaymentController();
        java.lang.Class<?> wildcardClass1 = paymentController0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        java.lang.Class<?> wildcardClass5 = roomController0.getClass();
// flaky "30) test038(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "20) test038(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = systemFacade0.bookRoom((int) (byte) 0, (int) (short) 0, (int) (byte) 100, (double) (short) -1, localDateTime17, localDateTime18);
// flaky "31) test039(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "21) test039(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "13) test039(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "12) test039(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "9) test039(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "3) test039(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "1) test039(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = systemFacade0.bookRoom(1, 0, (int) ' ', (double) 10L, localDateTime11, localDateTime12);
// flaky "32) test040(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "22) test040(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "14) test040(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "13) test040(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        java.lang.Class<?> wildcardClass7 = roomController0.getClass();
// flaky "33) test041(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "23) test041(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "15) test041(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = systemFacade0.bookRoom((int) (short) 10, (int) (short) 10, (int) '4', 0.0d, localDateTime9, localDateTime10);
// flaky "34) test042(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "24) test042(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "16) test042(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        java.lang.Class<?> wildcardClass13 = systemFacade0.getClass();
// flaky "35) test043(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "25) test043(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "17) test043(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "14) test043(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "10) test043(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "4) test043(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        java.lang.Class<?> wildcardClass15 = systemFacade0.getClass();
// flaky "36) test044(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "26) test044(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "18) test044(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "15) test044(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "11) test044(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "5) test044(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "2) test044(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = systemFacade0.bookRoom((int) ' ', (int) (byte) -1, (int) (short) 10, (double) (byte) 10, localDateTime9, localDateTime10);
// flaky "37) test045(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "27) test045(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "19) test045(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = systemFacade0.bookRoom((int) (short) -1, (int) (short) 10, 0, (double) 0, localDateTime17, localDateTime18);
// flaky "38) test046(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "28) test046(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "20) test046(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "16) test046(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "12) test046(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "6) test046(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "3) test046(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.lang.Class<?> wildcardClass23 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        java.lang.Class<?> wildcardClass17 = roomController0.getClass();
// flaky "39) test048(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "29) test048(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "21) test048(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "17) test048(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "13) test048(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "7) test048(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "4) test048(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "1) test048(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom(1, (int) (byte) 0, 0, (double) (-1L), localDateTime5, localDateTime6);
// flaky "40) test049(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((int) (short) 0, (int) (byte) 1, (int) (byte) 100, (double) (short) 0, localDateTime5, localDateTime6);
// flaky "41) test050(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = systemFacade0.bookRoom((-1), 0, (int) (short) 10, (double) (short) 0, localDateTime11, localDateTime12);
// flaky "42) test051(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "30) test051(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "22) test051(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "18) test051(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((int) (byte) 100, 10, (int) (byte) 10, (double) 0L, localDateTime5, localDateTime6);
// flaky "43) test052(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (byte) 1, 100, (int) (short) 10, 0.0d, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = systemFacade0.bookRoom(0, (int) (byte) 100, (-1), 10.0d, localDateTime22, localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = systemFacade0.bookRoom((int) (short) 1, (int) ' ', (-1), 0.0d, localDateTime5, localDateTime6);
        java.lang.Class<?> wildcardClass8 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) 10, (int) '4', 0, (double) 'a', localDateTime26, localDateTime27);
        java.lang.Class<?> wildcardClass29 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (short) -1, (int) ' ', (int) (byte) -1, (double) 0, localDateTime5, localDateTime6);
// flaky "44) test056(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (short) 10, 10, (int) ' ', 100.0d, localDateTime5, localDateTime6);
// flaky "45) test057(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) (byte) 0, (int) (byte) -1, 0, 10.0d, localDateTime7, localDateTime8);
// flaky "46) test058(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "31) test058(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) (short) 100, (int) (byte) 100, (int) (short) -1, (double) '4', localDateTime13, localDateTime14);
// flaky "47) test059(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "32) test059(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "23) test059(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "19) test059(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "14) test059(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = systemFacade0.bookRoom((int) (short) -1, 10, (int) (byte) 1, 100.0d, localDateTime11, localDateTime12);
// flaky "48) test060(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "33) test060(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "24) test060(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "20) test060(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom(1, (int) 'a', (int) (short) 10, 0.0d, localDateTime13, localDateTime14);
// flaky "49) test061(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "34) test061(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "25) test061(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "21) test061(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "15) test061(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((-1), (int) (byte) -1, (int) (short) 1, (double) (short) 10, localDateTime5, localDateTime6);
// flaky "50) test062(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        java.lang.Class<?> wildcardClass15 = roomController0.getClass();
// flaky "51) test063(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "35) test063(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "26) test063(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "22) test063(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "16) test063(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "8) test063(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "5) test063(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        java.lang.Class<?> wildcardClass27 = roomController0.getClass();
// flaky "52) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "36) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "27) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "23) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "17) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "9) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "6) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "2) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "1) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "1) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "1) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "1) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "1) test064(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (-1), 1, (double) (-1L), localDateTime5, localDateTime6);
// flaky "53) test065(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = systemFacade0.bookRoom((int) (short) 0, (int) (byte) 1, (int) '#', 1.0d, localDateTime15, localDateTime16);
// flaky "54) test066(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "37) test066(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "28) test066(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "24) test066(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "18) test066(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "10) test066(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) (byte) -1, (int) (short) 10, 0, (double) (-1L), localDateTime13, localDateTime14);
// flaky "55) test067(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "38) test067(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "29) test067(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "25) test067(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "19) test067(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (short) -1, (int) (byte) 10, (int) '4', (double) 1.0f, localDateTime5, localDateTime6);
// flaky "56) test068(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) 'a', (int) (short) 100, (int) (short) -1, (double) (byte) 10, localDateTime13, localDateTime14);
// flaky "57) test069(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "39) test069(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "30) test069(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "26) test069(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "20) test069(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking((int) (short) 1, (int) (byte) 0, 0, (double) '#', localDateTime12, localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (byte) 0, (int) (byte) 10, 0.0d, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) '4', (int) (short) 0, (double) (byte) 1, localDateTime12, localDateTime13);
        java.lang.Class<?> wildcardClass15 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, (int) 'a', 10, (double) (short) -1, localDateTime33, localDateTime34);
        java.lang.Class<?> wildcardClass36 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) (short) 10, (-1), (-1), (double) (byte) 0, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) '4', (int) (byte) 0, (int) ' ', 100.0d, localDateTime18, localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, (int) 'a', 10, (double) (short) -1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) '#', 100, (int) (short) -1, (-1.0d), localDateTime40, localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = systemFacade0.bookRoom(10, (int) (byte) 1, (int) (short) 0, (double) '#', localDateTime19, localDateTime20);
// flaky "58) test075(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "40) test075(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "31) test075(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "27) test075(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "21) test075(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "11) test075(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "7) test075(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "3) test075(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, (int) 'a', 10, (double) (short) -1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) '#', 1, (int) ' ', (double) (short) 0, localDateTime40, localDateTime41);
        java.lang.Class<?> wildcardClass43 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        java.lang.Class<?> wildcardClass25 = roomController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = systemFacade0.bookRoom((int) (byte) 10, (int) (short) 0, (int) (byte) 0, 10.0d, localDateTime7, localDateTime8);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = systemFacade0.bookRoom((int) (byte) 1, 0, 0, (double) 100.0f, localDateTime14, localDateTime15);
        java.lang.Class<?> wildcardClass17 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (short) 10, (int) (byte) 0, (int) (byte) -1, (double) (short) 10, localDateTime15, localDateTime16);
        dataModels.Room room18 = null;
        boolean boolean19 = systemFacade0.deleteRoom(room18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = systemFacade0.bookRoom((int) (short) 100, (int) (short) -1, 100, (double) (byte) -1, localDateTime24, localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = systemFacade0.bookRoom((int) (byte) 10, (int) (short) 0, (int) (byte) 0, 10.0d, localDateTime7, localDateTime8);
        dataModels.Room room10 = null;
        boolean boolean11 = systemFacade0.deleteRoom(room10);
        java.lang.Class<?> wildcardClass12 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = systemFacade0.bookRoom((int) (short) -1, (int) ' ', (int) (short) 10, (double) (byte) 1, localDateTime17, localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) -1, (int) 'a', (double) (byte) 10, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom((int) (byte) -1, (int) (short) 0, 0, (double) 1L, localDateTime34, localDateTime35);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = systemFacade0.bookRoom((int) (byte) -1, 100, (int) (short) 10, (double) (-1), localDateTime41, localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((-1), (int) (byte) 1, (int) (byte) -1, (double) (short) 100, localDateTime40, localDateTime41);
        java.lang.Class<?> wildcardClass43 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) 1, (int) '4', (double) (byte) -1, localDateTime23, localDateTime24);
        dataModels.Room room26 = null;
        boolean boolean27 = systemFacade0.deleteRoom(room26);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = systemFacade0.bookRoom(0, (int) (short) 1, (int) (short) 0, (double) '#', localDateTime32, localDateTime33);
        dataModels.Room room35 = null;
        boolean boolean36 = systemFacade0.deleteRoom(room35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (short) -1, (int) (byte) 1, 0, (double) (short) 10, localDateTime5, localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 1, (double) 0, localDateTime17, localDateTime18);
        dataModels.Room room20 = null;
        boolean boolean21 = systemFacade0.deleteRoom(room20);
        java.lang.Class<?> wildcardClass22 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(0, 1, (int) (short) 100, (double) (byte) 0, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) ' ', (int) '4', (-1.0d), localDateTime26, localDateTime27);
        java.lang.Class<?> wildcardClass29 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) (byte) -1, (int) '#', (int) (short) 100, (double) 100.0f, localDateTime27, localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((-1), 0, (int) (short) 1, (double) ' ', localDateTime25, localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (short) 10, (int) (byte) 0, (int) (byte) -1, (double) (short) 10, localDateTime15, localDateTime16);
        dataModels.Room room18 = null;
        boolean boolean19 = systemFacade0.deleteRoom(room18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = systemFacade0.bookRoom((int) (byte) 10, (int) (short) 10, (int) (byte) 100, (double) (short) 0, localDateTime24, localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) -1, (int) 'a', (double) (byte) 10, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom((int) (byte) -1, (int) (short) 0, 0, (double) 1L, localDateTime34, localDateTime35);
        java.lang.Class<?> wildcardClass37 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) '4', 10, (int) (short) -1, (double) (short) 0, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom((-1), (int) (short) -1, (int) (byte) 0, (double) 10.0f, localDateTime34, localDateTime35);
        dataModels.Room room37 = null;
        boolean boolean38 = systemFacade0.deleteRoom(room37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (byte) 0, (int) (byte) 10, 0.0d, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) '4', (int) (short) 0, (double) (byte) 1, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (short) 10, (int) (byte) 0, (int) (short) 100, (double) 10L, localDateTime19, localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(100, (int) (byte) 10, (int) '#', (double) 10, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (short) 100, (int) (short) -1, (int) ' ', (double) (short) 1, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (short) 0, (int) (short) -1, (int) (byte) -1, (double) 100, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) 1, (int) '4', (double) (byte) -1, localDateTime23, localDateTime24);
        dataModels.Room room26 = null;
        boolean boolean27 = systemFacade0.deleteRoom(room26);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = systemFacade0.bookRoom(0, (int) (short) 1, (int) (short) 0, (double) '#', localDateTime32, localDateTime33);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = systemFacade0.bookRoom((int) (byte) 100, (int) (short) 0, 0, (double) 'a', localDateTime39, localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom((int) (short) -1, 10, (int) (short) 10, 1.0d, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        java.lang.Class<?> wildcardClass21 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) '4', 10, (int) (short) -1, (double) (short) 0, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom((-1), (int) (short) -1, (int) (byte) 0, (double) 10.0f, localDateTime34, localDateTime35);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = systemFacade0.bookRoom((int) (short) 1, 0, (int) (byte) 1, (-1.0d), localDateTime41, localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) (byte) -1, (int) 'a', (int) 'a', (double) (short) 1, localDateTime27, localDateTime28);
        java.lang.Class<?> wildcardClass30 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) (short) 0, 0, (int) 'a', (double) 100L, localDateTime13, localDateTime14);
// flaky "59) test099(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "41) test099(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "32) test099(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "28) test099(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "22) test099(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        java.lang.Class<?> wildcardClass21 = roomController0.getClass();
// flaky "60) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "42) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "33) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "29) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "23) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "12) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "8) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "4) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "2) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "2) test100(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) (byte) 100, 100, 1, (double) (short) 1, localDateTime7, localDateTime8);
// flaky "61) test101(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "43) test101(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) (short) 1, 0, (int) (byte) -1, (double) 1, localDateTime7, localDateTime8);
// flaky "62) test102(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "44) test102(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = systemFacade0.bookRoom((int) (short) 100, 1, (int) ' ', (double) (short) 100, localDateTime15, localDateTime16);
// flaky "63) test103(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "45) test103(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "34) test103(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "30) test103(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "24) test103(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "13) test103(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        java.lang.Class<?> wildcardClass35 = roomController0.getClass();
// flaky "64) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "46) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "35) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "31) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "25) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "14) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "9) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "5) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "3) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "3) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "2) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "2) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "2) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "1) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "1) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "1) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "1) test104(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        java.lang.Class<?> wildcardClass13 = roomController0.getClass();
// flaky "65) test105(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "47) test105(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "36) test105(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "32) test105(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "26) test105(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "15) test105(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = systemFacade0.bookRoom((int) (short) 10, (int) ' ', (int) (short) 1, (double) (byte) 10, localDateTime17, localDateTime18);
// flaky "66) test106(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "48) test106(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "37) test106(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "33) test106(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "27) test106(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "16) test106(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "10) test106(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        java.lang.Class<?> wildcardClass17 = systemFacade0.getClass();
// flaky "67) test107(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "49) test107(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "38) test107(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "34) test107(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "28) test107(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "17) test107(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "11) test107(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "6) test107(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) (short) 10, 1, (int) (byte) 10, (double) ' ', localDateTime7, localDateTime8);
// flaky "68) test108(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "50) test108(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        java.lang.Class<?> wildcardClass19 = systemFacade0.getClass();
// flaky "69) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "51) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "39) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "35) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "29) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "18) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "12) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "7) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "4) test109(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = systemFacade0.bookRoom(10, (int) '#', (int) (byte) -1, (double) 'a', localDateTime13, localDateTime14);
        java.lang.Class<?> wildcardClass16 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom((int) (short) -1, 10, (int) (short) 10, 1.0d, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((int) (short) 100, (int) 'a', (int) (short) 100, (double) (byte) 1, localDateTime25, localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) ' ', (int) (short) -1, 10, (double) 100L, localDateTime40, localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) (byte) 100, (int) (short) 0, (int) '4', (double) (short) -1, localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (short) -1, (double) (-1), localDateTime16, localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, (int) 'a', 10, (double) (short) -1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) '#', 1, (int) ' ', (double) (short) 0, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(10, 1, (int) (short) 1, (double) 10, localDateTime47, localDateTime48);
        java.lang.Class<?> wildcardClass50 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom(0, (int) 'a', (int) (short) 1, (double) 1.0f, localDateTime13, localDateTime14);
// flaky "70) test115(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "52) test115(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "40) test115(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "36) test115(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "30) test115(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) -1, (int) 'a', (double) (byte) 10, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom(0, (int) (short) 100, (int) (short) 10, (double) 'a', localDateTime34, localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) (short) 10, (-1), (-1), (double) (byte) 0, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) (byte) -1, (int) (short) 100, (int) (short) 100, (double) ' ', localDateTime18, localDateTime19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) (byte) 100, (int) (short) 0, (int) '4', (double) (short) -1, localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (short) 1, (int) (short) 0, (double) 0L, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom(0, (int) (short) 10, (-1), 1.0d, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom((int) (byte) 100, (-1), (int) (short) 10, (double) '#', localDateTime30, localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        java.lang.Class<?> wildcardClass21 = systemFacade0.getClass();
// flaky "71) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "53) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "41) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "37) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "31) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "19) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "13) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "8) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "5) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "4) test119(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = systemFacade0.bookRoom((-1), (int) '4', (int) (short) 100, 1.0d, localDateTime15, localDateTime16);
// flaky "72) test120(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "54) test120(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "42) test120(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "38) test120(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "32) test120(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "20) test120(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 10, (int) (byte) 100, 100, (double) (byte) 10, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (short) 0, (-1), (double) ' ', localDateTime33, localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', 10, 1, (double) (short) 1, localDateTime33, localDateTime34);
        java.lang.Class<?> wildcardClass36 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom(0, (int) 'a', 0, 100.0d, localDateTime23, localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        java.lang.Class<?> wildcardClass3 = roomController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (byte) 1, 100, (int) (short) 10, 0.0d, localDateTime15, localDateTime16);
        dataModels.Room room18 = null;
        boolean boolean19 = systemFacade0.deleteRoom(room18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = systemFacade0.bookRoom((int) 'a', (int) (short) 100, 1, (double) (-1), localDateTime24, localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking(10, (int) (byte) 10, (int) (byte) 0, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, (int) (short) 1, (int) (short) -1, (double) 0.0f, localDateTime33, localDateTime34);
        java.lang.Class<?> wildcardClass36 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        java.lang.Class<?> wildcardClass33 = roomController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) 1, (int) '4', (double) (byte) -1, localDateTime23, localDateTime24);
        dataModels.Room room26 = null;
        boolean boolean27 = systemFacade0.deleteRoom(room26);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = systemFacade0.bookRoom(0, (int) (byte) 1, (int) (byte) 10, (double) (short) 10, localDateTime32, localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) (short) 1, 0, (int) 'a', 1.0d, localDateTime9, localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking(10, (int) (byte) 10, (int) (byte) 0, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) '#', (int) (byte) 0, 100, (double) 100, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking(0, (int) (byte) 1, (-1), (double) 'a', localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (short) -1, (int) ' ', (int) (short) 10, (double) 10L, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, (int) 'a', 10, (double) (short) -1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) '#', 1, (int) ' ', (double) (short) 0, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(10, 1, (int) (short) 1, (double) 10, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking(10, (int) ' ', (int) (short) 100, (double) 10.0f, localDateTime54, localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = systemFacade0.bookRoom((int) 'a', (int) (short) -1, (int) (short) 0, (double) (-1L), localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = systemFacade0.bookRoom((int) (byte) -1, (int) (short) 0, 100, (double) 100.0f, localDateTime20, localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) (byte) 100, (int) (short) 0, (int) '4', (double) (short) -1, localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (short) 1, (int) (short) 0, (double) 0L, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom(0, (int) (short) 10, (-1), 1.0d, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom((int) (short) 10, (int) (short) -1, 100, 0.0d, localDateTime30, localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = systemFacade0.bookRoom((int) (byte) -1, (-1), (int) (byte) 100, (double) 10, localDateTime19, localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = systemFacade0.bookRoom((int) (byte) 10, (int) (short) 0, (int) (byte) 0, 10.0d, localDateTime7, localDateTime8);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = systemFacade0.bookRoom((int) (byte) 1, 0, 0, (double) 100.0f, localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = systemFacade0.bookRoom((int) (byte) 100, (int) '#', (int) 'a', (double) 10, localDateTime21, localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) (short) 10, (-1), (-1), (double) (byte) 0, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) (short) 100, (int) (byte) 0, (int) (short) -1, (double) (short) 100, localDateTime18, localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((int) (byte) 100, (int) (byte) 100, 10, 10.0d, localDateTime5, localDateTime6);
// flaky "73) test137(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom(1, (int) 'a', 0, (double) (byte) 1, localDateTime7, localDateTime8);
// flaky "74) test138(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "55) test138(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = systemFacade0.bookRoom((int) (byte) 0, 100, (int) ' ', (double) '#', localDateTime21, localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) '#', (int) (byte) 100, 0, (double) 10, localDateTime15, localDateTime16);
        dataModels.Room room18 = null;
        boolean boolean19 = systemFacade0.deleteRoom(room18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = systemFacade0.bookRoom((int) '#', 0, (-1), (double) 'a', localDateTime24, localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (byte) 1, (int) 'a', (double) (byte) 1, localDateTime26, localDateTime27);
        java.lang.Class<?> wildcardClass29 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) 'a', (int) (byte) 0, 1, (double) (short) 1, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) (short) -1, (int) (short) 0, (int) (short) -1, (double) 100, localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((-1), (int) '4', (int) (byte) -1, (double) (short) -1, localDateTime25, localDateTime26);
        dataModels.Room room28 = null;
        boolean boolean29 = systemFacade0.deleteRoom(room28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = systemFacade0.bookRoom((int) '4', (int) (byte) -1, 0, (double) 100.0f, localDateTime9, localDateTime10);
// flaky "75) test143(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "56) test143(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "43) test143(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (byte) 1, 100, (int) (short) 10, 0.0d, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = systemFacade0.bookRoom((int) (short) 1, (int) (short) -1, (-1), (double) (short) 1, localDateTime22, localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (short) -1, (int) (byte) 100, (int) (short) 1, (double) (short) 10, localDateTime19, localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 1, (int) (byte) 100, (int) (short) 100, (double) (short) 0, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) -1, 100, (int) (byte) 10, 1.0d, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) 0, (int) '4', (double) (short) 100, localDateTime26, localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) (byte) 10, (int) (byte) -1, (int) (short) -1, (double) '#', localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom(10, (int) '4', (int) (short) 10, 0.0d, localDateTime18, localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) 'a', 0, (int) (short) 100, (-1.0d), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(0, 10, (int) (byte) 100, (double) 1L, localDateTime33, localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = systemFacade0.bookRoom(0, (int) 'a', (int) (short) 10, (double) (byte) 0, localDateTime27, localDateTime28);
// flaky "76) test150(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "57) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "44) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "39) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "33) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "21) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "14) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "9) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "6) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "5) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "3) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "3) test150(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = systemFacade0.bookRoom(0, (int) (byte) 0, (int) (short) 1, (double) 10.0f, localDateTime11, localDateTime12);
// flaky "77) test151(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "58) test151(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "45) test151(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "40) test151(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) (short) -1, (int) (short) 0, (int) (short) 100, (double) (byte) 100, localDateTime23, localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) 10, (int) '4', 0, (double) 'a', localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(10, (int) (short) 10, (int) (byte) -1, (double) (short) 10, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking(0, (-1), 10, (double) 0L, localDateTime40, localDateTime41);
        java.lang.Class<?> wildcardClass43 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, (int) 'a', 10, (double) (short) -1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) '#', 1, (int) ' ', (double) (short) 0, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(10, 1, (int) (short) 1, (double) 10, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) 'a', 0, (-1), (double) (-1), localDateTime54, localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) 'a', (int) (byte) 0, (int) (short) 1, 10.0d, localDateTime23, localDateTime24);
        java.lang.Class<?> wildcardClass26 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) -1, (int) 'a', (double) (byte) 10, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom((int) (short) 1, (int) (short) 1, 10, (double) (byte) 100, localDateTime34, localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (short) 100, (int) 'a', (int) 'a', (double) '#', localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) '4', (int) ' ', (int) '4', (double) (byte) 0, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking(10, (int) (short) 1, 10, (double) (byte) 10, localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = bookingController0.createBooking(10, 1, 10, (double) (byte) 100, localDateTime61, localDateTime62);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom(10, 10, (int) (short) 10, (double) (short) -1, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom((int) '#', 0, (-1), (double) (byte) 10, localDateTime34, localDateTime35);
        java.lang.Class<?> wildcardClass37 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) 100, (int) '#', 0.0d, localDateTime29, localDateTime30);
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = systemFacade0.bookRoom((int) ' ', (int) (byte) 100, (int) ' ', 0.0d, localDateTime36, localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking(10, (int) (byte) 10, (int) (byte) 0, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) '#', (int) (byte) 0, 100, (double) 100, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking(0, (int) (byte) 1, (-1), (double) 'a', localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) 1, (int) (short) -1, (int) '#', (double) (-1), localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.lang.Class<?> wildcardClass22 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (short) 100, (int) 'a', (int) 'a', (double) '#', localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) '4', (int) ' ', (int) '4', (double) (byte) 0, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking(10, (int) (short) 1, 10, (double) (byte) 10, localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = bookingController0.createBooking((int) '#', 0, (int) (byte) 1, (double) (short) 0, localDateTime61, localDateTime62);
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        boolean boolean70 = bookingController0.createBooking((int) '4', (int) 'a', (int) (byte) 0, 0.0d, localDateTime68, localDateTime69);
        java.time.LocalDateTime localDateTime75 = null;
        java.time.LocalDateTime localDateTime76 = null;
        boolean boolean77 = bookingController0.createBooking((int) (byte) 100, (int) (byte) 10, (int) '4', (double) 1, localDateTime75, localDateTime76);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking(10, (int) (byte) 10, (int) (byte) 0, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(100, (int) (short) 0, (int) (byte) 10, (double) 1L, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 10, (int) (short) -1, (int) (byte) 10, 10.0d, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) 10, 0, (int) 'a', (double) ' ', localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, (int) (short) 1, (double) (byte) 0, localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = bookingController0.createBooking((int) (byte) -1, (-1), (int) ' ', (double) 100.0f, localDateTime61, localDateTime62);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = systemFacade0.bookRoom((int) (short) 1, (int) ' ', (-1), 0.0d, localDateTime5, localDateTime6);
        dataModels.Room room8 = null;
        boolean boolean9 = systemFacade0.deleteRoom(room8);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = systemFacade0.bookRoom((int) ' ', (int) '#', 10, (double) (byte) 0, localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = systemFacade0.bookRoom((int) (short) 0, 10, 10, (double) 'a', localDateTime21, localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        java.lang.Class<?> wildcardClass43 = roomController0.getClass();
// flaky "78) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "59) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "46) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "41) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "34) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "22) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "15) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "10) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "7) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "6) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "4) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "4) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "3) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "2) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "2) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "2) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "2) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "1) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "1) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "1) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "1) test165(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = systemFacade0.bookRoom((int) (short) 1, 10, (int) (short) 1, (double) ' ', localDateTime11, localDateTime12);
// flaky "79) test166(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "60) test166(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "47) test166(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "42) test166(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        java.lang.Class<?> wildcardClass37 = roomController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (byte) 1, 100, (int) (short) 10, 0.0d, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = systemFacade0.bookRoom((int) (short) 0, 100, (-1), (double) 0, localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = systemFacade0.bookRoom((int) (short) 100, (int) '4', (int) (byte) 1, 0.0d, localDateTime29, localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = systemFacade0.bookRoom((int) (short) 1, 10, 0, (double) 100L, localDateTime15, localDateTime16);
// flaky "80) test169(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "61) test169(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "48) test169(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "43) test169(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "35) test169(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "23) test169(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        java.lang.Class<?> wildcardClass19 = roomController0.getClass();
// flaky "81) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "62) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "49) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "44) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "36) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "24) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "16) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "11) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "8) test170(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        dataModels.Room room43 = null;
        boolean boolean44 = roomController0.deleteRoom(room43);
        dataModels.Room room45 = null;
        boolean boolean46 = roomController0.deleteRoom(room45);
        java.lang.Class<?> wildcardClass47 = roomController0.getClass();
// flaky "82) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "63) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "50) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "45) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "37) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "25) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "17) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "12) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "9) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "7) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "5) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "5) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "4) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "3) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "3) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "3) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "3) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "2) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "2) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "2) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "2) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "1) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "1) test171(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) '4', (int) (short) -1, (int) '4', (double) 1L, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) (byte) 0, 100, 1, (double) 10.0f, localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((int) (short) 0, (int) '#', (int) (byte) 10, 10.0d, localDateTime25, localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) 'a', (int) 'a', (int) (short) 10, (double) (short) 10, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(10, 1, (int) (byte) 100, (double) 'a', localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (short) 10, (int) (byte) 0, (int) (byte) -1, (double) (short) 10, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = systemFacade0.bookRoom((int) (short) 100, (int) ' ', (int) (byte) 100, (double) 0.0f, localDateTime22, localDateTime23);
        dataModels.Room room25 = null;
        boolean boolean26 = systemFacade0.deleteRoom(room25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = systemFacade0.bookRoom((int) (byte) 10, (int) (short) 0, (int) (byte) 0, 10.0d, localDateTime7, localDateTime8);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = systemFacade0.bookRoom((int) (byte) 100, (int) 'a', (int) (byte) 10, (double) (short) 10, localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = systemFacade0.bookRoom((int) (short) -1, 0, 100, (double) (byte) -1, localDateTime21, localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) 'a', (int) (byte) 0, (int) (short) 1, 10.0d, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom(1, (int) (short) 10, (int) ' ', (double) (byte) 0, localDateTime30, localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) 1, (int) '4', (double) (byte) -1, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom((int) (short) 100, (int) (byte) 100, (int) (byte) 100, (double) 100.0f, localDateTime30, localDateTime31);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = systemFacade0.bookRoom(100, (int) (byte) -1, (int) ' ', (double) (short) -1, localDateTime37, localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 0, (int) (byte) 1, (int) '4', (double) (short) 10, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) ' ', (int) 'a', (int) '4', (double) 100L, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) (byte) 0, 100, (int) (byte) 0, (double) (-1.0f), localDateTime54, localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) (short) 100, 1, 0, (double) ' ', localDateTime13, localDateTime14);
// flaky "83) test179(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "64) test179(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "51) test179(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "46) test179(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "38) test179(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = systemFacade0.bookRoom((int) 'a', (int) (short) 10, (int) 'a', (double) (byte) 100, localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = systemFacade0.bookRoom(100, (int) (short) 10, 1, (double) 100, localDateTime28, localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom((int) ' ', (int) (byte) 10, (int) (short) 1, (double) (short) 1, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) '#', (int) (byte) 1, (int) (byte) 1, (double) (byte) -1, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom((int) (byte) 100, (int) ' ', 0, (double) 100, localDateTime30, localDateTime31);
        dataModels.Room room33 = null;
        boolean boolean34 = systemFacade0.deleteRoom(room33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(0, (int) (short) 100, (int) (short) 10, (double) 1L, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(1, (int) (short) 1, (int) (short) -1, (double) (short) -1, localDateTime19, localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (byte) 0, (int) (byte) 10, 0.0d, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) '4', (int) (short) 0, (double) (byte) 1, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) '4', 0, (int) (short) 1, (double) 1L, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking(100, (int) (byte) 1, (int) (byte) 1, (double) (-1L), localDateTime26, localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((int) (short) -1, (int) '4', 10, (double) (byte) 100, localDateTime5, localDateTime6);
// flaky "84) test184(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = systemFacade0.bookRoom((int) (byte) 10, (int) '4', (int) (short) 100, (double) (byte) 100, localDateTime13, localDateTime14);
// flaky "85) test185(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "65) test185(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "52) test185(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "47) test185(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "39) test185(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = systemFacade0.bookRoom((int) (short) -1, (int) (short) 0, (int) 'a', 1.0d, localDateTime11, localDateTime12);
// flaky "86) test186(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "66) test186(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "53) test186(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "48) test186(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        java.lang.Class<?> wildcardClass25 = systemFacade0.getClass();
// flaky "87) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "67) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "54) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "49) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "40) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "26) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "18) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "13) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "10) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "8) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "6) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "6) test187(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (short) 10, (int) '#', 1, (double) '#', localDateTime5, localDateTime6);
// flaky "88) test188(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        java.lang.Class<?> wildcardClass23 = roomController0.getClass();
// flaky "89) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "68) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "55) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "50) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "41) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "27) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "19) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "14) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "11) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "9) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "7) test189(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = systemFacade0.deleteRoom(room25);
        java.lang.Class<?> wildcardClass27 = systemFacade0.getClass();
// flaky "90) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "69) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "56) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "51) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "42) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "28) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "20) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "15) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "12) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "10) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "8) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "7) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "5) test190(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) 100, (int) '#', 0.0d, localDateTime29, localDateTime30);
        java.lang.Class<?> wildcardClass32 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) 1, (int) '4', (double) (byte) -1, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom((int) 'a', 1, (int) (short) 0, (double) (byte) 1, localDateTime30, localDateTime31);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = systemFacade0.bookRoom((int) (short) 10, 100, 0, (double) (byte) -1, localDateTime37, localDateTime38);
        dataModels.Room room40 = null;
        boolean boolean41 = systemFacade0.deleteRoom(room40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = systemFacade0.bookRoom((int) 'a', (int) (short) 10, (int) 'a', (double) (byte) 100, localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = systemFacade0.bookRoom((int) (byte) -1, (int) (byte) 0, (int) '#', (double) (-1L), localDateTime28, localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 1, (int) (byte) 100, (int) (short) 100, (double) (short) 0, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (short) 0, (int) ' ', 0, (double) (-1.0f), localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) (short) 10, (-1), 0, (double) 100.0f, localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = bookingController0.createBooking((int) (short) -1, (int) 'a', (int) (short) 0, (double) 1L, localDateTime61, localDateTime62);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.lang.Class<?> wildcardClass29 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, (int) 'a', 10, (double) (short) -1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) '#', 1, (int) ' ', (double) (short) 0, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(10, 1, (int) (short) 1, (double) 10, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) '4', (int) (short) 100, (int) (byte) -1, (double) (short) -1, localDateTime54, localDateTime55);
        java.lang.Class<?> wildcardClass57 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (byte) 1, 100, (int) (short) 10, 0.0d, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = systemFacade0.bookRoom((int) (short) 0, 100, (-1), (double) 0, localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = systemFacade0.bookRoom((int) 'a', 10, (int) (byte) 1, 0.0d, localDateTime29, localDateTime30);
        dataModels.Room room32 = null;
        boolean boolean33 = systemFacade0.deleteRoom(room32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (short) 10, (int) (byte) 0, (int) (byte) -1, (double) (short) 10, localDateTime15, localDateTime16);
        dataModels.Room room18 = null;
        boolean boolean19 = systemFacade0.deleteRoom(room18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (-1.0d), localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = systemFacade0.bookRoom((int) (byte) 10, (int) (byte) 0, 10, (double) (byte) 100, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = systemFacade0.bookRoom(1, (int) '#', 10, (double) 0.0f, localDateTime38, localDateTime39);
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = systemFacade0.bookRoom((int) (short) -1, (int) (short) -1, (int) (short) 10, 0.0d, localDateTime45, localDateTime46);
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        boolean boolean54 = systemFacade0.bookRoom(100, (int) (short) 10, (int) (short) -1, (double) 100L, localDateTime52, localDateTime53);
        java.lang.Class<?> wildcardClass55 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (short) 10, (int) (byte) 0, (int) (byte) -1, (double) (short) 10, localDateTime15, localDateTime16);
        dataModels.Room room18 = null;
        boolean boolean19 = systemFacade0.deleteRoom(room18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = systemFacade0.bookRoom(0, (int) (byte) 10, (int) (short) 1, (double) (short) 10, localDateTime24, localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom((int) ' ', (int) (byte) 10, (int) (short) 1, (double) (short) 1, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) '#', (int) (byte) 1, (int) (byte) 1, (double) (byte) -1, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom((int) (byte) 100, (int) ' ', 0, (double) 100, localDateTime30, localDateTime31);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = systemFacade0.bookRoom(0, 100, 0, (double) '#', localDateTime37, localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) 10, (int) '4', 0, (double) 'a', localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(10, (int) (short) 10, (int) (byte) -1, (double) (short) 10, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 0, (int) (byte) 10, 0, (double) (-1L), localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(0, (int) (short) 0, (int) (short) 10, (double) (short) 100, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (short) 1, (int) (short) -1, 0, (double) '4', localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) ' ', 0, 100, (double) (byte) 100, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) -1, 1, 0, (double) (byte) 100, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) ' ', 100, (int) ' ', (double) 100L, localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = bookingController0.createBooking((int) (short) -1, (int) (short) 100, (int) (byte) -1, 100.0d, localDateTime61, localDateTime62);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom((int) (short) 100, (int) (short) 10, (int) ' ', 0.0d, localDateTime7, localDateTime8);
// flaky "91) test203(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "70) test203(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = systemFacade0.bookRoom((int) (byte) 1, (int) '4', (int) ' ', 10.0d, localDateTime21, localDateTime22);
// flaky "92) test204(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "71) test204(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "57) test204(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "52) test204(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "43) test204(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "29) test204(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "21) test204(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "16) test204(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "13) test204(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (short) -1, (-1), (int) (short) 1, (double) (-1L), localDateTime5, localDateTime6);
// flaky "93) test205(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = systemFacade0.bookRoom((int) (byte) -1, 1, (int) ' ', (double) ' ', localDateTime23, localDateTime24);
// flaky "94) test206(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "72) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "58) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "53) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "44) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "30) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "22) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "17) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "14) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "11) test206(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = systemFacade0.bookRoom((-1), (int) (byte) 10, 0, (double) 1, localDateTime27, localDateTime28);
// flaky "95) test207(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "73) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "59) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "54) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "45) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "31) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "23) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "18) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "15) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "12) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "9) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "8) test207(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = systemFacade0.bookRoom((int) (byte) -1, (int) (byte) 100, (int) (byte) 100, (double) (short) 100, localDateTime15, localDateTime16);
// flaky "96) test208(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "74) test208(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "60) test208(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "55) test208(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "46) test208(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "32) test208(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = systemFacade0.bookRoom(100, 10, 100, 100.0d, localDateTime19, localDateTime20);
// flaky "97) test209(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "75) test209(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "61) test209(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "56) test209(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "47) test209(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "33) test209(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "24) test209(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "19) test209(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        dataModels.Room room43 = null;
        boolean boolean44 = roomController0.deleteRoom(room43);
        dataModels.Room room45 = null;
        boolean boolean46 = roomController0.deleteRoom(room45);
        dataModels.Room room47 = null;
        boolean boolean48 = roomController0.deleteRoom(room47);
        dataModels.Room room49 = null;
        boolean boolean50 = roomController0.deleteRoom(room49);
        dataModels.Room room51 = null;
        boolean boolean52 = roomController0.deleteRoom(room51);
        dataModels.Room room53 = null;
        boolean boolean54 = roomController0.deleteRoom(room53);
        java.lang.Class<?> wildcardClass55 = roomController0.getClass();
// flaky "98) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "76) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "62) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "57) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "48) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "34) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "25) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "20) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "16) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "13) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "10) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "9) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "6) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "4) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "4) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "4) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "4) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "3) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "3) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "3) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "3) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "2) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "2) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "1) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "1) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky "1) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "1) test210(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        java.lang.Class<?> wildcardClass41 = roomController0.getClass();
// flaky "99) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "77) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "63) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "58) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "49) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "35) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "26) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "21) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "17) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "14) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "11) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "10) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "7) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "5) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "5) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "5) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "5) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "4) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "4) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "4) test211(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = systemFacade0.bookRoom((int) (short) 1, (int) ' ', (-1), 0.0d, localDateTime5, localDateTime6);
        dataModels.Room room8 = null;
        boolean boolean9 = systemFacade0.deleteRoom(room8);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = systemFacade0.bookRoom((int) ' ', (int) '#', 10, (double) (byte) 0, localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = systemFacade0.bookRoom((int) '#', (int) ' ', 0, (double) ' ', localDateTime21, localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = systemFacade0.bookRoom(0, (int) ' ', (int) (byte) 10, (double) 100L, localDateTime15, localDateTime16);
// flaky "100) test213(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "78) test213(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "64) test213(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "59) test213(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "50) test213(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "36) test213(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = systemFacade0.bookRoom(0, (int) '4', (int) (byte) 100, (double) '4', localDateTime23, localDateTime24);
// flaky "101) test214(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "79) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "65) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "60) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "51) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "37) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "27) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "22) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "18) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "15) test214(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        java.lang.Class<?> wildcardClass31 = roomController0.getClass();
// flaky "102) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "80) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "66) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "61) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "52) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "38) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "28) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "23) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "19) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "16) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "12) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "11) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "8) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "6) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "6) test215(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking((int) (short) 0, (int) 'a', (-1), (double) 1.0f, localDateTime5, localDateTime6);
// flaky "103) test216(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) '4', (int) '#', (int) ' ', (double) 100.0f, localDateTime27, localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 1, (double) 0, localDateTime17, localDateTime18);
        dataModels.Room room20 = null;
        boolean boolean21 = systemFacade0.deleteRoom(room20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = systemFacade0.bookRoom((int) (short) 100, (int) (short) 10, 0, (double) (byte) -1, localDateTime26, localDateTime27);
        java.lang.Class<?> wildcardClass29 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(0, (int) (short) 100, (int) (short) 10, (double) 1L, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (short) 0, (int) ' ', (int) (short) 100, (double) (byte) 10, localDateTime19, localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = systemFacade0.bookRoom((int) (short) 1, (int) ' ', (-1), 0.0d, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = systemFacade0.bookRoom((-1), (int) (short) -1, (int) (byte) 10, (double) (-1L), localDateTime12, localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) (byte) 10, (int) (byte) -1, (int) (short) -1, (double) '#', localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) (byte) 100, 100, (int) 'a', 0.0d, localDateTime18, localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) 100, (int) '#', 0.0d, localDateTime29, localDateTime30);
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = systemFacade0.bookRoom((int) '#', 0, (int) (byte) 10, 0.0d, localDateTime36, localDateTime37);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = systemFacade0.bookRoom((int) (byte) -1, (int) (short) 10, (int) (byte) 100, (double) (byte) 100, localDateTime43, localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = systemFacade0.bookRoom((int) ' ', 1, 10, (double) 0, localDateTime29, localDateTime30);
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = systemFacade0.bookRoom(10, (int) (short) -1, (int) (byte) 10, (double) (byte) 1, localDateTime36, localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) 10, (int) '4', 0, (double) 'a', localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(10, (int) (short) 10, (int) (byte) -1, (double) (short) 10, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 0, (int) (byte) 10, 0, (double) (-1L), localDateTime40, localDateTime41);
        java.lang.Class<?> wildcardClass43 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (short) -1, 0, 0, (double) (-1L), localDateTime33, localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 1, (double) 0, localDateTime17, localDateTime18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = systemFacade0.bookRoom((int) (short) 1, (int) (byte) 1, 0, (double) ' ', localDateTime24, localDateTime25);
        java.lang.Class<?> wildcardClass27 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(0, (int) (short) 100, (int) (short) 10, (double) 1L, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '4', (int) 'a', (double) (byte) 100, localDateTime19, localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = systemFacade0.bookRoom((int) (short) 1, (int) ' ', (-1), 0.0d, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = systemFacade0.bookRoom((int) (short) 0, 0, (int) ' ', (double) 10.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = systemFacade0.bookRoom((int) (short) -1, (int) (short) 1, 1, (-1.0d), localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = systemFacade0.bookRoom((int) 'a', (int) (byte) 10, (int) 'a', (double) 0L, localDateTime26, localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (short) -1, (int) (short) -1, 0, (double) (-1L), localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (short) -1, (int) (short) 100, (int) (short) 100, (double) 1.0f, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = systemFacade0.bookRoom((-1), (int) (short) 1, 0, (double) (short) -1, localDateTime13, localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = systemFacade0.bookRoom((int) (short) -1, (int) ' ', 0, (double) 10.0f, localDateTime7, localDateTime8);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = systemFacade0.bookRoom((-1), (int) 'a', (int) (short) -1, 0.0d, localDateTime14, localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (byte) 1, 100, (int) (short) 10, 0.0d, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = systemFacade0.bookRoom((int) (short) 0, 100, (-1), (double) 0, localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = systemFacade0.bookRoom((int) (byte) -1, 1, (int) (short) 0, (double) 1, localDateTime29, localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) 'a', (int) 'a', (int) (short) 10, (double) (short) 10, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (short) 10, (int) '4', (int) (short) 10, (double) 'a', localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) (short) 1, (int) (byte) -1, (-1), (double) (short) 0, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom((int) (short) -1, 0, (-1), (double) (-1L), localDateTime30, localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) 10, (int) '4', 0, (double) 'a', localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(10, (int) (short) 10, (int) (byte) -1, (double) (short) 10, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking(0, (-1), 10, (double) 0L, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) 1, (int) (short) 1, 0, (double) (short) 100, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) '4', 0, (int) (byte) 1, (double) 100L, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) 10, 100, (int) (short) 10, (double) 10.0f, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) ' ', (int) (short) 0, (int) (short) 10, (double) 1L, localDateTime54, localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom((int) (short) -1, 10, (int) (short) 10, 1.0d, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((-1), (int) (short) 100, (int) (byte) -1, (double) (byte) 1, localDateTime25, localDateTime26);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) 100, 1, (double) (-1.0f), localDateTime32, localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) 'a', (int) (byte) 0, 1, (double) (short) 1, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) ' ', 1, (int) '4', (double) (short) -1, localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((int) ' ', (int) (short) 0, (int) (byte) 10, (double) (-1L), localDateTime25, localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = systemFacade0.bookRoom((int) (short) -1, (int) (short) -1, 0, (double) 10.0f, localDateTime7, localDateTime8);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = systemFacade0.bookRoom(10, (int) (short) 10, (int) '4', (double) '4', localDateTime14, localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) 10, (int) '4', 0, (double) 'a', localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(10, (int) (short) 10, (int) (byte) -1, (double) (short) 10, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking(0, 0, (int) (short) 1, (double) ' ', localDateTime40, localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) (short) 10, (-1), (-1), (double) (byte) 0, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) (byte) -1, (int) (short) 100, (int) (short) 100, (double) ' ', localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((int) '#', (int) (byte) 1, 100, (double) 'a', localDateTime25, localDateTime26);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = systemFacade0.bookRoom((int) '4', (int) (short) 0, 10, (double) (-1.0f), localDateTime32, localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = systemFacade0.bookRoom((-1), (int) (byte) -1, (int) (byte) 10, (double) '#', localDateTime19, localDateTime20);
// flaky "104) test242(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "81) test242(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "67) test242(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "62) test242(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "53) test242(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "39) test242(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "29) test242(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "24) test242(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = systemFacade0.bookRoom((int) (byte) 0, (int) (short) 1, (-1), (double) 10, localDateTime23, localDateTime24);
// flaky "105) test243(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "82) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "68) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "63) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "54) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "40) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "30) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "25) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "20) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "17) test243(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking(10, (int) (byte) 10, (int) (byte) 0, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(100, (int) (short) 0, (int) (byte) 10, (double) 1L, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) -1, (int) (byte) -1, (int) (byte) 100, (double) (-1.0f), localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) '4', (int) (byte) 1, (int) (byte) 1, (double) 0, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        dataModels.Room room43 = null;
        boolean boolean44 = roomController0.deleteRoom(room43);
        dataModels.Room room45 = null;
        boolean boolean46 = roomController0.deleteRoom(room45);
        dataModels.Room room47 = null;
        boolean boolean48 = roomController0.deleteRoom(room47);
        dataModels.Room room49 = null;
        boolean boolean50 = roomController0.deleteRoom(room49);
        dataModels.Room room51 = null;
        boolean boolean52 = roomController0.deleteRoom(room51);
        dataModels.Room room53 = null;
        boolean boolean54 = roomController0.deleteRoom(room53);
        dataModels.Room room55 = null;
        boolean boolean56 = roomController0.deleteRoom(room55);
        dataModels.Room room57 = null;
        boolean boolean58 = roomController0.deleteRoom(room57);
        dataModels.Room room59 = null;
        boolean boolean60 = roomController0.deleteRoom(room59);
        java.lang.Class<?> wildcardClass61 = roomController0.getClass();
// flaky "106) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "83) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "69) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "64) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "55) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "41) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "31) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "26) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "21) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "18) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "13) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "12) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "9) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "7) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "7) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "6) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "6) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "5) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "5) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "5) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "4) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "3) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "3) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "2) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "2) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky "2) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "2) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky "1) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky "1) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky "1) test245(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        dataModels.Room room43 = null;
        boolean boolean44 = roomController0.deleteRoom(room43);
        dataModels.Room room45 = null;
        boolean boolean46 = roomController0.deleteRoom(room45);
        dataModels.Room room47 = null;
        boolean boolean48 = roomController0.deleteRoom(room47);
        java.lang.Class<?> wildcardClass49 = roomController0.getClass();
// flaky "107) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "84) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "70) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "65) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "56) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "42) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "32) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "27) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "22) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "19) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "14) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "13) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "10) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "8) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "8) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "7) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "7) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "6) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "6) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "6) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "5) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "4) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "4) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "3) test246(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingController0.createBooking(100, (int) (short) -1, (int) 'a', (double) (short) 1, localDateTime5, localDateTime6);
// flaky "108) test247(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = systemFacade0.bookRoom((int) '#', (int) (byte) 10, (int) (short) 10, (double) 0.0f, localDateTime25, localDateTime26);
// flaky "109) test248(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "85) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "71) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "66) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "57) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "43) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "33) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "28) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "23) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "20) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "15) test248(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = systemFacade0.deleteRoom(room25);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = systemFacade0.bookRoom(0, (int) 'a', (int) '#', 100.0d, localDateTime31, localDateTime32);
// flaky "110) test249(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "86) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "72) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "67) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "58) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "44) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "34) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "29) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "24) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "21) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "16) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "14) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "11) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "9) test249(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        dataModels.Room room43 = null;
        boolean boolean44 = roomController0.deleteRoom(room43);
        dataModels.Room room45 = null;
        boolean boolean46 = roomController0.deleteRoom(room45);
        dataModels.Room room47 = null;
        boolean boolean48 = roomController0.deleteRoom(room47);
        dataModels.Room room49 = null;
        boolean boolean50 = roomController0.deleteRoom(room49);
        dataModels.Room room51 = null;
        boolean boolean52 = roomController0.deleteRoom(room51);
        java.lang.Class<?> wildcardClass53 = roomController0.getClass();
// flaky "111) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "87) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "73) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "68) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "59) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "45) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "35) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "30) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "25) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "22) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "17) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "15) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "12) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "10) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "9) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "8) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "8) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "7) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "7) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "7) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "6) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "5) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "5) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "4) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "3) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky "3) test250(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = systemFacade0.bookRoom((int) (short) 100, 1, (int) (byte) 10, (double) 10.0f, localDateTime9, localDateTime10);
// flaky "112) test251(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "88) test251(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "74) test251(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking(10, (int) (byte) 10, (int) (byte) 0, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) '#', (int) (byte) 0, 100, (double) 100, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (short) 1, (int) ' ', (int) (short) 0, (double) 'a', localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) 10, (int) (byte) -1, (int) ' ', (double) (byte) -1, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 0, (int) (byte) 1, (int) '4', (double) (short) 10, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(100, (int) (byte) 10, (int) (byte) -1, (double) 'a', localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) (byte) -1, (int) (short) -1, (int) (byte) 1, (double) 'a', localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = bookingController0.createBooking((int) (short) -1, 10, (int) (byte) 0, (double) 100.0f, localDateTime61, localDateTime62);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = systemFacade0.deleteRoom(room25);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = systemFacade0.bookRoom((-1), (int) (short) -1, 10, (double) (short) 100, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = systemFacade0.bookRoom(100, (int) (byte) 0, 0, (double) 0L, localDateTime38, localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking(0, 0, (int) (short) -1, (double) 100L, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(10, (int) (byte) 0, (-1), (double) 10.0f, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) '4', (int) (short) -1, (int) '4', (double) 1L, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) (byte) 0, 100, 1, (double) 10.0f, localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((int) (short) -1, 0, (int) ' ', (double) (byte) 10, localDateTime25, localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 1, (int) (byte) 100, (int) (short) 100, (double) (short) 0, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) '#', (-1), (int) '4', (double) (short) -1, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((-1), (int) (short) 1, (int) (short) 10, (double) 0, localDateTime54, localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) (short) 10, (-1), (-1), (double) (byte) 0, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom(1, (int) (byte) 1, (int) (byte) 0, (double) (byte) 100, localDateTime18, localDateTime19);
        java.lang.Class<?> wildcardClass21 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (byte) 1, 100, (int) (short) 10, 0.0d, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = systemFacade0.bookRoom((int) (short) 0, 100, (-1), (double) 0, localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = systemFacade0.bookRoom((int) 'a', 10, (int) (byte) 1, 0.0d, localDateTime29, localDateTime30);
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = systemFacade0.bookRoom((int) '#', (int) '4', (int) (short) 1, 10.0d, localDateTime36, localDateTime37);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = systemFacade0.bookRoom((int) 'a', (int) (short) 10, 1, 0.0d, localDateTime43, localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom((int) (short) -1, 10, (int) (short) 10, 1.0d, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((int) '#', (int) (short) 0, 10, 100.0d, localDateTime25, localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking(10, (int) (byte) 10, (int) (byte) 0, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (short) 0, 100, 100, (double) 10, localDateTime33, localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = systemFacade0.bookRoom((-1), 1, 100, (double) 'a', localDateTime19, localDateTime20);
// flaky "113) test262(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "89) test262(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "75) test262(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "69) test262(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "60) test262(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "46) test262(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "36) test262(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "31) test262(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((int) 'a', 0, (int) 'a', (double) 'a', localDateTime5, localDateTime6);
// flaky "114) test263(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemFacade0.bookRoom((int) (short) -1, (int) (short) 0, (int) (short) 0, (double) (-1.0f), localDateTime5, localDateTime6);
// flaky "115) test264(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = systemFacade0.deleteRoom(room25);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = systemFacade0.bookRoom((-1), (int) (short) -1, 10, (double) (short) 100, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = systemFacade0.bookRoom((int) (short) 100, 0, (int) (byte) -1, (double) (byte) 1, localDateTime38, localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) 'a', (int) 'a', (int) (short) 10, (double) (short) 10, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) -1, (int) (byte) 100, (int) (byte) -1, (double) 100L, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking(0, (int) '4', (int) '#', (double) ' ', localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = bookingController0.createBooking((int) (short) 100, (int) ' ', (int) (short) 100, 0.0d, localDateTime61, localDateTime62);
        java.lang.Class<?> wildcardClass64 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) -1, 0, (int) (short) 0, 0.0d, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (byte) 100, (int) (short) 10, 100, (double) 10, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) (short) 0, (int) (byte) 100, 100, (double) (short) 0, localDateTime54, localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) -1, (int) 'a', (double) (byte) 10, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom((int) (byte) -1, (int) (short) 0, 0, (double) 1L, localDateTime34, localDateTime35);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = systemFacade0.bookRoom((int) (byte) 10, (-1), (int) '4', (double) (short) -1, localDateTime41, localDateTime42);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = systemFacade0.bookRoom((int) (byte) 10, 1, (int) (byte) 0, (double) 1.0f, localDateTime48, localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 1, (int) (byte) 100, (int) (short) 100, (double) (short) 0, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) (short) 0, (int) ' ', 0, (double) (-1.0f), localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking((int) (short) 10, (-1), 0, (double) 100.0f, localDateTime54, localDateTime55);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = bookingController0.createBooking(10, (int) (byte) 0, (int) ' ', (double) 0.0f, localDateTime61, localDateTime62);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = systemFacade0.bookRoom((int) '4', (int) (short) 1, (int) (byte) 0, (double) 10.0f, localDateTime21, localDateTime22);
// flaky "116) test270(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "90) test270(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "76) test270(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "70) test270(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "61) test270(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "47) test270(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "37) test270(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "32) test270(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "26) test270(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking(100, (int) '#', (int) (short) 1, (double) 'a', localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) 10, (int) '4', 0, (double) 'a', localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (short) 100, (int) '#', (int) (byte) 100, (-1.0d), localDateTime33, localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(0, (int) '#', (int) 'a', (-1.0d), localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) 1, (int) '4', (double) (byte) -1, localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = systemFacade0.bookRoom((int) (short) 0, (int) (byte) 1, (int) (short) -1, (double) 0L, localDateTime30, localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking((int) (short) 1, (int) (short) 10, (int) (byte) 0, (double) (short) -1, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((-1), (int) ' ', 100, (double) 100, localDateTime19, localDateTime20);
        java.lang.Class<?> wildcardClass22 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = systemFacade0.bookRoom((int) 'a', (int) (byte) 0, 1, (double) (short) 1, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = systemFacade0.bookRoom((int) (short) -1, (int) (short) 0, (int) (short) -1, (double) 100, localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = systemFacade0.bookRoom((int) (byte) 1, (int) (short) 100, (int) (byte) 1, 100.0d, localDateTime25, localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = systemFacade0.bookRoom((int) 'a', (int) (byte) 1, (int) 'a', (double) 'a', localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = systemFacade0.bookRoom(10, (int) (byte) -1, (int) (byte) 10, (double) (short) 0, localDateTime16, localDateTime17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) '4', 10, (int) (short) -1, (double) (short) 0, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = systemFacade0.bookRoom((int) (short) 100, (int) (short) 1, (int) ' ', (double) (short) 0, localDateTime34, localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = systemFacade0.bookRoom(0, (int) (short) -1, (int) (byte) 1, 0.0d, localDateTime13, localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = systemFacade0.bookRoom((int) (short) 0, (int) (short) 1, (int) '4', (double) 1L, localDateTime9, localDateTime10);
// flaky "117) test277(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "91) test277(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "77) test277(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = systemFacade0.bookRoom((int) (short) 100, (int) '4', (int) (byte) 10, (double) (byte) 0, localDateTime11, localDateTime12);
// flaky "118) test278(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "92) test278(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "78) test278(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "71) test278(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        dataModels.Room room43 = null;
        boolean boolean44 = roomController0.deleteRoom(room43);
        dataModels.Room room45 = null;
        boolean boolean46 = roomController0.deleteRoom(room45);
        dataModels.Room room47 = null;
        boolean boolean48 = roomController0.deleteRoom(room47);
        dataModels.Room room49 = null;
        boolean boolean50 = roomController0.deleteRoom(room49);
        dataModels.Room room51 = null;
        boolean boolean52 = roomController0.deleteRoom(room51);
        dataModels.Room room53 = null;
        boolean boolean54 = roomController0.deleteRoom(room53);
        dataModels.Room room55 = null;
        boolean boolean56 = roomController0.deleteRoom(room55);
        dataModels.Room room57 = null;
        boolean boolean58 = roomController0.deleteRoom(room57);
        dataModels.Room room59 = null;
        boolean boolean60 = roomController0.deleteRoom(room59);
        dataModels.Room room61 = null;
        boolean boolean62 = roomController0.deleteRoom(room61);
        dataModels.Room room63 = null;
        boolean boolean64 = roomController0.deleteRoom(room63);
        dataModels.Room room65 = null;
        boolean boolean66 = roomController0.deleteRoom(room65);
        dataModels.Room room67 = null;
        boolean boolean68 = roomController0.deleteRoom(room67);
// flaky "119) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "93) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "79) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "72) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "62) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "48) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "38) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "33) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "27) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "23) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "18) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "16) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "13) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "11) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "10) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "9) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "9) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "8) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "8) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "8) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "7) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "6) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "6) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "5) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "4) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky "4) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "3) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky "2) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky "2) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky "2) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky "1) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// flaky "1) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky "1) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky "1) test279(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        dataModels.Room room43 = null;
        boolean boolean44 = roomController0.deleteRoom(room43);
        dataModels.Room room45 = null;
        boolean boolean46 = roomController0.deleteRoom(room45);
        dataModels.Room room47 = null;
        boolean boolean48 = roomController0.deleteRoom(room47);
        dataModels.Room room49 = null;
        boolean boolean50 = roomController0.deleteRoom(room49);
        dataModels.Room room51 = null;
        boolean boolean52 = roomController0.deleteRoom(room51);
        dataModels.Room room53 = null;
        boolean boolean54 = roomController0.deleteRoom(room53);
        dataModels.Room room55 = null;
        boolean boolean56 = roomController0.deleteRoom(room55);
        dataModels.Room room57 = null;
        boolean boolean58 = roomController0.deleteRoom(room57);
        dataModels.Room room59 = null;
        boolean boolean60 = roomController0.deleteRoom(room59);
        dataModels.Room room61 = null;
        boolean boolean62 = roomController0.deleteRoom(room61);
        dataModels.Room room63 = null;
        boolean boolean64 = roomController0.deleteRoom(room63);
        dataModels.Room room65 = null;
        boolean boolean66 = roomController0.deleteRoom(room65);
        java.lang.Class<?> wildcardClass67 = roomController0.getClass();
// flaky "120) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "94) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "80) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "73) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "63) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "49) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "39) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "34) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "28) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "24) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "19) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "17) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "14) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "12) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "11) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "10) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "10) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "9) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "9) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "9) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "8) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "7) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "7) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "6) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "5) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky "5) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "4) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky "3) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky "3) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky "3) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky "2) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// flaky "2) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky "2) test280(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = systemFacade0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = systemFacade0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = systemFacade0.deleteRoom(room29);
// flaky "121) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "95) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "81) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "74) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "64) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "50) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "40) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "35) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "29) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "25) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "20) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "18) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "15) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "13) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "12) test281(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = systemFacade0.bookRoom((int) '#', (int) (short) -1, 0, 0.0d, localDateTime19, localDateTime20);
// flaky "122) test282(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "96) test282(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "82) test282(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "75) test282(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "65) test282(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "51) test282(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "41) test282(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "36) test282(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, 10, (int) (byte) -1, (double) 0.0f, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (short) 0, (int) 'a', 100, 0.0d, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) 10, (int) '4', 0, (double) 1, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking(1, 0, 100, (double) ' ', localDateTime33, localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = systemFacade0.bookRoom(10, (int) '#', (int) (byte) -1, (double) 'a', localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = systemFacade0.bookRoom((int) 'a', 0, (int) ' ', (double) 0L, localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = systemFacade0.bookRoom((int) ' ', (int) (short) 100, 10, (double) 100, localDateTime27, localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = systemFacade0.deleteRoom(room25);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = systemFacade0.bookRoom(0, (int) (byte) -1, (int) (short) 1, 1.0d, localDateTime31, localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        java.lang.Class<?> wildcardClass23 = systemFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (short) -1, (int) (short) 1, (int) (byte) 100, 0.0d, localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) (byte) 10, 10, 10, (double) 0, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (short) 100, (int) 'a', (int) 'a', (double) '#', localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking((int) '4', (int) ' ', (int) '4', (double) (byte) 0, localDateTime47, localDateTime48);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = bookingController0.createBooking(10, (int) (short) 1, 10, (double) (byte) 10, localDateTime54, localDateTime55);
        java.lang.Class<?> wildcardClass57 = bookingController0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = systemFacade0.bookRoom((int) (short) 10, (int) (byte) 0, (int) (byte) -1, (double) (short) 10, localDateTime15, localDateTime16);
        dataModels.Room room18 = null;
        boolean boolean19 = systemFacade0.deleteRoom(room18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = systemFacade0.bookRoom((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (-1.0d), localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = systemFacade0.bookRoom((int) (byte) 10, (int) (byte) 0, 10, (double) (byte) 100, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = systemFacade0.bookRoom(1, (int) '#', 10, (double) 0.0f, localDateTime38, localDateTime39);
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = systemFacade0.bookRoom((int) (short) -1, (int) (short) -1, (int) (short) 10, 0.0d, localDateTime45, localDateTime46);
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        boolean boolean54 = systemFacade0.bookRoom(100, (int) (short) 10, (int) (short) -1, (double) 100L, localDateTime52, localDateTime53);
        dataModels.Room room55 = null;
        boolean boolean56 = systemFacade0.deleteRoom(room55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        controller.BookingController bookingController0 = new controller.BookingController();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = bookingController0.createBooking((int) (byte) 1, (int) (short) 0, (int) '4', (double) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = bookingController0.createBooking(10, (int) ' ', 100, (double) (byte) 0, localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = bookingController0.createBooking((int) (byte) 100, (int) (short) -1, (int) (short) 100, (double) (byte) -1, localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = bookingController0.createBooking((int) (byte) 100, (int) (byte) -1, 0, (double) (-1), localDateTime26, localDateTime27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = bookingController0.createBooking((int) ' ', (int) (byte) 1, (int) (byte) 100, (double) (byte) 1, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = bookingController0.createBooking((int) (byte) 0, (int) (byte) 1, (int) '4', (double) (short) 10, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = bookingController0.createBooking(100, 10, 100, (double) (byte) 0, localDateTime47, localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = systemFacade0.bookRoom((int) 'a', (int) (short) 10, (int) 'a', (double) (byte) 100, localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = systemFacade0.bookRoom((int) (short) 10, (int) '4', (int) (byte) 10, (double) (short) 1, localDateTime28, localDateTime29);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = systemFacade0.bookRoom(0, (int) (byte) 10, (int) 'a', (double) ' ', localDateTime35, localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        java.lang.Class<?> wildcardClass39 = roomController0.getClass();
// flaky "123) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "97) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "83) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "76) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "66) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "52) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "42) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "37) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "30) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "26) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "21) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "19) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "16) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "14) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "13) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "11) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "11) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "10) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "10) test291(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemFacade0.bookRoom(1, (int) (byte) -1, (int) (byte) 100, (double) 100.0f, localDateTime7, localDateTime8);
// flaky "124) test292(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "98) test292(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        controller.SystemFacade systemFacade0 = new controller.SystemFacade();
        dataModels.Room room1 = null;
        boolean boolean2 = systemFacade0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = systemFacade0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = systemFacade0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = systemFacade0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = systemFacade0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = systemFacade0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = systemFacade0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = systemFacade0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = systemFacade0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = systemFacade0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = systemFacade0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = systemFacade0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = systemFacade0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = systemFacade0.deleteRoom(room27);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = systemFacade0.bookRoom(100, (int) '#', (int) (byte) 10, (double) 'a', localDateTime33, localDateTime34);
// flaky "125) test293(randoop_test.controller.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "99) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "84) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "77) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "67) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "53) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "43) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "38) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "31) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "27) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "22) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "20) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "17) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "15) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "14) test293(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        controller.RoomController roomController0 = new controller.RoomController();
        dataModels.Room room1 = null;
        boolean boolean2 = roomController0.deleteRoom(room1);
        dataModels.Room room3 = null;
        boolean boolean4 = roomController0.deleteRoom(room3);
        dataModels.Room room5 = null;
        boolean boolean6 = roomController0.deleteRoom(room5);
        dataModels.Room room7 = null;
        boolean boolean8 = roomController0.deleteRoom(room7);
        dataModels.Room room9 = null;
        boolean boolean10 = roomController0.deleteRoom(room9);
        dataModels.Room room11 = null;
        boolean boolean12 = roomController0.deleteRoom(room11);
        dataModels.Room room13 = null;
        boolean boolean14 = roomController0.deleteRoom(room13);
        dataModels.Room room15 = null;
        boolean boolean16 = roomController0.deleteRoom(room15);
        dataModels.Room room17 = null;
        boolean boolean18 = roomController0.deleteRoom(room17);
        dataModels.Room room19 = null;
        boolean boolean20 = roomController0.deleteRoom(room19);
        dataModels.Room room21 = null;
        boolean boolean22 = roomController0.deleteRoom(room21);
        dataModels.Room room23 = null;
        boolean boolean24 = roomController0.deleteRoom(room23);
        dataModels.Room room25 = null;
        boolean boolean26 = roomController0.deleteRoom(room25);
        dataModels.Room room27 = null;
        boolean boolean28 = roomController0.deleteRoom(room27);
        dataModels.Room room29 = null;
        boolean boolean30 = roomController0.deleteRoom(room29);
        dataModels.Room room31 = null;
        boolean boolean32 = roomController0.deleteRoom(room31);
        dataModels.Room room33 = null;
        boolean boolean34 = roomController0.deleteRoom(room33);
        dataModels.Room room35 = null;
        boolean boolean36 = roomController0.deleteRoom(room35);
        dataModels.Room room37 = null;
        boolean boolean38 = roomController0.deleteRoom(room37);
        dataModels.Room room39 = null;
        boolean boolean40 = roomController0.deleteRoom(room39);
        dataModels.Room room41 = null;
        boolean boolean42 = roomController0.deleteRoom(room41);
        dataModels.Room room43 = null;
        boolean boolean44 = roomController0.deleteRoom(room43);
        dataModels.Room room45 = null;
        boolean boolean46 = roomController0.deleteRoom(room45);
        dataModels.Room room47 = null;
        boolean boolean48 = roomController0.deleteRoom(room47);
        dataModels.Room room49 = null;
        boolean boolean50 = roomController0.deleteRoom(room49);
        dataModels.Room room51 = null;
        boolean boolean52 = roomController0.deleteRoom(room51);
        dataModels.Room room53 = null;
        boolean boolean54 = roomController0.deleteRoom(room53);
        dataModels.Room room55 = null;
        boolean boolean56 = roomController0.deleteRoom(room55);
        dataModels.Room room57 = null;
        boolean boolean58 = roomController0.deleteRoom(room57);
        dataModels.Room room59 = null;
        boolean boolean60 = roomController0.deleteRoom(room59);
        dataModels.Room room61 = null;
        boolean boolean62 = roomController0.deleteRoom(room61);
        java.lang.Class<?> wildcardClass63 = roomController0.getClass();
// flaky "126) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "100) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "85) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "78) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "68) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "54) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "44) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "39) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "32) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "28) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "23) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "21) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "18) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "16) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "15) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "12) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "12) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "11) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "11) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "10) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "9) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "8) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "8) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "7) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky "6) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky "6) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "5) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky "4) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky "4) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky "4) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky "3) test294(randoop_test.controller.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }
}
