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
		// TODO Auto-generated method stub
		
	}
	

}
