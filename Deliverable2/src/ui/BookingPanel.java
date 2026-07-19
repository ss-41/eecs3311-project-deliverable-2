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
    private MainFrame frame;

    private RoomController roomController = new RoomController();
    private BookingController bookingController = new BookingController();
    

    public BookingPanel(MainFrame frame) {

    	this.frame = frame;
    	
        setLayout(new BorderLayout());



        JLabel title =
                new JLabel(
                        "Create Booking",
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
                        new GridLayout(4,2,10,10)
                );



        roomBox =
                new JComboBox<>();


        loadRooms();



        panel.add(
                new JLabel("Select Room")
        );


        panel.add(roomBox);



        JButton book =
                new JButton("Book Room");


        JButton refresh =
                new JButton("Refresh Rooms");


        JButton back =
                new JButton("Back");



        panel.add(book);
        panel.add(refresh);
        panel.add(back);



        add(panel, BorderLayout.CENTER);



        refresh.addActionListener(e -> {

            roomBox.removeAllItems();

            loadRooms();

        });



        book.addActionListener(e -> {


            int index =
                    roomBox.getSelectedIndex();


            if(index < 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please select a room."
                );

                return;

            }



            Room room =
                    availableRooms.get(index);



            int bookingID =
                    (int)(System.currentTimeMillis() % 100000);



            boolean success =
            		bookingController.createBooking(
            		        bookingID,
            		        frame.getCurrentUser().getUserID(),
            		        room.getRoomID(),
            		        20.00,
            		        LocalDateTime.now(),
            		        LocalDateTime.now().plusHours(1)
            		);



            if(success) {


                JOptionPane.showMessageDialog(
                        this,
                        "Booking created successfully!"
                );


            }
            else {


                JOptionPane.showMessageDialog(
                        this,
                        "Booking failed."
                );

            }

        });



        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );

    }
    
    private void loadRooms(){

        availableRooms = roomController.getAvailableRooms();

        for(Room room : availableRooms)
            roomBox.addItem(room.getRoomNum()+" - "+room.getBuilding());
    }

}