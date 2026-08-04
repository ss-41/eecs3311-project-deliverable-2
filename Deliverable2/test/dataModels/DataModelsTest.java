package dataModels;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.*;

import booking.state.ActiveState;
import database.singleton.Database;

public class DataModelsTest {
	
	//Booking Tests
	@Test
	public void testCreateBooking() {
		ActiveState a1 = new ActiveState(); 
		Booking b1 = new Booking(1031, 3, 12, 20.00, a1, LocalDateTime.of(2026, 10, 30, 14, 30), LocalDateTime.of(2026, 10, 30, 15, 30));
		b1.setBookingStatus(BookingStatus.ACTIVE);
		assertTrue(b1.toString().equals("Booking ID: 1031\nUser ID:3\nRoom ID: 12\nDeposit: $20.0\nStatus: ACTIVE\nStart: 2026-10-30 14:30\nEnd: 2026-10-30 15:30")); 
	}
	
	//User Test
	@Test 
	public void testCreateUser() {
		User u1 = new User(310, "Chloe Warren", "cw@gmail.com", "Ranger921", "S5959357371", false); 
		AccountType a1 = Database.getInstance().createAccountType("Student"); 
		assertNull(u1.getAccountType()); 
		u1.setAccountType(a1);
		assertNotNull(u1.getAccountType()); 
	}
	
	@Test
	public void testCreateUserString() {
		User u1 = new User(310, "Chloe Warren", "cw@gmail.com", "Ranger921", "S5959357371", false); 
		AccountType a1 = Database.getInstance().createAccountType("Student"); 
		u1.setAccountType(a1);
		assertTrue(u1.toString().equals("User ID: 310, User Name: Chloe Warren, User Email: cw@gmail.com, User stud_OR_orgID: S5959357371, Account Type: Student")); 
	}
	
	@Test 
	public void testCreateUserNoAccTypeString() {
		User u1 = new User(310, "Chloe Warren", "cw@gmail.com", "Ranger921", "S5959357371", false);
		u1.setName("Eala Yammen");
		assertTrue(u1.toString().equals("User ID: 310, User Name: Eala Yammen, User Email: cw@gmail.com, User stud_OR_orgID: S5959357371, Account Type: None")); 
	}
	
	//Room Tests
	@Test 
	public void testCreateRoom() {
		Room r1 = new Room(1014, "541E", 35, "Ross Building", RoomStatus.AVAILABLE, null); 
		assertTrue(r1.getCapacity() == 35); 
		r1.setCapacity(50);
		assertTrue(r1.getCapacity() == 50);
		r1.setBuilding("Lassonde Building");
		assertTrue(r1.getBuilding().equals("Lassonde Building")); 
		assertTrue(r1.toString().equals("Room ID: 1014, Room Num: 541E, Room Capacity: 50, Room Building: Lassonde Building, Room Status: AVAILABLE")); 
	}
	
	//Admin Tests
	@Test 
	public void testCreateAdmin() throws Exception{
		AccountType a2 = new AccountType(55, "Staff", 40.00); 
		ChiefEventCoordinator c1 = new ChiefEventCoordinator(108, "Amira Cole", "a_cole@gmail.com", "B9cCfrwshdssupLMKfQ8u", "S323254528", a2);
		
		AccountType a = new AccountType(5, "Student", 20.00);
		User u1 = c1.createAdministrator("Chloe Warren", "cw@gmail.com", "Ranger921", "S5959357371", a); 
		
		assertTrue(u1.getAccountType() == a); 
		assertTrue(u1.getStud_OR_orgID().equals("S5959357371")); 
		
	}
	
	
}
