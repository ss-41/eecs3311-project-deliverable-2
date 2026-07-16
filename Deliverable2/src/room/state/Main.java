package room.state;

public class Main {

	public static void main(String[] args) {
		RoomContext roomContext = new RoomContext();
		
		roomContext.request(); // initial state is disabled
		System.out.println();
		
		roomContext.enable(); // disabled to available state
		roomContext.request();
		System.out.println();
		
		roomContext.startMaintenance(); // available to maintenance state		
		roomContext.request();
		System.out.println();
		
		roomContext.enable(); // maintenance to available state
		roomContext.request();
		System.out.println();
		
		roomContext.disable(); // available to disabled state
		roomContext.request();
		System.out.println();
		
		System.out.println("-------------------------------------------------------");
		roomContext.setState(new OccupiedState()); // set to occupied state
		roomContext.request();
		System.out.println();

		roomContext.startMaintenance(); // cannot start maintenance when in occupied state 
		roomContext.request();
		System.out.println();
		
		roomContext.disable(); // occupied to disabled state
		roomContext.request();
		System.out.println();
		
	}

}
