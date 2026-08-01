package dataModels;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookingStatusRoomStatusTest {

    @Test
    public void testBookingStatusValues() {

        assertEquals(
                BookingStatus.ACTIVE,
                BookingStatus.valueOf("ACTIVE"));

        assertEquals(
                4,
                BookingStatus.values().length);
    }

    @Test
    public void testRoomStatusValues() {

        assertEquals(
                RoomStatus.AVAILABLE,
                RoomStatus.valueOf("AVAILABLE"));

        assertEquals(
                4,
                RoomStatus.values().length);
    }
}