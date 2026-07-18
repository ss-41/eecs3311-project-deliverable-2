package observer;

import java.util.ArrayList;

import dataModels.Room;
import dataModels.RoomStatus;

public class OccupancySensor extends Room{
	private int sensorID; 
	private String OS_status; 

	public OccupancySensor(int roomID, String roomNum, int capacity, String building, RoomStatus status,
			ArrayList<Observer> observers, int sensorID, String OS_status) {
		super(roomID, roomNum, capacity, building, status, observers);
		// TODO Auto-generated constructor stub
		this.sensorID = sensorID; 
		this.OS_status = OS_status;
	}
	

}
