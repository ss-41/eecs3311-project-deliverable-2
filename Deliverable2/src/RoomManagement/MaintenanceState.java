package RoomManagement;

public class MaintenanceState implements RoomState {

	@Override
	public void handleRequest() {
		System.out.println("Maintenance state: this room is closed temporarily"
				+ "\n" + "for repairs or maintenance.");
	}
	
	@Override
	public void enable(RoomContext context) {
		context.setState(new AvailableState());
		System.out.println("This room is now enabled again and is no longer temporarily closed");
	}

	@Override
	public void disable(RoomContext context) {
		context.setState(new DisabledState());
		System.out.println("This room is now disabled");
	}

	@Override
	public void startMaintenance(RoomContext context) {
		context.setState(new MaintenanceState());
		System.out.println("error: this room already closed for maintenance");
	}
	
	@Override
	public void endMaintenance(RoomContext context) {
		context.setState(new OccupiedState());
		System.out.println("The maintenance is finished and this room is now occupied again");
	}

}
