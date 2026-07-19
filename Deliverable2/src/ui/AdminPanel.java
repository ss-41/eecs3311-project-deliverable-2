package ui;

import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JPanel {


    public AdminPanel(MainFrame frame) {

        setLayout(new BorderLayout());


        JLabel title =
                new JLabel(
                        "Admin Dashboard",
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



        JPanel buttons =
                new JPanel(
                        new GridLayout(3,1,10,10)
                );


        JButton manageRooms =
                new JButton(
                        "Manage Rooms"
                );


        JButton sensors =
                new JButton(
                        "View Sensors"
                );


        JButton back =
                new JButton(
                        "Back"
                );


        buttons.add(manageRooms);
        buttons.add(sensors);
        buttons.add(back);


        add(buttons, BorderLayout.CENTER);



        manageRooms.addActionListener(e ->
                frame.showPanel("ROOM_MANAGEMENT")
        );


        sensors.addActionListener(e ->
                frame.showPanel("SENSORS")
        );


        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );

    }

}