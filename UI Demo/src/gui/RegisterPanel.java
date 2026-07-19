package gui;

import java.awt.GridLayout;

import javax.swing.*;

import dataModels.AccountType; 
import account.factory.GenerateAccountFactory; 
import dataModels.User;

public class RegisterPanel extends JPanel {
	
	private JTextField nameField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JPasswordField confirmPasswordField;
	private JTextField stud_OR_orgIDField;
	private JComboBox<String> accountTypeBox;
	
    public RegisterPanel(){

        setLayout(new GridLayout(10,2,10,10));

        nameField = new JTextField();
        add(new JLabel("Name"));
        add(nameField); 

        emailField = new JTextField();
        add(new JLabel("Email"));
        add(emailField);

        passwordField = new JPasswordField();
        add(new JLabel("Password"));
        add(passwordField);
        
        confirmPasswordField = new JPasswordField();
        add(new JLabel("Confirm Password"));
        add(confirmPasswordField);
        
        stud_OR_orgIDField = new JTextField(); 
        add(new JLabel("Student / Organization ID"));
        add(stud_OR_orgIDField);

        add(new JLabel("Account Type"));

        accountTypeBox = new JComboBox<>(new String[] {
        		"Student",
                "Faculty",
                "Staff",
                "Partner"
        });
        add(accountTypeBox); 


        JButton register = new JButton("Register");
        JButton back = new JButton("Back");

        add(register);
        add(back);
        
        register.addActionListener(e -> {

            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());
            String stud_OR_orgID = stud_OR_orgIDField.getText();
            String selectedAccountType =
                    (String) accountTypeBox.getSelectedItem();
            
            if (name.isBlank() || email.isBlank() || password.isBlank() || confirmPassword.isBlank() || stud_OR_orgID.isBlank()) {
            	JOptionPane.showMessageDialog(
                        this,
                        "All fields must be filled."
                );

                return;
            }
            
            
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(
                        this,
                        "Passwords do not match."
                );
                return;
            }
            
            AccountType accountType;

            switch (selectedAccountType) {
                case "Student":
                    accountType = new AccountType(1, "Student", 20.00);
                    break;

                case "Faculty":
                    accountType = new AccountType(2, "Faculty", 30.00);
                    break;

                case "Staff":
                    accountType = new AccountType(3, "Staff", 40.00);
                    break;

                case "Partner":
                    accountType = new AccountType(4, "Partner", 50.00);
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid account type selected."
                    );
                    return;
            }
            
            User newUser = GenerateAccountFactory.createUser(
                    name,
                    email,
                    password,
                    stud_OR_orgID,
                    accountType
            );
            JOptionPane.showMessageDialog(
                    this,
                    "Account Creation Successful. Welcome!\nUser ID: "
                            + newUser.getUserID()
            );
            
        });

        back.addActionListener(e->{

            MainWindow.getInstance().showPage("LOGIN");

        }); 

    }

}