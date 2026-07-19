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


    public double calculateFee(int bookingID) {

        try {

            database.loadBookings();
            database.loadUsers();


            Booking booking = null;


            for(Booking b : database.bookings) {

                if(b.getBookingID() == bookingID) {

                    booking = b;
                    break;
                }
            }


            if(booking == null) {
                return 0;
            }



            dataModels.User user = null;


            for(dataModels.User u : database.users) {

                if(u.getUserID() == booking.getUserID()) {

                    user = u;
                    break;
                }
            }


            if(user == null 
                    || user.getAccountType() == null) {

                return 0;
            }



            double hourlyRate =
                    user.getAccountType()
                        .getHourlyRate();



            long hours =
                    java.time.Duration.between(
                            booking.getBookingTime(),
                            booking.getBookingEndTime()
                    ).toHours();



            if(hours <= 0) {

                hours = 1;
            }


            return hourlyRate * hours;


        } catch(Exception e) {

            e.printStackTrace();
        }


        return 0;
    }

}