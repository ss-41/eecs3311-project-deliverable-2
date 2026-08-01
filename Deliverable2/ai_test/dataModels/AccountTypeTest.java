package dataModels;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTypeTest {

    @Test
    public void testConstructorAndGetters() {

        AccountType type = new AccountType(1, "Student", 20.0);

        assertEquals(1, type.getTypeID());
        assertEquals("Student", type.getTypeName());
        assertEquals(20.0, type.getHourlyRate(), 0.001);
    }

    @Test
    public void testDifferentAccountType() {

        AccountType type = new AccountType(2, "Faculty", 30.5);

        assertEquals(2, type.getTypeID());
        assertEquals("Faculty", type.getTypeName());
        assertEquals(30.5, type.getHourlyRate(), 0.001);
    }
}