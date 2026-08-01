package observer;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dataModels.AccountType;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;

public class CheckInTest {

    private CheckIn checkIn;
    private Room room;
    private User user;

    @Before
    public void setup() {

        checkIn = new CheckIn(
                1,
                LocalDateTime.now(),
                false);

        room = new Room(
                1,
                "ACE101",
                30,
                "ACE",
                RoomStatus.AVAILABLE,
                new ArrayList<Observer>());

        user = new User(
                10,
                "John",
                "john@test.com",
                "pass",
                "123",
                new AccountType(1,"Student",20));
    }

    @Test
    public void testValidateBooking() {

        assertFalse(checkIn.validateBooking());
    }

    @Test
    public void testApplyDeposit() {

        checkIn.applyDeposit();
    }

    @Test
    public void testForfeitDeposit() {

        checkIn.forfeitDeposit();
    }

    @Test
    public void testUpdateBadgeScanVerified() {

        room.setLastEvent("Badge Scan");
        room.setLastVerifiedBadge(true);
        room.setLastUser(user);

        checkIn.update(room);
    }

    @Test
    public void testUpdateOccupancyIgnored() {

        room.setLastEvent("Occupancy Check");

        checkIn.update(room);
    }
}