package BookingManagement;

public class ExpiredState implements BookingState {

	@Override
	public void handleRequest() {
		System.out.println("Expired state: this booking is expired");
	}

}
