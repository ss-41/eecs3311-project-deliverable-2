package dataModels;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {

    private Booking booking;

    @Before
    public void setup() {

        booking = new Booking(
                1,
                2,
                3,
                20,
                BookingStatus.ACTIVE,
                LocalDateTime.of(2026,1,1,10,0),
                LocalDateTime.of(2026,1,1,11,0));
    }

    @Test
    public void testConstructor() {

        assertEquals(1, booking.getBookingID());
        assertEquals(2, booking.getUserID());
        assertEquals(3, booking.getRoomID());
        assertEquals(20, booking.getDeposit(),0.001);
        assertEquals(
                BookingStatus.ACTIVE,
                booking.getBookingStatus());
    }

    @Test
    public void testSetBookingStatus() {

        booking.setBookingStatus(
                BookingStatus.CANCELLED);

        assertEquals(
                BookingStatus.CANCELLED,
                booking.getBookingStatus());
    }

    @Test
    public void testSetBookingEndTime() {

        LocalDateTime end =
                LocalDateTime.of(2026,1,1,12,0);

        booking.setBookingEndTime(end);

        assertEquals(end,
                booking.getBookingEndTime());
    }

    @Test
    public void testGetStatus() {

        assertEquals("ACTIVE",
                booking.getStatus());
    }

    @Test
    public void testToString() {

        String text = booking.toString();

        assertTrue(text.contains("Booking ID"));
        assertTrue(text.contains("Deposit"));
        assertTrue(text.contains("ACTIVE"));
    }

    @Test
    public void testUpdateOccupancyCompleted() {

        Room room =
                new Room(
                        1,
                        "ACE101",
                        30,
                        "ACE",
                        RoomStatus.AVAILABLE,
                        new ArrayList<>());

        room.OccupancyEvent(true);

        booking.update(room);

        assertEquals(
                BookingStatus.COMPLETED,
                booking.getBookingStatus());
    }

    @Test
    public void testUpdateBadgeScanDoesNothing() {

        Room room =
                new Room(
                        1,
                        "ACE101",
                        30,
                        "ACE",
                        RoomStatus.AVAILABLE,
                        new ArrayList<>());

        room.setLastEvent("Badge Scan");

        booking.update(room);

        assertEquals(
                BookingStatus.ACTIVE,
                booking.getBookingStatus());
    }
}