package database.singleton;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dataModels.User user4 = database0.validateLogin("hi!", "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.User> userList2 = database0.users;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = database0.emailExists("");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.User> userList2 = database0.users;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dataModels.User user5 = database0.validateLogin("hi!", "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        java.util.ArrayList<dataModels.Room> roomList2 = database0.rooms;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = database0.emailExists("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        database0.loadRooms();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        database0.loadRooms();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        int int2 = database0.getNextUserID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        database0.loadRooms();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Room> roomList1 = database0.rooms;
        java.util.ArrayList<dataModels.Booking> bookingList2 = database0.bookings;
        boolean boolean4 = database0.emailExists("hi!");
        java.util.ArrayList<dataModels.User> userList5 = database0.users;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        database0.loadRooms();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = database0.emailExists("hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = database0.emailExists("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        database.singleton.Database database0 = database.singleton.Database.getInstance();
        java.util.ArrayList<dataModels.Booking> bookingList1 = database0.bookings;
        dataModels.User user4 = database0.validateLogin("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        database0.loadRooms();
    }
}

