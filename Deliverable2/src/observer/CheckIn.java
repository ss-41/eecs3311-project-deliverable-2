package observer;

import java.time.LocalDateTime;

import dataModels.Room;

public class CheckIn implements Observer{
	private int checkInID; 
	private LocalDateTime checkInTime; 
	private boolean verified; 
	
	public CheckIn(int checkInID, LocalDateTime checkInTime, boolean verified) {
		this.checkInID = checkInID; 
		this.checkInTime = checkInTime; 
		this.verified = verified;
	}
	
	public boolean validateBooking() {
		return false; 
	}
	
	public void applyDeposit() {
		
	}
	
	public void forfeitDeposit() {
		
	}

	@Override
	public void update(Room room) {
		//if there was a badge scan, check in the user 
		if (room.getLastEvent().equals("Badge Scan")) {
			this.verified = room.isLastVerifiedBadge(); 
			this.checkInTime = LocalDateTime.now();
			String output = "[CheckIn] Reacting to Badge Scan On Room " + room.getRoomNum() + ". Verified = " + verified
                    + ", userID = " + room.getLastUser().getUserID() + ", user Name = " + room.getLastUser().getName()
                    + " at " + checkInTime;
			System.out.println(output);
		}
		
	}
	

}
