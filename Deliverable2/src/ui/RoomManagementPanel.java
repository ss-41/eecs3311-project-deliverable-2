package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import controller.RoomController;
import dataModels.Room;


public class RoomManagementPanel extends JPanel {


    private JComboBox<String> roomBox;

    private JLabel statusLabel;


    private ArrayList<Room> rooms;


    private RoomController roomController =
            new RoomController();



    public RoomManagementPanel(MainFrame frame) {


        setLayout(new BorderLayout());



        JLabel title =
                new JLabel(
                        "Room Management",
                        SwingConstants.CENTER
                );


        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );


        add(title, BorderLayout.NORTH);



        JPanel panel =
                new JPanel(
                        new GridLayout(5,1,10,10)
                );



        roomBox =
                new JComboBox<>();


        loadRooms();



        statusLabel =
                new JLabel(
                        "Select a room",
                        SwingConstants.CENTER
                );



        JButton enable =
                new JButton(
                        "Enable Room"
                );


        JButton disable =
                new JButton(
                        "Disable Room"
                );


        JButton maintenance =
                new JButton(
                        "Maintenance"
                );


        JButton back =
                new JButton(
                        "Back"
                );



        panel.add(roomBox);
        panel.add(statusLabel);
        panel.add(enable);
        panel.add(disable);
        panel.add(maintenance);



        add(panel, BorderLayout.CENTER);



        add(back, BorderLayout.SOUTH);



        roomBox.addActionListener(e -> updateStatus());



        enable.addActionListener(e -> {


            Room room =
                    getSelectedRoom();


            if(room == null)
                return;



            room.setStatus(
                    dataModels.RoomStatus.AVAILABLE
            );


            updateStatus();


        });



        disable.addActionListener(e -> {


            Room room =
                    getSelectedRoom();


            if(room == null)
                return;



            room.setStatus(
                    dataModels.RoomStatus.CLOSED
            );


            updateStatus();


        });



        maintenance.addActionListener(e -> {


            Room room =
                    getSelectedRoom();


            if(room == null)
                return;



            room.setStatus(
                    dataModels.RoomStatus.MAINTENANCE
            );


            updateStatus();


        });



        back.addActionListener(e ->
                frame.showPanel("ADMIN")
        );


    }




    private void loadRooms() {


        rooms =
                roomController.getAvailableRooms();



        for(Room room : rooms) {


            roomBox.addItem(
                    room.getRoomNum()
                    + " - "
                    + room.getBuilding()
            );

        }

    }




    private Room getSelectedRoom() {


        int index =
                roomBox.getSelectedIndex();



        if(index < 0)
            return null;



        return rooms.get(index);

    }




    private void updateStatus() {


        Room room =
                getSelectedRoom();



        if(room != null) {


            statusLabel.setText(
                    "Status: "
                    + room.getStatus()
            );

        }

    }

}