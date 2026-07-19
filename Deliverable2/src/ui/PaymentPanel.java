package ui;

import javax.swing.*;
import java.awt.*;

public class PaymentPanel extends JPanel {


    public PaymentPanel(MainFrame frame) {


        setLayout(new BorderLayout());


        JLabel title =
                new JLabel(
                        "Payment",
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



        JPanel panel =
                new JPanel(
                        new GridLayout(5,1,10,10)
                );


        JRadioButton credit =
                new JRadioButton(
                        "Credit Card"
                );


        JRadioButton debit =
                new JRadioButton(
                        "Debit Card"
                );


        JRadioButton billing =
                new JRadioButton(
                        "Institutional Billing"
                );


        ButtonGroup group =
                new ButtonGroup();


        group.add(credit);
        group.add(debit);
        group.add(billing);



        JButton confirm =
                new JButton(
                        "Confirm Payment"
                );


        JButton back =
                new JButton(
                        "Back"
                );



        panel.add(credit);
        panel.add(debit);
        panel.add(billing);
        panel.add(confirm);
        panel.add(back);



        add(panel, BorderLayout.CENTER);



        confirm.addActionListener(e -> {


            if(!credit.isSelected()
                    && !debit.isSelected()
                    && !billing.isSelected()) {


                JOptionPane.showMessageDialog(
                        this,
                        "Please select a payment method."
                );

                return;

            }



            String method = "";


            if(credit.isSelected()) {
                method = "Credit Card";
            }
            else if(debit.isSelected()) {
                method = "Debit Card";
            }
            else {
                method = "Institutional Billing";
            }



            JOptionPane.showMessageDialog(
                    this,
                    "Payment successful using "
                    + method
            );

        });



        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );

    }
}