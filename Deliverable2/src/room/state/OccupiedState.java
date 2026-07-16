package room.state;

public class OccupiedState implements RoomState {

	@Override
	public void handleRequest() {
		System.out.println("Available state: this room is occupied");
	}
	
	@Override
	public void enable(RoomContext context) {
		System.out.println("error: this room is occupied so it cannot be made available for others yet");
	}

	@Override
	public void disable(RoomContext context) {
		context.setState(new DisabledState());
		System.out.println("This room is now disabled");
	}

	@Override
	public void startMaintenance(RoomContext context) {
		// alternative method: use setState() to change to maintenance state while in occupied state
		System.out.println("error: this room is occupied so it cannot be temporarily closed for repairs or maintenance");
	}

}
