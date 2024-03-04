package javaswing;
import java.awt.*;
import javax.swing.*;

import org.w3c.dom.events.Event;

import java.awt.event.*;
public class f1 {
    public static void main(String arg[])
    {
        JFrame f = new JFrame("My First App");
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel l1 = new JLabel("User id :");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);
        JLabel l2 = new JLabel("Password :");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2); 
        JButton b1 = new JButton("Submit");
        f.add(b1);
        JButton b2 = new JButton("Close");
        // System.out.println(t1.getText()+" "+t2.getText());\
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is clicked
                String userId = t1.getText();
                String password = t2.getText();
                System.out.println("User id: " + userId);
                System.out.println("Password: " + password);
            }
        });
        f.add(b2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
    }
}
