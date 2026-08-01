package observer;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dataModels.AccountType;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;

public class AccountVerificationTest {

    private AccountVerification verification;
    private Room room;
    private User user;

    @Before
    public void setup() {

        verification = new AccountVerification(1, true, true);

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
                "12345",
                new AccountType(1, "Student", 20));
    }

    @Test
    public void testValidateEmailTrue() {

        assertTrue(verification.validateEmail());
    }

    @Test
    public void testVerifyUniversityAccountTrue() {

        assertTrue(verification.verifyUniversityAccount());
    }

    @Test
    public void testUpdateBadgeScan() {

        room.setLastEvent("Badge Scan");
        room.setLastUser(user);

        verification.update(room);
    }

    @Test
    public void testUpdateOccupancyDoesNothing() {

        room.setLastEvent("Occupancy Check");

        verification.update(room);
    }
}