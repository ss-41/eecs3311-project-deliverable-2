package observer;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.*;

import dataModels.AccountType;
import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;
import database.singleton.Database;

public class ObserverTest {

	private String captureOutput(Runnable r) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        try {
            r.run();
        } finally {
            System.setOut(original);
        }
        return out.toString().trim();
    }
	
	public static Database db; 

	@BeforeClass
	public static void setUp() throws Exception {
		db = Database.getInstance(); 
	}

	@Test
	public void attachObserversTest() {

		Room r1 = new Room(10, "A105", 4, "Engineering Building", RoomStatus.AVAILABLE, null);
		Booking b1 = new Booking(8, r1.getRoomID(), 2, 20.00, BookingStatus.ACTIVE, LocalDateTime.now(), LocalDateTime.of(2026, 7, 25, 10, 30));
		CheckIn c1 = new CheckIn(1, LocalDateTime.now(), false);
		AccountVerification a1 = new AccountVerification(1, false, false);
		
		r1.attachObserver(b1);
		r1.attachObserver(c1);
		r1.attachObserver(a1);
		
		assertTrue(r1.getObservers().indexOf(b1) == 0); 
		assertTrue(r1.getObservers().indexOf(c1) == 1); 
		assertTrue(r1.getObservers().indexOf(a1) == 2); 
		
	}
	
	@Test 
	public void badgeScanNoUserFoundTest(){
		AccountType a = new AccountType(5, "Student", 20.00);
		User u1 = new User(11, "Randy Chang", "randy@university.edu", "d82mw3rw1xaskvH", "S508342656", a, true);

		Room r1 = new Room(10, "A105", 4, "Engineering Building", RoomStatus.AVAILABLE, null);
		Booking b1 = new Booking(8, r1.getRoomID(), 2, 20.00, BookingStatus.ACTIVE, LocalDateTime.of(2026, 7, 24, 9, 30), LocalDateTime.of(2026, 7, 25, 10, 30));
		CheckIn c1 = new CheckIn(1, LocalDateTime.now(), false);
		AccountVerification a1 = new AccountVerification(1, false, false);
		
		r1.attachObserver(b1);
		r1.attachObserver(c1);
		r1.attachObserver(a1);
		
		String output = captureOutput(() -> r1.getBadgeScanner().scan(u1)); 
		assertTrue(output.contains("[BadgeScanner] Scanned badge ID: S508342656 at Room A105")); 
		assertTrue(output.contains("[BadgeScanner] Verification result: false (Badge ID not Found)")); 
		assertTrue(output.contains("[CheckIn] Reacting to Badge Scan On Room A105. Verified = false, userID = 11, user Name = Randy Chang at"));
		assertTrue(output.contains("[AccountVerification] Reacting to badge scan on Room A105, userID = 11, user Name = Randy Chang, verifiedEmail = false, universityVerified = false"));
		db.deleteUser(u1);//restore csv file's original state
	}
	
	@Test 
	public void badgeScanUserFound() throws Exception{
		AccountType a = new AccountType(5, "Student", 20.00);
		User u1 = new User(11, "Randy Chang", "randy@university.edu", "d82mw3rw1xaskvH", "S508342656", a, true);

		Room r1 = new Room(10, "A105", 4, "Engineering Building", RoomStatus.AVAILABLE, null);
		Booking b1 = new Booking(8, r1.getRoomID(), 2, 20.00, BookingStatus.ACTIVE, LocalDateTime.of(2026, 7, 24, 9, 30), LocalDateTime.of(2026, 7, 25, 10, 30));
		CheckIn c1 = new CheckIn(1, LocalDateTime.now(), false);
		AccountVerification a1 = new AccountVerification(1, false, false);
		BadgeScanner bs1 = new BadgeScanner(101, r1); 
		r1.setBadgeScanner(bs1);
		
		r1.attachObserver(b1);
		r1.attachObserver(c1);
		r1.attachObserver(a1);
		
		//store in database 
		db.users.add(u1);
		db.storeUsers();
		
		String output = captureOutput(() -> r1.getBadgeScanner().scan(u1)); 
		assertTrue(output.contains("[BadgeScanner] Scanned badge ID: S508342656 at Room A105")); 
		assertTrue(output.contains("[BadgeScanner] Verification result: true")); 
		assertTrue(output.contains("[CheckIn] Reacting to Badge Scan On Room A105. Verified = true, userID = 11, user Name = Randy Chang at"));	 
		db.deleteUser(u1);//restore csv file's original state
	}
	
	@Test 
	public void occupancySensorRoomUnoccupiedTest() {
		Room r1 = new Room(10, "A105", 4, "Engineering Building", RoomStatus.AVAILABLE, null);
		Booking b1 = new Booking(8, r1.getRoomID(), 2, 20.00, BookingStatus.ACTIVE, LocalDateTime.of(2026, 7, 24, 9, 30), LocalDateTime.of(2026, 7, 25, 10, 30));
		
		OccupancySensor s1 = new OccupancySensor(4, "Assigned", r1);
		r1.setOccupancySensor(s1);
		
		r1.attachObserver(b1);
		
		String output = captureOutput(() -> s1.sendOccupancyData()); 
		assertTrue(output.contains("[OccupancySensor] Cheking Occupancy for Room  A105. Occupancy = false"));
		assertTrue(output.contains("[Booking] Reacting to occupancy change on A105. Occupied = false"));	
		
	}
	
	@Test 
	public void occupancySensorRoomOccupiedTest() {
		Room r1 = new Room(10, "A105", 4, "Engineering Building", RoomStatus.MAINTENANCE, null);
		Booking b1 = new Booking(8, r1.getRoomID(), 2, 20.00, BookingStatus.ACTIVE, LocalDateTime.of(2026, 7, 24, 9, 30), LocalDateTime.of(2026, 7, 25, 10, 30));
		
		OccupancySensor s1 = new OccupancySensor(4, "Assigned", r1);
		r1.setOccupancySensor(s1);
		
		r1.attachObserver(b1);
		
		String output = captureOutput(() -> s1.sendOccupancyData()); 
		assertTrue(output.contains("[OccupancySensor] Cheking Occupancy for Room  A105. Occupancy = true"));
		assertTrue(output.contains("[Booking] Reacting to occupancy change on A105. Occupied = true"));
		
		
	}

}
