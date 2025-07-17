package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class pin extends JFrame implements ActionListener {
    JButton b1, b2;
    String pin;
    JPasswordField p1, p2;

    pin(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-30, 0, 1500, 830);
        add(image);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setForeground(Color.WHITE);
        label1.setBounds(430, 180, 400, 35);
        image.add(label1);

        JLabel label2 = new JLabel("NEW PIN:");
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label2.setBounds(430, 220, 150, 35);
        image.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65, 125, 128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600, 220, 200, 30);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(p1);

        JLabel label3 = new JLabel("Re-Enter NEW PIN:");
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setForeground(Color.WHITE);
        label3.setBounds(430, 250, 400, 35);
        image.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65, 125, 128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600, 255, 200, 30);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(p2);

        b1 = new JButton("CHANGE PIN");
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

        setSize(1500, 830);
        setLayout(null);
        setLocation(-10, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();
            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "PIN Does not Match");
                return;
            }
            if (e.getSource() == b1) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                    return;
                }
                conn c = new conn();
                String q1 = "update deposit set pin = '" + pin1 + "' where pin = '" + pin + "'";
                String q2 = "update login set pin = '" + pin1 + "' where pin = '" + pin + "'";
                String q3 = "update signupthree set pin = '" + pin1 + "' where pin = '" + pin + "'";
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                setVisible(false);
                new mainClass(pin);
            } else if (e.getSource() == b2) {
                new mainClass(pin);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new pin("");
    }
}
