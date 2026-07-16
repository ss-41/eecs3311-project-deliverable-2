package booking.state;

public class BookingContext {
	
	private BookingState state; // current state
	
	/*
	 * Default constructor to initialize current state to active
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
	
	public void extend() {
		state.extend(this);
	}
	
	public void expire() {
		state.expire(this);
	}
	
}
