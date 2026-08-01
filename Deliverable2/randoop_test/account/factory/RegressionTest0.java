package account.factory;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((-1), "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(100, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 10, "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) ' ', "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 0, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) ' ', "hi!", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) 'a', "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) ' ', "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 100, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "hi!", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 100, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "hi!", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 1, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 1, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(1, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 100, "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) 'a', "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "hi!", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(1, "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(1, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 0, "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 0, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(1, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(100, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "hi!", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 10, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(1, "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 100, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 0, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) ' ', "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 100, "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) ' ', "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 100, "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '4', "hi!", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "hi!", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) 'a', "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(100, "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(1, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) ' ', "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 0, "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '4', "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 0, "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(100, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 1, "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 10, "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((-1), "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "hi!", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 100, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 10, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(100, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) 'a', "hi!", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 10, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((-1), "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) 'a', "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(1, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(1, "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 0, "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 100, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) 'a', "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 10, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 100, "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((-1), "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) 'a', "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 100, "hi!", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) ' ', "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "hi!", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) ' ', "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) ' ', "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((-1), "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(1, "", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(1, "hi!", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 0, "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) -1, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(1, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) 'a', "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 1, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((-1), "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 1, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 0, "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "hi!", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '4', "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 0, "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) ' ', "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(1, "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 0, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '4', "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "hi!", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 100, "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "hi!", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) ' ', "", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) ' ', "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 0, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "hi!", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 0, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(0, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(100, "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 1, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 1, "hi!", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 0, "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) 'a', "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(1, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) 'a', "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) ' ', "", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "hi!", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(1, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) 'a', "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 1, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 100, "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) 10, "", "", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 10, "hi!", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 1, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) ' ', "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) '#', "hi!", "hi!", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 100, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '4', "", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(1, "", "", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 1, "", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (byte) -1, "hi!", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "hi!", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "hi!", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) ' ', "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(100, "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "hi!", "hi!", "", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "", "hi!", "hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(100, "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((-1), "hi!", "", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "hi!", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((-1), "hi!", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "hi!", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(10, "hi!", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "hi!", "", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '#', "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(10, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (short) 100, "hi!", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) -1, "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 100, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 0, "", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) -1, "", "", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) 'a', "hi!", "hi!", "", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) '4', "", "hi!", "", "", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator(0, "hi!", "hi!", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = administrator6.getClass();
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((int) (byte) 10, "", "", "", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser(100, "", "hi!", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(user6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) (short) 10, "", "hi!", "hi!", "", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        dataModels.AccountType accountType5 = null;
        dataModels.User user6 = account.factory.GenerateAccountFactory.createUser((-1), "hi!", "", "hi!", "", accountType5);
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        dataModels.AccountType accountType5 = null;
        dataModels.Administrator administrator6 = account.factory.GenerateAccountFactory.createAdministrator((int) 'a', "hi!", "", "hi!", "hi!", accountType5);
        org.junit.Assert.assertNotNull(administrator6);
    }
}

