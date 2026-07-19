package dataModels;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import booking.state.BookingState;
import observer.Observer;

public class Booking implements Observer{
	private int bookingID;
	private double deposit; 
	private BookingStatus bookingStatus; 
	private LocalDateTime bookingTime; 
	private LocalDateTime bookingEndTime; 
	
	public Booking(int bookingID, double deposit, BookingStatus bookingStatus, LocalDateTime bookingTime, LocalDateTime bookingEndTime) {
		this.bookingID = bookingID; 
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

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public double getDeposit() {
		return deposit;
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

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public LocalDateTime getBookingEndTime() {
		return bookingEndTime;
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
