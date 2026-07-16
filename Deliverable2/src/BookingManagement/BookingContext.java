package BookingManagement;

public class BookingContext {
	
	// private Room room; // references the room associated with the booking
	private BookingState state; // current state
	
	/*
	 * Default constructor to initialize current state to active by default
	 */
	public BookingContext() {
		state = new ActiveState();
	}
	
	public void setState(BookingState state) {
		this.state = state;
	}
	
	/*
	 * Not required - made to satisfy compiler and avoid warning message, "The value
	 *  of the field BookingContext.state is not used"
	 */
	public BookingState getState() {
		return state;
	}

	public void request() {
		state.handleRequest();
	}
	
	public void cancel() {
		state.cancel(this);
	}
	
	public void complete() {
		state.complete(this);
	}
	
	public void etend() {
		state.extend(this);
	}
	
}
