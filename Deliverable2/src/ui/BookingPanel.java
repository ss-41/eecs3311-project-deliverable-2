package ui;

import javax.swing.*;
import java.awt.*;
import controller.BookingController;
import java.time.LocalDateTime;
import controller.RoomController;
import java.util.ArrayList;

public class BookingPanel extends JPanel {
	
	private BookingController controller = new BookingController();
	private JComboBox<String> roomBox;
	private RoomController roomController =new RoomController();
	private ArrayList<String[]> availableRooms;

    public BookingPanel(MainFrame frame) {

        setLayout(new BorderLayout());

        JLabel title = new JLabel(
                "Room Booking",
                SwingConstants.CENTER
        );

        title.setFont(
                new Font("Arial",
                Font.BOLD,
                24)
        );


        add(title, BorderLayout.NORTH);


        JPanel panel = new JPanel(
                new GridLayout(5,2,10,10)
        );


        panel.add(new JLabel("Select Room"));
        roomBox = new JComboBox<>();
        loadRooms();
        panel.add(roomBox);


        panel.add(new JLabel("Date"));
        panel.add(new JTextField());


        panel.add(new JLabel("Start Time"));
        panel.add(new JTextField());


        panel.add(new JLabel("Duration (hours)"));
        panel.add(new JTextField());


        JButton book =
                new JButton("Book");


        JButton back =
                new JButton("Back");


        panel.add(book);
        panel.add(back);


        add(panel, BorderLayout.CENTER);


        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );


        book.addActionListener(e -> {
        	
        	int bookingID =
        	        (int)(Math.random()*10000);


        	int selectedIndex =
        	        roomBox.getSelectedIndex();


        	String[] selectedRoom =
        	        availableRooms.get(selectedIndex);


        	int roomID =
        	        Integer.parseInt(
        	                selectedRoom[0]
        	        );


        	boolean success =
        	        controller.createBooking(
        	                bookingID,
        	                roomID,
        	                20.0,
        	                LocalDateTime.now(),
        	                LocalDateTime.now().plusHours(1)
        	        );
        
            if(success){

                JOptionPane.showMessageDialog(
                        this,
                        "Booking created!"
                );

            }
            else{

                JOptionPane.showMessageDialog(
                        this,
                        "Booking failed."
                );

            }

        });

    }
    
    private void loadRooms() {


    	availableRooms =
    	        roomController.getAvailableRooms();


        for(String[] room : availableRooms) {


            String display =
                    room[1]
                    + " - "
                    + room[3]
                    + " (Capacity "
                    + room[2]
                    + ")";


            roomBox.addItem(display);

        }

    }
}