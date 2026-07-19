package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import dataModels.AccountType;
import dataModels.Booking;
import dataModels.Room;
import dataModels.User;

public class SystemFacade {

    private final AccountController accountController;
    private final BookingController bookingController;
    private final RoomController roomController;
    private final PaymentController paymentController;


    public SystemFacade() {

        accountController = new AccountController();
        bookingController = new BookingController();
        roomController = new RoomController();
        paymentController = new PaymentController();

    }


    /*
     * ACCOUNT MANAGEMENT
     */

    public boolean registerUser(
            String name,
            String email,
            String password,
            String studentOrOrgID,
            AccountType accountType) {

        return accountController.registerUser(
                name,
                email,
                password,
                studentOrOrgID,
                accountType
        );
    }


    public User login(
            String email,
            String password) {

        return accountController.login(
                email,
                password
        );
    }


    public boolean createAdmin(
            String name,
            String email,
            String password,
            String employeeID) {

        return accountController.createAdmin(
                name,
                email,
                password,
                employeeID
        );
    }



    /*
     * BOOKING WORKFLOW
     */

    public boolean bookRoom(
            int bookingID,
            int userID,
            int roomID,
            double deposit,
            LocalDateTime start,
            LocalDateTime end) {


        // create booking
        boolean bookingCreated =
                bookingController.createBooking(
                        bookingID,
                        userID,
                        roomID,
                        deposit,
                        start,
                        end
                );


        if(!bookingCreated) {
            return false;
        }


        return true;
    }



    public boolean cancelBooking(
            int bookingID,
            int userID) {


        return bookingController.cancelBooking(
                bookingID,
                userID
        );
    }



    public boolean extendBooking(
            int bookingID,
            LocalDateTime newEndTime) {


        return bookingController.extendBooking(
                bookingID,
                newEndTime
        );
    }



    public ArrayList<Booking> getBookings() {

        return bookingController.getBookings();

    }



    /*
     * ROOM MANAGEMENT
     */

    public ArrayList<Room> getAvailableRooms() {

        return roomController.getAvailableRooms();

    }


    public boolean addRoom(Room room) {

        return roomController.addRoom(room);

    }


    public boolean deleteRoom(Room room) {

        return roomController.deleteRoom(room);

    }



    /*
     * PAYMENT WORKFLOW
     */
    
    public double calculateFee(int bookingID) {

        return paymentController.calculateFee(
                bookingID
        );

    }
    
    public boolean payForBooking(
            int bookingID) {


        double fee =
                paymentController.calculateFee(
                        bookingID
                );


        return paymentController.processPayment(
                bookingID
        );

    }


}