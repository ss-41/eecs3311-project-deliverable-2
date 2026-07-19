package facade;

//a
public class AdminRoomManagingController {
    private AdminRoomFacade facade = new AdminRoomFacade();

    public void onAddButtonClicked(String roomId) { facade.addRoom(roomId); }
    public void onDisableButtonClicked(String roomId) { facade.disableRoom(roomId); }
    public void onMaintenanceButtonClicked(String roomId) { facade.setRoomMaintenance(roomId); }
}