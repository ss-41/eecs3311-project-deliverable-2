package RoomManagement;

public class OccupiedState implements RoomState {

	@Override
	public void handleRequest() {
		System.out.println("Available state: this room is occupied");
	}
	
	@Override
	public void enable(RoomContext context) {
		System.out.println("error: this room is occupied so it cannot be made available");
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
	
	@Override
	public void endMaintenance(RoomContext context) {
		System.out.println("error: this room is occupied so it is not in maintenance state");
	}

}
