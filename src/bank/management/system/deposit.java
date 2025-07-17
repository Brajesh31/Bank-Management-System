package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1, b2;

    deposit(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-30, 0, 1500, 830);
        add(image);

        JLabel label1 = new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setForeground(Color.WHITE);
        label1.setBounds(430, 180, 400, 35);
        image.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(430, 230, 355, 30);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(textField);

        b1 = new JButton("Deposit");
        b1.setBounds(660, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(660, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);

        setLayout(null);
        setSize(1500, 1080);
        setLocation(-10, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Some Amount");
                } else {
                    conn c = new conn();
                    c.statement.executeUpdate(
                            "insert into deposit values('" + pin + "', '" + date + "','Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposit Succesfully");
                    setVisible(false);
                    new mainClass(pin);
                }
            } else if (e.getSource() == b2) {
                setVisible(false);
                new mainClass(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new deposit("");
    }
}
