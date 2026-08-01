package database.singleton;

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
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        dataModels.Booking booking8 = null;
        database0.deleteBooking(booking8);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType4 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        dataModels.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteUser(user1);
// flaky "1) test003(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getUserID()\" because \"currentUser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.User> userList2 = database0.users;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType4 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        java.lang.Class<?> wildcardClass3 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteUser(user7);
// flaky "2) test006(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getUserID()\" because \"currentUser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "1) test006(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "1) test006(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteUser(user9);
// flaky "3) test007(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getUserID()\" because \"currentUser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "2) test007(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "2) test007(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        dataModels.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room11);
// flaky "4) test008(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "3) test008(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
// flaky "3) test008(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
// flaky "1) test008(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        java.lang.Class<?> wildcardClass9 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "5) test009(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "4) test009(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType9 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "6) test010(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "5) test010(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        java.lang.Class<?> wildcardClass3 = bookingList2.getClass();
        org.junit.Assert.assertNotNull(database0);
// flaky "7) test011(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType14 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "8) test012(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "6) test012(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
// flaky "4) test012(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList10);
// flaky "2) test012(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType10 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "9) test013(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "7) test013(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        dataModels.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room12);
// flaky "10) test014(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "8) test014(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
// flaky "5) test014(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
// flaky "3) test014(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.lang.Class<?> wildcardClass11 = bookingList8.getClass();
        org.junit.Assert.assertNotNull(database0);
// flaky "11) test015(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
// flaky "9) test015(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
// flaky "6) test015(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        dataModels.User user4 = database0.validateLogin("", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        java.lang.Class<?> wildcardClass3 = roomList2.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType4 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(roomList2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database0.bookings;
        java.lang.Class<?> wildcardClass17 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.User> userList2 = database0.users;
        dataModels.Room room3 = null;
        database0.deleteRoom(room3);
        int int5 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType13 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.lang.Class<?> wildcardClass11 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList1 = database0.users;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType3 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.User[] userArray12 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList13 = new java.util.ArrayList<dataModels.User>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList13, userArray12);
        database0.users = userList13;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userArray12);
        org.junit.Assert.assertArrayEquals(userArray12, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        boolean boolean13 = database0.emailExists("hi!");
        dataModels.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room14);
// flaky "12) test027(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "10) test027(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
// flaky "7) test027(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
// flaky "4) test027(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList3 = null;
        database0.rooms = roomList3;
        java.lang.Class<?> wildcardClass5 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
// flaky "13) test028(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User user3 = null;
        database0.deleteUser(user3);
        java.util.ArrayList<dataModels.Booking> bookingList5 = database0.bookings;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType7 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.lang.Class<?> wildcardClass2 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
// flaky "14) test030(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User user8 = null;
        database0.deleteUser(user8);
        java.lang.Class<?> wildcardClass10 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "15) test031(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "11) test031(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        boolean boolean13 = database0.emailExists("hi!");
        int int14 = database0.getNextUserID();
        dataModels.Room room15 = null;
// flaky "16) test032(randoop_test.database.singleton.RegressionTest0)":         database0.deleteRoom(room15);
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList18 = database17.rooms;
        java.util.ArrayList<dataModels.User> userList19 = database17.users;
        database0.users = userList19;
        org.junit.Assert.assertNotNull(database0);
// flaky "12) test032(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
// flaky "8) test032(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
// flaky "5) test032(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(database17);
// flaky "1) test032(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType3 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        dataModels.User user5 = database0.validateLogin("hi!", "");
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.User> userList8 = database6.users;
        dataModels.Room room9 = null;
// flaky "17) test034(randoop_test.database.singleton.RegressionTest0)":         database6.deleteRoom(room9);
        java.util.ArrayList<dataModels.Room> roomList11 = database6.rooms;
        database0.rooms = roomList11;
        org.junit.Assert.assertNotNull(database0);
// flaky "13) test034(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
// flaky "9) test034(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(database6);
// flaky "6) test034(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(userList8);
// flaky "2) test034(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.Room room3 = null;
// flaky "18) test035(randoop_test.database.singleton.RegressionTest0)":         database0.deleteRoom(room3);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.Booking booking9 = null;
        database0.deleteBooking(booking9);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList3 = database0.rooms;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType5 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "19) test037(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
// flaky "14) test037(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
// flaky "10) test037(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        int int13 = database0.getNextUserID();
        boolean boolean15 = database0.emailExists("hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "20) test038(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "15) test038(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
// flaky "11) test038(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList10);
// flaky "7) test038(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType13 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "21) test039(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "16) test039(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList1 = database0.users;
        java.lang.Class<?> wildcardClass2 = userList1.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList3 = database0.rooms;
        dataModels.Room room4 = null;
// flaky "22) test041(randoop_test.database.singleton.RegressionTest0)":         database0.deleteRoom(room4);
        org.junit.Assert.assertNotNull(database0);
// flaky "17) test041(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
// flaky "12) test041(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
// flaky "8) test041(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        int int13 = database0.getNextUserID();
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType15 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "23) test042(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "18) test042(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database0.bookings;
        java.util.ArrayList<dataModels.Booking> bookingList9 = database0.bookings;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType11 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "24) test043(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "19) test043(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList3 = null;
        database0.rooms = roomList3;
        dataModels.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteUser(user5);
// flaky "25) test044(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getUserID()\" because \"currentUser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "20) test044(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType13 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType15 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNull(roomList10);
        org.junit.Assert.assertNull(roomList11);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        dataModels.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "26) test048(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "21) test048(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
// flaky "13) test048(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.Room room9 = null;
// flaky "27) test049(randoop_test.database.singleton.RegressionTest0)":         database0.deleteRoom(room9);
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType12 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "22) test049(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "14) test049(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        java.lang.Class<?> wildcardClass16 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "28) test050(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "23) test050(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
// flaky "15) test050(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList3 = null;
        database0.rooms = roomList3;
        database.singleton.Database database5 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList6 = database5.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database5.bookings;
        boolean boolean9 = database5.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList10 = database5.users;
        database0.users = userList10;
        // The following exception was thrown during execution in test generation
        try {
            database0.loadRooms();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "29) test051(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database5);
        org.junit.Assert.assertNull(roomList6);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        int int16 = database0.getNextUserID();
        dataModels.User user19 = database0.validateLogin("", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        boolean boolean12 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        dataModels.Room room14 = null;
        database0.deleteRoom(room14);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        dataModels.User user12 = null;
        database0.deleteUser(user12);
        dataModels.Room room14 = null;
        database0.deleteRoom(room14);
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType17 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList1 = database0.users;
        dataModels.User user2 = null;
        database0.deleteUser(user2);
        dataModels.Room room4 = null;
        database0.deleteRoom(room4);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        dataModels.Booking[] bookingArray6 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList7 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList7, bookingArray6);
        database3.bookings = bookingList7;
        java.util.ArrayList<dataModels.User> userList10 = database3.users;
        database0.users = userList10;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType13 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(bookingArray6);
        org.junit.Assert.assertArrayEquals(bookingArray6, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        int int13 = database0.getNextUserID();
        dataModels.Booking booking14 = null;
        database0.deleteBooking(booking14);
        dataModels.Room room16 = null;
        database0.deleteRoom(room16);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        int int9 = database0.getNextUserID();
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType11 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = database0.emailExists("hi!");
// flaky "30) test059(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getEmail()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "24) test059(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "16) test059(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
// flaky "9) test059(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList10);
// flaky "3) test059(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList17 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList18 = database16.rooms;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database16.bookings = bookingList21;
        java.util.ArrayList<dataModels.User> userList23 = database16.users;
        dataModels.User user24 = null;
        database16.deleteUser(user24);
        boolean boolean27 = database16.emailExists("hi!");
        java.util.ArrayList<dataModels.Booking> bookingList28 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList29 = database16.rooms;
        database0.rooms = roomList29;
        database.singleton.Database database31 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList32 = database31.bookings;
        int int33 = database31.getNextUserID();
        dataModels.User[] userArray34 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList35 = new java.util.ArrayList<dataModels.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList35, userArray34);
        database31.users = userList35;
        int int38 = database31.getNextUserID();
        java.util.ArrayList<dataModels.User> userList39 = database31.users;
        dataModels.User user42 = database31.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList43 = database31.users;
        database0.users = userList43;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(roomList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(roomList29);
        org.junit.Assert.assertNotNull(database31);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(userArray34);
        org.junit.Assert.assertArrayEquals(userArray34, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNull(user42);
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        boolean boolean13 = database0.emailExists("hi!");
        // The following exception was thrown during execution in test generation
        try {
// flaky "31) test061(randoop_test.database.singleton.RegressionTest0)":             database0.loadBookings();
// flaky "25) test061(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
// flaky "17) test061(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "10) test061(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
// flaky "4) test061(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        boolean boolean13 = database0.emailExists("");
        // The following exception was thrown during execution in test generation
        try {
// flaky "32) test062(randoop_test.database.singleton.RegressionTest0)":             database0.loadBookings();
// flaky "26) test062(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "18) test062(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
// flaky "11) test062(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType15 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "33) test063(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        database.singleton.Database database2 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList3 = database2.bookings;
        java.util.ArrayList<dataModels.Room> roomList4 = database2.rooms;
        database.singleton.Database database5 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList6 = database5.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database5.bookings;
        database2.bookings = bookingList7;
        java.util.ArrayList<dataModels.User> userList9 = database2.users;
        java.util.ArrayList<dataModels.Booking> bookingList10 = database2.bookings;
        database0.bookings = bookingList10;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        int int14 = database12.getNextUserID();
        dataModels.User[] userArray15 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList16 = new java.util.ArrayList<dataModels.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList16, userArray15);
        database12.users = userList16;
        int int19 = database12.getNextUserID();
        java.util.ArrayList<dataModels.User> userList20 = database12.users;
        dataModels.User user23 = database12.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList24 = database12.users;
        database0.users = userList24;
        org.junit.Assert.assertNotNull(database0);
// flaky "34) test064(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNotNull(database2);
// flaky "27) test064(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(database5);
        org.junit.Assert.assertNotNull(roomList6);
// flaky "19) test064(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(userList9);
// flaky "12) test064(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNotNull(database12);
// flaky "5) test064(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(userArray15);
        org.junit.Assert.assertArrayEquals(userArray15, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        database0.bookings = bookingList13;
        boolean boolean16 = database0.emailExists("hi!");
        org.junit.Assert.assertNotNull(database0);
// flaky "35) test065(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
// flaky "28) test065(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
// flaky "20) test065(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        dataModels.Booking[] bookingArray6 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList7 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList7, bookingArray6);
        database3.bookings = bookingList7;
        java.util.ArrayList<dataModels.User> userList10 = database3.users;
        database0.users = userList10;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType13 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
// flaky "36) test066(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(bookingArray6);
        org.junit.Assert.assertArrayEquals(bookingArray6, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        dataModels.Room room12 = null;
        database0.deleteRoom(room12);
        dataModels.Room room14 = null;
        database0.deleteRoom(room14);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        boolean boolean15 = database0.emailExists("hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList3 = database0.rooms;
        java.lang.Class<?> wildcardClass4 = roomList3.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(roomList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList17 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList18 = database16.rooms;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database16.bookings = bookingList21;
        java.util.ArrayList<dataModels.User> userList23 = database16.users;
        dataModels.User user24 = null;
        database16.deleteUser(user24);
        boolean boolean27 = database16.emailExists("hi!");
        java.util.ArrayList<dataModels.Booking> bookingList28 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList29 = database16.rooms;
        database0.rooms = roomList29;
        database.singleton.Database database31 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList32 = database31.bookings;
        int int33 = database31.getNextUserID();
        dataModels.User[] userArray34 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList35 = new java.util.ArrayList<dataModels.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList35, userArray34);
        database31.users = userList35;
        int int38 = database31.getNextUserID();
        java.util.ArrayList<dataModels.User> userList39 = database31.users;
        database0.users = userList39;
        java.lang.Class<?> wildcardClass41 = userList39.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(roomList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(roomList29);
        org.junit.Assert.assertNotNull(database31);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(userArray34);
        org.junit.Assert.assertArrayEquals(userArray34, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        boolean boolean4 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList5 = database0.users;
        int int6 = database0.getNextUserID();
        java.util.ArrayList<dataModels.Booking> bookingList7 = null;
        database0.bookings = bookingList7;
        java.util.ArrayList<dataModels.Booking> bookingList9 = database0.bookings;
        int int10 = database0.getNextUserID();
        database.singleton.Database database11 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList12 = database11.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList13 = database11.bookings;
        dataModels.Booking[] bookingArray14 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList15 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList15, bookingArray14);
        database11.bookings = bookingList15;
        java.util.ArrayList<dataModels.User> userList18 = database11.users;
        database0.users = userList18;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(database11);
        org.junit.Assert.assertNotNull(roomList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingArray14);
        org.junit.Assert.assertArrayEquals(bookingArray14, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        java.util.ArrayList<dataModels.Room> roomList12 = database0.rooms;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType14 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(roomList12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        dataModels.User user14 = database0.validateLogin("", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList17 = database16.rooms;
        database0.rooms = roomList17;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType20 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "37) test074(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "29) test074(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
// flaky "21) test074(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
// flaky "13) test074(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        dataModels.User user13 = null;
        database0.deleteUser(user13);
        // The following exception was thrown during execution in test generation
        try {
// flaky "38) test075(randoop_test.database.singleton.RegressionTest0)":             database0.loadRooms();
// flaky "30) test075(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
// flaky "22) test075(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList8);
// flaky "14) test075(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        int int13 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList14 = null;
        database0.users = userList14;
        dataModels.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room16);
// flaky "39) test076(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "31) test076(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "23) test076(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
// flaky "15) test076(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList10);
// flaky "6) test076(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user16 = null;
        database0.deleteUser(user16);
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType19 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "40) test077(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "32) test077(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
// flaky "24) test077(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        int int13 = database0.getNextUserID();
        dataModels.Booking booking14 = null;
        database0.deleteBooking(booking14);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "41) test078(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "33) test078(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
// flaky "25) test078(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList10);
// flaky "16) test078(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.Booking booking9 = null;
        database0.deleteBooking(booking9);
        boolean boolean12 = database0.emailExists("");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "42) test079(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "34) test079(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        int int13 = database0.getNextUserID();
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        java.util.ArrayList<dataModels.Room> roomList16 = database14.rooms;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList18 = database17.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList19 = database17.bookings;
        database14.bookings = bookingList19;
        dataModels.Booking booking21 = null;
        database14.deleteBooking(booking21);
        dataModels.User user25 = database14.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList26 = database14.bookings;
        database0.bookings = bookingList26;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(roomList16);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNotNull(bookingList26);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        boolean boolean12 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        int int14 = database0.getNextUserID();
        java.lang.Class<?> wildcardClass15 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User user8 = null;
        database0.deleteUser(user8);
        dataModels.User user12 = database0.validateLogin("hi!", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        boolean boolean14 = database0.emailExists("hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(roomList8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        java.util.ArrayList<dataModels.Room> roomList14 = null;
        database0.rooms = roomList14;
        dataModels.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.lang.Class<?> wildcardClass2 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType14 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNull(roomList10);
        org.junit.Assert.assertNull(roomList11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database0.bookings;
        // The following exception was thrown during execution in test generation
        try {
            database0.loadRooms();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "43) test087(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
// flaky "35) test087(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
// flaky "26) test087(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList17 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList18 = database16.rooms;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database16.bookings = bookingList21;
        java.util.ArrayList<dataModels.User> userList23 = database16.users;
        dataModels.User user24 = null;
        database16.deleteUser(user24);
        boolean boolean27 = database16.emailExists("hi!");
        java.util.ArrayList<dataModels.Booking> bookingList28 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList29 = database16.rooms;
        database0.rooms = roomList29;
        database.singleton.Database database31 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList32 = database31.bookings;
        int int33 = database31.getNextUserID();
        dataModels.User[] userArray34 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList35 = new java.util.ArrayList<dataModels.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList35, userArray34);
        database31.users = userList35;
        int int38 = database31.getNextUserID();
        java.util.ArrayList<dataModels.User> userList39 = database31.users;
        database0.users = userList39;
        java.lang.Class<?> wildcardClass41 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(roomList18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNull(roomList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNull(roomList29);
        org.junit.Assert.assertNotNull(database31);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(userArray34);
        org.junit.Assert.assertArrayEquals(userArray34, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        database0.bookings = bookingList9;
        dataModels.User user13 = database0.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Room> roomList14 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "44) test089(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "36) test089(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNull(user13);
// flaky "27) test089(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        java.util.ArrayList<dataModels.Room> roomList16 = database14.rooms;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList18 = database17.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList19 = database17.bookings;
        database14.bookings = bookingList19;
        java.util.ArrayList<dataModels.User> userList21 = database14.users;
        dataModels.User[] userArray22 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList23 = new java.util.ArrayList<dataModels.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList23, userArray22);
        database14.users = userList23;
        database.singleton.Database database26 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList27 = database26.bookings;
        database14.bookings = bookingList27;
        database0.bookings = bookingList27;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType31 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
// flaky "45) test090(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList8);
// flaky "37) test090(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(bookingList15);
// flaky "28) test090(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList16);
        org.junit.Assert.assertNotNull(database17);
// flaky "17) test090(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userArray22);
        org.junit.Assert.assertArrayEquals(userArray22, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(database26);
        org.junit.Assert.assertNotNull(bookingList27);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database0.bookings = bookingList15;
        dataModels.User user19 = database0.validateLogin("hi!", "");
        dataModels.User user20 = null;
        database0.deleteUser(user20);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(database13);
// flaky "46) test091(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        java.util.ArrayList<dataModels.Room> roomList10 = database8.rooms;
        database0.rooms = roomList10;
        dataModels.User user12 = null;
        database0.deleteUser(user12);
        java.lang.Class<?> wildcardClass14 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "47) test092(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "38) test092(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
// flaky "29) test092(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        int int9 = database0.getNextUserID();
        java.util.ArrayList<dataModels.Booking> bookingList10 = database0.bookings;
        dataModels.Booking booking11 = null;
        database0.deleteBooking(booking11);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "48) test093(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "39) test093(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        int int9 = database0.getNextUserID();
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList11 = database10.bookings;
        java.util.ArrayList<dataModels.Room> roomList12 = database10.rooms;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database10.bookings = bookingList15;
        dataModels.Booking booking17 = null;
        database10.deleteBooking(booking17);
        dataModels.User user21 = database10.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList22 = database10.bookings;
        database0.bookings = bookingList22;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "49) test094(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "40) test094(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(bookingList11);
// flaky "30) test094(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList12);
        org.junit.Assert.assertNotNull(database13);
// flaky "18) test094(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNotNull(bookingList22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        dataModels.User user12 = null;
        database0.deleteUser(user12);
        dataModels.Room room14 = null;
// flaky "50) test095(randoop_test.database.singleton.RegressionTest0)":         database0.deleteRoom(room14);
        dataModels.User user18 = database0.validateLogin("", "");
        org.junit.Assert.assertNotNull(database0);
// flaky "41) test095(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
// flaky "31) test095(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
// flaky "19) test095(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        java.util.ArrayList<dataModels.Room> roomList10 = database8.rooms;
        database0.rooms = roomList10;
        boolean boolean13 = database0.emailExists("hi!");
        dataModels.Room room14 = null;
// flaky "51) test096(randoop_test.database.singleton.RegressionTest0)":         database0.deleteRoom(room14);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "42) test096(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "32) test096(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
// flaky "20) test096(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database0.bookings;
        java.util.ArrayList<dataModels.User> userList17 = database0.users;
        database.singleton.Database database18 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList19 = database18.bookings;
        java.util.ArrayList<dataModels.Room> roomList20 = database18.rooms;
        database.singleton.Database database21 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList22 = database21.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList23 = database21.bookings;
        database18.bookings = bookingList23;
        java.util.ArrayList<dataModels.User> userList25 = database18.users;
        dataModels.User user26 = null;
        database18.deleteUser(user26);
        boolean boolean29 = database18.emailExists("hi!");
        java.util.ArrayList<dataModels.Booking> bookingList30 = database18.bookings;
        java.util.ArrayList<dataModels.Room> roomList31 = database18.rooms;
        database0.rooms = roomList31;
        dataModels.User user33 = null;
        database0.deleteUser(user33);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "52) test097(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "43) test097(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
// flaky "33) test097(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(database18);
        org.junit.Assert.assertNotNull(bookingList19);
// flaky "21) test097(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList20);
        org.junit.Assert.assertNotNull(database21);
// flaky "7) test097(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList22);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingList30);
// flaky "1) test097(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList31);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.Booking booking9 = null;
        database0.deleteBooking(booking9);
        dataModels.Room[] roomArray11 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList12 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList12, roomArray11);
        database0.rooms = roomList12;
        java.util.ArrayList<dataModels.Room> roomList15 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "53) test098(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "44) test098(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(roomArray11);
        org.junit.Assert.assertArrayEquals(roomArray11, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(roomList15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        dataModels.User user9 = database0.validateLogin("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType11 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        dataModels.User user9 = database0.validateLogin("hi!", "hi!");
        dataModels.Room room10 = null;
        database0.deleteRoom(room10);
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList16 = database15.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList17 = database15.bookings;
        database12.bookings = bookingList17;
        dataModels.Booking booking19 = null;
        database12.deleteBooking(booking19);
        dataModels.User user23 = database12.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList24 = database12.bookings;
        database0.bookings = bookingList24;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNotNull(roomList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertNotNull(bookingList24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database0.bookings;
        java.util.ArrayList<dataModels.User> userList17 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList18 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        dataModels.User user13 = database0.validateLogin("hi!", "");
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        java.util.ArrayList<dataModels.Room> roomList16 = database14.rooms;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList18 = database17.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList19 = database17.bookings;
        database14.bookings = bookingList19;
        java.util.ArrayList<dataModels.User> userList21 = database14.users;
        dataModels.User[] userArray22 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList23 = new java.util.ArrayList<dataModels.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList23, userArray22);
        database14.users = userList23;
        database.singleton.Database database26 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList27 = database26.bookings;
        java.util.ArrayList<dataModels.Room> roomList28 = database26.rooms;
        database14.rooms = roomList28;
        java.util.ArrayList<dataModels.Booking> bookingList30 = database14.bookings;
        java.util.ArrayList<dataModels.User> userList31 = database14.users;
        database0.users = userList31;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType34 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(roomList16);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userArray22);
        org.junit.Assert.assertArrayEquals(userArray22, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(database26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNotNull(roomList28);
        org.junit.Assert.assertNotNull(bookingList30);
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database0.bookings = bookingList15;
        dataModels.User user19 = database0.validateLogin("", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        dataModels.User user9 = database0.validateLogin("hi!", "hi!");
        dataModels.Room room10 = null;
        database0.deleteRoom(room10);
        dataModels.Booking booking12 = null;
        database0.deleteBooking(booking12);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        int int13 = database0.getNextUserID();
        dataModels.Booking booking14 = null;
        database0.deleteBooking(booking14);
        dataModels.User user18 = database0.validateLogin("", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        java.util.ArrayList<dataModels.Booking> bookingList9 = database0.bookings;
        int int10 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        dataModels.User user9 = database0.validateLogin("hi!", "hi!");
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList11 = database10.bookings;
        java.util.ArrayList<dataModels.Room> roomList12 = database10.rooms;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database10.bookings = bookingList15;
        java.util.ArrayList<dataModels.User> userList17 = database10.users;
        dataModels.User[] userArray18 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList19 = new java.util.ArrayList<dataModels.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList19, userArray18);
        database10.users = userList19;
        database.singleton.Database database22 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList23 = database22.bookings;
        java.util.ArrayList<dataModels.Room> roomList24 = database22.rooms;
        database10.rooms = roomList24;
        java.util.ArrayList<dataModels.Booking> bookingList26 = database10.bookings;
        database0.bookings = bookingList26;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType29 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNotNull(roomList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userArray18);
        org.junit.Assert.assertArrayEquals(userArray18, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(database22);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(roomList24);
        org.junit.Assert.assertNotNull(bookingList26);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        boolean boolean13 = database0.emailExists("");
        java.util.ArrayList<dataModels.User> userList14 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database0.bookings;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.Booking booking9 = null;
        database0.deleteBooking(booking9);
        dataModels.Room[] roomArray11 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList12 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList12, roomArray11);
        database0.rooms = roomList12;
        dataModels.Booking booking15 = null;
        database0.deleteBooking(booking15);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(roomArray11);
        org.junit.Assert.assertArrayEquals(roomArray11, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.Booking booking9 = null;
        database0.deleteBooking(booking9);
        dataModels.Room[] roomArray11 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList12 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList12, roomArray11);
        database0.rooms = roomList12;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType16 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(roomArray11);
        org.junit.Assert.assertArrayEquals(roomArray11, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        int int13 = database0.getNextUserID();
        dataModels.User user16 = database0.validateLogin("", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User user8 = null;
        database0.deleteUser(user8);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "hi!");
        int int19 = database0.getNextUserID();
        java.lang.Class<?> wildcardClass20 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        dataModels.Booking booking13 = null;
        database0.deleteBooking(booking13);
        dataModels.User user15 = null;
        database0.deleteUser(user15);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.User> userList2 = database0.users;
        dataModels.User user3 = null;
        database0.deleteUser(user3);
        dataModels.Room room5 = null;
        database0.deleteRoom(room5);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList1 = database0.users;
        database.singleton.Database database2 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList3 = database2.bookings;
        java.util.ArrayList<dataModels.Room> roomList4 = database2.rooms;
        database.singleton.Database database5 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList6 = database5.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database5.bookings;
        database2.bookings = bookingList7;
        dataModels.Booking booking9 = null;
        database2.deleteBooking(booking9);
        dataModels.Booking booking11 = null;
        database2.deleteBooking(booking11);
        dataModels.Room[] roomArray13 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList14 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList14, roomArray13);
        database2.rooms = roomList14;
        database0.rooms = roomList14;
        java.lang.Class<?> wildcardClass18 = roomList14.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(database2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(database5);
        org.junit.Assert.assertNotNull(roomList6);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(roomArray13);
        org.junit.Assert.assertArrayEquals(roomArray13, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        dataModels.User user13 = null;
        database0.deleteUser(user13);
        dataModels.User user17 = database0.validateLogin("", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(roomList8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList8 = database7.bookings;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList11 = database10.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList12 = database10.bookings;
        database7.bookings = bookingList12;
        java.util.ArrayList<dataModels.User> userList14 = database7.users;
        dataModels.User[] userArray15 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList16 = new java.util.ArrayList<dataModels.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList16, userArray15);
        database7.users = userList16;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList20 = database19.bookings;
        java.util.ArrayList<dataModels.Room> roomList21 = database19.rooms;
        database7.rooms = roomList21;
        dataModels.User user25 = database7.validateLogin("hi!", "hi!");
        int int26 = database7.getNextUserID();
        dataModels.Room room27 = null;
        database7.deleteRoom(room27);
        java.util.ArrayList<dataModels.Room> roomList29 = database7.rooms;
        database0.rooms = roomList29;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userArray15);
        org.junit.Assert.assertArrayEquals(userArray15, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(roomList21);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(roomList29);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "hi!");
        int int19 = database0.getNextUserID();
        dataModels.User user22 = database0.validateLogin("hi!", "");
        dataModels.Room room23 = null;
        database0.deleteRoom(room23);
        dataModels.User user27 = database0.validateLogin("", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(user27);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        int int16 = database14.getNextUserID();
        dataModels.User[] userArray17 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList18 = new java.util.ArrayList<dataModels.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList18, userArray17);
        database14.users = userList18;
        int int21 = database14.getNextUserID();
        java.util.ArrayList<dataModels.User> userList22 = database14.users;
        dataModels.User user25 = database14.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray26 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList27 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList27, roomArray26);
        database14.rooms = roomList27;
        int int30 = database14.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList31 = database14.rooms;
        database0.rooms = roomList31;
        dataModels.User user35 = database0.validateLogin("", "hi!");
        database.singleton.Database database36 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList37 = database36.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList38 = database36.bookings;
        database.singleton.Database database39 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList40 = database39.bookings;
        java.util.ArrayList<dataModels.Room> roomList41 = database39.rooms;
        database.singleton.Database database42 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList43 = database42.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList44 = database42.bookings;
        database39.bookings = bookingList44;
        database36.bookings = bookingList44;
        database0.bookings = bookingList44;
        java.lang.Class<?> wildcardClass48 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(userArray17);
        org.junit.Assert.assertArrayEquals(userArray17, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNotNull(roomArray26);
        org.junit.Assert.assertArrayEquals(roomArray26, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(roomList31);
        org.junit.Assert.assertNull(user35);
        org.junit.Assert.assertNotNull(database36);
        org.junit.Assert.assertNotNull(roomList37);
        org.junit.Assert.assertNotNull(bookingList38);
        org.junit.Assert.assertNotNull(database39);
        org.junit.Assert.assertNotNull(bookingList40);
        org.junit.Assert.assertNotNull(roomList41);
        org.junit.Assert.assertNotNull(database42);
        org.junit.Assert.assertNotNull(roomList43);
        org.junit.Assert.assertNotNull(bookingList44);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        database0.bookings = bookingList9;
        dataModels.User user13 = database0.validateLogin("hi!", "");
        dataModels.User user16 = database0.validateLogin("hi!", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "hi!");
        int int19 = database0.getNextUserID();
        dataModels.User user22 = database0.validateLogin("hi!", "");
        dataModels.Room room23 = null;
        database0.deleteRoom(room23);
        dataModels.Booking[] bookingArray25 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList26 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList26, bookingArray25);
        database0.bookings = bookingList26;
        java.util.ArrayList<dataModels.Room> roomList29 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNotNull(bookingArray25);
        org.junit.Assert.assertArrayEquals(bookingArray25, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(roomList29);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        int int13 = database0.getNextUserID();
        dataModels.Room room14 = null;
        database0.deleteRoom(room14);
        int int16 = database0.getNextUserID();
        dataModels.Room room17 = null;
        database0.deleteRoom(room17);
        int int19 = database0.getNextUserID();
        dataModels.User user20 = null;
        database0.deleteUser(user20);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        int int13 = database0.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList14 = database0.rooms;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType16 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(roomList14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "hi!");
        int int19 = database0.getNextUserID();
        database.singleton.Database database20 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList21 = database20.bookings;
        java.util.ArrayList<dataModels.Room> roomList22 = database20.rooms;
        database.singleton.Database database23 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList24 = database23.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList25 = database23.bookings;
        database20.bookings = bookingList25;
        java.util.ArrayList<dataModels.User> userList27 = database20.users;
        dataModels.User[] userArray28 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList29 = new java.util.ArrayList<dataModels.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList29, userArray28);
        database20.users = userList29;
        database.singleton.Database database32 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList33 = database32.bookings;
        database20.bookings = bookingList33;
        database.singleton.Database database35 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList36 = database35.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList37 = database35.bookings;
        dataModels.Booking[] bookingArray38 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList39 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList39, bookingArray38);
        database35.bookings = bookingList39;
        database20.bookings = bookingList39;
        database.singleton.Database database43 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList44 = database43.bookings;
        int int45 = database43.getNextUserID();
        dataModels.User[] userArray46 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList47 = new java.util.ArrayList<dataModels.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList47, userArray46);
        database43.users = userList47;
        database.singleton.Database database50 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList51 = database50.rooms;
        java.util.ArrayList<dataModels.Room> roomList52 = database50.rooms;
        database43.rooms = roomList52;
        dataModels.User user54 = null;
        database43.deleteUser(user54);
        java.util.ArrayList<dataModels.User> userList56 = database43.users;
        java.util.ArrayList<dataModels.Room> roomList57 = database43.rooms;
        database20.rooms = roomList57;
        database0.rooms = roomList57;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(database20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(roomList22);
        org.junit.Assert.assertNotNull(database23);
        org.junit.Assert.assertNotNull(roomList24);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userArray28);
        org.junit.Assert.assertArrayEquals(userArray28, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(database32);
        org.junit.Assert.assertNotNull(bookingList33);
        org.junit.Assert.assertNotNull(database35);
        org.junit.Assert.assertNotNull(roomList36);
        org.junit.Assert.assertNotNull(bookingList37);
        org.junit.Assert.assertNotNull(bookingArray38);
        org.junit.Assert.assertArrayEquals(bookingArray38, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(database43);
        org.junit.Assert.assertNotNull(bookingList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(userArray46);
        org.junit.Assert.assertArrayEquals(userArray46, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(database50);
        org.junit.Assert.assertNotNull(roomList51);
        org.junit.Assert.assertNotNull(roomList52);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(roomList57);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database0.bookings;
        java.util.ArrayList<dataModels.User> userList17 = database0.users;
        database.singleton.Database database18 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList19 = database18.users;
        database0.users = userList19;
        java.lang.Class<?> wildcardClass21 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(database18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User user3 = null;
        database0.deleteUser(user3);
        java.util.ArrayList<dataModels.Booking> bookingList5 = database0.bookings;
        dataModels.User user8 = database0.validateLogin("", "");
        dataModels.User user9 = null;
        database0.deleteUser(user9);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        boolean boolean13 = database0.emailExists("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType15 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        dataModels.Room room7 = null;
        database0.deleteRoom(room7);
        java.util.ArrayList<dataModels.Room> roomList9 = database0.rooms;
        dataModels.Room room10 = null;
        database0.deleteRoom(room10);
        dataModels.Booking booking12 = null;
        database0.deleteBooking(booking12);
        int int14 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList1 = database0.users;
        dataModels.User user2 = null;
        database0.deleteUser(user2);
        dataModels.User user6 = database0.validateLogin("", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        database.singleton.Database database2 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList3 = database2.bookings;
        java.util.ArrayList<dataModels.Room> roomList4 = database2.rooms;
        database.singleton.Database database5 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList6 = database5.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database5.bookings;
        database2.bookings = bookingList7;
        java.util.ArrayList<dataModels.User> userList9 = database2.users;
        java.util.ArrayList<dataModels.Booking> bookingList10 = database2.bookings;
        database0.bookings = bookingList10;
        dataModels.User user14 = database0.validateLogin("", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(database2);
        org.junit.Assert.assertNotNull(bookingList3);
// flaky "54) test132(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(database5);
// flaky "45) test132(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList6);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        dataModels.User user9 = database0.validateLogin("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
// flaky "55) test133(randoop_test.database.singleton.RegressionTest0)":             database0.loadRooms();
// flaky "46) test133(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "34) test133(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        dataModels.Booking[] bookingArray6 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList7 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList7, bookingArray6);
        database3.bookings = bookingList7;
        java.util.ArrayList<dataModels.User> userList10 = database3.users;
        database0.users = userList10;
        dataModels.Booking booking12 = null;
        database0.deleteBooking(booking12);
        org.junit.Assert.assertNotNull(database0);
// flaky "56) test134(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList1);
// flaky "47) test134(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "35) test134(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(bookingArray6);
        org.junit.Assert.assertArrayEquals(bookingArray6, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        dataModels.Booking booking12 = null;
        database0.deleteBooking(booking12);
        dataModels.Booking booking14 = null;
        database0.deleteBooking(booking14);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
// flaky "57) test135(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList8);
// flaky "48) test135(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList9);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        java.util.ArrayList<dataModels.Room> roomList10 = database8.rooms;
        database0.rooms = roomList10;
        boolean boolean13 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList14 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "58) test136(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "49) test136(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
// flaky "36) test136(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        dataModels.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room14);
// flaky "59) test137(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "50) test137(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "37) test137(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
// flaky "22) test137(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList10);
// flaky "8) test137(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList11);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        boolean boolean17 = database0.emailExists("hi!");
        dataModels.Booking booking18 = null;
        database0.deleteBooking(booking18);
        int int20 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        dataModels.Booking[] bookingArray3 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList4 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList4, bookingArray3);
        database0.bookings = bookingList4;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList9 = database8.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList10 = database8.bookings;
        database0.bookings = bookingList10;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingArray3);
        org.junit.Assert.assertArrayEquals(bookingArray3, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        int int14 = database0.getNextUserID();
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList16 = database15.bookings;
        int int17 = database15.getNextUserID();
        dataModels.User[] userArray18 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList19 = new java.util.ArrayList<dataModels.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList19, userArray18);
        database15.users = userList19;
        int int22 = database15.getNextUserID();
        java.util.ArrayList<dataModels.User> userList23 = database15.users;
        dataModels.User user26 = database15.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList27 = database15.users;
        database0.users = userList27;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(userArray18);
        org.junit.Assert.assertArrayEquals(userArray18, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList17 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList18 = database16.rooms;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database16.bookings = bookingList21;
        java.util.ArrayList<dataModels.User> userList23 = database16.users;
        dataModels.User[] userArray24 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList25 = new java.util.ArrayList<dataModels.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList25, userArray24);
        database16.users = userList25;
        database0.users = userList25;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "60) test141(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "51) test141(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
// flaky "38) test141(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(bookingList17);
// flaky "23) test141(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList18);
        org.junit.Assert.assertNotNull(database19);
// flaky "9) test141(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userArray24);
        org.junit.Assert.assertArrayEquals(userArray24, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        int int14 = database0.getNextUserID();
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList16 = database15.bookings;
        int int17 = database15.getNextUserID();
        dataModels.User[] userArray18 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList19 = new java.util.ArrayList<dataModels.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList19, userArray18);
        database15.users = userList19;
        int int22 = database15.getNextUserID();
        java.util.ArrayList<dataModels.User> userList23 = database15.users;
        dataModels.User user26 = database15.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray27 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList28 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList28, roomArray27);
        database15.rooms = roomList28;
        java.util.ArrayList<dataModels.Booking> bookingList31 = database15.bookings;
        database0.bookings = bookingList31;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType34 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(userArray18);
        org.junit.Assert.assertArrayEquals(userArray18, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertNotNull(roomArray27);
        org.junit.Assert.assertArrayEquals(roomArray27, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookingList31);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        java.util.ArrayList<dataModels.Room> roomList14 = null;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.User> userList16 = database0.users;
        // The following exception was thrown during execution in test generation
        try {
            database0.loadRooms();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database0.bookings = bookingList15;
        // The following exception was thrown during execution in test generation
        try {
// flaky "61) test144(randoop_test.database.singleton.RegressionTest0)":             database0.loadBookings();
// flaky "52) test144(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "39) test144(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNull(roomList14);
// flaky "24) test144(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        boolean boolean4 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList5 = database0.users;
        java.util.ArrayList<dataModels.Room> roomList6 = database0.rooms;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList9 = database7.bookings;
        database0.bookings = bookingList9;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNull(roomList1);
// flaky "62) test145(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNull(roomList6);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNull(roomList8);
// flaky "53) test145(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        int int14 = database0.getNextUserID();
        dataModels.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "63) test146(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "");
        org.junit.Assert.assertNotNull(database0);
// flaky "64) test147(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
// flaky "54) test147(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
// flaky "40) test147(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        java.util.ArrayList<dataModels.Room> roomList14 = database0.rooms;
        // The following exception was thrown during execution in test generation
        try {
            database0.loadRooms();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "65) test148(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNull(roomList8);
        org.junit.Assert.assertNull(roomList9);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNull(roomList14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        database.singleton.Database database11 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList12 = database11.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList13 = database11.bookings;
        dataModels.Booking[] bookingArray14 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList15 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList15, bookingArray14);
        database11.bookings = bookingList15;
        java.util.ArrayList<dataModels.Booking> bookingList18 = database11.bookings;
        java.util.ArrayList<dataModels.Room> roomList19 = database11.rooms;
        database0.rooms = roomList19;
        org.junit.Assert.assertNotNull(database0);
// flaky "66) test149(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNull(roomList8);
        org.junit.Assert.assertNull(roomList9);
        org.junit.Assert.assertNotNull(database11);
        org.junit.Assert.assertNull(roomList12);
// flaky "55) test149(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNotNull(bookingArray14);
        org.junit.Assert.assertArrayEquals(bookingArray14, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(roomList19);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList3 = null;
        database0.rooms = roomList3;
        database.singleton.Database database5 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList6 = database5.bookings;
        java.util.ArrayList<dataModels.Room> roomList7 = database5.rooms;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList9 = database8.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList10 = database8.bookings;
        database5.bookings = bookingList10;
        java.util.ArrayList<dataModels.User> userList12 = database5.users;
        dataModels.User[] userArray13 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList14 = new java.util.ArrayList<dataModels.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList14, userArray13);
        database5.users = userList14;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList18 = database17.bookings;
        java.util.ArrayList<dataModels.Room> roomList19 = database17.rooms;
        database5.rooms = roomList19;
        dataModels.User user23 = database5.validateLogin("hi!", "hi!");
        int int24 = database5.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList25 = database5.rooms;
        database0.rooms = roomList25;
        org.junit.Assert.assertNotNull(database0);
// flaky "67) test150(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database5);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(roomList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNull(roomList9);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userArray13);
        org.junit.Assert.assertArrayEquals(userArray13, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(roomList19);
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(roomList25);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        database0.bookings = bookingList13;
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList16 = database15.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList17 = database15.bookings;
        dataModels.Booking[] bookingArray18 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList19 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList19, bookingArray18);
        database15.bookings = bookingList19;
        database0.bookings = bookingList19;
        database.singleton.Database database23 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList24 = database23.bookings;
        int int25 = database23.getNextUserID();
        dataModels.User[] userArray26 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList27 = new java.util.ArrayList<dataModels.User>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList27, userArray26);
        database23.users = userList27;
        database.singleton.Database database30 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList31 = database30.rooms;
        java.util.ArrayList<dataModels.Room> roomList32 = database30.rooms;
        database23.rooms = roomList32;
        dataModels.User user34 = null;
        database23.deleteUser(user34);
        java.util.ArrayList<dataModels.User> userList36 = database23.users;
        java.util.ArrayList<dataModels.Room> roomList37 = database23.rooms;
        database0.rooms = roomList37;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass39 = roomList37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNull(roomList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingArray18);
        org.junit.Assert.assertArrayEquals(bookingArray18, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(database23);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(userArray26);
        org.junit.Assert.assertArrayEquals(userArray26, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(database30);
        org.junit.Assert.assertNull(roomList31);
        org.junit.Assert.assertNull(roomList32);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNull(roomList37);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        int int2 = database0.getNextUserID();
        java.lang.Class<?> wildcardClass3 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        database0.bookings = bookingList13;
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList16 = database15.bookings;
        java.util.ArrayList<dataModels.Room> roomList17 = database15.rooms;
        database.singleton.Database database18 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList19 = database18.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList20 = database18.bookings;
        database15.bookings = bookingList20;
        java.util.ArrayList<dataModels.User> userList22 = database15.users;
        dataModels.User[] userArray23 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList24 = new java.util.ArrayList<dataModels.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList24, userArray23);
        database15.users = userList24;
        database.singleton.Database database27 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList28 = database27.bookings;
        database15.bookings = bookingList28;
        database.singleton.Database database30 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList31 = database30.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList32 = database30.bookings;
        dataModels.Booking[] bookingArray33 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList34 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList34, bookingArray33);
        database30.bookings = bookingList34;
        database15.bookings = bookingList34;
        database0.bookings = bookingList34;
        dataModels.User user41 = database0.validateLogin("", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "68) test153(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "56) test153(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNotNull(bookingList16);
// flaky "41) test153(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList17);
        org.junit.Assert.assertNotNull(database18);
// flaky "25) test153(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList19);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userArray23);
        org.junit.Assert.assertArrayEquals(userArray23, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(database27);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(database30);
// flaky "10) test153(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList31);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertNotNull(bookingArray33);
        org.junit.Assert.assertArrayEquals(bookingArray33, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(user41);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        boolean boolean4 = database0.emailExists("hi!");
        dataModels.Booking booking5 = null;
        database0.deleteBooking(booking5);
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList12 = database9.rooms;
        database0.rooms = roomList12;
        dataModels.Booking booking14 = null;
        database0.deleteBooking(booking14);
        org.junit.Assert.assertNotNull(database0);
// flaky "69) test154(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(database9);
// flaky "57) test154(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList10);
// flaky "42) test154(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList11);
// flaky "26) test154(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(roomList12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        boolean boolean17 = database0.emailExists("hi!");
        dataModels.Booking booking18 = null;
        database0.deleteBooking(booking18);
        java.util.ArrayList<dataModels.Room> roomList20 = database0.rooms;
        java.util.ArrayList<dataModels.User> userList21 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(roomList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList1 = database0.users;
        dataModels.User[] userArray2 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList3 = new java.util.ArrayList<dataModels.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList3, userArray2);
        database0.users = userList3;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userArray2);
        org.junit.Assert.assertArrayEquals(userArray2, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database0.bookings;
        java.util.ArrayList<dataModels.Booking> bookingList9 = database0.bookings;
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList11 = database10.rooms;
        java.util.ArrayList<dataModels.User> userList12 = database10.users;
        dataModels.User user13 = null;
        database10.deleteUser(user13);
        java.util.ArrayList<dataModels.Booking> bookingList15 = database10.bookings;
        database0.bookings = bookingList15;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList18 = database17.bookings;
        java.util.ArrayList<dataModels.Room> roomList19 = database17.rooms;
        database.singleton.Database database20 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList21 = database20.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList22 = database20.bookings;
        database17.bookings = bookingList22;
        java.util.ArrayList<dataModels.User> userList24 = database17.users;
        dataModels.User[] userArray25 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList26 = new java.util.ArrayList<dataModels.User>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList26, userArray25);
        database17.users = userList26;
        database.singleton.Database database29 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList30 = database29.bookings;
        java.util.ArrayList<dataModels.Room> roomList31 = database29.rooms;
        database17.rooms = roomList31;
        java.util.ArrayList<dataModels.Booking> bookingList33 = database17.bookings;
        database0.bookings = bookingList33;
        dataModels.User user35 = null;
        database0.deleteUser(user35);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "70) test157(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "58) test157(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(database10);
// flaky "43) test157(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(bookingList18);
// flaky "27) test157(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList19);
        org.junit.Assert.assertNotNull(database20);
// flaky "11) test157(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList21);
        org.junit.Assert.assertNotNull(bookingList22);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userArray25);
        org.junit.Assert.assertArrayEquals(userArray25, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(database29);
        org.junit.Assert.assertNotNull(bookingList30);
// flaky "2) test157(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList31);
        org.junit.Assert.assertNotNull(bookingList33);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        boolean boolean13 = database0.emailExists("");
        java.util.ArrayList<dataModels.Booking> bookingList14 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "71) test158(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "59) test158(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList14);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        boolean boolean17 = database0.emailExists("");
        java.util.ArrayList<dataModels.User> userList18 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user16 = null;
        database0.deleteUser(user16);
        java.util.ArrayList<dataModels.Booking> bookingList18 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        java.lang.Class<?> wildcardClass16 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        database0.bookings = bookingList13;
        java.util.ArrayList<dataModels.Room> roomList15 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        dataModels.User user12 = null;
        database0.deleteUser(user12);
        dataModels.Room room14 = null;
        database0.deleteRoom(room14);
        boolean boolean17 = database0.emailExists("hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        int int13 = database0.getNextUserID();
        dataModels.Booking booking14 = null;
        database0.deleteBooking(booking14);
        java.util.ArrayList<dataModels.User> userList16 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        dataModels.Booking[] bookingArray3 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList4 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList4, bookingArray3);
        database0.bookings = bookingList4;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database0.bookings;
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        boolean boolean10 = database0.emailExists("");
        database.singleton.Database database11 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList12 = database11.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList13 = database11.bookings;
        database0.bookings = bookingList13;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingArray3);
        org.junit.Assert.assertArrayEquals(bookingArray3, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database11);
        org.junit.Assert.assertNotNull(roomList12);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        java.util.ArrayList<dataModels.Room> roomList12 = database0.rooms;
        dataModels.Booking booking13 = null;
        database0.deleteBooking(booking13);
        java.lang.Class<?> wildcardClass15 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        int int13 = database0.getNextUserID();
        dataModels.Room room14 = null;
        database0.deleteRoom(room14);
        int int16 = database0.getNextUserID();
        dataModels.Room room17 = null;
        database0.deleteRoom(room17);
        java.util.ArrayList<dataModels.User> userList19 = database0.users;
        dataModels.User user22 = database0.validateLogin("hi!", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        boolean boolean13 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList14 = database0.users;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType16 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(roomList8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        java.util.ArrayList<dataModels.Room> roomList10 = database8.rooms;
        database0.rooms = roomList10;
        boolean boolean13 = database0.emailExists("hi!");
        int int14 = database0.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList15 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(roomList15);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        dataModels.Room room3 = null;
        database0.deleteRoom(room3);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(roomList2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database0.bookings;
        dataModels.Booking booking9 = null;
        database0.deleteBooking(booking9);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        java.util.ArrayList<dataModels.Room> roomList16 = database14.rooms;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList18 = database17.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList19 = database17.bookings;
        database14.bookings = bookingList19;
        java.util.ArrayList<dataModels.User> userList21 = database14.users;
        dataModels.User[] userArray22 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList23 = new java.util.ArrayList<dataModels.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList23, userArray22);
        database14.users = userList23;
        database.singleton.Database database26 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList27 = database26.bookings;
        database14.bookings = bookingList27;
        database0.bookings = bookingList27;
        dataModels.User user32 = database0.validateLogin("hi!", "hi!");
        int int33 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(roomList8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(roomList16);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userArray22);
        org.junit.Assert.assertArrayEquals(userArray22, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(database26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNull(user32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        dataModels.Booking booking1 = null;
        database0.deleteBooking(booking1);
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList10 = database3.users;
        java.util.ArrayList<dataModels.Booking> bookingList11 = database3.bookings;
        java.util.ArrayList<dataModels.Booking> bookingList12 = database3.bookings;
        database0.bookings = bookingList12;
        java.lang.Class<?> wildcardClass14 = bookingList12.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        database0.bookings = bookingList9;
        database.singleton.Database database11 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList12 = database11.bookings;
        java.util.ArrayList<dataModels.Room> roomList13 = database11.rooms;
        database0.rooms = roomList13;
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList16 = database15.bookings;
        java.util.ArrayList<dataModels.Room> roomList17 = database15.rooms;
        database.singleton.Database database18 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList19 = database18.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList20 = database18.bookings;
        database15.bookings = bookingList20;
        java.util.ArrayList<dataModels.User> userList22 = database15.users;
        dataModels.User[] userArray23 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList24 = new java.util.ArrayList<dataModels.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList24, userArray23);
        database15.users = userList24;
        database0.users = userList24;
        dataModels.Booking booking28 = null;
        database0.deleteBooking(booking28);
        dataModels.Booking booking30 = null;
        database0.deleteBooking(booking30);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(database11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(roomList13);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(roomList17);
        org.junit.Assert.assertNotNull(database18);
        org.junit.Assert.assertNotNull(roomList19);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userArray23);
        org.junit.Assert.assertArrayEquals(userArray23, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        boolean boolean13 = database0.emailExists("");
        int int14 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList15 = database0.users;
        org.junit.Assert.assertNotNull(database0);
// flaky "72) test175(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
// flaky "60) test175(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList17 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList18 = database16.rooms;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database16.bookings = bookingList21;
        java.util.ArrayList<dataModels.User> userList23 = database16.users;
        dataModels.User user24 = null;
        database16.deleteUser(user24);
        boolean boolean27 = database16.emailExists("hi!");
        java.util.ArrayList<dataModels.Booking> bookingList28 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList29 = database16.rooms;
        database0.rooms = roomList29;
        database.singleton.Database database31 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList32 = database31.bookings;
        int int33 = database31.getNextUserID();
        dataModels.User[] userArray34 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList35 = new java.util.ArrayList<dataModels.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList35, userArray34);
        database31.users = userList35;
        int int38 = database31.getNextUserID();
        java.util.ArrayList<dataModels.User> userList39 = database31.users;
        database0.users = userList39;
        dataModels.User user41 = null;
        database0.deleteUser(user41);
        org.junit.Assert.assertNotNull(database0);
// flaky "73) test176(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
// flaky "61) test176(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
// flaky "44) test176(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
// flaky "28) test176(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList17);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(roomList20);
// flaky "12) test176(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "3) test176(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList28);
        org.junit.Assert.assertNotNull(roomList29);
        org.junit.Assert.assertNotNull(database31);
// flaky "1) test176(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(userArray34);
        org.junit.Assert.assertArrayEquals(userArray34, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        dataModels.Booking[] bookingArray3 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList4 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList4, bookingArray3);
        database0.bookings = bookingList4;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database0.bookings;
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        boolean boolean10 = database0.emailExists("");
        java.lang.Class<?> wildcardClass11 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
// flaky "74) test177(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingArray3);
        org.junit.Assert.assertArrayEquals(bookingArray3, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database0.bookings;
        dataModels.Room room17 = null;
        database0.deleteRoom(room17);
        int int19 = database0.getNextUserID();
        database.singleton.Database database20 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList21 = database20.bookings;
        java.util.ArrayList<dataModels.Room> roomList22 = database20.rooms;
        database.singleton.Database database23 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList24 = database23.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList25 = database23.bookings;
        database20.bookings = bookingList25;
        java.util.ArrayList<dataModels.User> userList27 = database20.users;
        dataModels.User[] userArray28 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList29 = new java.util.ArrayList<dataModels.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList29, userArray28);
        database20.users = userList29;
        database.singleton.Database database32 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList33 = database32.bookings;
        java.util.ArrayList<dataModels.Room> roomList34 = database32.rooms;
        database20.rooms = roomList34;
        java.util.ArrayList<dataModels.Booking> bookingList36 = database20.bookings;
        java.util.ArrayList<dataModels.Room> roomList37 = database20.rooms;
        database0.rooms = roomList37;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(database20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(roomList22);
        org.junit.Assert.assertNotNull(database23);
        org.junit.Assert.assertNotNull(roomList24);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userArray28);
        org.junit.Assert.assertArrayEquals(userArray28, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(database32);
        org.junit.Assert.assertNotNull(bookingList33);
        org.junit.Assert.assertNotNull(roomList34);
        org.junit.Assert.assertNotNull(bookingList36);
        org.junit.Assert.assertNotNull(roomList37);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        boolean boolean13 = database0.emailExists("");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(roomList8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        dataModels.User user9 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.Booking> bookingList10 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.Room> roomList11 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User user8 = null;
        database0.deleteUser(user8);
        boolean boolean11 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        int int13 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList3 = null;
        database0.rooms = roomList3;
        boolean boolean6 = database0.emailExists("");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database12.bookings;
        database0.bookings = bookingList15;
        int int17 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        java.util.ArrayList<dataModels.Room> roomList16 = database14.rooms;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList18 = database17.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList19 = database17.bookings;
        database14.bookings = bookingList19;
        java.util.ArrayList<dataModels.User> userList21 = database14.users;
        dataModels.User[] userArray22 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList23 = new java.util.ArrayList<dataModels.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList23, userArray22);
        database14.users = userList23;
        database.singleton.Database database26 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList27 = database26.bookings;
        database14.bookings = bookingList27;
        database0.bookings = bookingList27;
        java.util.ArrayList<dataModels.User> userList30 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNull(roomList8);
        org.junit.Assert.assertNull(roomList9);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNull(roomList16);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNull(roomList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userArray22);
        org.junit.Assert.assertArrayEquals(userArray22, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(database26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNotNull(userList30);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        boolean boolean17 = database0.emailExists("hi!");
        dataModels.Booking booking18 = null;
        database0.deleteBooking(booking18);
        java.util.ArrayList<dataModels.Room> roomList20 = database0.rooms;
        dataModels.Booking booking21 = null;
        database0.deleteBooking(booking21);
        dataModels.User user23 = null;
        database0.deleteUser(user23);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(roomList20);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList14 = database13.bookings;
        java.util.ArrayList<dataModels.Room> roomList15 = database13.rooms;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList17 = database16.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList18 = database16.bookings;
        database13.bookings = bookingList18;
        dataModels.Booking booking20 = null;
        database13.deleteBooking(booking20);
        int int22 = database13.getNextUserID();
        java.util.ArrayList<dataModels.Booking> bookingList23 = database13.bookings;
        database0.bookings = bookingList23;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(bookingList14);
        org.junit.Assert.assertNotNull(roomList15);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(roomList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "hi!");
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database.singleton.Database database22 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList23 = database22.bookings;
        java.util.ArrayList<dataModels.Room> roomList24 = database22.rooms;
        database.singleton.Database database25 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList26 = database25.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList27 = database25.bookings;
        database22.bookings = bookingList27;
        database19.bookings = bookingList27;
        boolean boolean31 = database19.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList32 = database19.users;
        database0.users = userList32;
        dataModels.Room room34 = null;
        database0.deleteRoom(room34);
        boolean boolean37 = database0.emailExists("");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(roomList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(database22);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(roomList24);
        org.junit.Assert.assertNotNull(database25);
        org.junit.Assert.assertNotNull(roomList26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        dataModels.User user3 = null;
        database0.deleteUser(user3);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(roomList2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        int int5 = database3.getNextUserID();
        dataModels.User[] userArray6 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList7 = new java.util.ArrayList<dataModels.User>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList7, userArray6);
        database3.users = userList7;
        java.util.ArrayList<dataModels.User> userList10 = database3.users;
        database0.users = userList10;
        org.junit.Assert.assertNotNull(database0);
// flaky "75) test190(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(database3);
// flaky "62) test190(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(userArray6);
        org.junit.Assert.assertArrayEquals(userArray6, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        database0.bookings = bookingList9;
        dataModels.User user13 = database0.validateLogin("hi!", "");
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        int int16 = database14.getNextUserID();
        dataModels.User user17 = null;
        database14.deleteUser(user17);
        java.util.ArrayList<dataModels.Booking> bookingList19 = database14.bookings;
        database0.bookings = bookingList19;
        org.junit.Assert.assertNotNull(database0);
// flaky "76) test191(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
// flaky "63) test191(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
// flaky "45) test191(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(database14);
// flaky "29) test191(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "13) test191(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        boolean boolean13 = database0.emailExists("hi!");
        int int14 = database0.getNextUserID();
        dataModels.Room room15 = null;
        database0.deleteRoom(room15);
        java.util.ArrayList<dataModels.Room> roomList17 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
// flaky "77) test192(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "64) test192(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
// flaky "46) test192(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(roomList17);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        database0.bookings = bookingList9;
        dataModels.Room room11 = null;
        database0.deleteRoom(room11);
        org.junit.Assert.assertNotNull(database0);
// flaky "78) test193(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
// flaky "65) test193(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
// flaky "47) test193(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList3 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList4 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
// flaky "79) test194(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(roomList3);
        org.junit.Assert.assertNotNull(roomList4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        int int16 = database14.getNextUserID();
        dataModels.User[] userArray17 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList18 = new java.util.ArrayList<dataModels.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList18, userArray17);
        database14.users = userList18;
        int int21 = database14.getNextUserID();
        java.util.ArrayList<dataModels.User> userList22 = database14.users;
        dataModels.User user25 = database14.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray26 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList27 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList27, roomArray26);
        database14.rooms = roomList27;
        int int30 = database14.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList31 = database14.rooms;
        database0.rooms = roomList31;
        dataModels.User user35 = database0.validateLogin("", "hi!");
        database.singleton.Database database36 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList37 = database36.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList38 = database36.bookings;
        database.singleton.Database database39 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList40 = database39.bookings;
        java.util.ArrayList<dataModels.Room> roomList41 = database39.rooms;
        database.singleton.Database database42 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList43 = database42.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList44 = database42.bookings;
        database39.bookings = bookingList44;
        database36.bookings = bookingList44;
        database0.bookings = bookingList44;
        java.util.ArrayList<dataModels.Room> roomList48 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
// flaky "80) test195(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(database14);
// flaky "66) test195(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(userArray17);
        org.junit.Assert.assertArrayEquals(userArray17, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNotNull(roomArray26);
        org.junit.Assert.assertArrayEquals(roomArray26, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(roomList31);
        org.junit.Assert.assertNull(user35);
        org.junit.Assert.assertNotNull(database36);
        org.junit.Assert.assertNotNull(roomList37);
// flaky "48) test195(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList38);
        org.junit.Assert.assertNotNull(database39);
// flaky "30) test195(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList40);
        org.junit.Assert.assertNotNull(roomList41);
        org.junit.Assert.assertNotNull(database42);
        org.junit.Assert.assertNotNull(roomList43);
// flaky "14) test195(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList44);
        org.junit.Assert.assertNotNull(roomList48);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        dataModels.User user13 = database0.validateLogin("hi!", "");
        java.lang.Class<?> wildcardClass14 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
// flaky "81) test196(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "67) test196(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
// flaky "49) test196(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList3 = null;
        database0.rooms = roomList3;
        database.singleton.Database database5 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList6 = database5.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database5.bookings;
        boolean boolean9 = database5.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList10 = database5.users;
        database0.users = userList10;
        int int12 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
// flaky "82) test197(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(database5);
        org.junit.Assert.assertNull(roomList6);
// flaky "68) test197(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database0.bookings;
        java.util.ArrayList<dataModels.User> userList9 = database0.users;
        org.junit.Assert.assertNotNull(database0);
// flaky "83) test198(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
// flaky "69) test198(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
// flaky "50) test198(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        java.util.ArrayList<dataModels.Room> roomList10 = database8.rooms;
        database0.rooms = roomList10;
        dataModels.User user12 = null;
        database0.deleteUser(user12);
        dataModels.User user14 = null;
        database0.deleteUser(user14);
        org.junit.Assert.assertNotNull(database0);
// flaky "84) test199(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
// flaky "70) test199(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
// flaky "51) test199(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(roomList10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database0.bookings;
        java.util.ArrayList<dataModels.Booking> bookingList9 = database0.bookings;
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList11 = database10.rooms;
        java.util.ArrayList<dataModels.User> userList12 = database10.users;
        dataModels.User user13 = null;
        database10.deleteUser(user13);
        java.util.ArrayList<dataModels.Booking> bookingList15 = database10.bookings;
        database0.bookings = bookingList15;
        int int17 = database0.getNextUserID();
        dataModels.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "85) test200(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
// flaky "71) test200(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
// flaky "52) test200(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList8);
// flaky "31) test200(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNull(roomList11);
        org.junit.Assert.assertNotNull(userList12);
// flaky "15) test200(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "hi!");
        int int19 = database0.getNextUserID();
        dataModels.User user22 = database0.validateLogin("hi!", "");
        int int23 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
// flaky "86) test201(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
// flaky "72) test201(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
// flaky "53) test201(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        database0.bookings = bookingList9;
        database.singleton.Database database11 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList12 = database11.bookings;
        java.util.ArrayList<dataModels.Room> roomList13 = database11.rooms;
        database0.rooms = roomList13;
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList16 = database15.bookings;
        java.util.ArrayList<dataModels.Room> roomList17 = database15.rooms;
        database.singleton.Database database18 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList19 = database18.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList20 = database18.bookings;
        database15.bookings = bookingList20;
        java.util.ArrayList<dataModels.User> userList22 = database15.users;
        dataModels.User[] userArray23 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList24 = new java.util.ArrayList<dataModels.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList24, userArray23);
        database15.users = userList24;
        database0.users = userList24;
        // The following exception was thrown during execution in test generation
        try {
// flaky "87) test202(randoop_test.database.singleton.RegressionTest0)":             database0.loadBookings();
// flaky "73) test202(randoop_test.database.singleton.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.clear()\" because \"this.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
// flaky "54) test202(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
// flaky "32) test202(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
// flaky "16) test202(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(database11);
// flaky "4) test202(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(roomList13);
        org.junit.Assert.assertNotNull(database15);
// flaky "2) test202(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList16);
        org.junit.Assert.assertNull(roomList17);
        org.junit.Assert.assertNotNull(database18);
        org.junit.Assert.assertNull(roomList19);
// flaky "1) test202(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(bookingList20);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userArray23);
        org.junit.Assert.assertArrayEquals(userArray23, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        int int16 = database0.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList17 = database0.rooms;
        dataModels.Booking booking18 = null;
        database0.deleteBooking(booking18);
        database.singleton.Database database20 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList21 = database20.bookings;
        java.util.ArrayList<dataModels.Room> roomList22 = database20.rooms;
        database.singleton.Database database23 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList24 = database23.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList25 = database23.bookings;
        database20.bookings = bookingList25;
        java.util.ArrayList<dataModels.User> userList27 = database20.users;
        dataModels.User[] userArray28 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList29 = new java.util.ArrayList<dataModels.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList29, userArray28);
        database20.users = userList29;
        boolean boolean33 = database20.emailExists("");
        java.util.ArrayList<dataModels.User> userList34 = database20.users;
        database0.users = userList34;
        java.util.ArrayList<dataModels.Room> roomList36 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(roomList17);
        org.junit.Assert.assertNotNull(database20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(roomList22);
        org.junit.Assert.assertNotNull(database23);
        org.junit.Assert.assertNotNull(roomList24);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userArray28);
        org.junit.Assert.assertArrayEquals(userArray28, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(roomList36);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        dataModels.User user9 = database0.validateLogin("hi!", "hi!");
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList11 = database10.bookings;
        java.util.ArrayList<dataModels.Room> roomList12 = database10.rooms;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database10.bookings = bookingList15;
        java.util.ArrayList<dataModels.User> userList17 = database10.users;
        dataModels.User[] userArray18 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList19 = new java.util.ArrayList<dataModels.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList19, userArray18);
        database10.users = userList19;
        database.singleton.Database database22 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList23 = database22.bookings;
        java.util.ArrayList<dataModels.Room> roomList24 = database22.rooms;
        database10.rooms = roomList24;
        java.util.ArrayList<dataModels.Booking> bookingList26 = database10.bookings;
        database0.bookings = bookingList26;
        java.util.ArrayList<dataModels.Room> roomList28 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNotNull(roomList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userArray18);
        org.junit.Assert.assertArrayEquals(userArray18, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(database22);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(roomList24);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertNotNull(roomList28);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database0.bookings = bookingList15;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList18 = database17.bookings;
        int int19 = database17.getNextUserID();
        dataModels.User[] userArray20 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList21 = new java.util.ArrayList<dataModels.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList21, userArray20);
        database17.users = userList21;
        int int24 = database17.getNextUserID();
        java.util.ArrayList<dataModels.User> userList25 = database17.users;
        dataModels.User user28 = database17.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList29 = database17.users;
        java.util.ArrayList<dataModels.User> userList30 = database17.users;
        int int31 = database17.getNextUserID();
        database.singleton.Database database32 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList33 = database32.bookings;
        int int34 = database32.getNextUserID();
        dataModels.User[] userArray35 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList36 = new java.util.ArrayList<dataModels.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList36, userArray35);
        database32.users = userList36;
        int int39 = database32.getNextUserID();
        java.util.ArrayList<dataModels.User> userList40 = database32.users;
        dataModels.User user43 = database32.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray44 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList45 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList45, roomArray44);
        database32.rooms = roomList45;
        java.util.ArrayList<dataModels.Booking> bookingList48 = database32.bookings;
        database17.bookings = bookingList48;
        database0.bookings = bookingList48;
        database.singleton.Database database51 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList52 = database51.bookings;
        java.util.ArrayList<dataModels.Room> roomList53 = database51.rooms;
        database.singleton.Database database54 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList55 = database54.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList56 = database54.bookings;
        database51.bookings = bookingList56;
        dataModels.Booking booking58 = null;
        database51.deleteBooking(booking58);
        database.singleton.Database database60 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList61 = database60.rooms;
        java.util.ArrayList<dataModels.Room> roomList62 = database60.rooms;
        database51.rooms = roomList62;
        int int64 = database51.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList65 = database51.rooms;
        database0.rooms = roomList65;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(userArray20);
        org.junit.Assert.assertArrayEquals(userArray20, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNull(user28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(database32);
        org.junit.Assert.assertNotNull(bookingList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(userArray35);
        org.junit.Assert.assertArrayEquals(userArray35, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNull(user43);
        org.junit.Assert.assertNotNull(roomArray44);
        org.junit.Assert.assertArrayEquals(roomArray44, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookingList48);
        org.junit.Assert.assertNotNull(database51);
        org.junit.Assert.assertNotNull(bookingList52);
        org.junit.Assert.assertNotNull(roomList53);
        org.junit.Assert.assertNotNull(database54);
        org.junit.Assert.assertNotNull(roomList55);
        org.junit.Assert.assertNotNull(bookingList56);
        org.junit.Assert.assertNotNull(database60);
        org.junit.Assert.assertNotNull(roomList61);
        org.junit.Assert.assertNotNull(roomList62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(roomList65);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        java.util.ArrayList<dataModels.Room> roomList12 = database0.rooms;
        dataModels.User user13 = null;
        database0.deleteUser(user13);
        java.util.ArrayList<dataModels.User> userList15 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(roomList12);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList17 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList18 = database16.rooms;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database16.bookings = bookingList21;
        java.util.ArrayList<dataModels.User> userList23 = database16.users;
        dataModels.User user24 = null;
        database16.deleteUser(user24);
        boolean boolean27 = database16.emailExists("hi!");
        java.util.ArrayList<dataModels.Booking> bookingList28 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList29 = database16.rooms;
        database0.rooms = roomList29;
        database.singleton.Database database31 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList32 = database31.bookings;
        int int33 = database31.getNextUserID();
        dataModels.User[] userArray34 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList35 = new java.util.ArrayList<dataModels.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList35, userArray34);
        database31.users = userList35;
        int int38 = database31.getNextUserID();
        java.util.ArrayList<dataModels.User> userList39 = database31.users;
        database0.users = userList39;
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType42 = database0.createAccountType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(roomList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(roomList29);
        org.junit.Assert.assertNotNull(database31);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(userArray34);
        org.junit.Assert.assertArrayEquals(userArray34, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(userList39);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        boolean boolean12 = database0.emailExists("hi!");
        dataModels.Room room13 = null;
        database0.deleteRoom(room13);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        java.util.ArrayList<dataModels.Room> roomList12 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList13 = null;
        database0.rooms = roomList13;
        dataModels.Booking booking15 = null;
        database0.deleteBooking(booking15);
        java.util.ArrayList<dataModels.Booking> bookingList17 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomList12);
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database0.bookings;
        int int9 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList1 = database0.users;
        database.singleton.Database database2 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList3 = database2.bookings;
        java.util.ArrayList<dataModels.Room> roomList4 = database2.rooms;
        database.singleton.Database database5 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList6 = database5.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database5.bookings;
        database2.bookings = bookingList7;
        dataModels.Booking booking9 = null;
        database2.deleteBooking(booking9);
        dataModels.Booking booking11 = null;
        database2.deleteBooking(booking11);
        dataModels.Room[] roomArray13 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList14 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList14, roomArray13);
        database2.rooms = roomList14;
        database0.rooms = roomList14;
        boolean boolean19 = database0.emailExists("");
        java.lang.Class<?> wildcardClass20 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(database2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(database5);
        org.junit.Assert.assertNull(roomList6);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(roomArray13);
        org.junit.Assert.assertArrayEquals(roomArray13, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        database0.bookings = bookingList9;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        dataModels.Booking booking12 = null;
        database0.deleteBooking(booking12);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        dataModels.Booking[] bookingArray3 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList4 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList4, bookingArray3);
        database0.bookings = bookingList4;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList8 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList9 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingArray3);
        org.junit.Assert.assertArrayEquals(bookingArray3, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(roomList8);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        int int12 = database0.getNextUserID();
        dataModels.User user15 = database0.validateLogin("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        int int16 = database0.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList17 = database0.rooms;
        dataModels.Booking booking18 = null;
        database0.deleteBooking(booking18);
        database.singleton.Database database20 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList21 = database20.bookings;
        java.util.ArrayList<dataModels.Room> roomList22 = database20.rooms;
        database.singleton.Database database23 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList24 = database23.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList25 = database23.bookings;
        database20.bookings = bookingList25;
        java.util.ArrayList<dataModels.User> userList27 = database20.users;
        dataModels.User[] userArray28 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList29 = new java.util.ArrayList<dataModels.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList29, userArray28);
        database20.users = userList29;
        boolean boolean33 = database20.emailExists("");
        java.util.ArrayList<dataModels.User> userList34 = database20.users;
        database0.users = userList34;
        dataModels.User user38 = database0.validateLogin("", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(roomList17);
        org.junit.Assert.assertNotNull(database20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(roomList22);
        org.junit.Assert.assertNotNull(database23);
        org.junit.Assert.assertNotNull(roomList24);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userArray28);
        org.junit.Assert.assertArrayEquals(userArray28, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        boolean boolean8 = database0.emailExists("hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        database0.bookings = bookingList13;
        java.lang.Class<?> wildcardClass15 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        boolean boolean13 = database0.emailExists("hi!");
        int int14 = database0.getNextUserID();
        dataModels.Room room15 = null;
        database0.deleteRoom(room15);
        boolean boolean18 = database0.emailExists("");
        dataModels.Room room19 = null;
        database0.deleteRoom(room19);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        database.singleton.Database database2 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList3 = database2.bookings;
        java.util.ArrayList<dataModels.Room> roomList4 = database2.rooms;
        database.singleton.Database database5 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList6 = database5.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database5.bookings;
        database2.bookings = bookingList7;
        java.util.ArrayList<dataModels.User> userList9 = database2.users;
        java.util.ArrayList<dataModels.Booking> bookingList10 = database2.bookings;
        database0.bookings = bookingList10;
        int int12 = database0.getNextUserID();
        dataModels.Room room13 = null;
        database0.deleteRoom(room13);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(database2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(database5);
        org.junit.Assert.assertNotNull(roomList6);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList17 = database16.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList18 = database16.bookings;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList20 = database19.bookings;
        java.util.ArrayList<dataModels.Room> roomList21 = database19.rooms;
        database.singleton.Database database22 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList23 = database22.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList24 = database22.bookings;
        database19.bookings = bookingList24;
        database16.bookings = bookingList24;
        java.util.ArrayList<dataModels.User> userList27 = database16.users;
        dataModels.User user28 = null;
        database16.deleteUser(user28);
        java.util.ArrayList<dataModels.Booking> bookingList30 = database16.bookings;
        database0.bookings = bookingList30;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(roomList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(roomList21);
        org.junit.Assert.assertNotNull(database22);
        org.junit.Assert.assertNotNull(roomList23);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(bookingList30);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database0.bookings;
        java.util.ArrayList<dataModels.Booking> bookingList9 = database0.bookings;
        dataModels.Booking booking10 = null;
        database0.deleteBooking(booking10);
        dataModels.Room room12 = null;
        database0.deleteRoom(room12);
        java.util.ArrayList<dataModels.Room> roomList14 = database0.rooms;
        dataModels.User user17 = database0.validateLogin("hi!", "hi!");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        int int9 = database0.getNextUserID();
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList11 = database10.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList12 = database10.bookings;
        database0.bookings = bookingList12;
        java.lang.Class<?> wildcardClass14 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList3 = database0.bookings;
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        dataModels.User user15 = database0.validateLogin("hi!", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database0.bookings = bookingList15;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList18 = database17.bookings;
        int int19 = database17.getNextUserID();
        dataModels.User[] userArray20 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList21 = new java.util.ArrayList<dataModels.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList21, userArray20);
        database17.users = userList21;
        int int24 = database17.getNextUserID();
        java.util.ArrayList<dataModels.User> userList25 = database17.users;
        dataModels.User user28 = database17.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList29 = database17.users;
        java.util.ArrayList<dataModels.User> userList30 = database17.users;
        int int31 = database17.getNextUserID();
        database.singleton.Database database32 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList33 = database32.bookings;
        int int34 = database32.getNextUserID();
        dataModels.User[] userArray35 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList36 = new java.util.ArrayList<dataModels.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList36, userArray35);
        database32.users = userList36;
        int int39 = database32.getNextUserID();
        java.util.ArrayList<dataModels.User> userList40 = database32.users;
        dataModels.User user43 = database32.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray44 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList45 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList45, roomArray44);
        database32.rooms = roomList45;
        java.util.ArrayList<dataModels.Booking> bookingList48 = database32.bookings;
        database17.bookings = bookingList48;
        database0.bookings = bookingList48;
        dataModels.Room room51 = null;
        database0.deleteRoom(room51);
        java.util.ArrayList<dataModels.Booking> bookingList53 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(userArray20);
        org.junit.Assert.assertArrayEquals(userArray20, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNull(user28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(database32);
        org.junit.Assert.assertNotNull(bookingList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(userArray35);
        org.junit.Assert.assertArrayEquals(userArray35, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNull(user43);
        org.junit.Assert.assertNotNull(roomArray44);
        org.junit.Assert.assertArrayEquals(roomArray44, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookingList48);
        org.junit.Assert.assertNotNull(bookingList53);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        database.singleton.Database database9 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList10 = database9.rooms;
        java.util.ArrayList<dataModels.Room> roomList11 = database9.rooms;
        database0.rooms = roomList11;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        java.util.ArrayList<dataModels.Room> roomList14 = null;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.User> userList16 = database0.users;
        boolean boolean18 = database0.emailExists("");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        java.util.ArrayList<dataModels.Room> roomList16 = database14.rooms;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList18 = database17.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList19 = database17.bookings;
        database14.bookings = bookingList19;
        java.util.ArrayList<dataModels.User> userList21 = database14.users;
        dataModels.User[] userArray22 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList23 = new java.util.ArrayList<dataModels.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList23, userArray22);
        database14.users = userList23;
        database.singleton.Database database26 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList27 = database26.bookings;
        database14.bookings = bookingList27;
        database0.bookings = bookingList27;
        dataModels.User user30 = null;
        database0.deleteUser(user30);
        // The following exception was thrown during execution in test generation
        try {
            dataModels.AccountType accountType33 = database0.createAccountType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid account type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNull(roomList8);
        org.junit.Assert.assertNull(roomList9);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNull(roomList16);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNull(roomList18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userArray22);
        org.junit.Assert.assertArrayEquals(userArray22, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(database26);
        org.junit.Assert.assertNotNull(bookingList27);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        boolean boolean4 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList5 = database0.users;
        java.util.ArrayList<dataModels.Room> roomList6 = database0.rooms;
        dataModels.User[] userArray7 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList8 = new java.util.ArrayList<dataModels.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList8, userArray7);
        database0.users = userList8;
        java.util.ArrayList<dataModels.Room> roomList11 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNull(roomList6);
        org.junit.Assert.assertNotNull(userArray7);
        org.junit.Assert.assertArrayEquals(userArray7, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(roomList11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        java.util.ArrayList<dataModels.Room> roomList12 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList13 = null;
        database0.rooms = roomList13;
        dataModels.Booking booking15 = null;
        database0.deleteBooking(booking15);
        java.util.ArrayList<dataModels.Room> roomList17 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(roomList12);
        org.junit.Assert.assertNull(roomList17);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        java.util.ArrayList<dataModels.User> userList3 = null;
        database0.users = userList3;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
// flaky "88) test232(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        dataModels.Booking booking7 = null;
        database0.deleteBooking(booking7);
        dataModels.User user11 = null; // flaky "89) test233(randoop_test.database.singleton.RegressionTest0)": database0.validateLogin("hi!", "");
        java.util.ArrayList<dataModels.Booking> bookingList12 = database0.bookings;
        int int13 = 0; // flaky "74) test233(randoop_test.database.singleton.RegressionTest0)": database0.getNextUserID();
        dataModels.Booking booking14 = null;
        database0.deleteBooking(booking14);
        int int16 = 0; // flaky "55) test233(randoop_test.database.singleton.RegressionTest0)": database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(bookingList12);
// flaky "33) test233(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky "17) test233(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        dataModels.User user18 = database0.validateLogin("hi!", "hi!");
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database.singleton.Database database22 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList23 = database22.bookings;
        java.util.ArrayList<dataModels.Room> roomList24 = database22.rooms;
        database.singleton.Database database25 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList26 = database25.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList27 = database25.bookings;
        database22.bookings = bookingList27;
        database19.bookings = bookingList27;
        java.util.ArrayList<dataModels.User> userList30 = database19.users;
        dataModels.User user31 = null;
        database19.deleteUser(user31);
        java.util.ArrayList<dataModels.Booking> bookingList33 = database19.bookings;
        database0.bookings = bookingList33;
        dataModels.Room room35 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
// flaky "90) test234(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNull(roomList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(database22);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNull(roomList24);
        org.junit.Assert.assertNotNull(database25);
        org.junit.Assert.assertNull(roomList26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(bookingList33);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        dataModels.Booking[] bookingArray3 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList4 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList4, bookingArray3);
        database0.bookings = bookingList4;
        java.util.ArrayList<dataModels.Booking> bookingList7 = database0.bookings;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        int int10 = database8.getNextUserID();
        dataModels.User[] userArray11 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList12 = new java.util.ArrayList<dataModels.User>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList12, userArray11);
        database8.users = userList12;
        int int15 = database8.getNextUserID();
        java.util.ArrayList<dataModels.User> userList16 = database8.users;
        dataModels.User user19 = database8.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList20 = database8.users;
        database0.users = userList20;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingArray3);
        org.junit.Assert.assertArrayEquals(bookingArray3, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(userArray11);
        org.junit.Assert.assertArrayEquals(userArray11, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        boolean boolean4 = database0.emailExists("hi!");
        dataModels.User user7 = database0.validateLogin("hi!", "hi!");
        dataModels.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            database0.deleteRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"this.rooms\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.User> userList1 = database0.users;
        dataModels.User user2 = null;
        database0.deleteUser(user2);
        java.util.ArrayList<dataModels.User> userList4 = database0.users;
        dataModels.User user7 = database0.validateLogin("hi!", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList7 = database6.bookings;
        int int8 = database6.getNextUserID();
        dataModels.User[] userArray9 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList10 = new java.util.ArrayList<dataModels.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList10, userArray9);
        database6.users = userList10;
        int int13 = database6.getNextUserID();
        java.util.ArrayList<dataModels.User> userList14 = database6.users;
        dataModels.User user17 = database6.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList18 = database6.users;
        java.util.ArrayList<dataModels.Room> roomList19 = database6.rooms;
        java.util.ArrayList<dataModels.Room> roomList20 = database6.rooms;
        database0.rooms = roomList20;
        dataModels.User user22 = null;
        database0.deleteUser(user22);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(userArray9);
        org.junit.Assert.assertArrayEquals(userArray9, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNull(roomList19);
        org.junit.Assert.assertNull(roomList20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database0.bookings = bookingList15;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList18 = database17.bookings;
        int int19 = database17.getNextUserID();
        dataModels.User[] userArray20 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList21 = new java.util.ArrayList<dataModels.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList21, userArray20);
        database17.users = userList21;
        int int24 = database17.getNextUserID();
        java.util.ArrayList<dataModels.User> userList25 = database17.users;
        dataModels.User user28 = database17.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList29 = database17.users;
        java.util.ArrayList<dataModels.User> userList30 = database17.users;
        int int31 = database17.getNextUserID();
        database.singleton.Database database32 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList33 = database32.bookings;
        int int34 = database32.getNextUserID();
        dataModels.User[] userArray35 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList36 = new java.util.ArrayList<dataModels.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList36, userArray35);
        database32.users = userList36;
        int int39 = database32.getNextUserID();
        java.util.ArrayList<dataModels.User> userList40 = database32.users;
        dataModels.User user43 = database32.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray44 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList45 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList45, roomArray44);
        database32.rooms = roomList45;
        java.util.ArrayList<dataModels.Booking> bookingList48 = database32.bookings;
        database17.bookings = bookingList48;
        database0.bookings = bookingList48;
        dataModels.Room room51 = null;
        database0.deleteRoom(room51);
        database.singleton.Database database53 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList54 = database53.rooms;
        java.util.ArrayList<dataModels.Room> roomList55 = database53.rooms;
        java.util.ArrayList<dataModels.Room> roomList56 = database53.rooms;
        database0.rooms = roomList56;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(userArray20);
        org.junit.Assert.assertArrayEquals(userArray20, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNull(user28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(database32);
        org.junit.Assert.assertNotNull(bookingList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(userArray35);
        org.junit.Assert.assertArrayEquals(userArray35, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNull(user43);
        org.junit.Assert.assertNotNull(roomArray44);
        org.junit.Assert.assertArrayEquals(roomArray44, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookingList48);
        org.junit.Assert.assertNotNull(database53);
        org.junit.Assert.assertNotNull(roomList54);
        org.junit.Assert.assertNotNull(roomList55);
        org.junit.Assert.assertNotNull(roomList56);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        dataModels.Booking booking14 = null;
        database0.deleteBooking(booking14);
        java.util.ArrayList<dataModels.User> userList16 = database0.users;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(roomList8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database0.bookings;
        dataModels.Room room17 = null;
        database0.deleteRoom(room17);
        int int19 = database0.getNextUserID();
        java.util.ArrayList<dataModels.Booking> bookingList20 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(bookingList20);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User user3 = null;
        database0.deleteUser(user3);
        int int5 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray12 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList13 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList13, roomArray12);
        database0.rooms = roomList13;
        dataModels.Room room16 = null;
        database0.deleteRoom(room16);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(roomArray12);
        org.junit.Assert.assertArrayEquals(roomArray12, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        database.singleton.Database database7 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList8 = database7.rooms;
        java.util.ArrayList<dataModels.Room> roomList9 = database7.rooms;
        database0.rooms = roomList9;
        dataModels.User user11 = null;
        database0.deleteUser(user11);
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList14 = database13.bookings;
        java.util.ArrayList<dataModels.Room> roomList15 = database13.rooms;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList17 = database16.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList18 = database16.bookings;
        database13.bookings = bookingList18;
        dataModels.Booking booking20 = null;
        database13.deleteBooking(booking20);
        int int22 = database13.getNextUserID();
        java.util.ArrayList<dataModels.Booking> bookingList23 = database13.bookings;
        database0.bookings = bookingList23;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(database7);
// flaky "91) test244(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList8);
// flaky "75) test244(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList9);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(bookingList14);
// flaky "56) test244(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList15);
        org.junit.Assert.assertNotNull(database16);
// flaky "34) test244(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        java.util.ArrayList<dataModels.Room> roomList12 = database0.rooms;
        java.util.ArrayList<dataModels.Room> roomList13 = null;
        database0.rooms = roomList13;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database0.bookings;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
// flaky "92) test245(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
// flaky "76) test245(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "57) test245(randoop_test.database.singleton.RegressionTest0)":         org.junit.Assert.assertNull(roomList12);
        org.junit.Assert.assertNotNull(bookingList15);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        int int3 = database0.getNextUserID();
        dataModels.Booking booking4 = null;
        database0.deleteBooking(booking4);
        java.util.ArrayList<dataModels.User> userList6 = database0.users;
        dataModels.User user9 = database0.validateLogin("hi!", "hi!");
        dataModels.User user12 = database0.validateLogin("", "");
        dataModels.User user13 = null;
        database0.deleteUser(user13);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(roomList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList4 = database3.bookings;
        java.util.ArrayList<dataModels.Room> roomList5 = database3.rooms;
        database.singleton.Database database6 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList7 = database6.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database6.bookings;
        database3.bookings = bookingList8;
        database0.bookings = bookingList8;
        java.util.ArrayList<dataModels.User> userList11 = database0.users;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList16 = database15.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList17 = database15.bookings;
        database12.bookings = bookingList17;
        java.util.ArrayList<dataModels.User> userList19 = database12.users;
        java.util.ArrayList<dataModels.Booking> bookingList20 = database12.bookings;
        database0.bookings = bookingList20;
        boolean boolean23 = database0.emailExists("");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(roomList5);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNull(roomList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNull(roomList14);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNull(roomList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList9 = database8.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList10 = database8.bookings;
        dataModels.Booking[] bookingArray11 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList12 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList12, bookingArray11);
        database8.bookings = bookingList12;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database8.bookings;
        java.util.ArrayList<dataModels.User> userList16 = database8.users;
        database0.users = userList16;
        database.singleton.Database database18 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList19 = database18.bookings;
        int int20 = database18.getNextUserID();
        dataModels.User[] userArray21 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList22 = new java.util.ArrayList<dataModels.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList22, userArray21);
        database18.users = userList22;
        int int25 = database18.getNextUserID();
        java.util.ArrayList<dataModels.User> userList26 = database18.users;
        dataModels.User user29 = database18.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList30 = database18.users;
        java.util.ArrayList<dataModels.User> userList31 = database18.users;
        int int32 = database18.getNextUserID();
        database.singleton.Database database33 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList34 = database33.bookings;
        int int35 = database33.getNextUserID();
        dataModels.User[] userArray36 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList37 = new java.util.ArrayList<dataModels.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList37, userArray36);
        database33.users = userList37;
        int int40 = database33.getNextUserID();
        java.util.ArrayList<dataModels.User> userList41 = database33.users;
        dataModels.User user44 = database33.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray45 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList46 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList46, roomArray45);
        database33.rooms = roomList46;
        java.util.ArrayList<dataModels.Booking> bookingList49 = database33.bookings;
        database18.bookings = bookingList49;
        java.util.ArrayList<dataModels.Room> roomList51 = database18.rooms;
        database0.rooms = roomList51;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNull(roomList9);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingArray11);
        org.junit.Assert.assertArrayEquals(bookingArray11, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(database18);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(userArray21);
        org.junit.Assert.assertArrayEquals(userArray21, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(database33);
        org.junit.Assert.assertNotNull(bookingList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(userArray36);
        org.junit.Assert.assertArrayEquals(userArray36, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNull(user44);
        org.junit.Assert.assertNotNull(roomArray45);
        org.junit.Assert.assertArrayEquals(roomArray45, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bookingList49);
        org.junit.Assert.assertNotNull(roomList51);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        java.util.ArrayList<dataModels.User> userList13 = database0.users;
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList15 = database14.bookings;
        int int16 = database14.getNextUserID();
        dataModels.User[] userArray17 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList18 = new java.util.ArrayList<dataModels.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList18, userArray17);
        database14.users = userList18;
        int int21 = database14.getNextUserID();
        java.util.ArrayList<dataModels.User> userList22 = database14.users;
        dataModels.User user25 = database14.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray26 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList27 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList27, roomArray26);
        database14.rooms = roomList27;
        int int30 = database14.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList31 = database14.rooms;
        database0.rooms = roomList31;
        dataModels.User user35 = database0.validateLogin("", "hi!");
        boolean boolean37 = database0.emailExists("");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(userArray17);
        org.junit.Assert.assertArrayEquals(userArray17, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNotNull(roomArray26);
        org.junit.Assert.assertArrayEquals(roomArray26, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(roomList31);
        org.junit.Assert.assertNull(user35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        database0.bookings = bookingList9;
        database.singleton.Database database11 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList12 = database11.bookings;
        java.util.ArrayList<dataModels.Room> roomList13 = database11.rooms;
        database0.rooms = roomList13;
        database.singleton.Database database15 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList16 = database15.bookings;
        java.util.ArrayList<dataModels.Room> roomList17 = database15.rooms;
        database.singleton.Database database18 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList19 = database18.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList20 = database18.bookings;
        database15.bookings = bookingList20;
        java.util.ArrayList<dataModels.User> userList22 = database15.users;
        dataModels.User[] userArray23 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList24 = new java.util.ArrayList<dataModels.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList24, userArray23);
        database15.users = userList24;
        database0.users = userList24;
        dataModels.Booking booking28 = null;
        database0.deleteBooking(booking28);
        java.util.ArrayList<dataModels.User> userList30 = database0.users;
        java.lang.Class<?> wildcardClass31 = userList30.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(database11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(roomList13);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(roomList17);
        org.junit.Assert.assertNotNull(database18);
        org.junit.Assert.assertNotNull(roomList19);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userArray23);
        org.junit.Assert.assertArrayEquals(userArray23, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        java.util.ArrayList<dataModels.Booking> bookingList8 = database0.bookings;
        java.util.ArrayList<dataModels.Booking> bookingList9 = database0.bookings;
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList11 = database10.rooms;
        java.util.ArrayList<dataModels.User> userList12 = database10.users;
        dataModels.User user13 = null;
        database10.deleteUser(user13);
        java.util.ArrayList<dataModels.Booking> bookingList15 = database10.bookings;
        database0.bookings = bookingList15;
        int int17 = database0.getNextUserID();
        java.util.ArrayList<dataModels.Room> roomList18 = database0.rooms;
        dataModels.User user21 = database0.validateLogin("hi!", "hi!");
        dataModels.User user22 = null;
        database0.deleteUser(user22);
        database.singleton.Database database24 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList25 = database24.bookings;
        java.util.ArrayList<dataModels.Room> roomList26 = database24.rooms;
        database.singleton.Database database27 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList28 = database27.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList29 = database27.bookings;
        database24.bookings = bookingList29;
        java.util.ArrayList<dataModels.User> userList31 = database24.users;
        dataModels.User[] userArray32 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList33 = new java.util.ArrayList<dataModels.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList33, userArray32);
        database24.users = userList33;
        database.singleton.Database database36 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList37 = database36.bookings;
        java.util.ArrayList<dataModels.Room> roomList38 = database36.rooms;
        database24.rooms = roomList38;
        java.util.ArrayList<dataModels.Booking> bookingList40 = database24.bookings;
        java.util.ArrayList<dataModels.User> userList41 = database24.users;
        database0.users = userList41;
        database.singleton.Database database43 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList44 = database43.bookings;
        java.util.ArrayList<dataModels.Room> roomList45 = database43.rooms;
        database.singleton.Database database46 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList47 = database46.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList48 = database46.bookings;
        database43.bookings = bookingList48;
        java.util.ArrayList<dataModels.User> userList50 = database43.users;
        java.util.ArrayList<dataModels.Booking> bookingList51 = database43.bookings;
        java.util.ArrayList<dataModels.Booking> bookingList52 = database43.bookings;
        database0.bookings = bookingList52;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNotNull(database24);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(roomList26);
        org.junit.Assert.assertNotNull(database27);
        org.junit.Assert.assertNotNull(roomList28);
        org.junit.Assert.assertNotNull(bookingList29);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userArray32);
        org.junit.Assert.assertArrayEquals(userArray32, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(database36);
        org.junit.Assert.assertNotNull(bookingList37);
        org.junit.Assert.assertNotNull(roomList38);
        org.junit.Assert.assertNotNull(bookingList40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(database43);
        org.junit.Assert.assertNotNull(bookingList44);
        org.junit.Assert.assertNotNull(roomList45);
        org.junit.Assert.assertNotNull(database46);
        org.junit.Assert.assertNotNull(roomList47);
        org.junit.Assert.assertNotNull(bookingList48);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(bookingList51);
        org.junit.Assert.assertNotNull(bookingList52);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        int int12 = database0.getNextUserID();
        dataModels.User user15 = database0.validateLogin("hi!", "hi!");
        dataModels.Booking[] bookingArray16 = new dataModels.Booking[] {};
        java.util.ArrayList<dataModels.Booking> bookingList17 = new java.util.ArrayList<dataModels.Booking>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<dataModels.Booking>) bookingList17, bookingArray16);
        database0.bookings = bookingList17;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNotNull(bookingArray16);
        org.junit.Assert.assertArrayEquals(bookingArray16, new dataModels.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database0.bookings;
        java.lang.Class<?> wildcardClass17 = bookingList16.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        dataModels.User[] userArray8 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList9 = new java.util.ArrayList<dataModels.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList9, userArray8);
        database0.users = userList9;
        database.singleton.Database database12 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList13 = database12.bookings;
        java.util.ArrayList<dataModels.Room> roomList14 = database12.rooms;
        database0.rooms = roomList14;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList17 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList18 = database16.rooms;
        database.singleton.Database database19 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList20 = database19.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList21 = database19.bookings;
        database16.bookings = bookingList21;
        java.util.ArrayList<dataModels.User> userList23 = database16.users;
        dataModels.User user24 = null;
        database16.deleteUser(user24);
        boolean boolean27 = database16.emailExists("hi!");
        java.util.ArrayList<dataModels.Booking> bookingList28 = database16.bookings;
        java.util.ArrayList<dataModels.Room> roomList29 = database16.rooms;
        database0.rooms = roomList29;
        java.util.ArrayList<dataModels.Booking> bookingList31 = database0.bookings;
        java.lang.Class<?> wildcardClass32 = database0.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(roomList18);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(roomList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNotNull(roomList29);
        org.junit.Assert.assertNotNull(bookingList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        database.singleton.Database database3 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList4 = database3.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList5 = database3.bookings;
        database0.bookings = bookingList5;
        java.util.ArrayList<dataModels.User> userList7 = database0.users;
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList9 = database8.bookings;
        java.util.ArrayList<dataModels.Room> roomList10 = database8.rooms;
        database0.rooms = roomList10;
        dataModels.User user12 = null;
        database0.deleteUser(user12);
        int int14 = database0.getNextUserID();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(roomList2);
        org.junit.Assert.assertNotNull(database3);
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(roomList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        boolean boolean4 = database0.emailExists("hi!");
        dataModels.Booking booking5 = null;
        database0.deleteBooking(booking5);
        java.util.ArrayList<dataModels.Room> roomList7 = database0.rooms;
        dataModels.Booking booking8 = null;
        database0.deleteBooking(booking8);
        database.singleton.Database database10 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList11 = database10.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList12 = database10.bookings;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList14 = database13.bookings;
        java.util.ArrayList<dataModels.Room> roomList15 = database13.rooms;
        database.singleton.Database database16 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList17 = database16.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList18 = database16.bookings;
        database13.bookings = bookingList18;
        database10.bookings = bookingList18;
        java.util.ArrayList<dataModels.User> userList21 = database10.users;
        java.util.ArrayList<dataModels.User> userList22 = database10.users;
        database0.users = userList22;
        java.util.ArrayList<dataModels.Room> roomList24 = database0.rooms;
        dataModels.Booking booking25 = null;
        database0.deleteBooking(booking25);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(roomList11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(bookingList14);
        org.junit.Assert.assertNotNull(roomList15);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(roomList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(roomList24);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User[] userArray3 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList4 = new java.util.ArrayList<dataModels.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList4, userArray3);
        database0.users = userList4;
        int int7 = database0.getNextUserID();
        java.util.ArrayList<dataModels.User> userList8 = database0.users;
        dataModels.User user11 = database0.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList12 = database0.users;
        database.singleton.Database database13 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList14 = database13.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList15 = database13.bookings;
        database0.bookings = bookingList15;
        database.singleton.Database database17 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList18 = database17.bookings;
        int int19 = database17.getNextUserID();
        dataModels.User[] userArray20 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList21 = new java.util.ArrayList<dataModels.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList21, userArray20);
        database17.users = userList21;
        int int24 = database17.getNextUserID();
        java.util.ArrayList<dataModels.User> userList25 = database17.users;
        dataModels.User user28 = database17.validateLogin("hi!", "hi!");
        java.util.ArrayList<dataModels.User> userList29 = database17.users;
        java.util.ArrayList<dataModels.User> userList30 = database17.users;
        int int31 = database17.getNextUserID();
        database.singleton.Database database32 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList33 = database32.bookings;
        int int34 = database32.getNextUserID();
        dataModels.User[] userArray35 = new dataModels.User[] {};
        java.util.ArrayList<dataModels.User> userList36 = new java.util.ArrayList<dataModels.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<dataModels.User>) userList36, userArray35);
        database32.users = userList36;
        int int39 = database32.getNextUserID();
        java.util.ArrayList<dataModels.User> userList40 = database32.users;
        dataModels.User user43 = database32.validateLogin("hi!", "hi!");
        dataModels.Room[] roomArray44 = new dataModels.Room[] {};
        java.util.ArrayList<dataModels.Room> roomList45 = new java.util.ArrayList<dataModels.Room>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<dataModels.Room>) roomList45, roomArray44);
        database32.rooms = roomList45;
        java.util.ArrayList<dataModels.Booking> bookingList48 = database32.bookings;
        database17.bookings = bookingList48;
        database0.bookings = bookingList48;
        java.util.ArrayList<dataModels.Room> roomList51 = database0.rooms;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(roomList14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(userArray20);
        org.junit.Assert.assertArrayEquals(userArray20, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNull(user28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(database32);
        org.junit.Assert.assertNotNull(bookingList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(userArray35);
        org.junit.Assert.assertArrayEquals(userArray35, new dataModels.User[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNull(user43);
        org.junit.Assert.assertNotNull(roomArray44);
        org.junit.Assert.assertArrayEquals(roomArray44, new dataModels.Room[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookingList48);
        org.junit.Assert.assertNotNull(roomList51);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        dataModels.User user3 = null;
        database0.deleteUser(user3);
        java.util.ArrayList<dataModels.Booking> bookingList5 = database0.bookings;
        dataModels.Booking booking6 = null;
        database0.deleteBooking(booking6);
        database.singleton.Database database8 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList9 = database8.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList10 = database8.bookings;
        database.singleton.Database database11 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList12 = database11.bookings;
        java.util.ArrayList<dataModels.Room> roomList13 = database11.rooms;
        database.singleton.Database database14 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList15 = database14.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList16 = database14.bookings;
        database11.bookings = bookingList16;
        database8.bookings = bookingList16;
        java.util.ArrayList<dataModels.User> userList19 = database8.users;
        database0.users = userList19;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(roomList9);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(database11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(roomList13);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(roomList15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(userList19);
    }
}
