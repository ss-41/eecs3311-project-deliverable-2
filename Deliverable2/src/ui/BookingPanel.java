package ui;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

import controller.BookingController;
import controller.RoomController;
import dataModels.Room;


public class BookingPanel extends JPanel {


    private JComboBox<String> roomBox;
    private ArrayList<Room> availableRooms;

    private final RoomController roomController = new RoomController();
    private final BookingController bookingController = new BookingController();


    public BookingPanel(MainFrame frame) {

        setLayout(new BorderLayout());

        JPanel panel =
                new JPanel(
                new GridLayout(3,2,10,10));

        roomBox = new JComboBox<>();

        loadRooms();

        panel.add(
                new JLabel("Select Room")
        );


        panel.add(roomBox);



        JButton book =
                new JButton("Book");

        JButton back =
                new JButton("Back");



        panel.add(book);

        panel.add(back);



        add(panel,BorderLayout.CENTER);



        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );



        book.addActionListener(e -> {


            int index =
                    roomBox.getSelectedIndex();


            if(index < 0)
                return;



            Room room =
                    availableRooms.get(index);

            int roomID =
                    room.getRoomID();



            int bookingID =
                    (int)(Math.random()*10000);



            boolean success =
                    bookingController.createBooking(
                            bookingID,
                            roomID,
                            20.0,
                            LocalDateTime.now(),
                            LocalDateTime.now()
                                    .plusHours(1)
                    );



            if(success) {
                JOptionPane.showMessageDialog(
                        this,
                        "Booking Created!"
                );


            }


        });

    }



    private void loadRooms() {

        availableRooms = roomController.getAvailableRooms();


        if(availableRooms.isEmpty()) {

            roomBox.addItem("No rooms available");

        }
        else {

            for(Room room : availableRooms) {

                roomBox.addItem(
                    room.getRoomNum()
                    + " - "
                    + room.getBuilding()
                );

            }

        }

    }

}