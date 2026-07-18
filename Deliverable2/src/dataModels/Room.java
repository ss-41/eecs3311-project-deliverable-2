package dataModels;

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

}
