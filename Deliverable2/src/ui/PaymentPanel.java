package ui;

import javax.swing.*;
import java.awt.*;

public class PaymentPanel extends JPanel {


    public PaymentPanel(MainFrame frame) {


        setLayout(new BorderLayout());


        JLabel title =
                new JLabel(
                "Payment",
                SwingConstants.CENTER);


        title.setFont(
                new Font("Arial",
                Font.BOLD,
                24)
        );


        add(title, BorderLayout.NORTH);



        JPanel panel =
                new JPanel(
                new GridLayout(4,1)
        );


        JRadioButton credit =
                new JRadioButton(
                "Credit Card");


        JRadioButton debit =
                new JRadioButton(
                "Debit Card");


        JRadioButton billing =
                new JRadioButton(
                "Institutional Billing");


        ButtonGroup group =
                new ButtonGroup();


        group.add(credit);
        group.add(debit);
        group.add(billing);



        panel.add(credit);
        panel.add(debit);
        panel.add(billing);



        JButton back =
                new JButton("Back");


        panel.add(back);


        add(panel, BorderLayout.CENTER);



        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );

    }
}