package account.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import dataModels.AccountType;
import dataModels.Administrator;
import dataModels.User;

public class GenerateAccountFactoryTest {

    @Test
    public void testCreateUser() {

        AccountType accountType =
                new AccountType(
                        1,
                        "Student",
                        20.0);

        User user =
                GenerateAccountFactory.createUser(
                        1,
                        "John Smith",
                        "john@test.com",
                        "password123",
                        "100123456",
                        accountType);

        assertNotNull(user);

        assertEquals(1, user.getUserID());
        assertEquals("John Smith", user.getName());
        assertEquals("john@test.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals("100123456", user.getStud_OR_orgID());

        assertEquals(accountType, user.getAccountType());

        assertFalse(user.isAdmin());
    }

    @Test
    public void testCreateAdministrator() {

        AccountType accountType =
                new AccountType(
                        3,
                        "Staff",
                        40.0);

        Administrator admin =
                GenerateAccountFactory.createAdministrator(
                        10,
                        "Jane Doe",
                        "admin@test.com",
                        "adminpass",
                        "EMP100",
                        accountType);

        assertNotNull(admin);

        assertEquals(10, admin.getUserID());
        assertEquals("Jane Doe", admin.getName());
        assertEquals("admin@test.com", admin.getEmail());
        assertEquals("adminpass", admin.getPassword());
        assertEquals("EMP100", admin.getStud_OR_orgID());

        assertEquals(accountType, admin.getAccountType());

        assertTrue(admin.isAdmin());
    }

    @Test
    public void testCreateMultipleUsers() {

        AccountType student =
                new AccountType(
                        1,
                        "Student",
                        20);

        User user1 =
                GenerateAccountFactory.createUser(
                        1,
                        "Alice",
                        "alice@test.com",
                        "pass1",
                        "S001",
                        student);

        User user2 =
                GenerateAccountFactory.createUser(
                        2,
                        "Bob",
                        "bob@test.com",
                        "pass2",
                        "S002",
                        student);

        assertNotEquals(user1.getUserID(), user2.getUserID());
        assertNotEquals(user1.getEmail(), user2.getEmail());
    }

    @Test
    public void testAdministratorIsUser() {

        AccountType accountType =
                new AccountType(
                        3,
                        "Staff",
                        40);

        Administrator admin =
                GenerateAccountFactory.createAdministrator(
                        5,
                        "Admin",
                        "admin@test.com",
                        "password",
                        "EMP500",
                        accountType);

        assertTrue(admin instanceof User);
    }
}