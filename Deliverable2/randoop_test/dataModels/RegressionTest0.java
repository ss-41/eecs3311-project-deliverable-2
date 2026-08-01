package dataModels;

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
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room8.notifyAllObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        room8.setRoomNum("hi!");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        dataModels.BookingStatus bookingStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) (byte) -1, (int) (short) 10, (int) 'a', (double) (byte) 100, bookingStatus4, localDateTime5, localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = booking7.getStatus();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.BookingStatus.name()\" because \"this.bookingStatus\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        dataModels.RoomStatus roomStatus12 = null;
        room8.setStatus(roomStatus12);
        // The following exception was thrown during execution in test generation
        try {
            room8.OccupancyEvent(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        int int17 = room8.getRoomID();
        room8.setBuilding("hi!");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        java.lang.Class<?> wildcardClass22 = room8.getClass();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        java.lang.Class<?> wildcardClass15 = room8.getClass();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = room8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.RoomStatus.name()\" because \"this.status\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        room8.setLastEvent("");
        java.lang.String str19 = room8.getBuilding();
        dataModels.RoomStatus roomStatus24 = null;
        observer.Observer[] observerArray25 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList26 = new java.util.ArrayList<observer.Observer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList26, observerArray25);
        dataModels.Room room28 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus24, observerList26);
        observer.Observer observer29 = null;
        room28.attachObserver(observer29);
        observer.Observer[] observerArray31 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList32 = new java.util.ArrayList<observer.Observer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList32, observerArray31);
        room28.setObservers(observerList32);
        observer.OccupancySensor occupancySensor35 = room28.getOccupancySensor();
        room8.setOccupancySensor(occupancySensor35);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(observerArray25);
        org.junit.Assert.assertArrayEquals(observerArray25, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(observerArray31);
        org.junit.Assert.assertArrayEquals(observerArray31, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(occupancySensor35);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        dataModels.RoomStatus roomStatus12 = null;
        room8.setStatus(roomStatus12);
        dataModels.AccountType accountType22 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user23 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType22);
        java.lang.String str24 = user23.getPassword();
        user23.setEmail("None");
        // The following exception was thrown during execution in test generation
        try {
            room8.BadgeEvent(user23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType8);
        dataModels.RoomStatus roomStatus14 = null;
        observer.Observer[] observerArray15 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList16 = new java.util.ArrayList<observer.Observer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList16, observerArray15);
        dataModels.Room room18 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus14, observerList16);
        observer.Observer observer19 = null;
        room18.attachObserver(observer19);
        boolean boolean21 = room18.isLastOccupied();
        room18.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner24 = room18.getBadgeScanner();
        chiefEventCoordinator9.update(room18);
        int int26 = chiefEventCoordinator9.getUserID();
        org.junit.Assert.assertNotNull(observerArray15);
        org.junit.Assert.assertArrayEquals(observerArray15, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(badgeScanner24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        user9.setUserID(10);
        int int12 = user9.getUserID();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        dataModels.Booking booking11 = user9.bookRoom();
        java.lang.Class<?> wildcardClass12 = user9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        dataModels.Room room14 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList11);
        room14.setLastVerifiedBadge(true);
        dataModels.AccountType accountType25 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user26 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType25);
        java.lang.String str27 = user26.toString();
        user26.setName("");
        user26.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        room14.BadgeEvent(user26, false);
        java.lang.String str34 = room14.getRoomNum();
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str27, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        boolean boolean11 = user9.isAdmin();
        java.lang.String str12 = user9.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        dataModels.Booking booking11 = user9.bookRoom();
        boolean boolean12 = user9.isAdmin();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType8);
        chiefEventCoordinator9.setEmail("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        dataModels.RoomStatus roomStatus26 = null;
        observer.Observer[] observerArray27 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList28 = new java.util.ArrayList<observer.Observer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList28, observerArray27);
        dataModels.Room room30 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus26, observerList28);
        room30.notifyAllObservers();
        java.lang.String str32 = room30.getBuilding();
        booking.state.ActiveState activeState37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        dataModels.Booking booking40 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState37, localDateTime38, localDateTime39);
        java.time.LocalDateTime localDateTime41 = null;
        booking40.setBookingEndTime(localDateTime41);
        room30.attachObserver((observer.Observer) booking40);
        observer.Observer[] observerArray44 = new observer.Observer[] { booking40 };
        java.util.ArrayList<observer.Observer> observerList45 = new java.util.ArrayList<observer.Observer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList45, observerArray44);
        room8.setObservers(observerList45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = room8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.RoomStatus.name()\" because \"this.status\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(observerArray27);
        org.junit.Assert.assertArrayEquals(observerArray27, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(observerArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner14 = room8.getBadgeScanner();
        room8.setRoomNum("None");
        // The following exception was thrown during execution in test generation
        try {
            room8.OccupancyEvent(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badgeScanner14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        room23.notifyAllObservers();
        java.lang.String str25 = room23.getBuilding();
        booking.state.ActiveState activeState30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        dataModels.Booking booking33 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState30, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setBookingEndTime(localDateTime34);
        room23.attachObserver((observer.Observer) booking33);
        user9.update(room23);
        java.lang.String str38 = user9.getStud_OR_orgID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        dataModels.BookingStatus bookingStatus9 = null;
        booking7.setBookingStatus(bookingStatus9);
        int int11 = booking7.getUserID();
        int int12 = booking7.getRoomID();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner14 = room8.getBadgeScanner();
        room8.setRoomNum("None");
        room8.setCapacity((int) (byte) -1);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badgeScanner14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.getStud_OR_orgID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        // The following exception was thrown during execution in test generation
        try {
            room8.OccupancyEvent(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        room8.setLastOccupied(false);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        int int22 = booking18.getUserID();
        java.time.LocalDateTime localDateTime23 = booking18.getBookingEndTime();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType8);
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user19 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType18);
        chiefEventCoordinator9.setAccountType(accountType18);
        java.lang.String str21 = chiefEventCoordinator9.getPassword();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        room8.setLastOccupied(true);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType13);
        dataModels.AccountType accountType23 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user24 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType23);
        chiefEventCoordinator14.setAccountType(accountType23);
        double double26 = accountType23.getHourlyRate();
        dataModels.User user28 = new dataModels.User((int) (byte) 100, "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "", accountType23, false);
        dataModels.Booking booking29 = user28.bookRoom();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNull(booking29);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        int int22 = booking18.getUserID();
        dataModels.BookingStatus bookingStatus23 = booking18.getBookingStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = booking18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.bookingTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus23.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        int int15 = room8.getCapacity();
        room8.setLastOccupied(false);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        // The following exception was thrown during execution in test generation
        try {
            room8.OccupancyEvent(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        dataModels.AccountType accountType5 = null;
        dataModels.ChiefEventCoordinator chiefEventCoordinator6 = new dataModels.ChiefEventCoordinator(0, "hi!", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType8);
        chiefEventCoordinator9.setStud_OR_orgID("None");
        dataModels.AccountType accountType12 = chiefEventCoordinator9.getAccountType();
        chiefEventCoordinator9.setName("User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        room8.setLastOccupied(false);
        room8.setCapacity((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            room8.OccupancyEvent(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        room23.notifyAllObservers();
        java.lang.String str25 = room23.getBuilding();
        booking.state.ActiveState activeState30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        dataModels.Booking booking33 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState30, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setBookingEndTime(localDateTime34);
        room23.attachObserver((observer.Observer) booking33);
        user9.update(room23);
        int int38 = user9.getUserID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user14 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType13);
        dataModels.Administrator administrator15 = new dataModels.Administrator((int) (byte) -1, "", "", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType13);
        dataModels.AccountType accountType16 = administrator15.getAccountType();
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        java.lang.String str13 = user9.getStud_OR_orgID();
        boolean boolean14 = user9.cancelBooking();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.setLastOccupied(false);
        java.lang.String str11 = room8.getLastEvent();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "None" + "'", str11, "None");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.setLastOccupied(false);
        room8.setBuilding("User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user14 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType13);
        dataModels.Administrator administrator15 = new dataModels.Administrator((int) (byte) 10, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", "hi!", accountType13);
        administrator15.setUserID(10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        dataModels.User user6 = new dataModels.User(0, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        dataModels.RoomStatus roomStatus12 = null;
        room8.setStatus(roomStatus12);
        dataModels.RoomStatus roomStatus18 = null;
        observer.Observer[] observerArray19 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList20 = new java.util.ArrayList<observer.Observer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList20, observerArray19);
        dataModels.Room room22 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus18, observerList20);
        observer.Observer observer23 = null;
        room22.attachObserver(observer23);
        boolean boolean25 = room22.isLastOccupied();
        room22.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList28 = room22.getObservers();
        java.util.ArrayList<observer.Observer> observerList29 = room22.getObservers();
        room8.setObservers(observerList29);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerArray19);
        org.junit.Assert.assertArrayEquals(observerArray19, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(observerList28);
        org.junit.Assert.assertNotNull(observerList29);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        dataModels.Booking booking11 = user9.bookRoom();
        user9.setStud_OR_orgID("");
        int int14 = user9.getUserID();
        boolean boolean15 = user9.login();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        boolean boolean10 = user9.login();
        dataModels.AccountType accountType11 = user9.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(accountType11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        room8.setLastOccupied(false);
        room8.setCapacity((int) (byte) 100);
        observer.OccupancySensor occupancySensor15 = null;
        room8.setOccupancySensor(occupancySensor15);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        int int15 = room8.getCapacity();
        dataModels.AccountType accountType24 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user25 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType24);
        user25.setUserID(10);
        room8.BadgeEvent(user25, true);
        java.lang.String str30 = user25.getStud_OR_orgID();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        booking7.setBookingEndTime(localDateTime8);
        int int10 = booking7.getUserID();
        dataModels.RoomStatus roomStatus15 = null;
        observer.Observer[] observerArray16 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList17 = new java.util.ArrayList<observer.Observer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList17, observerArray16);
        dataModels.Room room19 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus15, observerList17);
        room19.notifyAllObservers();
        java.lang.String str21 = room19.getBuilding();
        booking.state.ActiveState activeState26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        dataModels.Booking booking29 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState26, localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime30 = null;
        booking29.setBookingEndTime(localDateTime30);
        room19.attachObserver((observer.Observer) booking29);
        int int33 = booking29.getUserID();
        dataModels.BookingStatus bookingStatus34 = booking29.getBookingStatus();
        booking7.setBookingStatus(bookingStatus34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(observerArray16);
        org.junit.Assert.assertArrayEquals(observerArray16, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus34 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus34.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        dataModels.User user6 = new dataModels.User(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", "hi!", false);
        dataModels.AccountType accountType7 = user6.getAccountType();
        org.junit.Assert.assertNull(accountType7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user14 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType13);
        dataModels.Administrator administrator15 = new dataModels.Administrator((int) (byte) -1, "", "", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType13);
        java.lang.String str16 = accountType13.getTypeName();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        dataModels.AccountType accountType3 = new dataModels.AccountType((int) (byte) 0, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", (double) '4');
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        room8.setLastOccupied(false);
        // The following exception was thrown during execution in test generation
        try {
            room8.notifyAllObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        int int22 = booking18.getUserID();
        dataModels.RoomStatus roomStatus27 = null;
        observer.Observer[] observerArray28 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList29 = new java.util.ArrayList<observer.Observer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList29, observerArray28);
        dataModels.Room room31 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus27, observerList29);
        observer.Observer observer32 = null;
        room31.attachObserver(observer32);
        observer.Observer[] observerArray34 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList35 = new java.util.ArrayList<observer.Observer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList35, observerArray34);
        room31.setObservers(observerList35);
        observer.OccupancySensor occupancySensor38 = room31.getOccupancySensor();
        observer.BadgeScanner badgeScanner39 = room31.getBadgeScanner();
        dataModels.RoomStatus roomStatus44 = null;
        observer.Observer[] observerArray45 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList46 = new java.util.ArrayList<observer.Observer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList46, observerArray45);
        dataModels.Room room48 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus44, observerList46);
        room31.setObservers(observerList46);
        java.lang.String str50 = room31.getRoomNum();
        booking18.update(room31);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(observerArray28);
        org.junit.Assert.assertArrayEquals(observerArray28, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(observerArray34);
        org.junit.Assert.assertArrayEquals(observerArray34, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(occupancySensor38);
        org.junit.Assert.assertNotNull(badgeScanner39);
        org.junit.Assert.assertNotNull(observerArray45);
        org.junit.Assert.assertArrayEquals(observerArray45, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        booking7.setBookingEndTime(localDateTime8);
        int int10 = booking7.getUserID();
        int int11 = booking7.getRoomID();
        int int12 = booking7.getUserID();
        java.time.LocalDateTime localDateTime13 = booking7.getBookingTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType8);
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user19 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType18);
        chiefEventCoordinator9.setAccountType(accountType18);
        java.lang.Class<?> wildcardClass21 = chiefEventCoordinator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        dataModels.Booking booking11 = user9.bookRoom();
        user9.setAdmin(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        room8.setLastOccupied(false);
        dataModels.AccountType accountType24 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user25 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType24);
        java.lang.String str26 = user25.toString();
        dataModels.Booking booking27 = user25.bookRoom();
        room8.setLastUser(user25);
        // The following exception was thrown during execution in test generation
        try {
            room8.OccupancyEvent(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str26, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNull(booking27);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        java.lang.String str17 = user9.getEmail();
        dataModels.RoomStatus roomStatus22 = null;
        observer.Observer[] observerArray23 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList24 = new java.util.ArrayList<observer.Observer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList24, observerArray23);
        dataModels.Room room26 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus22, observerList24);
        observer.Observer observer27 = null;
        room26.attachObserver(observer27);
        boolean boolean29 = room26.isLastOccupied();
        room26.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList32 = room26.getObservers();
        dataModels.AccountType accountType41 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user42 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType41);
        java.lang.String str43 = user42.toString();
        user42.setName("");
        user42.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus52 = null;
        observer.Observer[] observerArray53 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList54 = new java.util.ArrayList<observer.Observer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList54, observerArray53);
        dataModels.Room room56 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus52, observerList54);
        room56.notifyAllObservers();
        java.lang.String str58 = room56.getBuilding();
        booking.state.ActiveState activeState63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        dataModels.Booking booking66 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState63, localDateTime64, localDateTime65);
        java.time.LocalDateTime localDateTime67 = null;
        booking66.setBookingEndTime(localDateTime67);
        room56.attachObserver((observer.Observer) booking66);
        user42.update(room56);
        room26.setLastUser(user42);
        user9.update(room26);
        java.util.ArrayList<observer.Observer> observerList73 = room26.getObservers();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(observerArray23);
        org.junit.Assert.assertArrayEquals(observerArray23, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(observerList32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str43, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray53);
        org.junit.Assert.assertArrayEquals(observerArray53, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(observerList73);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        dataModels.Room room14 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList11);
        room14.setLastVerifiedBadge(true);
        dataModels.AccountType accountType25 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user26 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType25);
        java.lang.String str27 = user26.toString();
        user26.setName("");
        user26.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        room14.BadgeEvent(user26, false);
        booking.state.ActiveState activeState38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        dataModels.Booking booking41 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState38, localDateTime39, localDateTime40);
        java.time.LocalDateTime localDateTime42 = null;
        booking41.setBookingEndTime(localDateTime42);
        int int44 = booking41.getUserID();
        int int45 = booking41.getRoomID();
        int int46 = booking41.getUserID();
        room14.attachObserver((observer.Observer) booking41);
        dataModels.BookingStatus bookingStatus48 = booking41.getBookingStatus();
        java.time.LocalDateTime localDateTime49 = booking41.getBookingEndTime();
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str27, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus48.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertNull(localDateTime49);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        observer.Observer observer14 = null;
        room13.attachObserver(observer14);
        observer.Observer[] observerArray16 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList17 = new java.util.ArrayList<observer.Observer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList17, observerArray16);
        room13.setObservers(observerList17);
        dataModels.Room room20 = new dataModels.Room(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", (int) (byte) 1, "", roomStatus4, observerList17);
        booking.state.ActiveState activeState25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        dataModels.Booking booking28 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState25, localDateTime26, localDateTime27);
        int int29 = booking28.getUserID();
        int int30 = booking28.getBookingID();
        int int31 = booking28.getBookingID();
        room20.attachObserver((observer.Observer) booking28);
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(observerArray16);
        org.junit.Assert.assertArrayEquals(observerArray16, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        dataModels.User user6 = new dataModels.User((int) (short) -1, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        dataModels.BookingStatus bookingStatus8 = booking7.getBookingStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus8.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        booking.state.ActiveState activeState8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        dataModels.Booking booking11 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState8, localDateTime9, localDateTime10);
        int int12 = booking11.getUserID();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        room25.notifyAllObservers();
        java.lang.String str27 = room25.getBuilding();
        booking.state.ActiveState activeState32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        dataModels.Booking booking35 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState32, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime36 = null;
        booking35.setBookingEndTime(localDateTime36);
        room25.attachObserver((observer.Observer) booking35);
        int int39 = booking35.getUserID();
        dataModels.BookingStatus bookingStatus40 = booking35.getBookingStatus();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        dataModels.Booking booking43 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus40, localDateTime41, localDateTime42);
        booking11.setBookingStatus(bookingStatus40);
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        dataModels.Booking booking47 = new dataModels.Booking((int) ' ', 10, (int) (byte) 1, (double) 100.0f, bookingStatus40, localDateTime45, localDateTime46);
        double double48 = booking47.getDeposit();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus40 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus40.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType13);
        chiefEventCoordinator14.setStud_OR_orgID("None");
        dataModels.AccountType accountType17 = chiefEventCoordinator14.getAccountType();
        dataModels.ChiefEventCoordinator chiefEventCoordinator18 = new dataModels.ChiefEventCoordinator((int) (short) 10, "hi!", "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", accountType17);
        java.lang.String str19 = chiefEventCoordinator18.getName();
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        room23.notifyAllObservers();
        java.lang.String str25 = room23.getBuilding();
        booking.state.ActiveState activeState30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        dataModels.Booking booking33 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState30, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setBookingEndTime(localDateTime34);
        room23.attachObserver((observer.Observer) booking33);
        user9.update(room23);
        dataModels.RoomStatus roomStatus38 = room23.getStatus();
        dataModels.RoomStatus roomStatus43 = null;
        observer.Observer[] observerArray44 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList45 = new java.util.ArrayList<observer.Observer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList45, observerArray44);
        dataModels.Room room47 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus43, observerList45);
        observer.Observer observer48 = null;
        room47.attachObserver(observer48);
        observer.Observer[] observerArray50 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList51 = new java.util.ArrayList<observer.Observer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList51, observerArray50);
        room47.setObservers(observerList51);
        observer.OccupancySensor occupancySensor54 = room47.getOccupancySensor();
        room23.setOccupancySensor(occupancySensor54);
        room23.setLastOccupied(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(roomStatus38);
        org.junit.Assert.assertNotNull(observerArray44);
        org.junit.Assert.assertArrayEquals(observerArray44, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(observerArray50);
        org.junit.Assert.assertArrayEquals(observerArray50, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(occupancySensor54);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator(1, "", "ACTIVE", "ACTIVE", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        java.lang.String str9 = booking7.getStatus();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ACTIVE" + "'", str9, "ACTIVE");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        boolean boolean15 = user9.isAdmin();
        user9.setName("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        dataModels.RoomStatus roomStatus15 = null;
        room8.setStatus(roomStatus15);
        room8.setRoomNum("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking(52, 10, (int) (byte) 100, (double) (byte) 100, activeState4, localDateTime5, localDateTime6);
        dataModels.AccountType accountType16 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user17 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType16);
        java.lang.String str18 = user17.toString();
        user17.setName("");
        boolean boolean21 = user17.register();
        int int22 = user17.getUserID();
        user17.setEmail("None");
        dataModels.RoomStatus roomStatus29 = null;
        observer.Observer[] observerArray30 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList31 = new java.util.ArrayList<observer.Observer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList31, observerArray30);
        dataModels.Room room33 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus29, observerList31);
        observer.Observer observer34 = null;
        room33.attachObserver(observer34);
        observer.Observer[] observerArray36 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList37 = new java.util.ArrayList<observer.Observer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList37, observerArray36);
        room33.setObservers(observerList37);
        dataModels.RoomStatus roomStatus40 = null;
        room33.setStatus(roomStatus40);
        user17.update(room33);
        booking7.update(room33);
        room33.setLastVerifiedBadge(true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str18, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(observerArray30);
        org.junit.Assert.assertArrayEquals(observerArray30, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(observerArray36);
        org.junit.Assert.assertArrayEquals(observerArray36, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType13);
        chiefEventCoordinator14.setStud_OR_orgID("None");
        dataModels.AccountType accountType17 = chiefEventCoordinator14.getAccountType();
        dataModels.ChiefEventCoordinator chiefEventCoordinator18 = new dataModels.ChiefEventCoordinator((int) (short) 10, "hi!", "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", accountType17);
        chiefEventCoordinator18.setName("None");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        room8.setLastOccupied(false);
        // The following exception was thrown during execution in test generation
        try {
            room8.OccupancyEvent(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator19 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType18);
        chiefEventCoordinator19.setStud_OR_orgID("None");
        dataModels.AccountType accountType22 = chiefEventCoordinator19.getAccountType();
        dataModels.ChiefEventCoordinator chiefEventCoordinator23 = new dataModels.ChiefEventCoordinator((int) (short) 10, "hi!", "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", accountType22);
        dataModels.User user24 = new dataModels.User(10, "hi!", "hi!", "hi!", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType22);
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking(52, 10, (int) (byte) 100, (double) (byte) 100, activeState4, localDateTime5, localDateTime6);
        dataModels.RoomStatus roomStatus12 = null;
        observer.Observer[] observerArray13 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList14 = new java.util.ArrayList<observer.Observer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList14, observerArray13);
        dataModels.Room room16 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus12, observerList14);
        observer.Observer observer17 = null;
        room16.attachObserver(observer17);
        room16.setLastOccupied(false);
        room16.setCapacity((int) (byte) 100);
        int int23 = room16.getCapacity();
        booking7.update(room16);
        org.junit.Assert.assertNotNull(observerArray13);
        org.junit.Assert.assertArrayEquals(observerArray13, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking(52, 10, (int) (byte) 100, (double) (byte) 100, activeState4, localDateTime5, localDateTime6);
        dataModels.AccountType accountType16 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user17 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType16);
        java.lang.String str18 = user17.toString();
        user17.setName("");
        boolean boolean21 = user17.register();
        int int22 = user17.getUserID();
        user17.setEmail("None");
        dataModels.RoomStatus roomStatus29 = null;
        observer.Observer[] observerArray30 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList31 = new java.util.ArrayList<observer.Observer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList31, observerArray30);
        dataModels.Room room33 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus29, observerList31);
        observer.Observer observer34 = null;
        room33.attachObserver(observer34);
        observer.Observer[] observerArray36 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList37 = new java.util.ArrayList<observer.Observer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList37, observerArray36);
        room33.setObservers(observerList37);
        dataModels.RoomStatus roomStatus40 = null;
        room33.setStatus(roomStatus40);
        user17.update(room33);
        booking7.update(room33);
        int int44 = booking7.getUserID();
        java.lang.String str45 = booking7.getStatus();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str18, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(observerArray30);
        org.junit.Assert.assertArrayEquals(observerArray30, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(observerArray36);
        org.junit.Assert.assertArrayEquals(observerArray36, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ACTIVE" + "'", str45, "ACTIVE");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        room8.setLastOccupied(false);
        room8.setCapacity((int) (byte) 100);
        dataModels.RoomStatus roomStatus15 = room8.getStatus();
        dataModels.RoomStatus roomStatus16 = null;
        room8.setStatus(roomStatus16);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(roomStatus15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        dataModels.RoomStatus roomStatus8 = null;
        observer.Observer[] observerArray9 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList10 = new java.util.ArrayList<observer.Observer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList10, observerArray9);
        dataModels.Room room12 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus8, observerList10);
        room12.notifyAllObservers();
        java.lang.String str14 = room12.getBuilding();
        booking.state.ActiveState activeState19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        dataModels.Booking booking22 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState19, localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setBookingEndTime(localDateTime23);
        room12.attachObserver((observer.Observer) booking22);
        int int26 = booking22.getUserID();
        dataModels.BookingStatus bookingStatus27 = booking22.getBookingStatus();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        dataModels.Booking booking30 = new dataModels.Booking((int) (short) 10, (int) '4', (-1), (double) 10, bookingStatus27, localDateTime28, localDateTime29);
        int int31 = booking30.getBookingID();
        org.junit.Assert.assertNotNull(observerArray9);
        org.junit.Assert.assertArrayEquals(observerArray9, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus27.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        java.lang.String str17 = user9.getEmail();
        dataModels.RoomStatus roomStatus22 = null;
        observer.Observer[] observerArray23 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList24 = new java.util.ArrayList<observer.Observer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList24, observerArray23);
        dataModels.Room room26 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus22, observerList24);
        observer.Observer observer27 = null;
        room26.attachObserver(observer27);
        boolean boolean29 = room26.isLastOccupied();
        room26.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList32 = room26.getObservers();
        dataModels.AccountType accountType41 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user42 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType41);
        java.lang.String str43 = user42.toString();
        user42.setName("");
        user42.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus52 = null;
        observer.Observer[] observerArray53 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList54 = new java.util.ArrayList<observer.Observer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList54, observerArray53);
        dataModels.Room room56 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus52, observerList54);
        room56.notifyAllObservers();
        java.lang.String str58 = room56.getBuilding();
        booking.state.ActiveState activeState63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        dataModels.Booking booking66 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState63, localDateTime64, localDateTime65);
        java.time.LocalDateTime localDateTime67 = null;
        booking66.setBookingEndTime(localDateTime67);
        room56.attachObserver((observer.Observer) booking66);
        user42.update(room56);
        room26.setLastUser(user42);
        user9.update(room26);
        user9.setEmail("ACTIVE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(observerArray23);
        org.junit.Assert.assertArrayEquals(observerArray23, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(observerList32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str43, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray53);
        org.junit.Assert.assertArrayEquals(observerArray53, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) (byte) 10, (int) ' ', (int) (short) -1, (double) 1, activeState4, localDateTime5, localDateTime6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        booking7.setBookingEndTime(localDateTime8);
        int int10 = booking7.getUserID();
        int int11 = booking7.getRoomID();
        dataModels.BookingStatus bookingStatus12 = booking7.getBookingStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus12.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        java.lang.String str17 = user9.getEmail();
        dataModels.RoomStatus roomStatus22 = null;
        observer.Observer[] observerArray23 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList24 = new java.util.ArrayList<observer.Observer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList24, observerArray23);
        dataModels.Room room26 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus22, observerList24);
        observer.Observer observer27 = null;
        room26.attachObserver(observer27);
        boolean boolean29 = room26.isLastOccupied();
        room26.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList32 = room26.getObservers();
        dataModels.AccountType accountType41 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user42 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType41);
        java.lang.String str43 = user42.toString();
        user42.setName("");
        user42.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus52 = null;
        observer.Observer[] observerArray53 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList54 = new java.util.ArrayList<observer.Observer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList54, observerArray53);
        dataModels.Room room56 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus52, observerList54);
        room56.notifyAllObservers();
        java.lang.String str58 = room56.getBuilding();
        booking.state.ActiveState activeState63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        dataModels.Booking booking66 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState63, localDateTime64, localDateTime65);
        java.time.LocalDateTime localDateTime67 = null;
        booking66.setBookingEndTime(localDateTime67);
        room56.attachObserver((observer.Observer) booking66);
        user42.update(room56);
        room26.setLastUser(user42);
        user9.update(room26);
        java.lang.String str73 = room26.getBuilding();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(observerArray23);
        org.junit.Assert.assertArrayEquals(observerArray23, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(observerList32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str43, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray53);
        org.junit.Assert.assertArrayEquals(observerArray53, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User(0, "None", "None", "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType8);
        boolean boolean10 = user9.extendBooking();
        dataModels.AccountType accountType19 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user20 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType19);
        java.lang.String str21 = user20.toString();
        user20.setName("");
        boolean boolean24 = user20.register();
        int int25 = user20.getUserID();
        user20.setEmail("None");
        dataModels.RoomStatus roomStatus32 = null;
        observer.Observer[] observerArray33 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList34 = new java.util.ArrayList<observer.Observer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList34, observerArray33);
        dataModels.Room room36 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus32, observerList34);
        observer.Observer observer37 = null;
        room36.attachObserver(observer37);
        observer.Observer[] observerArray39 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList40 = new java.util.ArrayList<observer.Observer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList40, observerArray39);
        room36.setObservers(observerList40);
        dataModels.RoomStatus roomStatus43 = null;
        room36.setStatus(roomStatus43);
        user20.update(room36);
        user9.update(room36);
        dataModels.AccountType accountType47 = user9.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str21, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(observerArray33);
        org.junit.Assert.assertArrayEquals(observerArray33, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(observerArray39);
        org.junit.Assert.assertArrayEquals(observerArray39, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(accountType47);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        dataModels.Room room14 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList11);
        room14.setLastVerifiedBadge(true);
        dataModels.AccountType accountType25 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user26 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType25);
        java.lang.String str27 = user26.toString();
        user26.setName("");
        user26.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        room14.BadgeEvent(user26, false);
        booking.state.ActiveState activeState38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        dataModels.Booking booking41 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState38, localDateTime39, localDateTime40);
        java.time.LocalDateTime localDateTime42 = null;
        booking41.setBookingEndTime(localDateTime42);
        int int44 = booking41.getUserID();
        int int45 = booking41.getRoomID();
        int int46 = booking41.getUserID();
        room14.attachObserver((observer.Observer) booking41);
        dataModels.BookingStatus bookingStatus48 = booking41.getBookingStatus();
        java.lang.String str49 = booking41.getStatus();
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str27, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus48.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ACTIVE" + "'", str49, "ACTIVE");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) ' ', (-1), (int) (short) 10, (double) 1.0f, activeState4, localDateTime5, localDateTime6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        dataModels.BookingStatus bookingStatus22 = null;
        booking18.setBookingStatus(bookingStatus22);
        dataModels.BookingStatus bookingStatus24 = booking18.getBookingStatus();
        dataModels.RoomStatus roomStatus33 = null;
        observer.Observer[] observerArray34 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList35 = new java.util.ArrayList<observer.Observer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList35, observerArray34);
        dataModels.Room room37 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus33, observerList35);
        room37.notifyAllObservers();
        java.lang.String str39 = room37.getBuilding();
        booking.state.ActiveState activeState44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        dataModels.Booking booking47 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState44, localDateTime45, localDateTime46);
        java.time.LocalDateTime localDateTime48 = null;
        booking47.setBookingEndTime(localDateTime48);
        room37.attachObserver((observer.Observer) booking47);
        int int51 = booking47.getUserID();
        dataModels.BookingStatus bookingStatus52 = booking47.getBookingStatus();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        dataModels.Booking booking55 = new dataModels.Booking((int) (short) 10, (int) '4', (-1), (double) 10, bookingStatus52, localDateTime53, localDateTime54);
        booking18.setBookingStatus(bookingStatus52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = booking18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.bookingTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(bookingStatus24);
        org.junit.Assert.assertNotNull(observerArray34);
        org.junit.Assert.assertArrayEquals(observerArray34, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus52 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus52.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType13);
        dataModels.Administrator administrator15 = new dataModels.Administrator((int) (byte) 0, "", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType13);
        java.lang.String str16 = administrator15.getName();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        dataModels.RoomStatus roomStatus13 = null;
        observer.Observer[] observerArray14 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList15 = new java.util.ArrayList<observer.Observer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList15, observerArray14);
        dataModels.Room room17 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus13, observerList15);
        observer.Observer observer18 = null;
        room17.attachObserver(observer18);
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        room17.setObservers(observerList21);
        observer.OccupancySensor occupancySensor24 = room17.getOccupancySensor();
        observer.BadgeScanner badgeScanner25 = room17.getBadgeScanner();
        room17.setBuilding("hi!");
        booking7.update(room17);
        double double29 = booking7.getDeposit();
        java.lang.String str30 = booking7.getStatus();
        double double31 = booking7.getDeposit();
        int int32 = booking7.getRoomID();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(observerArray14);
        org.junit.Assert.assertArrayEquals(observerArray14, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(occupancySensor24);
        org.junit.Assert.assertNotNull(badgeScanner25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ACTIVE" + "'", str30, "ACTIVE");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        dataModels.RoomStatus roomStatus13 = null;
        observer.Observer[] observerArray14 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList15 = new java.util.ArrayList<observer.Observer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList15, observerArray14);
        dataModels.Room room17 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus13, observerList15);
        observer.Observer observer18 = null;
        room17.attachObserver(observer18);
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        room17.setObservers(observerList21);
        observer.OccupancySensor occupancySensor24 = room17.getOccupancySensor();
        observer.BadgeScanner badgeScanner25 = room17.getBadgeScanner();
        room17.setBuilding("hi!");
        booking7.update(room17);
        java.lang.String str29 = room17.getLastEvent();
        java.lang.String str30 = room17.getRoomNum();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(observerArray14);
        org.junit.Assert.assertArrayEquals(observerArray14, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(occupancySensor24);
        org.junit.Assert.assertNotNull(badgeScanner25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "None" + "'", str29, "None");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user19 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType18);
        dataModels.Administrator administrator20 = new dataModels.Administrator((int) (byte) -1, "", "", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType18);
        dataModels.ChiefEventCoordinator chiefEventCoordinator21 = new dataModels.ChiefEventCoordinator((int) (short) -1, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", accountType18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        dataModels.BookingStatus bookingStatus22 = null;
        booking18.setBookingStatus(bookingStatus22);
        java.time.LocalDateTime localDateTime24 = null;
        booking18.setBookingEndTime(localDateTime24);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        room8.setLastOccupied(false);
        java.util.ArrayList<observer.Observer> observerList13 = room8.getObservers();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerList13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType13);
        dataModels.AccountType accountType23 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user24 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType23);
        chiefEventCoordinator14.setAccountType(accountType23);
        double double26 = accountType23.getHourlyRate();
        dataModels.User user27 = new dataModels.User((int) '4', "", "hi!", "", "None", accountType23);
        dataModels.RoomStatus roomStatus32 = null;
        observer.Observer[] observerArray33 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList34 = new java.util.ArrayList<observer.Observer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList34, observerArray33);
        dataModels.Room room36 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus32, observerList34);
        observer.Observer observer37 = null;
        room36.attachObserver(observer37);
        observer.Observer[] observerArray39 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList40 = new java.util.ArrayList<observer.Observer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList40, observerArray39);
        room36.setObservers(observerList40);
        observer.OccupancySensor occupancySensor43 = room36.getOccupancySensor();
        observer.BadgeScanner badgeScanner44 = room36.getBadgeScanner();
        dataModels.RoomStatus roomStatus49 = null;
        observer.Observer[] observerArray50 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList51 = new java.util.ArrayList<observer.Observer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList51, observerArray50);
        dataModels.Room room53 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus49, observerList51);
        room36.setObservers(observerList51);
        java.lang.String str55 = room36.getRoomNum();
        user27.update(room36);
        java.lang.String str57 = user27.getEmail();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(observerArray33);
        org.junit.Assert.assertArrayEquals(observerArray33, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(observerArray39);
        org.junit.Assert.assertArrayEquals(observerArray39, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(occupancySensor43);
        org.junit.Assert.assertNotNull(badgeScanner44);
        org.junit.Assert.assertNotNull(observerArray50);
        org.junit.Assert.assertArrayEquals(observerArray50, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType13);
        dataModels.ChiefEventCoordinator chiefEventCoordinator15 = new dataModels.ChiefEventCoordinator((int) (short) 100, "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "None", accountType13);
        chiefEventCoordinator15.setName("hi!");
        chiefEventCoordinator15.setUserID(0);
        boolean boolean20 = chiefEventCoordinator15.cancelBooking();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        user9.setUserID((int) (short) 1);
        user9.setUserID((int) ' ');
        user9.setPassword("hi!");
        int int19 = user9.getUserID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        dataModels.AccountType accountType3 = new dataModels.AccountType((int) (short) -1, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", (double) 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        dataModels.RoomStatus roomStatus8 = null;
        observer.Observer[] observerArray9 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList10 = new java.util.ArrayList<observer.Observer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList10, observerArray9);
        dataModels.Room room12 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus8, observerList10);
        room12.notifyAllObservers();
        java.lang.String str14 = room12.getBuilding();
        booking.state.ActiveState activeState19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        dataModels.Booking booking22 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState19, localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setBookingEndTime(localDateTime23);
        room12.attachObserver((observer.Observer) booking22);
        int int26 = booking22.getUserID();
        dataModels.BookingStatus bookingStatus27 = booking22.getBookingStatus();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        dataModels.Booking booking30 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus27, localDateTime28, localDateTime29);
        int int31 = booking30.getRoomID();
        org.junit.Assert.assertNotNull(observerArray9);
        org.junit.Assert.assertArrayEquals(observerArray9, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus27.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator19 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType18);
        dataModels.AccountType accountType28 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user29 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType28);
        chiefEventCoordinator19.setAccountType(accountType28);
        double double31 = accountType28.getHourlyRate();
        dataModels.User user32 = new dataModels.User((int) '4', "", "hi!", "", "None", accountType28);
        double double33 = accountType28.getHourlyRate();
        dataModels.Administrator administrator34 = new dataModels.Administrator(1, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "", accountType28);
        boolean boolean35 = administrator34.isAdmin();
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        room8.setObservers(observerList23);
        dataModels.BookingStatus bookingStatus31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        dataModels.Booking booking34 = new dataModels.Booking((int) (byte) -1, (int) (short) 10, (int) 'a', (double) (byte) 100, bookingStatus31, localDateTime32, localDateTime33);
        dataModels.RoomStatus roomStatus39 = null;
        observer.Observer[] observerArray40 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList41 = new java.util.ArrayList<observer.Observer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList41, observerArray40);
        dataModels.Room room43 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus39, observerList41);
        room43.notifyAllObservers();
        java.lang.String str45 = room43.getBuilding();
        booking.state.ActiveState activeState50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        dataModels.Booking booking53 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState50, localDateTime51, localDateTime52);
        java.time.LocalDateTime localDateTime54 = null;
        booking53.setBookingEndTime(localDateTime54);
        room43.attachObserver((observer.Observer) booking53);
        int int57 = booking53.getUserID();
        dataModels.BookingStatus bookingStatus58 = booking53.getBookingStatus();
        booking34.setBookingStatus(bookingStatus58);
        room8.attachObserver((observer.Observer) booking34);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(observerArray40);
        org.junit.Assert.assertArrayEquals(observerArray40, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus58 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus58.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        dataModels.RoomStatus roomStatus13 = null;
        dataModels.RoomStatus roomStatus18 = null;
        observer.Observer[] observerArray19 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList20 = new java.util.ArrayList<observer.Observer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList20, observerArray19);
        dataModels.Room room22 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus18, observerList20);
        dataModels.Room room23 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus13, observerList20);
        room23.setLastVerifiedBadge(true);
        dataModels.AccountType accountType34 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user35 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType34);
        java.lang.String str36 = user35.toString();
        user35.setName("");
        user35.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        room23.BadgeEvent(user35, false);
        booking.state.ActiveState activeState47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        dataModels.Booking booking50 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState47, localDateTime48, localDateTime49);
        java.time.LocalDateTime localDateTime51 = null;
        booking50.setBookingEndTime(localDateTime51);
        int int53 = booking50.getUserID();
        int int54 = booking50.getRoomID();
        int int55 = booking50.getUserID();
        room23.attachObserver((observer.Observer) booking50);
        room8.attachObserver((observer.Observer) booking50);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray19);
        org.junit.Assert.assertArrayEquals(observerArray19, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str36, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        dataModels.RoomStatus roomStatus15 = null;
        room8.setStatus(roomStatus15);
        room8.setRoomID((int) (byte) -1);
        dataModels.RoomStatus roomStatus23 = null;
        observer.Observer[] observerArray24 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList25 = new java.util.ArrayList<observer.Observer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList25, observerArray24);
        dataModels.Room room27 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus23, observerList25);
        observer.Observer observer28 = null;
        room27.attachObserver(observer28);
        boolean boolean30 = room27.isLastOccupied();
        room27.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList33 = room27.getObservers();
        room8.setObservers(observerList33);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(observerArray24);
        org.junit.Assert.assertArrayEquals(observerArray24, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(observerList33);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        room8.setBuilding("hi!");
        java.lang.String str19 = room8.getLastEvent();
        boolean boolean20 = room8.isLastOccupied();
        int int21 = room8.getRoomID();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "None" + "'", str19, "None");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        dataModels.RoomStatus roomStatus8 = null;
        observer.Observer[] observerArray9 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList10 = new java.util.ArrayList<observer.Observer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList10, observerArray9);
        dataModels.Room room12 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus8, observerList10);
        room12.notifyAllObservers();
        java.lang.String str14 = room12.getBuilding();
        booking.state.ActiveState activeState19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        dataModels.Booking booking22 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState19, localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setBookingEndTime(localDateTime23);
        room12.attachObserver((observer.Observer) booking22);
        int int26 = booking22.getUserID();
        dataModels.BookingStatus bookingStatus27 = booking22.getBookingStatus();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        dataModels.Booking booking30 = new dataModels.Booking((int) (short) 100, 100, (int) (byte) 10, (double) '#', bookingStatus27, localDateTime28, localDateTime29);
        int int31 = booking30.getBookingID();
        org.junit.Assert.assertNotNull(observerArray9);
        org.junit.Assert.assertArrayEquals(observerArray9, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus27.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        room23.notifyAllObservers();
        java.lang.String str25 = room23.getBuilding();
        booking.state.ActiveState activeState30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        dataModels.Booking booking33 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState30, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setBookingEndTime(localDateTime34);
        room23.attachObserver((observer.Observer) booking33);
        user9.update(room23);
        dataModels.RoomStatus roomStatus38 = null;
        room23.setStatus(roomStatus38);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        dataModels.User user6 = new dataModels.User((int) 'a', "hi!", "", "ACTIVE", "", false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        dataModels.RoomStatus roomStatus12 = room8.getStatus();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(roomStatus12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user9 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType8);
        boolean boolean10 = user9.isAdmin();
        boolean boolean11 = user9.cancelBooking();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        user9.setUserID(10);
        dataModels.Booking booking12 = user9.bookRoom();
        java.lang.String str13 = user9.getName();
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType8);
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user19 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType18);
        chiefEventCoordinator9.setAccountType(accountType18);
        boolean boolean21 = chiefEventCoordinator9.extendBooking();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType13);
        dataModels.AccountType accountType23 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user24 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType23);
        chiefEventCoordinator14.setAccountType(accountType23);
        double double26 = accountType23.getHourlyRate();
        dataModels.User user28 = new dataModels.User((int) (byte) 100, "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "", accountType23, false);
        boolean boolean29 = user28.login();
        int int30 = user28.getUserID();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        dataModels.BookingStatus bookingStatus9 = null;
        booking7.setBookingStatus(bookingStatus9);
        java.time.LocalDateTime localDateTime11 = booking7.getBookingTime();
        double double12 = booking7.getDeposit();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        dataModels.AccountType accountType3 = new dataModels.AccountType((int) (byte) 10, "hi!", 10.0d);
        double double4 = accountType3.getHourlyRate();
        double double5 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        dataModels.Booking booking11 = user9.bookRoom();
        user9.setStud_OR_orgID("");
        java.lang.String str14 = user9.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        room8.setLastOccupied(false);
        dataModels.AccountType accountType24 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user25 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType24);
        java.lang.String str26 = user25.toString();
        dataModels.Booking booking27 = user25.bookRoom();
        room8.setLastUser(user25);
        boolean boolean29 = user25.register();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str26, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNull(booking27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        java.time.LocalDateTime localDateTime22 = booking18.getBookingEndTime();
        booking.state.ActiveState activeState31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        dataModels.Booking booking34 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState31, localDateTime32, localDateTime33);
        int int35 = booking34.getUserID();
        dataModels.RoomStatus roomStatus44 = null;
        observer.Observer[] observerArray45 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList46 = new java.util.ArrayList<observer.Observer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList46, observerArray45);
        dataModels.Room room48 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus44, observerList46);
        room48.notifyAllObservers();
        java.lang.String str50 = room48.getBuilding();
        booking.state.ActiveState activeState55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        dataModels.Booking booking58 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState55, localDateTime56, localDateTime57);
        java.time.LocalDateTime localDateTime59 = null;
        booking58.setBookingEndTime(localDateTime59);
        room48.attachObserver((observer.Observer) booking58);
        int int62 = booking58.getUserID();
        dataModels.BookingStatus bookingStatus63 = booking58.getBookingStatus();
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        dataModels.Booking booking66 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus63, localDateTime64, localDateTime65);
        booking34.setBookingStatus(bookingStatus63);
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        dataModels.Booking booking70 = new dataModels.Booking((int) ' ', 10, (int) (byte) 1, (double) 100.0f, bookingStatus63, localDateTime68, localDateTime69);
        booking18.setBookingStatus(bookingStatus63);
        int int72 = booking18.getBookingID();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(observerArray45);
        org.junit.Assert.assertArrayEquals(observerArray45, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus63 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus63.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        java.lang.String str11 = room8.getLastEvent();
        dataModels.User user12 = room8.getLastUser();
        dataModels.RoomStatus roomStatus13 = room8.getStatus();
        dataModels.RoomStatus roomStatus14 = null;
        room8.setStatus(roomStatus14);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "None" + "'", str11, "None");
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(roomStatus13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        dataModels.RoomStatus roomStatus8 = null;
        observer.Observer[] observerArray9 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList10 = new java.util.ArrayList<observer.Observer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList10, observerArray9);
        dataModels.Room room12 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus8, observerList10);
        room12.notifyAllObservers();
        java.lang.String str14 = room12.getBuilding();
        booking.state.ActiveState activeState19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        dataModels.Booking booking22 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState19, localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setBookingEndTime(localDateTime23);
        room12.attachObserver((observer.Observer) booking22);
        int int26 = booking22.getUserID();
        dataModels.BookingStatus bookingStatus27 = booking22.getBookingStatus();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        dataModels.Booking booking30 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus27, localDateTime28, localDateTime29);
        int int31 = booking30.getUserID();
        java.time.LocalDateTime localDateTime32 = null;
        booking30.setBookingEndTime(localDateTime32);
        org.junit.Assert.assertNotNull(observerArray9);
        org.junit.Assert.assertArrayEquals(observerArray9, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus27.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user14 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType13);
        dataModels.Administrator administrator15 = new dataModels.Administrator((int) (byte) -1, "", "", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType13);
        dataModels.Booking booking16 = administrator15.bookRoom();
        dataModels.Booking booking17 = administrator15.bookRoom();
        org.junit.Assert.assertNull(booking16);
        org.junit.Assert.assertNull(booking17);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        dataModels.Room room14 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList11);
        int int15 = room14.getRoomID();
        room14.setLastVerifiedBadge(false);
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner14 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        observer.Observer observer24 = null;
        room23.attachObserver(observer24);
        observer.Observer[] observerArray26 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList27 = new java.util.ArrayList<observer.Observer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList27, observerArray26);
        room23.setObservers(observerList27);
        observer.OccupancySensor occupancySensor30 = room23.getOccupancySensor();
        observer.BadgeScanner badgeScanner31 = room23.getBadgeScanner();
        room8.setBadgeScanner(badgeScanner31);
        room8.setLastEvent("None");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badgeScanner14);
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(observerArray26);
        org.junit.Assert.assertArrayEquals(observerArray26, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(occupancySensor30);
        org.junit.Assert.assertNotNull(badgeScanner31);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        booking7.setBookingEndTime(localDateTime8);
        int int10 = booking7.getUserID();
        dataModels.BookingStatus bookingStatus11 = booking7.getBookingStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus11.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        boolean boolean15 = user9.isAdmin();
        boolean boolean16 = user9.login();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        dataModels.RoomStatus roomStatus15 = null;
        room8.setStatus(roomStatus15);
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        room8.setObservers(observerList23);
        java.util.ArrayList<observer.Observer> observerList27 = room8.getObservers();
        dataModels.RoomStatus roomStatus32 = null;
        dataModels.RoomStatus roomStatus37 = null;
        observer.Observer[] observerArray38 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList39 = new java.util.ArrayList<observer.Observer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList39, observerArray38);
        dataModels.Room room41 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus37, observerList39);
        observer.Observer observer42 = null;
        room41.attachObserver(observer42);
        observer.Observer[] observerArray44 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList45 = new java.util.ArrayList<observer.Observer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList45, observerArray44);
        room41.setObservers(observerList45);
        dataModels.RoomStatus roomStatus48 = null;
        room41.setStatus(roomStatus48);
        dataModels.RoomStatus roomStatus54 = null;
        observer.Observer[] observerArray55 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList56 = new java.util.ArrayList<observer.Observer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList56, observerArray55);
        dataModels.Room room58 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus54, observerList56);
        room41.setObservers(observerList56);
        java.util.ArrayList<observer.Observer> observerList60 = room41.getObservers();
        dataModels.Room room61 = new dataModels.Room(100, "", (int) (byte) 1, "ACTIVE", roomStatus32, observerList60);
        room8.setObservers(observerList60);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(observerList27);
        org.junit.Assert.assertNotNull(observerArray38);
        org.junit.Assert.assertArrayEquals(observerArray38, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(observerArray44);
        org.junit.Assert.assertArrayEquals(observerArray44, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(observerArray55);
        org.junit.Assert.assertArrayEquals(observerArray55, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(observerList60);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.setLastOccupied(false);
        int int11 = room8.getCapacity();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        java.lang.String str13 = user9.getStud_OR_orgID();
        user9.setPassword("ACTIVE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        user9.setUserID((int) (short) -1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        dataModels.BookingStatus bookingStatus22 = null;
        booking18.setBookingStatus(bookingStatus22);
        int int24 = booking18.getRoomID();
        dataModels.RoomStatus roomStatus29 = null;
        observer.Observer[] observerArray30 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList31 = new java.util.ArrayList<observer.Observer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList31, observerArray30);
        dataModels.Room room33 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus29, observerList31);
        room33.notifyAllObservers();
        java.lang.String str35 = room33.getBuilding();
        booking.state.ActiveState activeState40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        dataModels.Booking booking43 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState40, localDateTime41, localDateTime42);
        java.time.LocalDateTime localDateTime44 = null;
        booking43.setBookingEndTime(localDateTime44);
        room33.attachObserver((observer.Observer) booking43);
        java.time.LocalDateTime localDateTime47 = booking43.getBookingEndTime();
        booking.state.ActiveState activeState56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        dataModels.Booking booking59 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState56, localDateTime57, localDateTime58);
        int int60 = booking59.getUserID();
        dataModels.RoomStatus roomStatus69 = null;
        observer.Observer[] observerArray70 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList71 = new java.util.ArrayList<observer.Observer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList71, observerArray70);
        dataModels.Room room73 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus69, observerList71);
        room73.notifyAllObservers();
        java.lang.String str75 = room73.getBuilding();
        booking.state.ActiveState activeState80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        dataModels.Booking booking83 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState80, localDateTime81, localDateTime82);
        java.time.LocalDateTime localDateTime84 = null;
        booking83.setBookingEndTime(localDateTime84);
        room73.attachObserver((observer.Observer) booking83);
        int int87 = booking83.getUserID();
        dataModels.BookingStatus bookingStatus88 = booking83.getBookingStatus();
        java.time.LocalDateTime localDateTime89 = null;
        java.time.LocalDateTime localDateTime90 = null;
        dataModels.Booking booking91 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus88, localDateTime89, localDateTime90);
        booking59.setBookingStatus(bookingStatus88);
        java.time.LocalDateTime localDateTime93 = null;
        java.time.LocalDateTime localDateTime94 = null;
        dataModels.Booking booking95 = new dataModels.Booking((int) ' ', 10, (int) (byte) 1, (double) 100.0f, bookingStatus88, localDateTime93, localDateTime94);
        booking43.setBookingStatus(bookingStatus88);
        booking18.setBookingStatus(bookingStatus88);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(observerArray30);
        org.junit.Assert.assertArrayEquals(observerArray30, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(observerArray70);
        org.junit.Assert.assertArrayEquals(observerArray70, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus88 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus88.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        dataModels.RoomStatus roomStatus12 = null;
        room8.setStatus(roomStatus12);
        dataModels.RoomStatus roomStatus18 = null;
        dataModels.RoomStatus roomStatus23 = null;
        observer.Observer[] observerArray24 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList25 = new java.util.ArrayList<observer.Observer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList25, observerArray24);
        dataModels.Room room27 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus23, observerList25);
        observer.Observer observer28 = null;
        room27.attachObserver(observer28);
        boolean boolean30 = room27.isLastOccupied();
        room27.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList33 = room27.getObservers();
        java.util.ArrayList<observer.Observer> observerList34 = room27.getObservers();
        dataModels.Room room35 = new dataModels.Room(1, "hi!", (int) 'a', "None", roomStatus18, observerList34);
        room8.setObservers(observerList34);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerArray24);
        org.junit.Assert.assertArrayEquals(observerArray24, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(observerList33);
        org.junit.Assert.assertNotNull(observerList34);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        room8.setBuilding("hi!");
        java.lang.String str19 = room8.getLastEvent();
        observer.OccupancySensor occupancySensor20 = room8.getOccupancySensor();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "None" + "'", str19, "None");
        org.junit.Assert.assertNotNull(occupancySensor20);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        int int22 = booking18.getUserID();
        int int23 = booking18.getBookingID();
        int int24 = booking18.getUserID();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) 'a', (int) (byte) 0, (int) '4', (double) (-1.0f), activeState4, localDateTime5, localDateTime6);
        dataModels.BookingStatus bookingStatus8 = booking7.getBookingStatus();
        int int9 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus8.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        java.lang.String str13 = user9.getStud_OR_orgID();
        java.lang.String str14 = user9.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        dataModels.RoomStatus roomStatus8 = null;
        observer.Observer[] observerArray9 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList10 = new java.util.ArrayList<observer.Observer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList10, observerArray9);
        dataModels.Room room12 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus8, observerList10);
        room12.notifyAllObservers();
        java.lang.String str14 = room12.getBuilding();
        booking.state.ActiveState activeState19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        dataModels.Booking booking22 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState19, localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime23 = null;
        booking22.setBookingEndTime(localDateTime23);
        room12.attachObserver((observer.Observer) booking22);
        java.time.LocalDateTime localDateTime26 = booking22.getBookingEndTime();
        booking.state.ActiveState activeState35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        dataModels.Booking booking38 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState35, localDateTime36, localDateTime37);
        int int39 = booking38.getUserID();
        dataModels.RoomStatus roomStatus48 = null;
        observer.Observer[] observerArray49 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList50 = new java.util.ArrayList<observer.Observer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList50, observerArray49);
        dataModels.Room room52 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus48, observerList50);
        room52.notifyAllObservers();
        java.lang.String str54 = room52.getBuilding();
        booking.state.ActiveState activeState59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        dataModels.Booking booking62 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState59, localDateTime60, localDateTime61);
        java.time.LocalDateTime localDateTime63 = null;
        booking62.setBookingEndTime(localDateTime63);
        room52.attachObserver((observer.Observer) booking62);
        int int66 = booking62.getUserID();
        dataModels.BookingStatus bookingStatus67 = booking62.getBookingStatus();
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        dataModels.Booking booking70 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus67, localDateTime68, localDateTime69);
        booking38.setBookingStatus(bookingStatus67);
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        dataModels.Booking booking74 = new dataModels.Booking((int) ' ', 10, (int) (byte) 1, (double) 100.0f, bookingStatus67, localDateTime72, localDateTime73);
        booking22.setBookingStatus(bookingStatus67);
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        dataModels.Booking booking78 = new dataModels.Booking((int) 'a', 32, 97, (double) (byte) -1, bookingStatus67, localDateTime76, localDateTime77);
        org.junit.Assert.assertNotNull(observerArray9);
        org.junit.Assert.assertArrayEquals(observerArray9, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(observerArray49);
        org.junit.Assert.assertArrayEquals(observerArray49, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus67 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus67.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        room8.setCapacity(0);
        room8.setRoomID((int) ' ');
        room8.setBuilding("None");
        int int21 = room8.getCapacity();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        observer.Observer observer26 = null;
        room25.attachObserver(observer26);
        boolean boolean28 = room25.isLastOccupied();
        room25.setLastVerifiedBadge(false);
        boolean boolean31 = room25.isLastVerifiedBadge();
        java.util.ArrayList<observer.Observer> observerList32 = room25.getObservers();
        room8.setObservers(observerList32);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(observerList32);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        room23.notifyAllObservers();
        java.lang.String str25 = room23.getBuilding();
        booking.state.ActiveState activeState30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        dataModels.Booking booking33 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState30, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setBookingEndTime(localDateTime34);
        room23.attachObserver((observer.Observer) booking33);
        user9.update(room23);
        user9.setStud_OR_orgID("ACTIVE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        observer.Observer observer24 = null;
        room23.attachObserver(observer24);
        boolean boolean26 = room23.isLastOccupied();
        room23.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner29 = room23.getBadgeScanner();
        dataModels.RoomStatus roomStatus34 = null;
        observer.Observer[] observerArray35 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList36 = new java.util.ArrayList<observer.Observer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList36, observerArray35);
        dataModels.Room room38 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus34, observerList36);
        observer.Observer observer39 = null;
        room38.attachObserver(observer39);
        observer.Observer[] observerArray41 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList42 = new java.util.ArrayList<observer.Observer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList42, observerArray41);
        room38.setObservers(observerList42);
        observer.OccupancySensor occupancySensor45 = room38.getOccupancySensor();
        observer.BadgeScanner badgeScanner46 = room38.getBadgeScanner();
        room23.setBadgeScanner(badgeScanner46);
        room8.setBadgeScanner(badgeScanner46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = room8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.RoomStatus.name()\" because \"this.status\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(badgeScanner29);
        org.junit.Assert.assertNotNull(observerArray35);
        org.junit.Assert.assertArrayEquals(observerArray35, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(observerArray41);
        org.junit.Assert.assertArrayEquals(observerArray41, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(occupancySensor45);
        org.junit.Assert.assertNotNull(badgeScanner46);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user14 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType13);
        dataModels.Administrator administrator15 = new dataModels.Administrator((int) (byte) 10, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", "hi!", accountType13);
        boolean boolean16 = administrator15.register();
        boolean boolean17 = administrator15.isAdmin();
        administrator15.setPassword("");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        room8.setLastEvent("");
        java.lang.String str19 = room8.getBuilding();
        dataModels.User user20 = room8.getLastUser();
        observer.BadgeScanner badgeScanner21 = room8.getBadgeScanner();
        java.util.ArrayList<observer.Observer> observerList22 = room8.getObservers();
        dataModels.RoomStatus roomStatus27 = null;
        observer.Observer[] observerArray28 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList29 = new java.util.ArrayList<observer.Observer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList29, observerArray28);
        dataModels.Room room31 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus27, observerList29);
        observer.Observer observer32 = null;
        room31.attachObserver(observer32);
        boolean boolean34 = room31.isLastOccupied();
        room31.setLastVerifiedBadge(false);
        boolean boolean37 = room31.isLastVerifiedBadge();
        java.util.ArrayList<observer.Observer> observerList38 = room31.getObservers();
        room8.setObservers(observerList38);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNotNull(badgeScanner21);
        org.junit.Assert.assertNotNull(observerList22);
        org.junit.Assert.assertNotNull(observerArray28);
        org.junit.Assert.assertArrayEquals(observerArray28, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(observerList38);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        dataModels.BookingStatus bookingStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) (byte) -1, (int) (short) 10, (int) 'a', (double) (byte) 100, bookingStatus4, localDateTime5, localDateTime6);
        dataModels.RoomStatus roomStatus12 = null;
        observer.Observer[] observerArray13 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList14 = new java.util.ArrayList<observer.Observer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList14, observerArray13);
        dataModels.Room room16 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus12, observerList14);
        room16.notifyAllObservers();
        java.lang.String str18 = room16.getBuilding();
        booking.state.ActiveState activeState23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        dataModels.Booking booking26 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState23, localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        booking26.setBookingEndTime(localDateTime27);
        room16.attachObserver((observer.Observer) booking26);
        int int30 = booking26.getUserID();
        dataModels.BookingStatus bookingStatus31 = booking26.getBookingStatus();
        booking7.setBookingStatus(bookingStatus31);
        java.time.LocalDateTime localDateTime33 = booking7.getBookingEndTime();
        org.junit.Assert.assertNotNull(observerArray13);
        org.junit.Assert.assertArrayEquals(observerArray13, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus31.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertNull(localDateTime33);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        java.lang.String str17 = user9.getEmail();
        dataModels.RoomStatus roomStatus22 = null;
        observer.Observer[] observerArray23 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList24 = new java.util.ArrayList<observer.Observer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList24, observerArray23);
        dataModels.Room room26 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus22, observerList24);
        observer.Observer observer27 = null;
        room26.attachObserver(observer27);
        boolean boolean29 = room26.isLastOccupied();
        room26.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList32 = room26.getObservers();
        dataModels.AccountType accountType41 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user42 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType41);
        java.lang.String str43 = user42.toString();
        user42.setName("");
        user42.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus52 = null;
        observer.Observer[] observerArray53 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList54 = new java.util.ArrayList<observer.Observer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList54, observerArray53);
        dataModels.Room room56 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus52, observerList54);
        room56.notifyAllObservers();
        java.lang.String str58 = room56.getBuilding();
        booking.state.ActiveState activeState63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        dataModels.Booking booking66 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState63, localDateTime64, localDateTime65);
        java.time.LocalDateTime localDateTime67 = null;
        booking66.setBookingEndTime(localDateTime67);
        room56.attachObserver((observer.Observer) booking66);
        user42.update(room56);
        room26.setLastUser(user42);
        user9.update(room26);
        user9.setAdmin(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(observerArray23);
        org.junit.Assert.assertArrayEquals(observerArray23, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(observerList32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str43, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray53);
        org.junit.Assert.assertArrayEquals(observerArray53, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        observer.Observer observer14 = null;
        room13.attachObserver(observer14);
        boolean boolean16 = room13.isLastOccupied();
        room13.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList19 = room13.getObservers();
        java.util.ArrayList<observer.Observer> observerList20 = room13.getObservers();
        dataModels.Room room21 = new dataModels.Room(1, "hi!", (int) 'a', "None", roomStatus4, observerList20);
        java.lang.String str22 = room21.getRoomNum();
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(observerList19);
        org.junit.Assert.assertNotNull(observerList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        java.lang.String str17 = user9.getEmail();
        int int18 = user9.getUserID();
        boolean boolean19 = user9.extendBooking();
        user9.setEmail("User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        room8.setObservers(observerList23);
        java.lang.String str27 = room8.getBuilding();
        dataModels.AccountType accountType36 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user37 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType36);
        boolean boolean38 = user37.isAdmin();
        user37.setPassword("hi!");
        room8.setLastUser(user37);
        user37.setPassword("None");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType8);
        int int10 = chiefEventCoordinator9.getUserID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        dataModels.User user6 = new dataModels.User((int) '4', "", "", "ACTIVE", "None", true);
        boolean boolean7 = user6.isAdmin();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        dataModels.User user6 = new dataModels.User(97, "ACTIVE", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "", true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user14 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType13);
        double double15 = accountType13.getHourlyRate();
        int int16 = accountType13.getTypeID();
        dataModels.User user18 = new dataModels.User((int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType13, false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        dataModels.AccountType accountType22 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator23 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType22);
        dataModels.AccountType accountType32 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user33 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType32);
        chiefEventCoordinator23.setAccountType(accountType32);
        int int35 = accountType32.getTypeID();
        dataModels.User user37 = new dataModels.User((int) '4', "", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType32, true);
        boolean boolean38 = user37.cancelBooking();
        room8.setLastUser(user37);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        dataModels.Booking booking11 = user9.bookRoom();
        user9.setName("None");
        boolean boolean14 = user9.isAdmin();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        int int14 = user9.getUserID();
        dataModels.AccountType accountType28 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator29 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType28);
        dataModels.AccountType accountType38 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user39 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType38);
        chiefEventCoordinator29.setAccountType(accountType38);
        dataModels.ChiefEventCoordinator chiefEventCoordinator41 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "None", "ACTIVE", "", "None", accountType38);
        int int42 = accountType38.getTypeID();
        user9.setAccountType(accountType38);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        int int22 = booking18.getUserID();
        dataModels.BookingStatus bookingStatus23 = booking18.getBookingStatus();
        java.time.LocalDateTime localDateTime24 = booking18.getBookingTime();
        java.time.LocalDateTime localDateTime25 = booking18.getBookingTime();
        int int26 = booking18.getRoomID();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus23.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        dataModels.Room room14 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList11);
        room14.setLastVerifiedBadge(true);
        dataModels.AccountType accountType25 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user26 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType25);
        java.lang.String str27 = user26.toString();
        user26.setName("");
        user26.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        room14.BadgeEvent(user26, false);
        int int34 = room14.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = room14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.RoomStatus.name()\" because \"this.status\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str27, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        dataModels.BookingStatus bookingStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) (byte) -1, (int) (short) 10, (int) 'a', (double) (byte) 100, bookingStatus4, localDateTime5, localDateTime6);
        dataModels.BookingStatus bookingStatus8 = booking7.getBookingStatus();
        int int9 = booking7.getRoomID();
        int int10 = booking7.getUserID();
        double double11 = booking7.getDeposit();
        org.junit.Assert.assertNull(bookingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        room8.setRoomNum("");
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        observer.Observer observer26 = null;
        room25.attachObserver(observer26);
        observer.Observer[] observerArray28 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList29 = new java.util.ArrayList<observer.Observer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList29, observerArray28);
        room25.setObservers(observerList29);
        observer.OccupancySensor occupancySensor32 = room25.getOccupancySensor();
        observer.BadgeScanner badgeScanner33 = room25.getBadgeScanner();
        dataModels.RoomStatus roomStatus38 = null;
        observer.Observer[] observerArray39 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList40 = new java.util.ArrayList<observer.Observer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList40, observerArray39);
        dataModels.Room room42 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus38, observerList40);
        observer.Observer observer43 = null;
        room42.attachObserver(observer43);
        observer.Observer[] observerArray45 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList46 = new java.util.ArrayList<observer.Observer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList46, observerArray45);
        room42.setObservers(observerList46);
        observer.OccupancySensor occupancySensor49 = room42.getOccupancySensor();
        observer.BadgeScanner badgeScanner50 = room42.getBadgeScanner();
        room25.setBadgeScanner(badgeScanner50);
        room8.setBadgeScanner(badgeScanner50);
        room8.setRoomNum("ACTIVE");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(observerArray28);
        org.junit.Assert.assertArrayEquals(observerArray28, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(occupancySensor32);
        org.junit.Assert.assertNotNull(badgeScanner33);
        org.junit.Assert.assertNotNull(observerArray39);
        org.junit.Assert.assertArrayEquals(observerArray39, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(observerArray45);
        org.junit.Assert.assertArrayEquals(observerArray45, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(occupancySensor49);
        org.junit.Assert.assertNotNull(badgeScanner50);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.getPassword();
        dataModels.Booking booking11 = user9.bookRoom();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        dataModels.BookingStatus bookingStatus9 = null;
        booking7.setBookingStatus(bookingStatus9);
        java.time.LocalDateTime localDateTime11 = booking7.getBookingTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.getStatus();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.BookingStatus.name()\" because \"this.bookingStatus\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        room8.setCapacity(0);
        room8.setRoomNum("None");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        int int17 = user9.getUserID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType13);
        dataModels.AccountType accountType23 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user24 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType23);
        chiefEventCoordinator14.setAccountType(accountType23);
        double double26 = accountType23.getHourlyRate();
        dataModels.User user27 = new dataModels.User((int) '4', "", "hi!", "", "None", accountType23);
        dataModels.RoomStatus roomStatus32 = null;
        observer.Observer[] observerArray33 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList34 = new java.util.ArrayList<observer.Observer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList34, observerArray33);
        dataModels.Room room36 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus32, observerList34);
        observer.Observer observer37 = null;
        room36.attachObserver(observer37);
        observer.Observer[] observerArray39 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList40 = new java.util.ArrayList<observer.Observer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList40, observerArray39);
        room36.setObservers(observerList40);
        observer.OccupancySensor occupancySensor43 = room36.getOccupancySensor();
        observer.BadgeScanner badgeScanner44 = room36.getBadgeScanner();
        dataModels.RoomStatus roomStatus49 = null;
        observer.Observer[] observerArray50 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList51 = new java.util.ArrayList<observer.Observer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList51, observerArray50);
        dataModels.Room room53 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus49, observerList51);
        room36.setObservers(observerList51);
        java.lang.String str55 = room36.getRoomNum();
        user27.update(room36);
        room36.notifyAllObservers();
        dataModels.AccountType accountType71 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator72 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType71);
        dataModels.ChiefEventCoordinator chiefEventCoordinator73 = new dataModels.ChiefEventCoordinator((int) (short) 100, "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "None", accountType71);
        java.lang.String str74 = chiefEventCoordinator73.getName();
        room36.setLastUser((dataModels.User) chiefEventCoordinator73);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(observerArray33);
        org.junit.Assert.assertArrayEquals(observerArray33, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(observerArray39);
        org.junit.Assert.assertArrayEquals(observerArray39, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(occupancySensor43);
        org.junit.Assert.assertNotNull(badgeScanner44);
        org.junit.Assert.assertNotNull(observerArray50);
        org.junit.Assert.assertArrayEquals(observerArray50, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        booking7.setBookingEndTime(localDateTime8);
        int int10 = booking7.getUserID();
        int int11 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        room8.setCapacity(0);
        room8.setRoomID((int) ' ');
        dataModels.RoomStatus roomStatus23 = null;
        observer.Observer[] observerArray24 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList25 = new java.util.ArrayList<observer.Observer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList25, observerArray24);
        dataModels.Room room27 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus23, observerList25);
        observer.Observer observer28 = null;
        room27.attachObserver(observer28);
        observer.Observer[] observerArray30 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList31 = new java.util.ArrayList<observer.Observer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList31, observerArray30);
        room27.setObservers(observerList31);
        observer.OccupancySensor occupancySensor34 = room27.getOccupancySensor();
        observer.BadgeScanner badgeScanner35 = room27.getBadgeScanner();
        room8.setBadgeScanner(badgeScanner35);
        java.lang.String str37 = room8.getLastEvent();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
        org.junit.Assert.assertNotNull(observerArray24);
        org.junit.Assert.assertArrayEquals(observerArray24, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(observerArray30);
        org.junit.Assert.assertArrayEquals(observerArray30, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(occupancySensor34);
        org.junit.Assert.assertNotNull(badgeScanner35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "None" + "'", str37, "None");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        dataModels.AccountType accountType23 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user24 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType23);
        java.lang.String str25 = user24.toString();
        user24.setName("");
        user24.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus34 = null;
        observer.Observer[] observerArray35 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList36 = new java.util.ArrayList<observer.Observer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList36, observerArray35);
        dataModels.Room room38 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus34, observerList36);
        room38.notifyAllObservers();
        java.lang.String str40 = room38.getBuilding();
        booking.state.ActiveState activeState45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        dataModels.Booking booking48 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState45, localDateTime46, localDateTime47);
        java.time.LocalDateTime localDateTime49 = null;
        booking48.setBookingEndTime(localDateTime49);
        room38.attachObserver((observer.Observer) booking48);
        user24.update(room38);
        room8.setLastUser(user24);
        java.lang.String str54 = user24.toString();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str25, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray35);
        org.junit.Assert.assertArrayEquals(observerArray35, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str54, "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        room8.setObservers(observerList23);
        java.lang.String str27 = room8.getRoomNum();
        dataModels.RoomStatus roomStatus28 = room8.getStatus();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(roomStatus28);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator19 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType18);
        dataModels.Administrator administrator20 = new dataModels.Administrator((int) (byte) 0, "", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType18);
        dataModels.AccountType accountType24 = new dataModels.AccountType(10, "", (double) (short) -1);
        administrator20.setAccountType(accountType24);
        dataModels.User user26 = new dataModels.User(1, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", "ACTIVE", "hi!", accountType24);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        dataModels.User user6 = new dataModels.User(0, "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        user9.setUserID((int) (short) 1);
        user9.setEmail("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        observer.Observer observer26 = null;
        room25.attachObserver(observer26);
        observer.Observer[] observerArray28 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList29 = new java.util.ArrayList<observer.Observer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList29, observerArray28);
        room25.setObservers(observerList29);
        observer.OccupancySensor occupancySensor32 = room25.getOccupancySensor();
        observer.BadgeScanner badgeScanner33 = room25.getBadgeScanner();
        room8.setBadgeScanner(badgeScanner33);
        int int35 = room8.getRoomID();
        int int36 = room8.getCapacity();
        java.util.ArrayList<observer.Observer> observerList37 = room8.getObservers();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(observerArray28);
        org.junit.Assert.assertArrayEquals(observerArray28, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(occupancySensor32);
        org.junit.Assert.assertNotNull(badgeScanner33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(observerList37);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        dataModels.RoomStatus roomStatus12 = null;
        room8.setStatus(roomStatus12);
        room8.setLastVerifiedBadge(true);
        dataModels.User user16 = room8.getLastUser();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner14 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        observer.Observer observer24 = null;
        room23.attachObserver(observer24);
        observer.Observer[] observerArray26 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList27 = new java.util.ArrayList<observer.Observer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList27, observerArray26);
        room23.setObservers(observerList27);
        observer.OccupancySensor occupancySensor30 = room23.getOccupancySensor();
        observer.BadgeScanner badgeScanner31 = room23.getBadgeScanner();
        room8.setBadgeScanner(badgeScanner31);
        room8.setCapacity((int) (byte) 100);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badgeScanner14);
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(observerArray26);
        org.junit.Assert.assertArrayEquals(observerArray26, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(occupancySensor30);
        org.junit.Assert.assertNotNull(badgeScanner31);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        java.lang.String str17 = user9.getEmail();
        dataModels.RoomStatus roomStatus22 = null;
        observer.Observer[] observerArray23 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList24 = new java.util.ArrayList<observer.Observer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList24, observerArray23);
        dataModels.Room room26 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus22, observerList24);
        observer.Observer observer27 = null;
        room26.attachObserver(observer27);
        boolean boolean29 = room26.isLastOccupied();
        room26.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList32 = room26.getObservers();
        dataModels.AccountType accountType41 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user42 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType41);
        java.lang.String str43 = user42.toString();
        user42.setName("");
        user42.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus52 = null;
        observer.Observer[] observerArray53 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList54 = new java.util.ArrayList<observer.Observer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList54, observerArray53);
        dataModels.Room room56 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus52, observerList54);
        room56.notifyAllObservers();
        java.lang.String str58 = room56.getBuilding();
        booking.state.ActiveState activeState63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        dataModels.Booking booking66 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState63, localDateTime64, localDateTime65);
        java.time.LocalDateTime localDateTime67 = null;
        booking66.setBookingEndTime(localDateTime67);
        room56.attachObserver((observer.Observer) booking66);
        user42.update(room56);
        room26.setLastUser(user42);
        user9.update(room26);
        room26.setBuilding("None");
        observer.BadgeScanner badgeScanner75 = room26.getBadgeScanner();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(observerArray23);
        org.junit.Assert.assertArrayEquals(observerArray23, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(observerList32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str43, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray53);
        org.junit.Assert.assertArrayEquals(observerArray53, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(badgeScanner75);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType13);
        dataModels.ChiefEventCoordinator chiefEventCoordinator15 = new dataModels.ChiefEventCoordinator((int) (short) 100, "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "None", accountType13);
        dataModels.Booking booking16 = chiefEventCoordinator15.bookRoom();
        java.lang.String str17 = chiefEventCoordinator15.getStud_OR_orgID();
        org.junit.Assert.assertNull(booking16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "None" + "'", str17, "None");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        dataModels.RoomStatus roomStatus15 = null;
        observer.Observer[] observerArray16 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList17 = new java.util.ArrayList<observer.Observer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList17, observerArray16);
        dataModels.Room room19 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus15, observerList17);
        observer.Observer observer20 = null;
        room19.attachObserver(observer20);
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        room19.setObservers(observerList23);
        observer.OccupancySensor occupancySensor26 = room19.getOccupancySensor();
        room8.setOccupancySensor(occupancySensor26);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray16);
        org.junit.Assert.assertArrayEquals(observerArray16, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(occupancySensor26);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        room8.setLastEvent("");
        java.lang.String str19 = room8.getBuilding();
        dataModels.User user20 = room8.getLastUser();
        java.lang.String str21 = room8.getRoomNum();
        dataModels.User user22 = room8.getLastUser();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator19 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType18);
        dataModels.AccountType accountType28 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user29 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType28);
        chiefEventCoordinator19.setAccountType(accountType28);
        double double31 = accountType28.getHourlyRate();
        dataModels.User user32 = new dataModels.User((int) '4', "", "hi!", "", "None", accountType28);
        double double33 = accountType28.getHourlyRate();
        dataModels.Administrator administrator34 = new dataModels.Administrator((int) (byte) -1, "ACTIVE", "", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", accountType28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        int int8 = booking7.getUserID();
        int int9 = booking7.getBookingID();
        int int10 = booking7.getBookingID();
        int int11 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        int int14 = user9.getUserID();
        java.lang.String str15 = user9.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        observer.Observer observer14 = null;
        room13.attachObserver(observer14);
        observer.Observer[] observerArray16 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList17 = new java.util.ArrayList<observer.Observer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList17, observerArray16);
        room13.setObservers(observerList17);
        dataModels.Room room20 = new dataModels.Room(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", (int) (byte) 1, "", roomStatus4, observerList17);
        java.util.ArrayList<observer.Observer> observerList21 = room20.getObservers();
        observer.OccupancySensor occupancySensor22 = room20.getOccupancySensor();
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(observerArray16);
        org.junit.Assert.assertArrayEquals(observerArray16, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(observerList21);
        org.junit.Assert.assertNotNull(occupancySensor22);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        dataModels.RoomStatus roomStatus26 = null;
        observer.Observer[] observerArray27 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList28 = new java.util.ArrayList<observer.Observer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList28, observerArray27);
        dataModels.Room room30 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus26, observerList28);
        room30.notifyAllObservers();
        java.lang.String str32 = room30.getBuilding();
        booking.state.ActiveState activeState37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        dataModels.Booking booking40 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState37, localDateTime38, localDateTime39);
        java.time.LocalDateTime localDateTime41 = null;
        booking40.setBookingEndTime(localDateTime41);
        room30.attachObserver((observer.Observer) booking40);
        observer.Observer[] observerArray44 = new observer.Observer[] { booking40 };
        java.util.ArrayList<observer.Observer> observerList45 = new java.util.ArrayList<observer.Observer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList45, observerArray44);
        room8.setObservers(observerList45);
        room8.setRoomID((int) (byte) 10);
        java.lang.String str50 = room8.getLastEvent();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(observerArray27);
        org.junit.Assert.assertArrayEquals(observerArray27, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(observerArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "None" + "'", str50, "None");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        observer.Observer observer26 = null;
        room25.attachObserver(observer26);
        observer.Observer[] observerArray28 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList29 = new java.util.ArrayList<observer.Observer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList29, observerArray28);
        room25.setObservers(observerList29);
        observer.OccupancySensor occupancySensor32 = room25.getOccupancySensor();
        observer.BadgeScanner badgeScanner33 = room25.getBadgeScanner();
        room8.setBadgeScanner(badgeScanner33);
        room8.OccupancyEvent(false);
        java.lang.String str37 = room8.getRoomNum();
        room8.notifyAllObservers();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(observerArray28);
        org.junit.Assert.assertArrayEquals(observerArray28, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(occupancySensor32);
        org.junit.Assert.assertNotNull(badgeScanner33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        java.lang.String str17 = user9.getEmail();
        dataModels.RoomStatus roomStatus22 = null;
        observer.Observer[] observerArray23 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList24 = new java.util.ArrayList<observer.Observer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList24, observerArray23);
        dataModels.Room room26 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus22, observerList24);
        observer.Observer observer27 = null;
        room26.attachObserver(observer27);
        boolean boolean29 = room26.isLastOccupied();
        room26.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList32 = room26.getObservers();
        dataModels.AccountType accountType41 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user42 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType41);
        java.lang.String str43 = user42.toString();
        user42.setName("");
        user42.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus52 = null;
        observer.Observer[] observerArray53 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList54 = new java.util.ArrayList<observer.Observer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList54, observerArray53);
        dataModels.Room room56 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus52, observerList54);
        room56.notifyAllObservers();
        java.lang.String str58 = room56.getBuilding();
        booking.state.ActiveState activeState63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        dataModels.Booking booking66 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState63, localDateTime64, localDateTime65);
        java.time.LocalDateTime localDateTime67 = null;
        booking66.setBookingEndTime(localDateTime67);
        room56.attachObserver((observer.Observer) booking66);
        user42.update(room56);
        room26.setLastUser(user42);
        user9.update(room26);
        room26.setBuilding("None");
        // The following exception was thrown during execution in test generation
        try {
            room26.OccupancyEvent(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(observerArray23);
        org.junit.Assert.assertArrayEquals(observerArray23, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(observerList32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str43, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray53);
        org.junit.Assert.assertArrayEquals(observerArray53, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        room8.setLastOccupied(false);
        room8.setCapacity((int) (byte) 100);
        dataModels.RoomStatus roomStatus15 = room8.getStatus();
        boolean boolean16 = room8.isLastVerifiedBadge();
        room8.setLastEvent("None");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(roomStatus15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        java.lang.String str13 = user9.toString();
        user9.setName("ACTIVE");
        dataModels.AccountType accountType34 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator35 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType34);
        dataModels.AccountType accountType44 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user45 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType44);
        chiefEventCoordinator35.setAccountType(accountType44);
        double double47 = accountType44.getHourlyRate();
        dataModels.User user48 = new dataModels.User((int) '4', "", "hi!", "", "None", accountType44);
        double double49 = accountType44.getHourlyRate();
        dataModels.Administrator administrator50 = new dataModels.Administrator(1, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "", accountType44);
        user9.setAccountType(accountType44);
        int int52 = accountType44.getTypeID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str13, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        room8.setLastOccupied(false);
        room8.setCapacity((int) (byte) 100);
        dataModels.User user21 = new dataModels.User((int) '4', "", "", "ACTIVE", "None", true);
        boolean boolean22 = user21.cancelBooking();
        dataModels.AccountType accountType23 = null;
        user21.setAccountType(accountType23);
        // The following exception was thrown during execution in test generation
        try {
            room8.BadgeEvent(user21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        dataModels.RoomStatus roomStatus14 = null;
        observer.Observer[] observerArray15 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList16 = new java.util.ArrayList<observer.Observer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList16, observerArray15);
        dataModels.Room room18 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus14, observerList16);
        observer.Observer observer19 = null;
        room18.attachObserver(observer19);
        observer.Observer[] observerArray21 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList22 = new java.util.ArrayList<observer.Observer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList22, observerArray21);
        room18.setObservers(observerList22);
        dataModels.Room room25 = new dataModels.Room(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", (int) (byte) 1, "", roomStatus9, observerList22);
        dataModels.Room room26 = new dataModels.Room((int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", 52, "", roomStatus4, observerList22);
        booking.state.ActiveState activeState31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        dataModels.Booking booking34 = new dataModels.Booking(52, 10, (int) (byte) 100, (double) (byte) 100, activeState31, localDateTime32, localDateTime33);
        dataModels.AccountType accountType43 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user44 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType43);
        java.lang.String str45 = user44.toString();
        user44.setName("");
        boolean boolean48 = user44.register();
        int int49 = user44.getUserID();
        user44.setEmail("None");
        dataModels.RoomStatus roomStatus56 = null;
        observer.Observer[] observerArray57 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList58 = new java.util.ArrayList<observer.Observer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList58, observerArray57);
        dataModels.Room room60 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus56, observerList58);
        observer.Observer observer61 = null;
        room60.attachObserver(observer61);
        observer.Observer[] observerArray63 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList64 = new java.util.ArrayList<observer.Observer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList64, observerArray63);
        room60.setObservers(observerList64);
        dataModels.RoomStatus roomStatus67 = null;
        room60.setStatus(roomStatus67);
        user44.update(room60);
        booking34.update(room60);
        room26.attachObserver((observer.Observer) booking34);
        java.lang.String str72 = room26.getBuilding();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = room26.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.RoomStatus.name()\" because \"this.status\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray15);
        org.junit.Assert.assertArrayEquals(observerArray15, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(observerArray21);
        org.junit.Assert.assertArrayEquals(observerArray21, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str45, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(observerArray57);
        org.junit.Assert.assertArrayEquals(observerArray57, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(observerArray63);
        org.junit.Assert.assertArrayEquals(observerArray63, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        observer.Observer observer14 = null;
        room13.attachObserver(observer14);
        observer.Observer[] observerArray16 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList17 = new java.util.ArrayList<observer.Observer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList17, observerArray16);
        room13.setObservers(observerList17);
        dataModels.Room room20 = new dataModels.Room(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", (int) (byte) 1, "", roomStatus4, observerList17);
        java.util.ArrayList<observer.Observer> observerList21 = room20.getObservers();
        dataModels.RoomStatus roomStatus26 = null;
        observer.Observer[] observerArray27 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList28 = new java.util.ArrayList<observer.Observer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList28, observerArray27);
        dataModels.Room room30 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus26, observerList28);
        observer.Observer observer31 = null;
        room30.attachObserver(observer31);
        observer.Observer[] observerArray33 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList34 = new java.util.ArrayList<observer.Observer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList34, observerArray33);
        room30.setObservers(observerList34);
        observer.OccupancySensor occupancySensor37 = room30.getOccupancySensor();
        room20.setOccupancySensor(occupancySensor37);
        dataModels.AccountType accountType52 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator53 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType52);
        dataModels.Administrator administrator54 = new dataModels.Administrator((int) (byte) 0, "", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType52);
        room20.BadgeEvent((dataModels.User) administrator54, true);
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(observerArray16);
        org.junit.Assert.assertArrayEquals(observerArray16, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(observerList21);
        org.junit.Assert.assertNotNull(observerArray27);
        org.junit.Assert.assertArrayEquals(observerArray27, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(observerArray33);
        org.junit.Assert.assertArrayEquals(observerArray33, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(occupancySensor37);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        dataModels.RoomStatus roomStatus13 = null;
        observer.Observer[] observerArray14 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList15 = new java.util.ArrayList<observer.Observer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList15, observerArray14);
        dataModels.Room room17 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus13, observerList15);
        observer.Observer observer18 = null;
        room17.attachObserver(observer18);
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        room17.setObservers(observerList21);
        observer.OccupancySensor occupancySensor24 = room17.getOccupancySensor();
        observer.BadgeScanner badgeScanner25 = room17.getBadgeScanner();
        room17.setBuilding("hi!");
        booking7.update(room17);
        dataModels.RoomStatus roomStatus33 = null;
        observer.Observer[] observerArray34 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList35 = new java.util.ArrayList<observer.Observer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList35, observerArray34);
        dataModels.Room room37 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus33, observerList35);
        room37.notifyAllObservers();
        java.lang.String str39 = room37.getBuilding();
        dataModels.RoomStatus roomStatus40 = null;
        room37.setStatus(roomStatus40);
        booking7.update(room37);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(observerArray14);
        org.junit.Assert.assertArrayEquals(observerArray14, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(occupancySensor24);
        org.junit.Assert.assertNotNull(badgeScanner25);
        org.junit.Assert.assertNotNull(observerArray34);
        org.junit.Assert.assertArrayEquals(observerArray34, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        int int15 = room8.getCapacity();
        dataModels.AccountType accountType24 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user25 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType24);
        user25.setUserID(10);
        room8.BadgeEvent(user25, true);
        java.lang.String str30 = room8.getRoomNum();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType8);
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user19 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType18);
        chiefEventCoordinator9.setAccountType(accountType18);
        chiefEventCoordinator9.setAdmin(false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        user9.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        dataModels.RoomStatus roomStatus19 = null;
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        dataModels.Room room23 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus19, observerList21);
        room23.notifyAllObservers();
        java.lang.String str25 = room23.getBuilding();
        booking.state.ActiveState activeState30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        dataModels.Booking booking33 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState30, localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        booking33.setBookingEndTime(localDateTime34);
        room23.attachObserver((observer.Observer) booking33);
        user9.update(room23);
        boolean boolean38 = user9.login();
        boolean boolean39 = user9.extendBooking();
        boolean boolean40 = user9.extendBooking();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user19 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType18);
        java.lang.String str20 = user19.toString();
        boolean boolean21 = user19.isAdmin();
        boolean boolean22 = user19.cancelBooking();
        dataModels.AccountType accountType23 = user19.getAccountType();
        double double24 = accountType23.getHourlyRate();
        int int25 = accountType23.getTypeID();
        dataModels.Administrator administrator26 = new dataModels.Administrator((int) ' ', "ACTIVE", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", accountType23);
        dataModels.User user27 = new dataModels.User(1, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType23);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str20, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking(52, 10, (int) (byte) 100, (double) (byte) 100, activeState4, localDateTime5, localDateTime6);
        dataModels.AccountType accountType16 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user17 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType16);
        java.lang.String str18 = user17.toString();
        user17.setName("");
        boolean boolean21 = user17.register();
        int int22 = user17.getUserID();
        user17.setEmail("None");
        dataModels.RoomStatus roomStatus29 = null;
        observer.Observer[] observerArray30 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList31 = new java.util.ArrayList<observer.Observer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList31, observerArray30);
        dataModels.Room room33 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus29, observerList31);
        observer.Observer observer34 = null;
        room33.attachObserver(observer34);
        observer.Observer[] observerArray36 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList37 = new java.util.ArrayList<observer.Observer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList37, observerArray36);
        room33.setObservers(observerList37);
        dataModels.RoomStatus roomStatus40 = null;
        room33.setStatus(roomStatus40);
        user17.update(room33);
        booking7.update(room33);
        int int44 = booking7.getBookingID();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str18, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(observerArray30);
        org.junit.Assert.assertArrayEquals(observerArray30, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(observerArray36);
        org.junit.Assert.assertArrayEquals(observerArray36, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        dataModels.Room room14 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList11);
        room14.setLastVerifiedBadge(true);
        dataModels.AccountType accountType25 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user26 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType25);
        java.lang.String str27 = user26.toString();
        user26.setName("");
        user26.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        room14.BadgeEvent(user26, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = room14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.RoomStatus.name()\" because \"this.status\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str27, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        room8.setLastEvent("");
        java.lang.String str19 = room8.getBuilding();
        dataModels.User user20 = room8.getLastUser();
        java.lang.String str21 = room8.getRoomNum();
        dataModels.RoomStatus roomStatus22 = null;
        room8.setStatus(roomStatus22);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        dataModels.Room room14 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList11);
        dataModels.AccountType accountType28 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user29 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType28);
        dataModels.Administrator administrator30 = new dataModels.Administrator((int) (byte) 10, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", "hi!", accountType28);
        boolean boolean31 = administrator30.register();
        boolean boolean32 = administrator30.isAdmin();
        room14.BadgeEvent((dataModels.User) administrator30, true);
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        dataModels.User user6 = new dataModels.User((int) (byte) 10, "None", "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", "hi!", false);
        boolean boolean7 = user6.register();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        observer.Observer observer26 = null;
        room25.attachObserver(observer26);
        observer.Observer[] observerArray28 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList29 = new java.util.ArrayList<observer.Observer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList29, observerArray28);
        room25.setObservers(observerList29);
        observer.OccupancySensor occupancySensor32 = room25.getOccupancySensor();
        observer.BadgeScanner badgeScanner33 = room25.getBadgeScanner();
        room8.setBadgeScanner(badgeScanner33);
        booking.state.ActiveState activeState39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        dataModels.Booking booking42 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState39, localDateTime40, localDateTime41);
        java.time.LocalDateTime localDateTime43 = null;
        booking42.setBookingEndTime(localDateTime43);
        int int45 = booking42.getUserID();
        int int46 = booking42.getRoomID();
        room8.attachObserver((observer.Observer) booking42);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(observerArray28);
        org.junit.Assert.assertArrayEquals(observerArray28, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(occupancySensor32);
        org.junit.Assert.assertNotNull(badgeScanner33);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        double double10 = accountType8.getHourlyRate();
        double double11 = accountType8.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        int int22 = booking18.getRoomID();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        dataModels.AccountType accountType5 = null;
        dataModels.User user7 = new dataModels.User(97, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", "ACTIVE", "None", accountType5, false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType8);
        dataModels.RoomStatus roomStatus14 = null;
        observer.Observer[] observerArray15 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList16 = new java.util.ArrayList<observer.Observer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList16, observerArray15);
        dataModels.Room room18 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus14, observerList16);
        observer.Observer observer19 = null;
        room18.attachObserver(observer19);
        boolean boolean21 = room18.isLastOccupied();
        room18.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner24 = room18.getBadgeScanner();
        chiefEventCoordinator9.update(room18);
        java.util.ArrayList<observer.Observer> observerList26 = room18.getObservers();
        // The following exception was thrown during execution in test generation
        try {
            room18.notifyAllObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"observer.Observer.update(dataModels.Room)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(observerArray15);
        org.junit.Assert.assertArrayEquals(observerArray15, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(badgeScanner24);
        org.junit.Assert.assertNotNull(observerList26);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        booking.state.ActiveState activeState15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        dataModels.Booking booking18 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState15, localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        booking18.setBookingEndTime(localDateTime19);
        room8.attachObserver((observer.Observer) booking18);
        dataModels.BookingStatus bookingStatus22 = null;
        booking18.setBookingStatus(bookingStatus22);
        int int24 = booking18.getBookingID();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType8);
        dataModels.AccountType accountType10 = chiefEventCoordinator9.getAccountType();
        chiefEventCoordinator9.setStud_OR_orgID("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        java.lang.String str13 = chiefEventCoordinator9.getPassword();
        dataModels.AccountType accountType14 = chiefEventCoordinator9.getAccountType();
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        java.lang.String str11 = room8.getBuilding();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        observer.Observer observer14 = null;
        room13.attachObserver(observer14);
        observer.Observer[] observerArray16 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList17 = new java.util.ArrayList<observer.Observer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList17, observerArray16);
        room13.setObservers(observerList17);
        dataModels.Room room20 = new dataModels.Room(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", (int) (byte) 1, "", roomStatus4, observerList17);
        java.util.ArrayList<observer.Observer> observerList21 = room20.getObservers();
        int int22 = room20.getRoomID();
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(observerArray16);
        org.junit.Assert.assertArrayEquals(observerArray16, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(observerList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        room8.setLastEvent("");
        room8.setLastEvent("ACTIVE");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        dataModels.AccountType accountType5 = null;
        dataModels.User user7 = new dataModels.User((int) (short) 0, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType5, false);
        java.lang.String str8 = user7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str8, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user14 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType13);
        dataModels.Administrator administrator15 = new dataModels.Administrator((int) (byte) 10, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", "hi!", accountType13);
        boolean boolean16 = administrator15.register();
        dataModels.Booking booking17 = administrator15.bookRoom();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(booking17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        int int8 = booking7.getUserID();
        int int9 = booking7.getBookingID();
        double double10 = booking7.getDeposit();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        dataModels.AccountType accountType23 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator24 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType23);
        chiefEventCoordinator24.setStud_OR_orgID("None");
        dataModels.AccountType accountType27 = chiefEventCoordinator24.getAccountType();
        dataModels.User user28 = new dataModels.User(100, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", accountType27);
        dataModels.User user30 = new dataModels.User((int) ' ', "hi!", "None", "", "ACTIVE", accountType27, true);
        dataModels.ChiefEventCoordinator chiefEventCoordinator31 = new dataModels.ChiefEventCoordinator((int) (short) 10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType27);
        org.junit.Assert.assertNotNull(accountType27);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        dataModels.RoomStatus roomStatus14 = null;
        observer.Observer[] observerArray15 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList16 = new java.util.ArrayList<observer.Observer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList16, observerArray15);
        dataModels.Room room18 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus14, observerList16);
        observer.Observer observer19 = null;
        room18.attachObserver(observer19);
        observer.Observer[] observerArray21 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList22 = new java.util.ArrayList<observer.Observer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList22, observerArray21);
        room18.setObservers(observerList22);
        dataModels.Room room25 = new dataModels.Room(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", (int) (byte) 1, "", roomStatus9, observerList22);
        dataModels.Room room26 = new dataModels.Room((int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", 52, "", roomStatus4, observerList22);
        booking.state.ActiveState activeState31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        dataModels.Booking booking34 = new dataModels.Booking(52, 10, (int) (byte) 100, (double) (byte) 100, activeState31, localDateTime32, localDateTime33);
        dataModels.AccountType accountType43 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user44 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType43);
        java.lang.String str45 = user44.toString();
        user44.setName("");
        boolean boolean48 = user44.register();
        int int49 = user44.getUserID();
        user44.setEmail("None");
        dataModels.RoomStatus roomStatus56 = null;
        observer.Observer[] observerArray57 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList58 = new java.util.ArrayList<observer.Observer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList58, observerArray57);
        dataModels.Room room60 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus56, observerList58);
        observer.Observer observer61 = null;
        room60.attachObserver(observer61);
        observer.Observer[] observerArray63 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList64 = new java.util.ArrayList<observer.Observer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList64, observerArray63);
        room60.setObservers(observerList64);
        dataModels.RoomStatus roomStatus67 = null;
        room60.setStatus(roomStatus67);
        user44.update(room60);
        booking34.update(room60);
        room26.attachObserver((observer.Observer) booking34);
        java.lang.String str72 = room26.getBuilding();
        room26.setLastVerifiedBadge(false);
        room26.OccupancyEvent(false);
        org.junit.Assert.assertNotNull(observerArray15);
        org.junit.Assert.assertArrayEquals(observerArray15, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(observerArray21);
        org.junit.Assert.assertArrayEquals(observerArray21, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str45, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(observerArray57);
        org.junit.Assert.assertArrayEquals(observerArray57, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(observerArray63);
        org.junit.Assert.assertArrayEquals(observerArray63, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        dataModels.RoomStatus roomStatus13 = null;
        observer.Observer[] observerArray14 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList15 = new java.util.ArrayList<observer.Observer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList15, observerArray14);
        dataModels.Room room17 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus13, observerList15);
        observer.Observer observer18 = null;
        room17.attachObserver(observer18);
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        room17.setObservers(observerList21);
        observer.OccupancySensor occupancySensor24 = room17.getOccupancySensor();
        observer.BadgeScanner badgeScanner25 = room17.getBadgeScanner();
        room17.setBuilding("hi!");
        booking7.update(room17);
        double double29 = booking7.getDeposit();
        java.lang.String str30 = booking7.getStatus();
        int int31 = booking7.getUserID();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(observerArray14);
        org.junit.Assert.assertArrayEquals(observerArray14, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(occupancySensor24);
        org.junit.Assert.assertNotNull(badgeScanner25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ACTIVE" + "'", str30, "ACTIVE");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        dataModels.AccountType accountType3 = new dataModels.AccountType(10, "", (double) (short) -1);
        java.lang.String str4 = accountType3.getTypeName();
        double double5 = accountType3.getHourlyRate();
        double double6 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastOccupied(false);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        observer.Observer observer14 = null;
        room13.attachObserver(observer14);
        boolean boolean16 = room13.isLastOccupied();
        room13.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList19 = room13.getObservers();
        dataModels.Room room20 = new dataModels.Room(0, "", 1, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList19);
        dataModels.User user21 = room20.getLastUser();
        boolean boolean22 = room20.isLastOccupied();
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(observerList19);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        java.util.ArrayList<observer.Observer> observerList14 = room8.getObservers();
        room8.setRoomNum("");
        room8.setLastOccupied(true);
        boolean boolean19 = room8.isLastVerifiedBadge();
        room8.setCapacity((int) (short) 1);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(observerList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        dataModels.AccountType accountType18 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator19 = new dataModels.ChiefEventCoordinator((-1), "None", "hi!", "hi!", "", accountType18);
        dataModels.AccountType accountType28 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user29 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType28);
        chiefEventCoordinator19.setAccountType(accountType28);
        double double31 = accountType28.getHourlyRate();
        dataModels.User user32 = new dataModels.User((int) '4', "", "hi!", "", "None", accountType28);
        dataModels.AccountType accountType33 = user32.getAccountType();
        java.lang.String str34 = accountType33.getTypeName();
        dataModels.ChiefEventCoordinator chiefEventCoordinator35 = new dataModels.ChiefEventCoordinator((int) ' ', "hi!", "", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType33);
        chiefEventCoordinator35.setEmail("");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(accountType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        dataModels.User user6 = new dataModels.User((int) (byte) 0, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "ACTIVE", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", true);
        java.lang.String str7 = user6.toString();
        user6.setName("User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User ID: 0, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User stud_OR_orgID: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , Account Type: None" + "'", str7, "User ID: 0, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User stud_OR_orgID: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , Account Type: None");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        java.lang.String str13 = user9.toString();
        boolean boolean14 = user9.isAdmin();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str13, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        booking.state.ActiveState activeState12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        dataModels.Booking booking15 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState12, localDateTime13, localDateTime14);
        int int16 = booking15.getUserID();
        dataModels.RoomStatus roomStatus25 = null;
        observer.Observer[] observerArray26 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList27 = new java.util.ArrayList<observer.Observer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList27, observerArray26);
        dataModels.Room room29 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus25, observerList27);
        room29.notifyAllObservers();
        java.lang.String str31 = room29.getBuilding();
        booking.state.ActiveState activeState36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        dataModels.Booking booking39 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState36, localDateTime37, localDateTime38);
        java.time.LocalDateTime localDateTime40 = null;
        booking39.setBookingEndTime(localDateTime40);
        room29.attachObserver((observer.Observer) booking39);
        int int43 = booking39.getUserID();
        dataModels.BookingStatus bookingStatus44 = booking39.getBookingStatus();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        dataModels.Booking booking47 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus44, localDateTime45, localDateTime46);
        booking15.setBookingStatus(bookingStatus44);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        dataModels.Booking booking51 = new dataModels.Booking(32, (int) (short) 100, 1, (double) 0.0f, bookingStatus44, localDateTime49, localDateTime50);
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        dataModels.Booking booking54 = new dataModels.Booking((-1), (int) (short) 0, (-1), (double) 10, bookingStatus44, localDateTime52, localDateTime53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = booking54.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.bookingTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(observerArray26);
        org.junit.Assert.assertArrayEquals(observerArray26, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus44 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus44.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        dataModels.User user6 = new dataModels.User(1, "User ID: 0, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User stud_OR_orgID: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , Account Type: None", "ACTIVE", "", "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        dataModels.RoomStatus roomStatus4 = null;
        dataModels.RoomStatus roomStatus9 = null;
        observer.Observer[] observerArray10 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList11 = new java.util.ArrayList<observer.Observer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList11, observerArray10);
        dataModels.Room room13 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus9, observerList11);
        dataModels.Room room14 = new dataModels.Room((int) (short) -1, "hi!", (int) ' ', "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", roomStatus4, observerList11);
        dataModels.User user21 = new dataModels.User((int) '4', "", "", "ACTIVE", "None", true);
        boolean boolean22 = user21.cancelBooking();
        room14.setLastUser(user21);
        org.junit.Assert.assertNotNull(observerArray10);
        org.junit.Assert.assertArrayEquals(observerArray10, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType8);
        chiefEventCoordinator9.setStud_OR_orgID("None");
        dataModels.AccountType accountType12 = chiefEventCoordinator9.getAccountType();
        int int13 = chiefEventCoordinator9.getUserID();
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user14 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType13);
        dataModels.Administrator administrator15 = new dataModels.Administrator((int) (byte) -1, "", "", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType13);
        dataModels.Booking booking16 = administrator15.bookRoom();
        administrator15.setAdmin(true);
        dataModels.Booking booking19 = administrator15.bookRoom();
        org.junit.Assert.assertNull(booking16);
        org.junit.Assert.assertNull(booking19);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType13);
        java.lang.String str15 = accountType13.getTypeName();
        dataModels.Administrator administrator16 = new dataModels.Administrator(0, "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner14 = room8.getBadgeScanner();
        room8.setRoomNum("None");
        java.lang.String str17 = room8.getLastEvent();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badgeScanner14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "None" + "'", str17, "None");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        dataModels.AccountType accountType5 = null;
        dataModels.User user7 = new dataModels.User((int) (byte) 100, "None", "User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "", "", accountType5, false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        dataModels.BookingStatus bookingStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) (byte) -1, (int) (short) 10, (int) 'a', (double) (byte) 100, bookingStatus4, localDateTime5, localDateTime6);
        dataModels.BookingStatus bookingStatus8 = booking7.getBookingStatus();
        booking.state.ActiveState activeState13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        dataModels.Booking booking16 = new dataModels.Booking((int) 'a', (int) (byte) 0, (int) '4', (double) (-1.0f), activeState13, localDateTime14, localDateTime15);
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        room25.notifyAllObservers();
        java.lang.String str27 = room25.getBuilding();
        booking.state.ActiveState activeState32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        dataModels.Booking booking35 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState32, localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime36 = null;
        booking35.setBookingEndTime(localDateTime36);
        room25.attachObserver((observer.Observer) booking35);
        java.time.LocalDateTime localDateTime39 = booking35.getBookingEndTime();
        booking.state.ActiveState activeState48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        dataModels.Booking booking51 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState48, localDateTime49, localDateTime50);
        int int52 = booking51.getUserID();
        dataModels.RoomStatus roomStatus61 = null;
        observer.Observer[] observerArray62 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList63 = new java.util.ArrayList<observer.Observer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList63, observerArray62);
        dataModels.Room room65 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus61, observerList63);
        room65.notifyAllObservers();
        java.lang.String str67 = room65.getBuilding();
        booking.state.ActiveState activeState72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        dataModels.Booking booking75 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState72, localDateTime73, localDateTime74);
        java.time.LocalDateTime localDateTime76 = null;
        booking75.setBookingEndTime(localDateTime76);
        room65.attachObserver((observer.Observer) booking75);
        int int79 = booking75.getUserID();
        dataModels.BookingStatus bookingStatus80 = booking75.getBookingStatus();
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        dataModels.Booking booking83 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus80, localDateTime81, localDateTime82);
        booking51.setBookingStatus(bookingStatus80);
        java.time.LocalDateTime localDateTime85 = null;
        java.time.LocalDateTime localDateTime86 = null;
        dataModels.Booking booking87 = new dataModels.Booking((int) ' ', 10, (int) (byte) 1, (double) 100.0f, bookingStatus80, localDateTime85, localDateTime86);
        booking35.setBookingStatus(bookingStatus80);
        booking16.setBookingStatus(bookingStatus80);
        booking7.setBookingStatus(bookingStatus80);
        org.junit.Assert.assertNull(bookingStatus8);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(observerArray62);
        org.junit.Assert.assertArrayEquals(observerArray62, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus80 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus80.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        boolean boolean11 = user9.isAdmin();
        int int12 = user9.getUserID();
        java.lang.String str13 = user9.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str13, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        boolean boolean11 = room8.isLastOccupied();
        room8.setLastVerifiedBadge(false);
        observer.BadgeScanner badgeScanner14 = room8.getBadgeScanner();
        int int15 = room8.getRoomID();
        booking.state.ActiveState activeState20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        dataModels.Booking booking23 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState20, localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime24 = booking23.getBookingEndTime();
        dataModels.BookingStatus bookingStatus25 = null;
        booking23.setBookingStatus(bookingStatus25);
        java.time.LocalDateTime localDateTime27 = booking23.getBookingTime();
        int int28 = booking23.getRoomID();
        room8.attachObserver((observer.Observer) booking23);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badgeScanner14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        room8.setObservers(observerList23);
        java.lang.String str27 = room8.getBuilding();
        room8.setRoomNum("User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user14 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType13);
        java.lang.String str15 = user14.toString();
        boolean boolean16 = user14.isAdmin();
        boolean boolean17 = user14.cancelBooking();
        dataModels.AccountType accountType18 = user14.getAccountType();
        double double19 = accountType18.getHourlyRate();
        int int20 = accountType18.getTypeID();
        dataModels.Administrator administrator21 = new dataModels.Administrator((int) ' ', "ACTIVE", "hi!", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", accountType18);
        java.lang.String str22 = administrator21.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str15, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User ID: 32, User Name: ACTIVE, User Email: hi!, User stud_OR_orgID: None, Account Type: " + "'", str22, "User ID: 32, User Name: ACTIVE, User Email: hi!, User stud_OR_orgID: None, Account Type: ");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        room8.setObservers(observerList23);
        java.lang.String str27 = room8.getRoomNum();
        dataModels.AccountType accountType36 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user37 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType36);
        java.lang.String str38 = user37.toString();
        user37.setAdmin(true);
        room8.setLastUser(user37);
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str38, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        dataModels.AccountType accountType3 = new dataModels.AccountType((int) '#', "hi!", (double) (byte) 10);
        double double4 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", (double) (short) -1);
        java.lang.String str14 = accountType13.getTypeName();
        dataModels.ChiefEventCoordinator chiefEventCoordinator15 = new dataModels.ChiefEventCoordinator(10, "ACTIVE", "hi!", "", "hi!", accountType13);
        dataModels.ChiefEventCoordinator chiefEventCoordinator16 = new dataModels.ChiefEventCoordinator((int) (short) 10, "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "ACTIVE", "User ID: 0, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User stud_OR_orgID: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , Account Type: None", accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = booking7.getBookingEndTime();
        dataModels.RoomStatus roomStatus13 = null;
        observer.Observer[] observerArray14 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList15 = new java.util.ArrayList<observer.Observer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList15, observerArray14);
        dataModels.Room room17 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus13, observerList15);
        observer.Observer observer18 = null;
        room17.attachObserver(observer18);
        observer.Observer[] observerArray20 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList21 = new java.util.ArrayList<observer.Observer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList21, observerArray20);
        room17.setObservers(observerList21);
        observer.OccupancySensor occupancySensor24 = room17.getOccupancySensor();
        observer.BadgeScanner badgeScanner25 = room17.getBadgeScanner();
        room17.setBuilding("hi!");
        booking7.update(room17);
        java.lang.String str29 = room17.getLastEvent();
        room17.setRoomNum("hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(observerArray14);
        org.junit.Assert.assertArrayEquals(observerArray14, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(observerArray20);
        org.junit.Assert.assertArrayEquals(observerArray20, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(occupancySensor24);
        org.junit.Assert.assertNotNull(badgeScanner25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "None" + "'", str29, "None");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        dataModels.AccountType accountType13 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator14 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType13);
        chiefEventCoordinator14.setStud_OR_orgID("None");
        dataModels.AccountType accountType17 = chiefEventCoordinator14.getAccountType();
        dataModels.ChiefEventCoordinator chiefEventCoordinator18 = new dataModels.ChiefEventCoordinator((int) (short) 10, "hi!", "", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "hi!", accountType17);
        chiefEventCoordinator18.setEmail("");
        java.lang.Class<?> wildcardClass21 = chiefEventCoordinator18.getClass();
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        dataModels.BookingStatus bookingStatus4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) (byte) -1, (int) (short) 10, (int) 'a', (double) (byte) 100, bookingStatus4, localDateTime5, localDateTime6);
        dataModels.BookingStatus bookingStatus8 = booking7.getBookingStatus();
        booking.state.ActiveState activeState21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        dataModels.Booking booking24 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState21, localDateTime22, localDateTime23);
        int int25 = booking24.getUserID();
        dataModels.RoomStatus roomStatus34 = null;
        observer.Observer[] observerArray35 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList36 = new java.util.ArrayList<observer.Observer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList36, observerArray35);
        dataModels.Room room38 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus34, observerList36);
        room38.notifyAllObservers();
        java.lang.String str40 = room38.getBuilding();
        booking.state.ActiveState activeState45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        dataModels.Booking booking48 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState45, localDateTime46, localDateTime47);
        java.time.LocalDateTime localDateTime49 = null;
        booking48.setBookingEndTime(localDateTime49);
        room38.attachObserver((observer.Observer) booking48);
        int int52 = booking48.getUserID();
        dataModels.BookingStatus bookingStatus53 = booking48.getBookingStatus();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        dataModels.Booking booking56 = new dataModels.Booking((int) (byte) 1, 0, (int) 'a', 0.0d, bookingStatus53, localDateTime54, localDateTime55);
        booking24.setBookingStatus(bookingStatus53);
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        dataModels.Booking booking60 = new dataModels.Booking(32, (int) (short) 100, 1, (double) 0.0f, bookingStatus53, localDateTime58, localDateTime59);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        dataModels.Booking booking63 = new dataModels.Booking((-1), (int) (short) 0, (-1), (double) 10, bookingStatus53, localDateTime61, localDateTime62);
        booking7.setBookingStatus(bookingStatus53);
        dataModels.BookingStatus bookingStatus65 = booking7.getBookingStatus();
        org.junit.Assert.assertNull(bookingStatus8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(observerArray35);
        org.junit.Assert.assertArrayEquals(observerArray35, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + bookingStatus53 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus53.equals(dataModels.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus65 + "' != '" + dataModels.BookingStatus.ACTIVE + "'", bookingStatus65.equals(dataModels.BookingStatus.ACTIVE));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        dataModels.User user6 = new dataModels.User(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", "hi!", false);
        int int7 = user6.getUserID();
        user6.setStud_OR_orgID("None");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.ChiefEventCoordinator chiefEventCoordinator9 = new dataModels.ChiefEventCoordinator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType8);
        chiefEventCoordinator9.setStud_OR_orgID("None");
        dataModels.AccountType accountType12 = chiefEventCoordinator9.getAccountType();
        chiefEventCoordinator9.setName("hi!");
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        observer.Observer observer9 = null;
        room8.attachObserver(observer9);
        observer.Observer[] observerArray11 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList12 = new java.util.ArrayList<observer.Observer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList12, observerArray11);
        room8.setObservers(observerList12);
        observer.OccupancySensor occupancySensor15 = room8.getOccupancySensor();
        observer.BadgeScanner badgeScanner16 = room8.getBadgeScanner();
        dataModels.RoomStatus roomStatus21 = null;
        observer.Observer[] observerArray22 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList23 = new java.util.ArrayList<observer.Observer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList23, observerArray22);
        dataModels.Room room25 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus21, observerList23);
        observer.Observer observer26 = null;
        room25.attachObserver(observer26);
        observer.Observer[] observerArray28 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList29 = new java.util.ArrayList<observer.Observer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList29, observerArray28);
        room25.setObservers(observerList29);
        observer.OccupancySensor occupancySensor32 = room25.getOccupancySensor();
        observer.BadgeScanner badgeScanner33 = room25.getBadgeScanner();
        room8.setBadgeScanner(badgeScanner33);
        room8.OccupancyEvent(false);
        observer.OccupancySensor occupancySensor37 = room8.getOccupancySensor();
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(observerArray11);
        org.junit.Assert.assertArrayEquals(observerArray11, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(badgeScanner16);
        org.junit.Assert.assertNotNull(observerArray22);
        org.junit.Assert.assertArrayEquals(observerArray22, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(observerArray28);
        org.junit.Assert.assertArrayEquals(observerArray28, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(occupancySensor32);
        org.junit.Assert.assertNotNull(badgeScanner33);
        org.junit.Assert.assertNotNull(occupancySensor37);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        dataModels.User user6 = new dataModels.User(100, "User ID: 10, User Name: , User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "None", "hi!", false);
        boolean boolean7 = user6.cancelBooking();
        java.lang.String str8 = user6.getStud_OR_orgID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        dataModels.RoomStatus roomStatus4 = null;
        observer.Observer[] observerArray5 = new observer.Observer[] {};
        java.util.ArrayList<observer.Observer> observerList6 = new java.util.ArrayList<observer.Observer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<observer.Observer>) observerList6, observerArray5);
        dataModels.Room room8 = new dataModels.Room((int) (byte) 10, "hi!", (int) (byte) 1, "hi!", roomStatus4, observerList6);
        room8.notifyAllObservers();
        java.lang.String str10 = room8.getBuilding();
        dataModels.RoomStatus roomStatus11 = null;
        room8.setStatus(roomStatus11);
        room8.setCapacity((int) '4');
        org.junit.Assert.assertNotNull(observerArray5);
        org.junit.Assert.assertArrayEquals(observerArray5, new observer.Observer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", (double) (short) -1);
        dataModels.User user9 = new dataModels.User((int) (short) 100, "None", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ", "", accountType8);
        user9.setName("User ID: 10, User Name: User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: , User Email: hi!, User stud_OR_orgID: , Account Type: ");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        boolean boolean11 = user9.extendBooking();
        java.lang.String str12 = user9.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        dataModels.AccountType accountType8 = new dataModels.AccountType(10, "", 10.0d);
        dataModels.User user9 = new dataModels.User((int) (byte) 10, "hi!", "hi!", "", "", accountType8);
        java.lang.String str10 = user9.toString();
        user9.setName("");
        boolean boolean13 = user9.register();
        boolean boolean14 = user9.register();
        dataModels.AccountType accountType15 = user9.getAccountType();
        java.lang.String str16 = user9.getEmail();
        dataModels.AccountType accountType17 = user9.getAccountType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: " + "'", str10, "User ID: 10, User Name: hi!, User Email: hi!, User stud_OR_orgID: , Account Type: ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        booking.state.ActiveState activeState4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        dataModels.Booking booking7 = new dataModels.Booking((int) '4', (int) (short) 100, (int) (short) 10, (double) (byte) 0, activeState4, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = null;
        booking7.setBookingEndTime(localDateTime8);
        java.lang.String str10 = booking7.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ACTIVE" + "'", str10, "ACTIVE");
    }
}

