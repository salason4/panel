package File;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Jtext {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\Engr_horshy\\src\\File\\logons.png");
        JLabel label1 = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        label1.setText(" Engr Oshy do you need a code? ");
        label1.setIcon(image);
        label1.setHorizontalTextPosition(JLabel.CENTER);// Set text center, right and left of image icon
        label1.setVerticalTextPosition(JLabel.TOP);// Set text center, top and down of image icon
        label1.setForeground( new Color(0X00FF00)); // set font color of the test
        label1.setFont( new Font( "MV BOli", Font.ITALIC, 25));// set font text
        label1.setIconTextGap(100); // set gap of test to image
        label1.setBackground(Color.BLACK); // set background color
        label1.setOpaque(true); // display background color
        label1.setBorder(border);
        label1.setVerticalAlignment(JLabel.CENTER); // set vertical position within icon+text within the label
        label1.setHorizontalAlignment(JLabel.CENTER); // SET horizontal within icon+text within the label
       // label1.setBounds(100,0, 500, 500); // set x, y with the frame as well as dimension
    JFrame frame = new JFrame(); // this create  a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(500,500);
        frame.setVisible(true);
      //  frame.setLayout(null);
       frame.add(label1);
       frame.pack(); // to accommodate everything within the test  make sure it come last


    }
}
