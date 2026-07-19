package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import booking.state.ActiveState;
import dataModels.Booking;
import utils.BookingCSVManager;


public class BookingController {


    public boolean createBooking(
            int bookingID,
            int roomID,
            double deposit,
            LocalDateTime start,
            LocalDateTime end) {



        Booking booking =
                new Booking(
                        bookingID,
                        roomID,
                        deposit,
                        new ActiveState(),
                        start,
                        end
                );


        return BookingCSVManager.saveBooking(booking);

    }




    public ArrayList<String[]> getBookings() {

        return BookingCSVManager.loadBookings();

    }

}