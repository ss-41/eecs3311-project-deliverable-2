package BookingManagement;

public class CompletedState implements BookingState {

	@Override
	public void handleRequest() {
		System.out.println("Completed state: this booking is completed");
	}

	@Override
	public void cancel(BookingContext context) {
		context.setState(new CancelledState());
		System.out.println("This booking is now cancelled");
	}

	@Override
	public void complete(BookingContext context) {
		System.out.println("error: this booking is already completed");
	}

	@Override
	public void extend(BookingContext context) {
		context.setState(new ActiveState());
		System.out.println("This booking is extended and now active again");
	}
	
}
