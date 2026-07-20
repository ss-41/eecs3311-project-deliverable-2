package dataModels;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import booking.state.ActiveState;
import observer.Observer;

public class Booking implements Observer {

    private int bookingID;
    private int userID;
    private int roomID;
    private double deposit;

    private BookingStatus bookingStatus;

    private LocalDateTime bookingTime;
    private LocalDateTime bookingEndTime;



    public Booking(
            int bookingID,
            int userID,
            int roomID,
            double deposit,
            BookingStatus bookingStatus,
            LocalDateTime bookingTime,
            LocalDateTime bookingEndTime
    ) {

    	this.bookingID = bookingID;
        this.userID = userID;
        this.roomID = roomID;
        this.deposit = deposit;
        this.bookingStatus = bookingStatus;
        this.bookingTime = bookingTime;
        this.bookingEndTime = bookingEndTime;

    }



    // used by BookingController
    public Booking(
            int bookingID,
            int userID,
            int roomID,
            double deposit,
            ActiveState state,
            LocalDateTime start,
            LocalDateTime end
    ) {

        this.bookingID = bookingID;
        this.userID = userID;
        this.roomID = roomID;
        this.deposit = deposit;
        this.bookingStatus = BookingStatus.ACTIVE;
        this.bookingTime = start;
        this.bookingEndTime = end;

    }
    



	public int getBookingID() {
        return bookingID;
    }


    public int getUserID() {
        return userID;
    }


    public int getRoomID() {
        return roomID;
    }


    public double getDeposit() {
        return deposit;
    }


    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }


    public LocalDateTime getBookingTime() {
        return bookingTime;
    }


    public LocalDateTime getBookingEndTime() {
        return bookingEndTime;
    }

    public void setBookingStatus(BookingStatus status){
        this.bookingStatus = status;
    }
    
    public void setBookingEndTime(LocalDateTime bookingEndTime) {

        this.bookingEndTime = bookingEndTime;

    }

    public String getStatus(){

        return bookingStatus.name();

    }



    @Override
    public void update(Room room){

        if(room.getLastEvent().equals("Occupancy Check")){

            if(room.isLastOccupied()){
                bookingStatus = BookingStatus.COMPLETED;
            }
            System.out.println("[Booking] Reacting to occupancy change on " + room.getRoomNum() + ". Occupied = " + room.isLastOccupied());

        }

    }



    @Override
    public String toString(){

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


        return
                "Booking ID: " + bookingID +
                "\nUser ID:" + userID +
                "\nRoom ID: " + roomID +
                "\nDeposit: $" + deposit +
                "\nStatus: " + bookingStatus +
                "\nStart: " + bookingTime.format(formatter) +
                "\nEnd: " + bookingEndTime.format(formatter);

    }

}