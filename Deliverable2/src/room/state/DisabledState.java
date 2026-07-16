package room.state;

public class DisabledState implements RoomState {

	@Override
	public void handleRequest() {
		System.out.println("Disabled state: this room is disabled");
	}
	
	@Override
	public void enable(RoomContext context) {
		context.setState(new AvailableState());
		System.out.println("this room is now enabled");
	}

	@Override
	public void disable(RoomContext context) {
		System.out.println("error: this room is already disabled");
	}

	@Override
	public void startMaintenance(RoomContext context) {
		System.out.println("error: this room is disabled so it cannot be temporarily closed"
				+ "\n" + "for maintenance");
	}

}
