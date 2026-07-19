package dataModels;

public class User {
	private int userID; 
	private String name; 
	private String email; 
	private String password; 
	private String stud_OR_orgID;
	private AccountType accountType;
	private boolean admin;
	
	public User(int userID, String name, String email, String password, String stud_OR_orgID, boolean admin) {
		this.userID = userID; 
		this.name = name; 
		this.email = email; 
		this.password = password; 
		this.stud_OR_orgID = stud_OR_orgID; 
		this.admin = admin;
		this.accountType = null;
	}
    

    public User(
            int userID,
            String name,
            String email,
            String password,
            String stud_OR_orgID,
            AccountType accountType) {

        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.stud_OR_orgID = stud_OR_orgID;
        this.accountType = accountType;
    }
    
    public User(
            int userID,
            String name,
            String email,
            String password,
            String stud_OR_orgID, AccountType accountType2, boolean b
            ) {

        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.stud_OR_orgID = stud_OR_orgID;
        this.accountType = accountType2;
        this.admin = b;
    }
    
    

    public int getUserID() {
	    return userID;
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

	public void setUserID(int userID) {
		this.userID = userID;
	}

    public boolean extendBooking() {
        return false;
    }

    public boolean cancelBooking() {
        return false;
    }


    public void update(Room room) {
        
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

	public void setStud_OR_orgID(String stud_OR_orgID) {
		this.stud_OR_orgID = stud_OR_orgID;
	}
	
	public boolean isAdmin() {
	    return admin;
	}


	public void setAdmin(boolean admin) {
	    this.admin = admin;
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

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "User ID: " + userID
                + ", User Name: " + name
                + ", User Email: " + email
                + ", User stud_OR_orgID: " + stud_OR_orgID
                + ", Account Type: "
                + (accountType == null ? "None" : accountType.getTypeName());
    }
}