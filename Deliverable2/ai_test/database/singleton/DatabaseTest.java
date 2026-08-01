package database.singleton;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dataModels.AccountType;
import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;

public class DatabaseTest {

    private Database database;

    @Before
    public void setup() {

        database = Database.getInstance();

        database.users.clear();
        database.rooms.clear();
        database.bookings.clear();
    }

    @Test
    public void testSingleton() {

        Database db2 = Database.getInstance();

        assertSame(database, db2);
    }

    @Test
    public void testCreateStudentAccountType() {

        AccountType type =
                database.createAccountType("Student");

        assertEquals(1, type.getTypeID());
        assertEquals("Student", type.getTypeName());
        assertEquals(20.0, type.getHourlyRate(), 0.001);
    }

    @Test
    public void testCreateFacultyAccountType() {

        AccountType type =
                database.createAccountType("Faculty");

        assertEquals("Faculty", type.getTypeName());
    }

    @Test
    public void testCreateStaffAccountType() {

        AccountType type =
                database.createAccountType("Staff");

        assertEquals("Staff", type.getTypeName());
    }

    @Test
    public void testCreatePartnerAccountType() {

        AccountType type =
                database.createAccountType("Partner");

        assertEquals("Partner", type.getTypeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAccountType() {

        database.createAccountType("Invalid");
    }

    @Test
    public void testGetNextUserIDEmpty() {

        assertEquals(1, database.getNextUserID());
    }

    @Test
    public void testGetNextUserID() {

        AccountType type =
                new AccountType(1,"Student",20);

        database.users.add(
                new User(
                        5,
                        "John",
                        "john@test.com",
                        "pass",
                        "111",
                        type));

        database.users.add(
                new User(
                        10,
                        "Bob",
                        "bob@test.com",
                        "pass",
                        "222",
                        type));

        assertEquals(11,
                database.getNextUserID());
    }

    @Test
    public void testEmailExists() {

        AccountType type =
                new AccountType(1,"Student",20);

        database.users.add(
                new User(
                        1,
                        "John",
                        "john@test.com",
                        "pass",
                        "111",
                        type));

        assertTrue(database.emailExists("john@test.com"));
    }

    @Test
    public void testEmailExistsIgnoreCase() {

        AccountType type =
                new AccountType(1,"Student",20);

        database.users.add(
                new User(
                        1,
                        "John",
                        "john@test.com",
                        "pass",
                        "111",
                        type));

        assertTrue(database.emailExists("JOHN@TEST.COM"));
    }

    @Test
    public void testEmailDoesNotExist() {

        assertFalse(database.emailExists("abc@test.com"));
    }

    @Test
    public void testEmailNull() {

        assertFalse(database.emailExists(null));
    }

    @Test
    public void testValidateLoginSuccess() {

        AccountType type =
                new AccountType(1,"Student",20);

        User user =
                new User(
                        1,
                        "John",
                        "john@test.com",
                        "password",
                        "111",
                        type);

        database.users.add(user);

        User result =
                database.validateLogin(
                        "john@test.com",
                        "password");

        assertEquals(user, result);
    }

    @Test
    public void testValidateLoginWrongPassword() {

        AccountType type =
                new AccountType(1,"Student",20);

        database.users.add(
                new User(
                        1,
                        "John",
                        "john@test.com",
                        "password",
                        "111",
                        type));

        assertNull(
                database.validateLogin(
                        "john@test.com",
                        "wrong"));
    }

    @Test
    public void testValidateLoginWrongEmail() {

        assertNull(
                database.validateLogin(
                        "abc@test.com",
                        "password"));
    }

    @Test
    public void testValidateLoginNullEmail() {

        assertNull(
                database.validateLogin(
                        null,
                        "password"));
    }

    @Test
    public void testValidateLoginNullPassword() {

        assertNull(
                database.validateLogin(
                        "john@test.com",
                        null));
    }

    @Test
    public void testDeleteUser() {

        AccountType type =
                new AccountType(1,"Student",20);

        User user =
                new User(
                        1,
                        "John",
                        "john@test.com",
                        "pass",
                        "111",
                        type);

        database.users.add(user);

        database.deleteUser(user);

        assertEquals(0, database.users.size());
    }

    @Test
    public void testDeleteNonExistingUser() {

        AccountType type =
                new AccountType(1,"Student",20);

        User user =
                new User(
                        1,
                        "John",
                        "john@test.com",
                        "pass",
                        "111",
                        type);

        database.deleteUser(user);

        assertEquals(0, database.users.size());
    }

    @Test
    public void testDeleteRoom() {

        Room room =
                new Room(
                        1,
                        "ACE101",
                        30,
                        "ACE",
                        RoomStatus.AVAILABLE,
                        new ArrayList<>());

        database.rooms.add(room);

        database.deleteRoom(room);

        assertEquals(0,
                database.rooms.size());
    }

    @Test
    public void testDeleteBooking() {

        Booking booking =
                new Booking(
                        1,
                        2,
                        3,
                        20,
                        BookingStatus.ACTIVE,
                        LocalDateTime.now(),
                        LocalDateTime.now().plusHours(1));

        database.bookings.add(booking);

        database.deleteBooking(booking);

        assertEquals(0,
                database.bookings.size());
    }

    @Test
    public void testDeleteNonExistingBooking() {

        Booking booking =
                new Booking(
                        99,
                        1,
                        1,
                        20,
                        BookingStatus.ACTIVE,
                        LocalDateTime.now(),
                        LocalDateTime.now());

        database.deleteBooking(booking);

        assertEquals(0,
                database.bookings.size());
    }
}