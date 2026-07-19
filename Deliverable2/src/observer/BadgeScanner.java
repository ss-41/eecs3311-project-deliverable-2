package observer;

import java.util.ArrayList;

import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;
import database.singleton.Database;

public class BadgeScanner{
	private int scannerID;
	private Room room;

	public BadgeScanner(int scannerID, Room room) {
		// TODO Auto-generated constructor stub
		this.scannerID = scannerID; 
		this.room = room;
	}
	
	public BadgeScanner(Room room) {
		// TODO Auto-generated constructor stub
		this.room = room;
	}

	//verifies badge, then alerts room that badge has been scanned
	public String scan(User user) {
		System.out.println("[BadgeScanner] Scanned badge ID: " + user.getStud_OR_orgID() + " at Room " + room.getRoomNum());
		boolean isVerified = verify(user);
		String result = "[BadgeScanner] Verification result: " + isVerified + (isVerified ? "" : " (Badge ID not Found)");
		System.out.println(result);
		room.BadgeEvent(user, isVerified);
		return user.getStud_OR_orgID();
	}

	//searches db for user's badge
	public boolean verify(User user) {
		//User foundUser = null; 
		Database db = Database.getInstance();
		try {
			db.loadUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (User u: db.users) {
			if (u.getStud_OR_orgID().equals(user.getStud_OR_orgID())) {
				return true; 
			}
		}
		return false; 
	}
}
