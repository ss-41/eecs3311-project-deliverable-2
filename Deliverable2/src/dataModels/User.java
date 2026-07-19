package dataModels;

public class User {
	private int userID; 
	private String name; 
	private String email; 
	private String password; 
	private String stud_OR_orgID; 
	private AccountType accountType;
	
	public User(int userID, String name, String email, String password, String stud_OR_orgID, AccountType accountType) {
		this.userID = userID; 
		this.name = name; 
		this.email = email; 
		this.password = password; 
		this.stud_OR_orgID = stud_OR_orgID;
		this.accountType = accountType;
		
	}
	
	public int getUserID() {
	    return userID;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	public int getUserID() {
	    return userID;
	}

	public String getName() {
	    return name;
	}

	public String getEmail() {
	    return email;
	}

	public String getPassword() {
	    return password;
	}

	public String getStudentOrOrgID() {
	    return stud_OR_orgID;
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

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStud_OR_orgID() {
		return stud_OR_orgID;
	}

	public void setStud_OR_orgID(String stud_OR_orgID) {
		this.stud_OR_orgID = stud_OR_orgID;
	}
	
	@Override
	public String toString() {
		return "User ID: " + userID + ", User Name: "+ name + ", User Email: " + email + ", User Password: " + password + ", User stud_OR_orgID: " + stud_OR_orgID;
	}

}
