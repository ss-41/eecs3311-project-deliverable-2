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
		return false; 
	}
	
	public boolean verifyUniversityAccount() {
		return false; 
	}

	@Override
	public void update(Room room) {
		// TODO Auto-generated method stub
		
	}

}
