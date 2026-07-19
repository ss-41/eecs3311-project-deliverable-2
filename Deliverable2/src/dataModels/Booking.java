package dataModels;

import java.time.LocalDateTime;

import booking.state.BookingState;
import observer.Observer;

public class Booking implements Observer{
	private int bookingID;
	private double deposit; 
	private BookingState bookingStatus; 
	private LocalDateTime bookingTime; 
	private LocalDateTime bookingEndTime; 
	private int roomID;
	
	public Booking(int bookingID, int roomID, double deposit, BookingState bookingStatus, LocalDateTime bookingTime, LocalDateTime bookingEndTime) {
		this.bookingID = bookingID;
		this.roomID = roomID;
		this.deposit = deposit; 
		this.bookingStatus = bookingStatus;
		this.bookingTime = bookingTime; 
		this.bookingEndTime = bookingEndTime;
	}
	
	public void editBooking() {
		
	}
	
	public void cancelBooking() {
		
	}
	
	public boolean extendBooking() {
		return false; 
	}
	
	public double totalCost() {
		return 0.00;
	}
	
	public void update(Room room) {
		
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
	    return bookingStatus.getClass().getSimpleName();
	}


	public LocalDateTime getBookingTime() {
	    return bookingTime;
	}


	public LocalDateTime getBookingEndTime() {
	    return bookingEndTime;
	}

}
