package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import controller.RoomController;
import dataModels.Room;
import database.singleton.Database;


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

        JPanel panel = new JPanel(new GridLayout(7,1,10,10));

        roomBox = new JComboBox<>();


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
        
        JButton add =
                new JButton("Add Room");


        JButton delete =
                new JButton("Delete Room");



        panel.add(roomBox);
        panel.add(statusLabel);
        panel.add(enable);
        panel.add(disable);
        panel.add(maintenance);
        panel.add(add);
        panel.add(delete);


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
            		dataModels.RoomStatus.AVAILABLE
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
        
        add.addActionListener(e -> {

            JTextField roomNum =
                    new JTextField();

            JTextField capacity =
                    new JTextField();

            JTextField building =
                    new JTextField();


            JPanel input =
                    new JPanel(new GridLayout(3,2));

            input.add(new JLabel("Room Number"));
            input.add(roomNum);

            input.add(new JLabel("Capacity"));
            input.add(capacity);

            input.add(new JLabel("Building"));
            input.add(building);



            int result =
                    JOptionPane.showConfirmDialog(
                            this,
                            input,
                            "Add Room",
                            JOptionPane.OK_CANCEL_OPTION
                    );


            if(result == JOptionPane.OK_OPTION) {


                int id =
                        (int)(System.currentTimeMillis()%100000);



                Room room =
                        new Room(
                                id,
                                roomNum.getText(),
                                Integer.parseInt(capacity.getText()),
                                building.getText(),
                                dataModels.RoomStatus.DISABLED,
                                null
                        );


                if(roomController.addRoom(room)) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Room added"
                    );

                    roomBox.removeAllItems();
                    loadRooms();

                }

            }

        });
        
        delete.addActionListener(e -> {


            Room room =
                    getSelectedRoom();


            if(room == null)
                return;


            int choice =
                    JOptionPane.showConfirmDialog(
                            this,
                            "Delete selected room?",
                            "Confirm",
                            JOptionPane.YES_NO_OPTION
                    );


            if(choice == JOptionPane.YES_OPTION) {


                roomController.deleteRoom(room);


                rooms.remove(room);


                roomBox.removeAllItems();

                loadRooms();


                JOptionPane.showMessageDialog(
                        this,
                        "Room deleted"
                );

            }

        });

    }

    private void loadRooms() {

    	Database db = Database.getInstance(); 
    	try {
			db.loadRooms();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};

        for(Room room : db.rooms) {

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