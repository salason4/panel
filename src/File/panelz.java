package File;

import javax.swing.*;
import java.awt.*;

public class panelz {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\Engr_horshy\\src\\File\\download.jpeg");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        //label.setVerticalAlignment(JLabel.TOP);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);


        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0, 250,250);
        redpanel.setLayout(null);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0, 250,250);
        bluepanel.setLayout(null);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250, 500,250);
        greenpanel.setLayout(null);


    JFrame frame = new JFrame(); // this create  a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        bluepanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
}
}
