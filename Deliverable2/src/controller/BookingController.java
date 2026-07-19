package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import booking.state.ActiveState;
import dataModels.Booking;
import database.singleton.Database;


public class BookingController {

    private final Database database;


    public BookingController() {
        database = Database.getInstance();
    }


    public boolean createBooking(
            int bookingID,
            int roomID,
            double deposit,
            LocalDateTime start,
            LocalDateTime end) {


        try {

            database.loadBookings();

        } catch(Exception e) {

            e.printStackTrace();
            return false;

        }


        Booking booking =
                new Booking(
                        bookingID,
                        roomID,
                        deposit,
                        new ActiveState(),
                        start,
                        end
                );


        database.bookings.add(booking);


        try {

            database.storeBookings();
            return true;

        } catch(Exception e) {

            e.printStackTrace();
            return false;

        }

    }



    public ArrayList<Booking> getBookings() {

        try {

            database.loadBookings();
            return database.bookings;

        } catch(Exception e) {

            e.printStackTrace();
            return new ArrayList<>();

        }

    }

}