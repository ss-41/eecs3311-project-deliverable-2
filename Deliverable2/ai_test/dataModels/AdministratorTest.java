package dataModels;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdministratorTest {

    @Test
    public void testAdministratorConstructor() {

        AccountType type =
                new AccountType(2, "Administrator", 40);

        Administrator admin =
                new Administrator(
                        1,
                        "Admin",
                        "admin@test.com",
                        "pass",
                        "100",
                        type);

        assertTrue(admin.isAdmin());

        assertEquals("Admin", admin.getName());
        assertEquals(type, admin.getAccountType());
    }
}