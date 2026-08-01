package observer;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dataModels.AccountType;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;

public class BadgeScannerTest {

    private BadgeScanner scanner;
    private Room room;
    private User user;

    @Before
    public void setup() {

        room = new Room(
                1,
                "ACE101",
                30,
                "ACE",
                RoomStatus.AVAILABLE,
                new ArrayList<Observer>());

        scanner = new BadgeScanner(room);

        user = new User(
                5,
                "Alice",
                "alice@test.com",
                "pass",
                "S12345",
                new AccountType(1,"Student",20));
    }

    @Test
    public void testScanReturnsBadgeID() {

        String id = scanner.scan(user);

        assertEquals("S12345", id);
    }

    @Test
    public void testVerifyMethodRuns() {

        scanner.verify(user);
    }
}