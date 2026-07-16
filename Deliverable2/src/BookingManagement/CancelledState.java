package BookingManagement;

public class CancelledState implements BookingState {

	@Override
	public void handleRequest() {
		System.out.println("Cancelled state: this booking is cancelled");
	}

	@Override
	public void cancel(BookingContext context) {
		System.out.println("error: this booking is already cancelled");
	}

	@Override
	public void complete(BookingContext context) {
		System.out.println("error: this booking is cancelled");
	}

	@Override
	public void extend(BookingContext context) {
		System.out.println("error: this booking is cancelled");
	}
	
	@Override
	public void expire(BookingContext context) {
		System.out.println("error: this booking is cancelled");
	}

}
