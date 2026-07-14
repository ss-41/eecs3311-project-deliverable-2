package BookingManagement;

public class CancelledState implements BookingState {

	@Override
	public void handleRequest() {
		System.out.println("Cancelled state: this booking is cancelled");
	}

}
