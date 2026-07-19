package facade;

public class ClientBookingController {
    private BookingRoomFacade facade = new BookingRoomFacade();

    public void onBookButtonClicked(String userId, String roomId, double rate, String date, int time) { 
        facade.reserveRoom(userId, roomId, rate, date, time); 
    }

    public void onCancelButtonClicked(String bookingId) { 
        facade.cancelReservation(bookingId); 
    }
}//a