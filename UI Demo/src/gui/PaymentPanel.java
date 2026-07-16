package gui;

import java.awt.GridLayout;

import javax.swing.*;

public class PaymentPanel extends JPanel {

    public PaymentPanel(){

        setLayout(new GridLayout(7,2,10,10));

        add(new JLabel("Payment Method"));

        JComboBox<String> payment =
                new JComboBox<>(new String[]{
                        "Credit Card",
                        "Debit Card",
                        "Institution Billing"
                });

        add(payment);

        JButton pay = new JButton("Pay");

        JButton back = new JButton("Back");

        add(pay);
        add(back);

        back.addActionListener(e->{

            MainWindow.getInstance().showPage("DASHBOARD");

        });

    }

}