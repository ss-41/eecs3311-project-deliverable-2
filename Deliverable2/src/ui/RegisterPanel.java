package ui;

import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JPanel {

    public RegisterPanel(MainFrame frame) {

        setLayout(new GridBagLayout());

        JPanel panel = new JPanel(new GridLayout(7,2,10,10));

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        String[] accountTypes = {
                "Student",
                "Faculty",
                "Staff",
                "Partner"
        };

        JComboBox<String> typeBox =
                new JComboBox<>(accountTypes);

        JButton registerButton =
                new JButton("Create Account");

        JButton backButton =
                new JButton("Back");

        panel.add(new JLabel("Name"));
        panel.add(nameField);

        panel.add(new JLabel("Email"));
        panel.add(emailField);

        panel.add(new JLabel("Password"));
        panel.add(passwordField);

        panel.add(new JLabel("Account Type"));
        panel.add(typeBox);

        panel.add(registerButton);
        panel.add(backButton);

        add(panel);

        backButton.addActionListener(e ->
                frame.showLogin());

        registerButton.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    this,
                    "Account Created!\n\n"
                    + "Name: " + nameField.getText()
                    + "\nEmail: " + emailField.getText()
                    + "\nType: " + typeBox.getSelectedItem()
            );

            frame.showLogin();

        });

    }

}