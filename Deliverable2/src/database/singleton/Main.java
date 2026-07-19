package database.singleton;

import java.time.LocalDateTime;
import java.util.ArrayList;

import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;

public class Main {

	public static void main(String[] args) throws Exception {
		Database db = Database.getInstance(); //get the only instance of Database
		System.out.println("CURRENT USERS IN DATABASE");
		db.loadUsers();
		for(User u: db.users){
			System.out.println(u.toString());
		}
		
		//create new users
		User u1 = new User(6, "Jack Rey", "jack.rey@gmail.com", "B9cCfNshcJsupLMx0Q8u", "S123234529");
		User u2 = new User(7, "Emma Grace", "emma.grace@gmail.com", "sh6RkMbMQVyBPxEhJnc0", "S1423254528");
		db.users.add(u1); 
		db.users.add(u2);
		
		//add them to database 
		db.storeUsers();
		
		//show updated users in database
		System.out.println("UPDATED USERS IN DATABASE");
		for(User u: db.users){
			System.out.println(u.toString());
		}
		
		//delete users from database 
		db.deleteUser(u1);
		db.deleteUser(u2);
		
		System.out.println("\n ------------------------------------------------------- \n");
		
		Database db2 = Database.getInstance(); //can use the same instance again
		System.out.println("CURRENT BOOKINGS IN DATABASE");
		db2.loadBookings();
		for(Booking b: db2.bookings){
			System.out.println(b.toString());
		}
		
		//delete the first booking and add another one into the database
		db2.deleteBooking(db2.bookings.get(0));
		db2.bookings.add(new Booking(7, 20.00, BookingStatus.ACTIVE, LocalDateTime.now(), LocalDateTime.of(2026, 7, 25, 15, 30)));
		db2.storeBookings();
		
		//show updated bookings in database
		System.out.println("UPDATED BOOKINGS IN DATABASE");
		for(Booking b: db2.bookings){
			System.out.println(b.toString());
		}
		
		System.out.println("\n ------------------------------------------------------- \n");
		
		Database db3 = Database.getInstance(); //use the same instance 
		System.out.println("CURRENT ROOMS IN DATABASE");
		db3.loadRooms();
		for(Room r: db3.rooms){
			System.out.println(r.toString());
		}
			
		//create new room and store in database
		Room r1 = new Room(7, "D101", 30, "Ross Building", RoomStatus.CLOSED, null); 
		db3.rooms.add(r1);
		db3.storeRooms();
		
		//show updated rooms in database
		System.out.println("UPDATED ROOMS IN DATABASE");
		for(Room r: db3.rooms){
			System.out.println(r.toString());
		}
	}

}
