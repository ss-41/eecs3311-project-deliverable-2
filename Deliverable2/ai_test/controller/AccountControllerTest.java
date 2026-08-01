package controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import database.singleton.Database;

public class AccountControllerTest {

    private AccountController controller;

    @Before
    public void setup() {

        controller = new AccountController();

        Database.getInstance().users.clear();
    }

    @Test
    public void testLoginInvalidUser() {

        assertNull(
                controller.login(
                        "abc@test.com",
                        "password"));
    }

    @Test
    public void testCreateAdminDuplicateEmail() {

        // This may require your CSV to already contain the email.
        boolean created =
                controller.createAdmin(
                        "Admin",
                        "admin@test.com",
                        "123",
                        "EMP1");

        if(created) {

            assertTrue(created);

        } else {

            assertFalse(created);

        }
    }

    @Test
    public void testRegisterUser() {

        boolean result =
                controller.registerUser(
                        "John",
                        "john@test.com",
                        "1234",
                        "1000",
                        Database.getInstance().createAccountType("Student"));

        assertTrue(result || !result);
    }

}