package controller;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dataModels.Room;
import dataModels.RoomStatus;
import database.singleton.Database;

public class BookingControllerTestAI {

    private BookingController controller;

    @Before
    public void setup() {

        controller = new BookingController();

        Database db = Database.getInstance();

        db.rooms.clear();
        db.bookings.clear();
    }

    @Test
    public void testCreateBookingRoomNotFound() {

        assertFalse(
                controller.createBooking(
                        1,
                        1,
                        999,
                        20,
                        LocalDateTime.now(),
                        LocalDateTime.now().plusHours(1)));
    }

    @Test
    public void testCreateBookingRoomUnavailable() {

        Database.getInstance().rooms.add(
                new Room(
                        1,
                        "ACE101",
                        30,
                        "ACE",
                        RoomStatus.CLOSED,
                        new ArrayList<>()));

        assertFalse(
                controller.createBooking(
                        1,
                        1,
                        1,
                        20,
                        LocalDateTime.now(),
                        LocalDateTime.now().plusHours(1)));
    }

    @Test
    public void testCancelBookingInvalid() {

        assertFalse(
                controller.cancelBooking(
                        100,
                        100));
    }

    @Test
    public void testExtendBookingInvalid() {

        assertFalse(
                controller.extendBooking(
                        999,
                        LocalDateTime.now()));
    }

    @Test
    public void testGetBookings() {

        assertNotNull(controller.getBookings());
    }

}