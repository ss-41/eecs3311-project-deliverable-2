package observer;

import java.util.ArrayList;

import dataModels.Room;
import dataModels.RoomStatus;

public class BadgeScanner extends Room{
	private int scannerID;

	public BadgeScanner(int roomID, String roomNum, int capacity, String building, RoomStatus status,
			ArrayList<Observer> observers, int scannerID) {
		super(roomID, roomNum, capacity, building, status, observers);
		// TODO Auto-generated constructor stub
		this.scannerID = scannerID; 
	}
	
	public String scan() {
		return null;
	}

	public boolean verify() {
		return false; 
	}
}
