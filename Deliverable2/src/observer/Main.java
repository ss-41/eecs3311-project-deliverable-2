package observer;


import java.time.LocalDateTime;

import dataModels.AccountType;
import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;
import database.singleton.Database;

public class Main {

	public static void main(String[] args) {
		 
		//create a new user that's not in the database 
		AccountType a = new AccountType(5, "Student", 20.00);
		User u1 = new User(11, "Randy Chang", "randy@university.edu", "d82mw3rw1xaskvH", "S508342656", a, true);
		
		Room r1 = new Room(10, "A105", 4, "Engineering Building", RoomStatus.AVAILABLE, null);
		Booking b1 = new Booking(8, r1.getRoomID(), 2, 20.00, BookingStatus.ACTIVE, LocalDateTime.now(), LocalDateTime.of(2026, 7, 25, 10, 30));
		CheckIn c1 = new CheckIn(1, LocalDateTime.now(), false);
		AccountVerification a1 = new AccountVerification(1, false, false);
		
		//attach observers 
		r1.attachObserver(b1);
		r1.attachObserver(c1);
		r1.attachObserver(a1);
		
		//try to scan user's badge 
		System.out.println("=== Scan 1: Randy Scans Badge (not in Database) ===");
        r1.getBadgeScanner().scan(u1);
        
        System.out.println("\n ------------------------------------------------------- \n");
        
        //store u1 in database 
        Database db = Database.getInstance();
        db.users.add(u1);
        try {
			db.storeUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        System.out.println("=== Scan 2: Randy Scans Badge (User in Database) ===");
        r1.getBadgeScanner().scan(u1);
        
        System.out.println("\n ------------------------------------------------------- \n");
        
        //trigger room's occupancy sensor
        System.out.println("=== User triggers occupancy sensor ===");
        r1.getOccupancySensor().sendOccupancyData();
		
        db.deleteUser(u1);//restore csv file's original state
		
	}

}
