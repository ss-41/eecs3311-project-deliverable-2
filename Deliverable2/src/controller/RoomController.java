package controller;

import java.util.ArrayList;

import dataModels.Room;
import database.singleton.Database;
import dataModels.RoomStatus;

public class RoomController {

    private final Database database;


    public RoomController() {
        database = Database.getInstance();
    }


    public ArrayList<Room> getAvailableRooms() {

        try {
            database.loadRooms();

        } catch(Exception e) {
            e.printStackTrace();
        }


        ArrayList<Room> availableRooms =
                new ArrayList<>();


        for(Room room : database.rooms) {

            if(room.getStatus() == RoomStatus.AVAILABLE) {
                availableRooms.add(room);
            }

        }


        return availableRooms;
    }

}