package dataModels;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import observer.Observer;
import observer.Subject;

public class Room implements Subject{
	private int roomID; 
	private String roomNum; 
	private int capacity; 
	private String building; 
	private RoomStatus status; 
	private ArrayList<Observer> observers; 
	
	public Room(int roomID, String roomNum, int capacity, String building, RoomStatus status, ArrayList<Observer> observers) {
		this.roomID = roomID; 
		this.roomNum = roomNum; 
		this.capacity = capacity; 
		this.building = building; 
		this.status = status; 
		this.observers = observers;
		
	}
	
	private boolean isAvailable() {
		return false; 
	}
	
	private void enable() {

	}
	
	private void disable() {
		
	}
	
	private void closeForRepair() {
		
	}
	
	public void update(Room room) {
		
	}
	
	@Override
	public void notifyAllObservers() {
		
	}

	@Override
	public void attachObserver(Observer ob) {
		// TODO Auto-generated method stub
		
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public RoomStatus getStatus() {
		return status;
	}

	public void setStatus(RoomStatus status) {
		this.status = status;
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
	
	@Override
	public String toString() {
		String stringRoomStatus = status.name();
		return "Room ID: " + roomID + ", Room Num: "+ roomNum + ", Room Capacity: " + capacity + ", Room Building: " + building + ", Room Status: " + stringRoomStatus;
	}

}
