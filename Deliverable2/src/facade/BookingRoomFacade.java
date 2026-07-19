package facade;

public class BookingRoomFacade {
	protected RoomManager roomManager = RoomManager.getInstance();
    protected BookingManager bookingManager = new BookingManager();
    protected PaymentManager paymentProcessor = new PaymentManager();

    //should take date and time directly from GUI
    public boolean reserveRoom(String userId, String roomId, double rate, String date, int time) {
        if (roomManager.isAvailable(roomId)) {
            paymentProcessor.deposit(userId, rate);
            bookingManager.createBooking(userId, roomId, date, time);
            return true;
        }
        System.out.println("Reservation failed: Room " + roomId + " is not available.");
        return false;
    }

    public boolean cancelReservation(String bookingId) {
        bookingManager.deleteBooking(bookingId);
        return true;
    }
}//a