package database.singleton;
import java.util.ArrayList;

import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import booking.state.BookingState;

public class Database {
	private static Database instance; 
	private static String pathRooms = "src/csv_files/room.csv";
	private static String pathBookings = "src/csv_files/booking.csv";
	private static String pathUsers = "src/csv_files/user.csv";
	
	public ArrayList<User> users = new ArrayList<User>();
	public ArrayList<Booking> bookings = new ArrayList<Booking>();
	public ArrayList<Room> rooms = new ArrayList<Room>();
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if (instance == null) {
			instance = new Database(); 
		}
		return instance;
	}
	
	//load rooms from csv file
	public void loadRooms() throws Exception{
		CsvReader readerRoom;
		try {
			rooms.clear();
			readerRoom = new CsvReader(pathRooms);
			readerRoom.readHeaders();
			while (readerRoom.readRecord()) {
				int roomID = Integer.valueOf(readerRoom.get("roomID"));
				String roomNum = readerRoom.get("roomNum");
				int capacity = Integer.valueOf(readerRoom.get("capacity")); 
				String building = readerRoom.get("building");
				String stringRoomStatus = readerRoom.get("status"); 
				RoomStatus roomStatus = RoomStatus.valueOf(stringRoomStatus);
				Room r = new Room(roomID, roomNum, capacity, building, roomStatus, null);
				rooms.add(r);
			}
			readerRoom.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	//store rooms in csv file 
	public void storeRooms() throws Exception{
		CsvWriter csvOutputRoom = new CsvWriter(new FileWriter(pathRooms, false), ',');
		try {
			csvOutputRoom.write("roomID");
			csvOutputRoom.write("roomNum");
			csvOutputRoom.write("capacity");
			csvOutputRoom.write("building");
			csvOutputRoom.write("roomStatus");
			csvOutputRoom.endRecord();
			
			for (Room r: rooms) {
				csvOutputRoom.write(String.valueOf(r.getRoomID()));
				csvOutputRoom.write(r.getRoomNum());
				csvOutputRoom.write(String.valueOf(r.getCapacity()));
				csvOutputRoom.write(r.getBuilding());
				csvOutputRoom.write(r.getStatus().name());
				csvOutputRoom.endRecord();
			}
			csvOutputRoom.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//removes room from csv file 
	public void deleteRoom(Room room) {
		Room rToRemove = null;
		for (Room r: rooms) {
			if (r.getRoomID() == room.getRoomID()) {
				rToRemove = r;
			}
		}
		rooms.remove(rToRemove);
		
		try {
			instance.storeRooms();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//load bookings from csv file
	public void loadBookings() throws Exception{
		CsvReader readerBooking;
		try {
			bookings.clear();
			readerBooking = new CsvReader(pathBookings);
			readerBooking.readHeaders();
			while (readerBooking.readRecord()) {
				int bookingID = Integer.valueOf(readerBooking.get("bookingID")); 
				Double deposit = Double.valueOf(readerBooking.get("deposit")); 
				String stringBookingStatus = readerBooking.get("bookingStatus"); 
				BookingStatus bookingStatus = BookingStatus.valueOf(stringBookingStatus);
				String stringBookingTime = readerBooking.get("bookingTime"); 
				LocalDateTime bookingTime = LocalDateTime.parse(stringBookingTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
				String stringBookingEndTime = readerBooking.get("bookingEndTime");
				LocalDateTime bookingEndTime = LocalDateTime.parse(stringBookingEndTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
				Booking b = new Booking(bookingID, deposit, bookingStatus, bookingTime, bookingEndTime);
				bookings.add(b);
			}
			readerBooking.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
	}
	
	public void storeBookings() throws Exception{
		CsvWriter csvOutputBooking = new CsvWriter(new FileWriter(pathBookings, false), ',');
		try {
			csvOutputBooking.write("bookingID");
			csvOutputBooking.write("deposit");
			csvOutputBooking.write("bookingStatus");
			csvOutputBooking.write("bookingTime");
			csvOutputBooking.write("bookingEndTime");
			csvOutputBooking.endRecord();
			
			for (Booking b: bookings) {
				csvOutputBooking.write(String.valueOf(b.getBookingID()));
				csvOutputBooking.write(String.valueOf(b.getDeposit()));
				String stringBookingStatus = b.getBookingStatus().name();
				csvOutputBooking.write(stringBookingStatus);
				String stringBookingTime = b.getBookingTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
				csvOutputBooking.write(stringBookingTime);
				String stringBookingEndTime = b.getBookingEndTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
				csvOutputBooking.write(stringBookingEndTime);
				csvOutputBooking.endRecord();
			}
			csvOutputBooking.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//removes booking from csv file 
		public void deleteBooking(Booking booking) {
			Booking bToRemove = null;
			for (Booking b: bookings) {
				if (b.getBookingID() == booking.getBookingID()) {
					bToRemove = b;
				}
			}
			bookings.remove(bToRemove);
			
			try {
				instance.storeBookings();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	//loads users from csv file
	public void loadUsers() throws Exception{
		CsvReader readerUser;
		try {
			users.clear();
			readerUser = new CsvReader(pathUsers);
			readerUser.readHeaders();
			while (readerUser.readRecord()) {
				int userID = Integer.valueOf(readerUser.get("userID")); 
				String name = readerUser.get("name"); 
				String email = readerUser.get("email"); 
				String password = readerUser.get("password"); 
				String stud_OR_orgID = readerUser.get("stud_OR_orgID");
				User u = new User(userID, name, email, password, stud_OR_orgID);
				users.add(u);
			}
			readerUser.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
	}
	
	//writes users to csv file
	public void storeUsers() throws Exception{
		CsvWriter csvOutputUser = new CsvWriter(new FileWriter(pathUsers, false), ',');
		try {
			csvOutputUser.write("userID");
			csvOutputUser.write("name");
			csvOutputUser.write("email");
			csvOutputUser.write("password");
			csvOutputUser.write("stud_OR_orgID");
			csvOutputUser.endRecord();
			
			for (User u: users) {
				csvOutputUser.write(String.valueOf(u.getUserID()));
				csvOutputUser.write(u.getName());
				csvOutputUser.write(u.getEmail());
				csvOutputUser.write(u.getPassword());
				csvOutputUser.write(u.getStud_OR_orgID());
				csvOutputUser.endRecord();
			}
			csvOutputUser.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//removes user from csv file 
	public void deleteUser(User user) {
		User uToRemove = null;
		for (User u: users) {
			if (u.getUserID() == user.getUserID()) {
				uToRemove = u;
			}
		}
		users.remove(uToRemove);
		
		try {
			instance.storeUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}


