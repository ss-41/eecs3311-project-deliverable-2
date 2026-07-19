package ui;

import javax.swing.*;

import controller.RoomController;

import java.awt.*;

public class AdminPanel extends JPanel {

	private RoomController roomController = new RoomController();
	
    public AdminPanel(MainFrame frame) {


        setLayout(new BorderLayout());


        JLabel title =
                new JLabel(
                "Room Management",
                SwingConstants.CENTER);


        title.setFont(
                new Font("Arial",
                Font.BOLD,
                24)
        );


        add(title, BorderLayout.NORTH);



        JPanel buttons =
                new JPanel(
                new GridLayout(3,1,10,10)
        );


        JButton addRoom =
                new JButton("Add Room");


        JButton enableRoom =
                new JButton("Enable Room");


        JButton disableRoom =
                new JButton("Disable Room");


        JButton back =
                new JButton("Back");



        buttons.add(addRoom);
        buttons.add(enableRoom);
        buttons.add(disableRoom);
        buttons.add(back);


        add(buttons, BorderLayout.CENTER);



        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );
        
        addRoom.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    this,
                    "Add room functionality"
            );

        });
        
        enableRoom.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    this,
                    "Enable room functionality"
            );

        });


        disableRoom.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    this,
                    "Disable room functionality"
            );

        });

    }

}