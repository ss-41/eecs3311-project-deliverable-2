package dataModels;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import observer.BadgeScanner;
import observer.Observer;
import observer.OccupancySensor;
import observer.Subject;

public class Room implements Subject{
	private int roomID; 
	private String roomNum; 
	private int capacity; 
	private String building; 
	private RoomStatus status; 
	private BadgeScanner badgeScanner;
    private OccupancySensor occupancySensor;
	private ArrayList<Observer> observers; 
	
	private String lastEvent; 
    private boolean lastVerifiedBadge;
    private User lastUser; 
    private boolean lastOccupied;
	
	public Room(int roomID, String roomNum, int capacity, String building, RoomStatus status, ArrayList<Observer> observers) {
		this.roomID = roomID; 
		this.roomNum = roomNum; 
		this.capacity = capacity; 
		this.building = building; 
		this.status = status; 
		this.observers = observers;
		if (observers == null) {
			this.observers = new ArrayList<Observer>(); 
		}
		
		badgeScanner = new BadgeScanner(this);
		occupancySensor = new OccupancySensor(this);
		
		//these attributes give information to the observers
		lastEvent = "None"; 
		lastVerifiedBadge = false; 
		lastUser = null; 
		lastOccupied = false; 
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
	
	
	@Override
	public void notifyAllObservers() {
		for (Observer o: observers) {
			o.update(this);
		}
	}

	@Override
	public void attachObserver(Observer ob) {
		// TODO Auto-generated method stub
		observers.add(ob);
	}
	
	//notifies observers that badge has been scanned
	public void BadgeEvent(User user, boolean verified) {
		this.lastEvent = "Badge Scan";
        this.lastVerifiedBadge = verified;
        this.lastUser = user;
        notifyAllObservers();
	}
	
	//notified observers that occupancy has been checked
	public void OccupancyEvent(boolean occupied) {
		this.lastEvent = "Occupancy Check"; 
		this.lastOccupied = occupied; 
		if (occupied) {
			status = RoomStatus.CLOSED; 
		} else {
			status = RoomStatus.AVAILABLE;
		}
		notifyAllObservers();
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

	public BadgeScanner getBadgeScanner() {
		return badgeScanner;
	}

	public void setBadgeScanner(BadgeScanner badgeScanner) {
		this.badgeScanner = badgeScanner;
	}

	public OccupancySensor getOccupancySensor() {
		return occupancySensor;
	}

	public void setOccupancySensor(OccupancySensor occupancySensor) {
		this.occupancySensor = occupancySensor;
	}

	public String getLastEvent() {
		return lastEvent;
	}

	public void setLastEvent(String lastEvent) {
		this.lastEvent = lastEvent;
	}

	public boolean isLastVerifiedBadge() {
		return lastVerifiedBadge;
	}

	public void setLastVerifiedBadge(boolean lastVerifiedBadge) {
		this.lastVerifiedBadge = lastVerifiedBadge;
	}

	public User getLastUser() {
		return lastUser;
	}

	public void setLastUser(User lastUser) {
		this.lastUser = lastUser;
	}

	public boolean isLastOccupied() {
		return lastOccupied;
	}

	public void setLastOccupied(boolean lastOccupied) {
		this.lastOccupied = lastOccupied;
	}

}
