package dataModels;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;
    private AccountType type;

    @Before
    public void setup() {

        type = new AccountType(1, "Student", 20);

        user = new User(
                10,
                "John",
                "john@test.com",
                "password",
                "12345",
                type);
    }

    @Test
    public void testConstructor() {

        assertEquals(10, user.getUserID());
        assertEquals("John", user.getName());
        assertEquals("john@test.com", user.getEmail());
        assertEquals("password", user.getPassword());
        assertEquals("12345", user.getStud_OR_orgID());
        assertEquals(type, user.getAccountType());
    }

    @Test
    public void testSetters() {

        AccountType newType = new AccountType(2, "Faculty", 30);

        user.setUserID(20);
        user.setName("Bob");
        user.setEmail("bob@test.com");
        user.setPassword("abc");
        user.setStud_OR_orgID("999");
        user.setAccountType(newType);
        user.setAdmin(true);

        assertEquals(20, user.getUserID());
        assertEquals("Bob", user.getName());
        assertEquals("bob@test.com", user.getEmail());
        assertEquals("abc", user.getPassword());
        assertEquals("999", user.getStud_OR_orgID());
        assertEquals(newType, user.getAccountType());
        assertTrue(user.isAdmin());
    }

    @Test
    public void testRegisterReturnsFalse() {

        assertFalse(user.register());
    }

    @Test
    public void testLoginReturnsFalse() {

        assertFalse(user.login());
    }

    @Test
    public void testBookRoomReturnsNull() {

        assertNull(user.bookRoom());
    }

    @Test
    public void testExtendBookingReturnsFalse() {

        assertFalse(user.extendBooking());
    }

    @Test
    public void testCancelBookingReturnsFalse() {

        assertFalse(user.cancelBooking());
    }

    @Test
    public void testUpdateDoesNothing() {

        user.update(null);
    }

    @Test
    public void testToStringContainsValues() {

        String text = user.toString();

        assertTrue(text.contains("John"));
        assertTrue(text.contains("Student"));
        assertTrue(text.contains("12345"));
    }

    @Test
    public void testConstructorWithBooleanAdmin() {

        User admin = new User(
                1,
                "Admin",
                "a@test.com",
                "pass",
                "999",
                type,
                true);

        assertTrue(admin.isAdmin());
    }

    @Test
    public void testConstructorWithoutAccountType() {

        User u = new User(
                1,
                "Name",
                "email",
                "pass",
                "ID",
                false);

        assertNull(u.getAccountType());
        assertFalse(u.isAdmin());
    }
}