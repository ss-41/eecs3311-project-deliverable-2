package facade;

import java.util.HashMap;
import java.util.Map;
import room.state.RoomContext;
import room.state.AvailableState;

public class RoomManager {
    private static RoomManager instance;
    private Map<String, RoomContext> rooms = new HashMap<>();
    private RoomManager() {}
    public static synchronized RoomManager getInstance() {
        if (instance == null) {
            instance = new RoomManager();
        }
        return instance;
    }

    public boolean isAvailable(String roomID) {
        rooms.putIfAbsent(roomID, new RoomContext());
        return rooms.get(roomID).getState() instanceof AvailableState;
    }

    public void updateRoomState(String roomID, String action) {
        RoomContext room = rooms.get(roomID);
        if (room == null) rooms.putIfAbsent(roomID, new RoomContext()); // Ensure it exists
        
        room = rooms.get(roomID);
        switch (action) {
            case "enable": room.enable(); break;
            case "disable": room.disable(); break;
            case "maintenance": room.startMaintenance(); break;
        }
    }
}//a