package ui;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {


    private MainFrame frame;


    public LoginPanel(MainFrame frame) {

        this.frame = frame;

        setLayout(new GridBagLayout());


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2,10,10));


        JLabel title = new JLabel(
                "YorkU Conference Room Scheduler",
                SwingConstants.CENTER
        );


        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();


        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();


        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");


        panel.add(emailLabel);
        panel.add(emailField);

        panel.add(passwordLabel);
        panel.add(passwordField);

        panel.add(loginButton);
        panel.add(registerButton);


        setBorder(BorderFactory.createEmptyBorder(50,50,50,50));


        add(panel);


        loginButton.addActionListener(e -> {

            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            if(email.isBlank() || password.isBlank()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter your email and password."
                );
                return;
            }

            frame.showPanel("DASHBOARD");

        });


        registerButton.addActionListener(e ->
        frame.showRegister());

    }

}