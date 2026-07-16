package room.state;

public class AvailableState implements RoomState {

	@Override
	public void handleRequest() {
		System.out.println("Available state: this room is available");
	}

	@Override
	public void enable(RoomContext context) {
		System.out.println("error: this room is already available so it cannot be enabled");
	}

	@Override
	public void disable(RoomContext context) {
		context.setState(new DisabledState());
		System.out.println("This room is now disabled");
	}

	@Override
	public void startMaintenance(RoomContext context) {
		context.setState(new MaintenanceState());
		System.out.println("This room is now closed temporarily for repairs or maintenance");
	}

}
