package controller;

import database.singleton.Database;
import dataModels.Booking;

public class PaymentController {

    private final Database database;


    public PaymentController() {
        database = Database.getInstance();
    }


    public boolean processPayment(int bookingID) {

        try {
            database.loadBookings();

        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }


        for(Booking booking : database.bookings) {

            if(booking.getBookingID() == bookingID) {

                // Payment successful
                // Add payment status here if Booking supports it

                try {
                    database.storeBookings();
                    return true;

                } catch(Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }


        return false;
    }


    public double calculateFee(double baseFee) {

        return baseFee;

    }

}