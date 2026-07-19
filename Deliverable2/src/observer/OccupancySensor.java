package observer;

import java.util.ArrayList;

import dataModels.Room;
import dataModels.RoomStatus;

public class OccupancySensor{
	private int sensorID; 
	private String OS_status; 
	private Room room; 

	public OccupancySensor(int sensorID, String OS_status, Room room) {
		// TODO Auto-generated constructor stub
		this.sensorID = sensorID; 
		this.OS_status = OS_status;
		this.room = room;
	}

	public OccupancySensor(Room room) {
		// TODO Auto-generated constructor stub
		this.room = room;
	}
	
	public void sendOccupancyData() {
		boolean occupied; 
		if (room.getStatus() == RoomStatus.AVAILABLE) {
			occupied = false; 
		} else {
			occupied = true; 
		}
		System.out.println("[OccupancySensor] Cheking Occupancy for Room  " + room.getRoomNum()+ ". Occupancy = " + occupied);
		room.OccupancyEvent(occupied);
	}

}
