package ui;

import javax.swing.*;
import java.awt.*;

import dataModels.User;
import controller.AccountController;


public class AdminPanel extends JPanel {


    private AccountController accountController =
            new AccountController();


    private JButton createAdmin;


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
                        new GridLayout(4,1,10,10)
                );


        JButton manageRooms =
                new JButton("Manage Rooms");

        JButton sensors =
                new JButton("View Sensors");

        createAdmin =
                new JButton("Create Admin Account");

        JButton back =
                new JButton("Back");

        buttons.add(manageRooms);
        buttons.add(sensors);
        buttons.add(createAdmin);
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


        createAdmin.addActionListener(e -> {

            createAdminAccount();

        });

    }


    private void createAdminAccount() {


        JTextField name =
                new JTextField();


        JTextField email =
                new JTextField();


        JPasswordField password =
                new JPasswordField();


        JTextField id =
                new JTextField();



        JPanel panel =
                new JPanel(
                        new GridLayout(4,2,5,5)
                );


        panel.add(new JLabel("Name"));
        panel.add(name);


        panel.add(new JLabel("Email"));
        panel.add(email);


        panel.add(new JLabel("Password"));
        panel.add(password);


        panel.add(new JLabel("Employee ID"));
        panel.add(id);



        int result =
                JOptionPane.showConfirmDialog(
                        this,
                        panel,
                        "Create Admin",
                        JOptionPane.OK_CANCEL_OPTION
                );


        if(result == JOptionPane.OK_OPTION) {


            boolean success =
                    accountController.createAdmin(
                            name.getText(),
                            email.getText(),
                            new String(password.getPassword()),
                            id.getText()
                    );


            if(success) {

                JOptionPane.showMessageDialog(
                        this,
                        "Admin account created."
                );

            }
            else {

                JOptionPane.showMessageDialog(
                        this,
                        "Failed to create admin."
                );

            }

        }

    }
    
    public void refreshAdmin(User user) {

        if(user != null &&
           user.getEmail().equals("chief@yorku.ca")) {

            createAdmin.setVisible(true);

        }
        else {

            createAdmin.setVisible(false);

        }

    }

}