package observer;

import dataModels.Room;

public class AccountVerification implements Observer{
	private int verificationID; 
	private boolean verifiedEmail; 
	private boolean universityVerified; 
	
	public AccountVerification(int verificationID, boolean verifiedEmail, boolean universityVerified) {
		this.verificationID = verificationID; 
		this.verifiedEmail = verifiedEmail; 
		this.universityVerified = universityVerified; 
	}
	
	public boolean validateEmail() {
		return verifiedEmail; 
	}
	
	public boolean verifyUniversityAccount() {
		return universityVerified; 
	}

	//Account Verification class is notified when badge is scanned for student/org ID
	@Override
	public void update(Room room) {
		// TODO Auto-generated method stub
		if (room.getLastEvent().equals("Badge Scan")) {
			String output = "[AccountVerification] Reacting to badge scan on Room " + room.getRoomNum()
            + ", userID = " + room.getLastUser().getUserID() + ", user Name = " + room.getLastUser().getName()
            + ", verifiedEmail = " + verifiedEmail
            + ", universityVerified = " + universityVerified;
			System.out.println(output);
		}
		
		
	}
	

}
