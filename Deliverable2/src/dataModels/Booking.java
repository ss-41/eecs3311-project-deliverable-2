package dataModels;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import observer.Observer;

public class Booking implements Observer {

    private int bookingID;
    private int roomID;
    private double deposit;
    private BookingStatus bookingStatus;
    private LocalDateTime bookingTime;
    private LocalDateTime bookingEndTime;


    public Booking(int bookingID,int roomID,double deposit,BookingStatus bookingStatus,LocalDateTime bookingTime,LocalDateTime bookingEndTime) {
        this.bookingID = bookingID;
        this.roomID = roomID;
        this.deposit = deposit;
        this.bookingStatus = bookingStatus;
        this.bookingTime = bookingTime;
        this.bookingEndTime = bookingEndTime;
    }



    public int getBookingID() {
        return bookingID;
    }


    public int getRoomID() {
        return roomID;
    }


    public double getDeposit() {
        return deposit;
    }


    public String getStatus() {

        return bookingStatus
                .getClass()
                .getSimpleName();
    }


    public LocalDateTime getBookingTime() {
        return bookingTime;
    }


    public LocalDateTime getBookingEndTime() {
        return bookingEndTime;
    }



    public void editBooking() {

    }


    public void cancelBooking() {

    }


    public boolean extendBooking() {

        return false;
    }


    public double totalCost() {

        return 0.0;
    }


    @Override
    public void update(Room room) {

    }
    

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public void setBookingEndTime(LocalDateTime bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}
	
	@Override
	public String toString() {
		String stringBookingStatus = bookingStatus.name();
		String stringBookingTime = bookingTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		String stringBookingEndTime = bookingEndTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		return "Booking ID: " + bookingID + ", Booking Deposit: "+ deposit + ", Booking Status: " + stringBookingStatus + ", Booking Start Time: " + stringBookingTime + ", Booking End Time: " + stringBookingEndTime;
	}

}