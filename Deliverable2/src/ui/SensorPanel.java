package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;


public class SensorPanel extends JPanel {


    private JTextArea logArea;

    private Room room;



    public SensorPanel(MainFrame frame) {


        setLayout(new BorderLayout());



        JLabel title =
                new JLabel(
                        "Room Sensors",
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



        room =
                new Room(
                        1,
                        "DB 101",
                        30,
                        "Davis Building",
                        RoomStatus.AVAILABLE,
                        new ArrayList<>()
                );



        JPanel buttons =
                new JPanel(
                        new GridLayout(4,1,10,10)
                );



        JButton badge =
                new JButton(
                        "Scan Badge"
                );


        JButton occupied =
                new JButton(
                        "Set Occupied"
                );


        JButton empty =
                new JButton(
                        "Set Empty"
                );


        JButton back =
                new JButton(
                        "Back"
                );



        buttons.add(badge);
        buttons.add(occupied);
        buttons.add(empty);
        buttons.add(back);



        add(buttons, BorderLayout.WEST);



        logArea =
                new JTextArea();


        logArea.setEditable(false);


        add(
                new JScrollPane(logArea),
                BorderLayout.CENTER
        );



        badge.addActionListener(e -> {


            room.BadgeEvent(
                    new User(
                            1,
                            "Test User",
                            "test@yorku.ca",
                            "password",
                            "12345"
                    ),
                    true
            );


            log(
                    "Badge Scan Event Triggered"
            );


        });



        occupied.addActionListener(e -> {


            room.OccupancyEvent(true);


            log(
                    "Occupancy detected"
            );


        });



        empty.addActionListener(e -> {


            room.OccupancyEvent(false);


            log(
                    "Room is empty"
            );


        });



        back.addActionListener(e ->

                frame.showPanel("ADMIN")

        );

    }




    private void log(String message) {


        logArea.append(
                message
                + "\n"
        );

    }

}