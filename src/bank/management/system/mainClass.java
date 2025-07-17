package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainClass extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    mainClass(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-30, 0, 1500, 830);
        add(image);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(400, 180, 700, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 28));
        image.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBackground(new Color(65, 125, 128));
        b1.setBounds(395, 270, 150, 35);
        image.add(b1);

        b2 = new JButton("CASH WITHDRAW");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65, 125, 128));
        b2.addActionListener(this);
        b2.setBounds(675, 270, 150, 35);
        image.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65, 125, 128));
        b3.addActionListener(this);
        b3.setBounds(395, 315, 150, 35);
        image.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65, 125, 128));
        b4.addActionListener(this);
        b4.setBounds(675, 315, 150, 35);
        image.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65, 125, 128));
        b5.addActionListener(this);
        b5.setBounds(395, 360, 150, 35);
        image.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65, 125, 128));
        b6.addActionListener(this);
        b6.setBounds(675, 360, 150, 35);
        image.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65, 125, 128));
        b7.addActionListener(this);
        b7.setBounds(675, 405, 150, 35);
        image.add(b7);

        setLayout(null);
        setSize(1500, 1080);
        setLocation(-10, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new deposit(pin);
            setVisible(false);
        } else if (e.getSource() == b7) {
            System.exit(0);
        } else if (e.getSource() == b2) {
            new withdraw(pin);
            setVisible(false);
        } else if (e.getSource() == b6) {
            new balanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource() == b3) {
            new fastCash(pin);
            setVisible(false);
        } else if (e.getSource() == b5) {
            new pin(pin);
            setVisible(false);
        } else if (e.getSource() == b4) {
            new mini(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new mainClass("");
    }
}
