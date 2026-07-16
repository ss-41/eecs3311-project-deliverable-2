package RoomManagement;

public class RoomContext {
	
	private RoomState state;
	
	/*
	 * Default constructor to initialize current state to disabled 
	 */
	public RoomContext() {
		this.state = new DisabledState(); // initial state is disabled
	}
	
	public void setState(RoomState state) {
		this.state = state;
	}
	
	/*
	 * Not required - made to satisfy compiler and avoid warning message, "The value
	 *  of the field RoomContext.state is not used"
	 */
	public RoomState getState() {
		return state;
	}
	
	public void request() {
		state.handleRequest();
	}
	
	public void enable() {
		state.enable(this);
	}
	
	public void disable() {
		state.disable(this);
	}
	
	public void startMaintenance() {
		state.startMaintenance(this);
	}
	
	public void endMaintenance() {
		state.endMaintenance(this);
	}
	
}
