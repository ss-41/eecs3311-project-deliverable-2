package dataModels;

public class User {
	private int userID; 
	private String name; 
	private String email; 
	private String password; 
	private String stud_OR_orgID; 
	
	public User(int userID, String name, String email, String password, String stud_OR_orgID) {
		this.userID = userID; 
		this.name = name; 
		this.email = email; 
		this.password = password; 
		this.stud_OR_orgID = stud_OR_orgID; 
	}
	
	public boolean register() {
		return false; 
	}
	
	public boolean login() {
		return false; 
	}
	
	public Booking bookRoom() {
		return null; 
	}
	
	public boolean extendBooking() {
		return false; 
	}
	
	public boolean cancelBooking() {
		return false; 
	}
	
	public void update(Room room) {
		
	}

}
