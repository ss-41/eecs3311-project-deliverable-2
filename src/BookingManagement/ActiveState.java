package BookingManagement;

public class ActiveState implements BookingState {

	@Override
	public void handleRequest() {
		System.out.println("Active state: this booking is active");
	}

}
