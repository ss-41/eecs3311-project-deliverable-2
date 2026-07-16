package room.state;

public interface RoomState {
	
	/*
	 * there is no addRoom() method as creating a RoomContext object represents
	 * adding a room which has a default state of disabled when initalized
	 */
	
	public void handleRequest();
	public void enable(RoomContext context);
	public void disable(RoomContext context);
	public void startMaintenance(RoomContext context);
	
}
