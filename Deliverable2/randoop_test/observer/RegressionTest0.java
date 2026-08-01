package observer;

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
        dataModels.Room room0 = null;
        observer.OccupancySensor occupancySensor1 = new observer.OccupancySensor(room0);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor1.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        dataModels.Room room0 = null;
        observer.BadgeScanner badgeScanner1 = new observer.BadgeScanner(room0);
        dataModels.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = badgeScanner1.scan(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', true, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) 10, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        java.lang.Class<?> wildcardClass4 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) 10, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', true, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) 100, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) '#', room1);
        java.lang.Class<?> wildcardClass3 = badgeScanner2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        dataModels.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        java.lang.Class<?> wildcardClass6 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (short) -1, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        java.lang.Class<?> wildcardClass5 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (short) -1, room1);
        java.lang.Class<?> wildcardClass3 = badgeScanner2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.forfeitDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.forfeitDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) '#', room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 1, localDateTime1, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', true, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        java.lang.Class<?> wildcardClass5 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) ' ', false, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor(0, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 0, localDateTime1, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 1, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(100, localDateTime1, true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.applyDeposit();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (byte) 0, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 10, true, false);
        boolean boolean4 = accountVerification3.validateEmail();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor(1, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) 'a', false, true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.applyDeposit();
        java.lang.Class<?> wildcardClass5 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        dataModels.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner(10, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(10, localDateTime1, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        boolean boolean7 = accountVerification3.validateEmail();
        java.lang.Class<?> wildcardClass8 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', true, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) '4', room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((-1), room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) 100, "hi!", room2);
        java.lang.Class<?> wildcardClass4 = occupancySensor3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        java.lang.Class<?> wildcardClass6 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.forfeitDeposit();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(100, localDateTime1, false);
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', true, false);
        java.lang.Class<?> wildcardClass4 = accountVerification3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) ' ', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (byte) 100, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 10, true, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        java.lang.Class<?> wildcardClass6 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        java.lang.Class<?> wildcardClass6 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) -1, false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) -1, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        java.lang.Class<?> wildcardClass5 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) 1, "hi!", room2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.validateEmail();
        boolean boolean7 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, true, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) -1, true, false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 100, true, false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        boolean boolean7 = accountVerification3.validateEmail();
        boolean boolean8 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(100, true, true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(100, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner(0, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner(0, room1);
        java.lang.Class<?> wildcardClass3 = badgeScanner2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 10, localDateTime1, false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', false, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        boolean boolean6 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) -1, localDateTime1, false);
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        boolean boolean7 = accountVerification3.verifyUniversityAccount();
        java.lang.Class<?> wildcardClass8 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) 10, "hi!", room2);
        java.lang.Class<?> wildcardClass4 = occupancySensor3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 1, false, true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) 0, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        dataModels.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (short) 0, room1);
        java.lang.Class<?> wildcardClass3 = badgeScanner2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 100, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner(100, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(10, true, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        dataModels.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) -1, true, true);
        java.lang.Class<?> wildcardClass4 = accountVerification3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 10, localDateTime1, true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        boolean boolean7 = accountVerification3.validateEmail();
        boolean boolean8 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) 0, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) -1, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', true, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        java.lang.Class<?> wildcardClass5 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(100, false, false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) 'a', room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) -1, true, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.validateEmail();
        java.lang.Class<?> wildcardClass7 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        java.lang.Class<?> wildcardClass6 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', true, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.validateEmail();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 0, localDateTime1, true);
        java.lang.Class<?> wildcardClass4 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 100, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        boolean boolean7 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(100, false, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(100, localDateTime1, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) 10, "hi!", room2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean9 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 100, localDateTime1, false);
        java.lang.Class<?> wildcardClass4 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) -1, false, false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, true, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) ' ', localDateTime1, false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, false, false);
        java.lang.Class<?> wildcardClass4 = accountVerification3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        boolean boolean6 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((-1), true, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 10, true, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        dataModels.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 100, false, false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 100, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 0, localDateTime1, true);
        checkIn3.applyDeposit();
        java.lang.Class<?> wildcardClass5 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        boolean boolean8 = checkIn3.validateBooking();
        dataModels.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(10, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (byte) 10, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(10, localDateTime1, false);
        checkIn3.forfeitDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        java.lang.Class<?> wildcardClass6 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(10, localDateTime1, false);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        java.lang.Class<?> wildcardClass6 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 0, localDateTime1, false);
        checkIn3.applyDeposit();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) '#', "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 100, localDateTime1, false);
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        dataModels.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(10, localDateTime1, false);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        boolean boolean6 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(100, localDateTime1, false);
        checkIn3.applyDeposit();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        dataModels.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (short) 1, room1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.forfeitDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) -1, true, true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', true, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        java.lang.Class<?> wildcardClass9 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 10, true, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(100, localDateTime1, false);
        java.lang.Class<?> wildcardClass4 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 100, localDateTime1, false);
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(100, true, false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 0, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) -1, false, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        boolean boolean7 = checkIn3.validateBooking();
        boolean boolean8 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 1, localDateTime1, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(10, true, true);
        java.lang.Class<?> wildcardClass4 = accountVerification3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 100, localDateTime1, false);
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        java.lang.Class<?> wildcardClass6 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor(100, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) 0, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(10, true, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', false, true);
        boolean boolean4 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 100, localDateTime1, false);
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) ' ', true, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        java.lang.Class<?> wildcardClass8 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) -1, localDateTime1, true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) ' ', false, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        boolean boolean6 = accountVerification3.validateEmail();
        boolean boolean7 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((-1), true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        boolean boolean11 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor(10, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        boolean boolean7 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner(1, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) ' ', true, false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 10, true, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        java.lang.Class<?> wildcardClass5 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) 10, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(0, true, true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.validateEmail();
        boolean boolean6 = accountVerification3.validateEmail();
        boolean boolean7 = accountVerification3.validateEmail();
        boolean boolean8 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(0, false, true);
        java.lang.Class<?> wildcardClass4 = accountVerification3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) 100, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 100, false, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 0, localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 100, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) -1, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        boolean boolean6 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) -1, localDateTime1, false);
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(10, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(100, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor(100, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 1, localDateTime1, false);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(10, localDateTime1, false);
        checkIn3.applyDeposit();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 0, false, true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 10, true, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) 'a', "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(1, false, true);
        java.lang.Class<?> wildcardClass4 = accountVerification3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 1, localDateTime1, false);
        checkIn3.applyDeposit();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
        dataModels.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) 100, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (short) 0, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        dataModels.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((-1), false, true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 0, localDateTime1, true);
        checkIn3.applyDeposit();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 100, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 100, localDateTime1, true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.validateEmail();
        boolean boolean7 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        dataModels.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 10, false, false);
        boolean boolean4 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        java.lang.Class<?> wildcardClass5 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) -1, true, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor(0, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) -1, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        boolean boolean6 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) 'a', true, false);
        java.lang.Class<?> wildcardClass4 = accountVerification3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) 'a', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        java.lang.Class<?> wildcardClass8 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((-1), "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) 'a', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        boolean boolean11 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', false, true);
        java.lang.Class<?> wildcardClass4 = accountVerification3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((-1), localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        dataModels.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '4', localDateTime1, true);
        checkIn3.applyDeposit();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 100, localDateTime1, false);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        boolean boolean10 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 100, localDateTime1, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(1, localDateTime1, true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) ' ', false, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        boolean boolean6 = accountVerification3.validateEmail();
        boolean boolean7 = accountVerification3.verifyUniversityAccount();
        boolean boolean8 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.forfeitDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) -1, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        dataModels.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', true, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 0, false, false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.forfeitDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        java.lang.Class<?> wildcardClass6 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (byte) -1, "", room2);
        java.lang.Class<?> wildcardClass4 = occupancySensor3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) ' ', room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', true, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 1, localDateTime1, false);
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (byte) 1, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        java.lang.Class<?> wildcardClass5 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (short) 100, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        boolean boolean6 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        dataModels.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 0, true, false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        boolean boolean7 = accountVerification3.validateEmail();
        boolean boolean8 = accountVerification3.verifyUniversityAccount();
        boolean boolean9 = accountVerification3.verifyUniversityAccount();
        boolean boolean10 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 1, false, false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(10, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        dataModels.Room room1 = null;
        observer.BadgeScanner badgeScanner2 = new observer.BadgeScanner((int) (byte) -1, room1);
        dataModels.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = badgeScanner2.scan(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.User.getStud_OR_orgID()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        boolean boolean6 = checkIn3.validateBooking();
        boolean boolean7 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 10, localDateTime1, true);
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, false);
        java.lang.Class<?> wildcardClass4 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 10, true, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(10, localDateTime1, false);
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) 0, "", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) -1, localDateTime1, false);
        checkIn3.forfeitDeposit();
        checkIn3.applyDeposit();
        checkIn3.applyDeposit();
        dataModels.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        boolean boolean8 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) -1, localDateTime1, true);
        boolean boolean4 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 1, false, true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 100, localDateTime1, false);
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, true);
        boolean boolean4 = accountVerification3.validateEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(10, false, false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        java.lang.Class<?> wildcardClass11 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((-1), localDateTime1, true);
        java.lang.Class<?> wildcardClass4 = checkIn3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(0, localDateTime1, true);
        checkIn3.applyDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        checkIn3.applyDeposit();
        boolean boolean7 = checkIn3.validateBooking();
        java.lang.Class<?> wildcardClass8 = checkIn3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(1, false, false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((-1), true, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', true, false);
        boolean boolean4 = accountVerification3.validateEmail();
        java.lang.Class<?> wildcardClass5 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) ' ', "hi!", room2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) '#', localDateTime1, true);
        checkIn3.forfeitDeposit();
        boolean boolean5 = checkIn3.validateBooking();
        boolean boolean6 = checkIn3.validateBooking();
        checkIn3.forfeitDeposit();
        checkIn3.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(1, localDateTime1, false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '#', false, true);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) -1, false, true);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) 10, true, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) '4', false, false);
        boolean boolean4 = accountVerification3.verifyUniversityAccount();
        boolean boolean5 = accountVerification3.validateEmail();
        boolean boolean6 = accountVerification3.verifyUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        dataModels.Room room2 = null;
        observer.OccupancySensor occupancySensor3 = new observer.OccupancySensor((int) (short) -1, "hi!", room2);
        // The following exception was thrown during execution in test generation
        try {
            occupancySensor3.sendOccupancyData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getStatus()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((-1), false, false);
        dataModels.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (byte) -1, false, true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 1, localDateTime1, true);
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (short) 0, localDateTime1, false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn(10, localDateTime1, false);
        boolean boolean4 = checkIn3.validateBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((-1), localDateTime1, true);
        checkIn3.applyDeposit();
        checkIn3.forfeitDeposit();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 100, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.verifyUniversityAccount();
        java.lang.Class<?> wildcardClass6 = accountVerification3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification((int) (short) 0, true, true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        observer.AccountVerification accountVerification3 = new observer.AccountVerification(10, true, true);
        boolean boolean4 = accountVerification3.validateEmail();
        boolean boolean5 = accountVerification3.validateEmail();
        dataModels.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            accountVerification3.update(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.time.LocalDateTime localDateTime1 = null;
        observer.CheckIn checkIn3 = new observer.CheckIn((int) (byte) 0, localDateTime1, false);
        checkIn3.forfeitDeposit();
        dataModels.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkIn3.update(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"dataModels.Room.getLastEvent()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

