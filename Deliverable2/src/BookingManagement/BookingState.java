package BookingManagement;

public interface BookingState {
	
	public void handleRequest();
	public void cancel(BookingContext context);
	public void complete(BookingContext context);
	public void extend(BookingContext context);
	public void expire(BookingContext context);
}
