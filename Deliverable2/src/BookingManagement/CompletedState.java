package BookingManagement;

public class CompletedState implements BookingState {

	@Override
	public void handleRequest() {
		System.out.println("Completed state: this booking is completed");
	}

}
