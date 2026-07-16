package RoomManagement;

public class Main {

	public static void main(String[] args) {
		RoomContext roomContext = new RoomContext();
		
		roomContext.request(); // initial state is disabled
		System.out.println();
		
		roomContext.setState(new AvailableState()); // set to available state
		roomContext.request();
		System.out.println();
		
	}

}
