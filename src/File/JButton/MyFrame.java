package File.JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\Engr_horshy\\src\\File\\JButton\\downloaded.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\Engr_horshy\\src\\File\\logons.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
        button = new JButton();


        button.setBounds(100, 100, 250, 100);
        //button.addActionListener(e -> System.out.println("poo"));
        button.addActionListener(this);
        button.setText("i'm a button");
        button.setIcon(icon);
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-15);
        button.setFont(new Font("Time New Roman", Font.BOLD, 25));
        button.setForeground(Color.GREEN);
        button.setBackground(Color.red);
        //button.setEnabled(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setBorder(BorderFactory.createEtchedBorder());
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            //System.out.println("poo");
           //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}