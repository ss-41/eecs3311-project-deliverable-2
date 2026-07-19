package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import booking.state.ActiveState;
import dataModels.Booking;
import dataModels.Room;
import dataModels.RoomStatus;
import database.singleton.Database;


public class BookingController {


    private final Database database;



    public BookingController() {

        database = Database.getInstance();

    }



    public boolean createBooking(
            int bookingID,
            int userID,
            int roomID,
            double deposit,
            LocalDateTime start,
            LocalDateTime end) {



        Room selectedRoom = null;



        for(Room room : database.rooms) {


            if(room.getRoomID() == roomID) {

                selectedRoom = room;
                break;

            }

        }



        if(selectedRoom == null) {

            return false;

        }



        if(selectedRoom.getStatus() != RoomStatus.AVAILABLE) {

            return false;

        }




        Booking booking =
                new Booking(
                        bookingID,
                        userID,
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

        } catch(Exception e) {

            e.printStackTrace();
        }

        return database.bookings;
    }
    
    
    public boolean extendBooking(int bookingID) {

        try {

            database.loadBookings();

            for(Booking booking : database.bookings) {

                if(booking.getBookingID() == bookingID) {

                    if(booking.getBookingStatus() != dataModels.BookingStatus.ACTIVE)
                        return false;

                    booking.setBookingEndTime(
                            booking.getBookingEndTime().plusHours(1)
                    );

                    database.storeBookings();

                    return true;
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean cancelBooking(int bookingID, int userID) {

        try {
            database.loadBookings();

            for(Booking booking : database.bookings) {


                if(booking.getBookingID() == bookingID
                        && booking.getUserID() == userID) {

                    if(LocalDateTime.now()
                            .isBefore(booking.getBookingEndTime())) {

                        booking.setBookingStatus(
                                dataModels.BookingStatus.CANCELLED
                        );

                        database.storeBookings();

                        return true;
                    }
                }
            }

        } catch(Exception e) {

            e.printStackTrace();

        }
        return false;
    }


}