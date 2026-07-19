package ui;

import javax.swing.*;
import java.awt.*;
import controller.AccountController;
import dataModels.AccountType;
import database.singleton.Database;

public class RegisterPanel extends JPanel {
	
	private final AccountController accountController = new AccountController();

    public RegisterPanel(MainFrame frame) {

        setLayout(new GridBagLayout());

        JPanel panel = new JPanel(new GridLayout(7,2,10,10));

        JTextField nameField = new JTextField();

        JTextField emailField = new JTextField();

        JPasswordField passwordField = new JPasswordField();

        JTextField organizationIDField = new JTextField();


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

        panel.add(new JLabel("Student/Organization ID"));
        panel.add(organizationIDField);

        panel.add(new JLabel("Account Type"));
        panel.add(typeBox);

        panel.add(registerButton);
        panel.add(backButton);

        add(panel);

        backButton.addActionListener(e ->
                frame.showLogin());
        
        registerButton.addActionListener(e -> {
        	String selectedType = (String) typeBox.getSelectedItem();
        	AccountType a = Database.getInstance().createAccountType(selectedType);

        	if(nameField.getText().isBlank()
        	        || emailField.getText().isBlank()
        	        || passwordField.getPassword().length == 0
        	        || organizationIDField.getText().isBlank()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please complete all fields including ID."
                );
                return;
            }

        	boolean success =
        	        accountController.registerUser(
        	                nameField.getText(),
        	                emailField.getText(),
        	                new String(passwordField.getPassword()),
        	                organizationIDField.getText(),
        	                a
        	        );

            if(success) {

                JOptionPane.showMessageDialog(
                        this,
                        "Account successfully created!"
                );

                frame.showLogin();

            }
            else {

                JOptionPane.showMessageDialog(
                        this,
                        "Email already exists."
                );

            }

        });

    }

}