package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import controller.BookingController;
import dataModels.Booking;


public class MyBookingsPanel extends JPanel {


    private JTextArea bookingArea;


    private BookingController controller =
            new BookingController();


    private MainFrame frame;



    public MyBookingsPanel(MainFrame frame) {


        this.frame = frame;


        setLayout(new BorderLayout());



        JLabel title =
                new JLabel(
                        "My Bookings",
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


        bookingArea = new JTextArea();
        bookingArea.setEditable(false);


        add(
                new JScrollPane(bookingArea),
                BorderLayout.CENTER
        );



        JPanel buttons =
                new JPanel();

        JButton refresh =
                new JButton("Refresh");

        JButton extend =
                new JButton("Extend Booking");
        
        JButton cancel =
                new JButton("Cancel Booking");
        
        JButton back =
                new JButton("Back");

        buttons.add(refresh);
        buttons.add(extend);
        buttons.add(cancel);
        buttons.add(back);
        

        add(buttons, BorderLayout.SOUTH);

        refresh.addActionListener(e ->
                loadBookings()
        );

        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );
        
        
        extend.addActionListener(e -> {

            String input =
                    JOptionPane.showInputDialog(
                            this,
                            "Enter Booking ID:"
                    );

            if(input == null) return;

            try {

                int bookingID =
                        Integer.parseInt(input);

                boolean success =
                        controller.extendBooking(bookingID);

                if(success) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Booking extended by one hour."
                    );

                    loadBookings();

                }
                else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Unable to extend booking."
                    );

                }

            } catch(NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Booking ID."
                );

            }

        });
        
        cancel.addActionListener(e -> {


            String input =
                    JOptionPane.showInputDialog(
                            this,
                            "Enter Booking ID to cancel:"
                    );


            if(input == null) return;
            
            try {

                int bookingID =
                        Integer.parseInt(input);

                boolean success =
                        controller.cancelBooking(
                                bookingID,
                                frame.getCurrentUser().getUserID()
                        );

                if(success) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Booking cancelled."
                    );
                    loadBookings();
                }
                else {
                    JOptionPane.showMessageDialog(
                            this,
                            "Cannot cancel booking."
                    );
                }

            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Booking ID."
                );
            }


        });


    }


    private void loadBookings() {

        bookingArea.setText("");

        if(frame.getCurrentUser() == null) {

            bookingArea.append("Please login first.");
            return;

        }

        ArrayList<Booking> bookings =
                controller.getBookings();

        database.singleton.Database db =
                database.singleton.Database.getInstance();
        try {
			db.loadRooms();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        boolean found = false;

        for(Booking booking : bookings) {

            if(booking.getUserID() == frame.getCurrentUser().getUserID()) {

                String roomName = "Unknown";

                for(dataModels.Room room : db.rooms) {

                    if(room.getRoomID() == booking.getRoomID()) {

                        roomName = room.getRoomNum()
                                + " (" + room.getBuilding() + ")";
                        break;

                    }

                }

                bookingArea.append(
                        "Booking ID: " + booking.getBookingID() + "\n"
                        + "Room: " + roomName + "\n"
                        + "Deposit: $" + booking.getDeposit() + "\n"
                        + "Status: " + booking.getBookingStatus() + "\n"
                        + "Start: " + booking.getBookingTime() + "\n"
                        + "End: " + booking.getBookingEndTime() + "\n\n"
                );

                found = true;

            }

        }

        if(!found)
            bookingArea.append("No bookings found.");

    }
    
    

}