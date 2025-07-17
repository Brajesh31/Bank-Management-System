package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class balanceEnquiry extends JFrame implements ActionListener {
    JLabel label2;
    JButton b2;
    String pin;

    balanceEnquiry(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-30, 0, 1500, 830);
        add(image);

        JLabel label1 = new JLabel("Your Current Balance is Rs. ");
        label1.setFont(new Font("System", Font.BOLD, 28));
        label1.setForeground(Color.WHITE);
        label1.setBounds(430, 160, 400, 35);
        image.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(430, 210, 400, 35);
        image.add(label2);

        b2 = new JButton("BACK");
        b2.setBounds(660, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);

        int balance = 0;
        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from deposit where pin ='" + pin + "'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        label2.setText("" + balance);

        setLayout(null);
        setSize(1500, 1080);
        setLocation(-10, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new mainClass(pin);
    }

    public static void main(String[] args) {
        new balanceEnquiry("");
    }
}
