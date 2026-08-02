package database.singleton;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.*;

import dataModels.AccountType;
import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;

public class DatabaseSingletonTest {

	public static Database db; 

	@BeforeClass
	public static void setUp() throws Exception {
		db = Database.getInstance(); 
	}

	@Test
	public void createUserTest() throws Exception {
		AccountType a1 = new AccountType(45, "Partner", 50.00); 
		User u1 = new User(106, "Bryan Rogers", "b_rogers@gmail.com", "B9cCfNshcJsupLMx0Q8u", "P123274529", a1, false); 
		db.users.add(u1); //add to array 
		assertTrue(db.users.contains(u1));

		db.storeUsers(); //store in csv 

		db.loadUsers();//load from csv

		boolean userFound = false;
		for (User u : db.users) {
			if (u.getUserID() == u1.getUserID()) { // find id
				userFound = true;
				break;
			}
		}
		assertTrue(userFound);
	}

	@Test 
	public void createUser2Test() throws Exception{
		AccountType a2 = new AccountType(55, "Staff", 40.00); 
		User u2 = new User(108, "Amira Cole", "a_cole@gmail.com", "B9cCfrwshdssupLMKfQ8u", "S323254528", a2, false); 

		//another way to add user to db
		db.addUser(u2);
		assertTrue(db.users.contains(u2));
		db.storeUsers();

		db.loadUsers();

		boolean userFound = false;
		for (User u : db.users) {
			if (u.getUserID() == u2.getUserID()) { // find id
				userFound = true;
				break;
			}
		}
		assertTrue(userFound);

	}


	@Test 
	public void findUserByEmailTest() throws Exception{
		AccountType a2 = new AccountType(55, "Staff", 40.00); 
		User u2 = new User(108, "Amira Cole", "a_cole@gmail.com", "B9cCfrwshdssupLMKfQ8u", "S323254528", a2, false); 

		db.addUser(u2);
		assertTrue(db.users.contains(u2));
		db.storeUsers();

		db.loadUsers();

		assertTrue(db.emailExists(u2.getEmail())); 

	}

	@Test 
	public void findUserByEmailFailTest() {

		assertFalse(db.emailExists(null)); 

	}

	@Test 
	public void validateUserTest() throws Exception{
		AccountType a2 = new AccountType(55, "Staff", 40.00); 
		User u2 = new User(108, "Amira Cole", "a_cole@gmail.com", "B9cCfrwshdssupLMKfQ8u", "S323254528", a2, false); 

		db.addUser(u2);
		assertTrue(db.users.contains(u2));
		db.storeUsers();

		db.loadUsers();
		
		assertNotNull(db.validateLogin(u2.getEmail(), u2.getPassword()));

	}
	
	@Test 
	public void validateUserFailTest() {
		AccountType a4 = new AccountType(55, "Faculty", 30.00); 
		User u2 = new User(108, "Anna Roleman", "ar_@gmail.com", "G9cCfrwshdssdaLMKfQ8u", "F323264528", a4, false); 
		
		assertNull(db.validateLogin(u2.getEmail(), u2.getPassword()));
		
	}
	
	@Test 
	public void createAccountTypeStudent() {
		AccountType accTypeStudent = db.createAccountType("Student"); 
		assertTrue(accTypeStudent.getTypeName().equals("Student"));
	}
	
	@Test 
	public void createAccountTypeFaculty() {
		AccountType accTypeFaculty = db.createAccountType("Faculty"); 
		assertTrue(accTypeFaculty.getTypeName().equals("Faculty"));
	}
	
	@Test (expected = Exception.class)
	public void createAccountTypeFail() {
		AccountType accType = db.createAccountType("Faculty and Admin");
		fail("IllegalArgumentException should have been thrown"); 
	}

	@Test 
	public void deleteUserTest() throws Exception{
		AccountType a2 = new AccountType(55, "Staff", 40.00); 
		User u3 = new User(108, "Lee Coleman", "lee_coleman@gmail.com", "N9fdsfrwshdssurLaKfP8u", "S523255526", a2, false); 

		db.addUser(u3);
		assertTrue(db.users.contains(u3));

		db.deleteUser(u3);

		db.loadUsers();

		assertTrue(db.users.indexOf(u3) == -1); //should not be able to find user in db	

	}

	@Test 
	public void createBookingTest() throws Exception{
		Booking b1 = new Booking(7, 2, 2 , 20.00, BookingStatus.EXPIRED, LocalDateTime.now(), LocalDateTime.of(2026, 6, 21, 16, 00));
		db.bookings.add(b1); 

		assertTrue(db.bookings.contains(b1));

		db.storeBookings(); //store in csv 

		db.loadBookings();//load from csv

		boolean bookingFound = false;
		for (Booking b : db.bookings) {
			if (b.getBookingID() == b1.getBookingID()) { // find id
				bookingFound = true;
				break;
			}
		}
		assertTrue(bookingFound);

	}

	@Test 
	public void deleteBookingTest() throws Exception{
		Booking b2 = new Booking(17, 2, 2 , 30.00, BookingStatus.EXPIRED, LocalDateTime.now(), LocalDateTime.of(2025, 8, 10, 18, 00));
		db.bookings.add(b2);

		assertTrue(db.bookings.contains(b2));

		db.deleteBooking(b2);

		assertTrue(db.bookings.indexOf(b2) == -1); //should not be able to find booking in db	
	}

	@Test 
	public void createRoomTest() throws Exception{
		Room r1 = new Room(101, "R101B", 15, "ACW", RoomStatus.AVAILABLE, null); 
		db.rooms.add(r1); 

		assertTrue(db.rooms.contains(r1));

		db.storeRooms(); //store in csv 

		db.loadRooms();//load from csv

		boolean roomFound = false;
		for (Room r : db.rooms) {
			if (r.getRoomID() == r1.getRoomID()) { // find id
				roomFound = true;
				break;
			}
		}
		assertTrue(roomFound);

	}

	@Test 
	public void deleteRoomTest() throws Exception {
		Room r2 = new Room(102, "R102C", 20, "ACE", RoomStatus.AVAILABLE, null);

		db.rooms.add(r2);

		assertTrue(db.rooms.contains(r2));

		db.deleteRoom(r2);

		assertTrue(db.rooms.indexOf(r2) == -1); //should not be able to find booking in db	

	}

}
