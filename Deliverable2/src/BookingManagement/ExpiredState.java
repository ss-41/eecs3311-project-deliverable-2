package BookingManagement;

public class ExpiredState implements BookingState {

	@Override
	public void handleRequest() {
		System.out.println("Expired state: this booking is expired");
	}

	@Override
	public void cancel(BookingContext context) {
		context.setState(new CancelledState());
		System.out.println("error: this booking is expired");
	}

	@Override
	public void complete(BookingContext context) {
		System.out.println("error: this booking is expired");
	}

	@Override
	public void extend(BookingContext context) {
		context.setState(new ActiveState());
		System.out.println("error: this booking is expired so it cannot be extended");
	}
	
}
