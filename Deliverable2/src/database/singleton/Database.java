package database.singleton;
import java.util.ArrayList;

import dataModels.Booking;
import dataModels.Room;
import dataModels.User;

public class Database {
	private static Database instance; 
	private static String pathRooms = "";
	private static String pathBookings = "";
	private static String pathUsers = "";
	
	private Database() {
		
	}
	
	private Database getInstance() {
		if (instance == null) {
			instance = new Database(); 
		}
		return instance;
	}
	
	public ArrayList<Room> loadRooms(){
		return null;
	}
	
	public void storeRooms(ArrayList<Room> rooms) {
		
	}
	
	public ArrayList<Booking> loadBookings(){
		return null;
	}
	
	public void storeBookings(ArrayList<Booking> bookings) {
		
	}
	
	public ArrayList<User> loadUsers(){
		return null;
	}
	
	public void storeUsers(ArrayList<User> users) {
		
	}
	
	
	
	
}


