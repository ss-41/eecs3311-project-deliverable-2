package facade;

public class AdminRoomFacade {
	protected RoomManager roomManager = RoomManager.getInstance();
    private BookingManager bookingManager = new BookingManager();
    private PaymentManager paymentProcessor = new PaymentManager();

    public boolean reserveRoom(String userId, String roomId, double rate) {
        return roomManager.isAvailable(roomId);
    }

    public boolean cancelReservation(String bookingId) {
        bookingManager.deleteBooking(bookingId);
        return true;
    }

    public void addRoom(String roomID) {
        roomManager.isAvailable(roomID); 
        System.out.println("Room " + roomID + " added to system.");
    }

    public void disableRoom(String roomID) {
        roomManager.updateRoomState(roomID, "disable");
    }

    public void setRoomMaintenance(String roomID) {
        roomManager.updateRoomState(roomID, "maintenance");
    }
    
    //a
    public void enableRoom(String roomID) {
        roomManager.updateRoomState(roomID, "enable");
        System.out.println("Room " + roomID + " is now enabled.");
    }
}