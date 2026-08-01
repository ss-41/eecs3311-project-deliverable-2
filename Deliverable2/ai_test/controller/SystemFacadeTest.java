package controller;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import database.singleton.Database;

public class SystemFacadeTest {

    private SystemFacade facade;

    @Before
    public void setup() {

        facade = new SystemFacade();

        Database.getInstance().users.clear();
        Database.getInstance().rooms.clear();
        Database.getInstance().bookings.clear();
    }

    @Test
    public void testLoginInvalid() {

        assertNull(
                facade.login(
                        "abc@test.com",
                        "123"));
    }

    @Test
    public void testBookRoomInvalidRoom() {

        assertFalse(
                facade.bookRoom(
                        1,
                        1,
                        999,
                        20,
                        LocalDateTime.now(),
                        LocalDateTime.now().plusHours(1)));
    }

    @Test
    public void testCancelBookingInvalid() {

        assertFalse(
                facade.cancelBooking(
                        100,
                        100));
    }

    @Test
    public void testExtendBookingInvalid() {

        assertFalse(
                facade.extendBooking(
                        100,
                        LocalDateTime.now()));
    }

    @Test
    public void testGetBookingsNotNull() {

        assertNotNull(
                facade.getBookings());
    }

    @Test
    public void testGetRoomsNotNull() {

        assertNotNull(
                facade.getAvailableRooms());
    }

    @Test
    public void testCalculateFeeInvalidBooking() {

        assertEquals(
                0,
                facade.calculateFee(999),
                0.001);
    }

    @Test
    public void testPayInvalidBooking() {

        assertFalse(
                facade.payForBooking(999));
    }

}