package booking.state;

public class ActiveState implements BookingState {

	@Override
	public void handleRequest() {
		System.out.println("Active state: this booking is active");
	}

	@Override
	public void cancel(BookingContext context) {
		context.setState(new CancelledState());
		System.out.println("This booking is now cancelled");
	}

	@Override
	public void complete(BookingContext context) {
		context.setState(new CompletedState());
		System.out.println("This booking is now completed");
	}

	@Override
	public void extend(BookingContext context) {
		context.setState(new ActiveState());
		System.out.println("error: this booking is already active. The booking can be extended"
				+ "\n" + "once the booking is completed");
	}

	@Override
	public void expire(BookingContext context) {
		context.setState(new ExpiredState());
		System.out.println("This booking is now expired");
	}

}
