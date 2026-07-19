package facade;

import java.util.HashMap;
import java.util.Map;
import booking.state.BookingContext;

public class BookingManager {
    private Map<String, BookingContext> bookings = new HashMap<>();
    private int idCounter = 0;

    public String createBooking(String clientID, String roomID, String date, int hour) {
        String bookingID = "B" + (++idCounter);
        bookings.put(bookingID, new BookingContext());
        System.out.println("Booking " + bookingID + " created for Room " + roomID);
        return bookingID;
    }

    public void deleteBooking(String bookingID) {
        bookings.remove(bookingID);
        System.out.println("Booking " + bookingID + " deleted.");
    }

    public void extendBooking(String bookingID, int extraHours) {
        if(bookings.containsKey(bookingID)) {
            bookings.get(bookingID).extend();
        }
    }
}//a